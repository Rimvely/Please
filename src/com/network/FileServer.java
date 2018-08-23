package com.network;

import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServer {

	class WorkThread extends Thread {

		@SuppressWarnings("unused")
		private Socket sc = null;

		public WorkThread(Socket sc) {
			this.sc = sc;
		}

		@Override
		public void run() {

			try {

				ObjectInputStream ois = new ObjectInputStream(
						sc.getInputStream());

				System.out.println(sc.getInetAddress().getAddress() + "접속...");// IP띄우기

				FileOutputStream fos = null;
				Object ob = null;

				while ((ob = ois.readObject()) != null) { // object는 객체니까 클래스는
															// null
					// 직렬화된 데이터를 받아서 밑에서 다운캐스팅한거다.

					if (ob instanceof FileInfo) {

						FileInfo info = (FileInfo) ob;

						// 파일전송시작
						if (info.getCode() == 100) {

							String str = new String(info.getData());

							fos = new FileOutputStream(str);// 파일명

							System.out.println("파일전송 시작...");

							// 파일전송중
						} else if (info.getCode() == 110) {

							if (fos == null)
								break;

							fos.write(info.getData(), 0, info.getSize());
							// 겟게이타를뽑는데 0부터 info의 사이즈까지

							System.out.println(info.getSize() + "bytes 받는중...");

							// 파일전송끝
						} else if (info.getCode() == 200) {

							if (fos == null)
								break;

							String str = new String(info.getData());

							fos.close();

							System.out.println(str + "파일전송 끝...");
							
							break; //써둬도 되고 안써줘도 되고

						}
					}

				}

			} catch (Exception e) {
				System.out.println(e.toString());
			}

		}

	}
	
	public void serverStart(){
		
		try {
			
			ServerSocket ss = new ServerSocket(5555);
			System.out.println("클라이언트 접속 대기중...");
			
			Socket sc = ss.accept();
			
			WorkThread wt = new WorkThread(sc);
			wt.start();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	public static void main(String[] args) {
		new FileServer().serverStart();

	}

}
