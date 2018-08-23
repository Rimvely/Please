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

				System.out.println(sc.getInetAddress().getAddress() + "����...");// IP����

				FileOutputStream fos = null;
				Object ob = null;

				while ((ob = ois.readObject()) != null) { // object�� ��ü�ϱ� Ŭ������
															// null
					// ����ȭ�� �����͸� �޾Ƽ� �ؿ��� �ٿ�ĳ�����ѰŴ�.

					if (ob instanceof FileInfo) {

						FileInfo info = (FileInfo) ob;

						// �������۽���
						if (info.getCode() == 100) {

							String str = new String(info.getData());

							fos = new FileOutputStream(str);// ���ϸ�

							System.out.println("�������� ����...");

							// ����������
						} else if (info.getCode() == 110) {

							if (fos == null)
								break;

							fos.write(info.getData(), 0, info.getSize());
							// �ٰ���Ÿ���̴µ� 0���� info�� ���������

							System.out.println(info.getSize() + "bytes �޴���...");

							// �������۳�
						} else if (info.getCode() == 200) {

							if (fos == null)
								break;

							String str = new String(info.getData());

							fos.close();

							System.out.println(str + "�������� ��...");
							
							break; //��ֵ� �ǰ� �Ƚ��൵ �ǰ�

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
			System.out.println("Ŭ���̾�Ʈ ���� �����...");
			
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
