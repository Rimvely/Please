package com.network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ServerTest2 {

	private ArrayList<Socket> clients = new ArrayList<Socket>();

	public void serverStart() { //클라이언트가 몇개가 들어오던지 sc를 그갯수만큼만든다.

		try {

			ServerSocket ss = new ServerSocket(5555);
			System.out.println("서버 시작....");

			while (true) { // 소켓수만큼 자동연결

				Socket sc = ss.accept();

				WorkThread wt = new WorkThread(sc);
				wt.start();
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	class WorkThread extends Thread {

		private Socket sc;

		public WorkThread(Socket sc) {
			this.sc = sc;
		} // 위존성 주입

		@Override
		public void run() { //Thread를 여러개 만들었으니 여러명 채팅가능

			String ip = null;
			String msg = null;

			try {

				BufferedReader br = new BufferedReader(new InputStreamReader(
						sc.getInputStream()));

				// IP보내면 IP받아야지
				ip = sc.getInetAddress().getHostAddress();//사용자의 ip를 받아내

				// 접속한 클라이언트
				clients.add(sc); // sc = List에 넣어놓는거야. 그 클라이언트의 sc에서 ip받아내고
									// 메세지받아내고

				// br에는 메세지가 저장되어있다.
				// 다른 클라이언트에게 접속 사실 알림
				msg = ip + "]가 입장 했습니다!"; //ip를 띄우고

				for (Socket s : clients) {
					
					//clients가 한말을 또 자기가 안받게 하기위해서
					//나한테는 띄울필요가없어서 if코딩
					if(s==sc)
						continue; //이번만 패스. //이 밑으로 for문을 한번만패스

					PrintWriter pw = new PrintWriter(s.getOutputStream(), true); // true은
																					// packet이
																					// 가능차지않아도
																					// 내보내는것
					pw.println(msg); //서버에서 모니터링을 위해 콘설창에 표시

				}
				
				System.out.println(msg);//다 해놓고 서버에도 하나 띄워봐
				
				//----------------------------
				
				for (Socket s : clients) {
					
					//clients가 한말을 또 자기가 안받게 하기위해서
					if(s==sc)
						continue; //이번만 패스. //이 밑으로 for문을 한번만패스

					PrintWriter pw = new PrintWriter(s.getOutputStream(), true); // true은
																					// packet이
																					// 가능차지않아도
																					// 내보내는것
					pw.println(msg);

				}

			} catch (Exception e) {
				msg = ip + "] 퇴장하셨습니다";
						
				try {
					for (Socket s : clients) {
						
						//clients가 한말을 또 자기가 안받게 하기위해서
						if(s==sc)
							continue; //이번만 패스. //이 밑으로 for문을 한번만패스

						PrintWriter pw = new PrintWriter(s.getOutputStream(), true); // true은
																						// packet이
																						// 가능차지않아도
																						// 내보내는것
						pw.println(msg);

					}
					
				} catch (Exception e2) {
					
				}
			}

		}
	}

	public static void main(String[] arge) {
		
		ServerTest2 ob = new ServerTest2();
		ob.serverStart();

	}

}
