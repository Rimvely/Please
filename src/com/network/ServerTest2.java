package com.network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ServerTest2 {

	private ArrayList<Socket> clients = new ArrayList<Socket>();

	public void serverStart() { //Ŭ���̾�Ʈ�� ��� �������� sc�� �װ�����ŭ�����.

		try {

			ServerSocket ss = new ServerSocket(5555);
			System.out.println("���� ����....");

			while (true) { // ���ϼ���ŭ �ڵ�����

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
		} // ������ ����

		@Override
		public void run() { //Thread�� ������ ��������� ������ ä�ð���

			String ip = null;
			String msg = null;

			try {

				BufferedReader br = new BufferedReader(new InputStreamReader(
						sc.getInputStream()));

				// IP������ IP�޾ƾ���
				ip = sc.getInetAddress().getHostAddress();//������� ip�� �޾Ƴ�

				// ������ Ŭ���̾�Ʈ
				clients.add(sc); // sc = List�� �־���°ž�. �� Ŭ���̾�Ʈ�� sc���� ip�޾Ƴ���
									// �޼����޾Ƴ���

				// br���� �޼����� ����Ǿ��ִ�.
				// �ٸ� Ŭ���̾�Ʈ���� ���� ��� �˸�
				msg = ip + "]�� ���� �߽��ϴ�!"; //ip�� ����

				for (Socket s : clients) {
					
					//clients�� �Ѹ��� �� �ڱⰡ �ȹް� �ϱ����ؼ�
					//�����״� ����ʿ䰡��� if�ڵ�
					if(s==sc)
						continue; //�̹��� �н�. //�� ������ for���� �ѹ����н�

					PrintWriter pw = new PrintWriter(s.getOutputStream(), true); // true��
																					// packet��
																					// ���������ʾƵ�
																					// �������°�
					pw.println(msg); //�������� ����͸��� ���� �ܼ�â�� ǥ��

				}
				
				System.out.println(msg);//�� �س��� �������� �ϳ� �����
				
				//----------------------------
				
				for (Socket s : clients) {
					
					//clients�� �Ѹ��� �� �ڱⰡ �ȹް� �ϱ����ؼ�
					if(s==sc)
						continue; //�̹��� �н�. //�� ������ for���� �ѹ����н�

					PrintWriter pw = new PrintWriter(s.getOutputStream(), true); // true��
																					// packet��
																					// ���������ʾƵ�
																					// �������°�
					pw.println(msg);

				}

			} catch (Exception e) {
				msg = ip + "] �����ϼ̽��ϴ�";
						
				try {
					for (Socket s : clients) {
						
						//clients�� �Ѹ��� �� �ڱⰡ �ȹް� �ϱ����ؼ�
						if(s==sc)
							continue; //�̹��� �н�. //�� ������ for���� �ѹ����н�

						PrintWriter pw = new PrintWriter(s.getOutputStream(), true); // true��
																						// packet��
																						// ���������ʾƵ�
																						// �������°�
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
