package com.network;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

//  UDP    = 속도가 빠른 송수신. 데이터 검증x 근거리데이터 송수신에 쓰임 LAN
//  TCP/IP = TCP 데이터를 보냄. IP 송,수신 데이터를 검증(신중)=수신률 100%. 장거리데이터에 쓰임.인터넷표준규격.

public class ChatCS extends Frame implements ActionListener, Runnable {

	private static final long serialVersionUID = 1L;

	private MulticastSocket ms = null;
	private InetAddress xGroup = null;

	private String host = "230.0.0.1";// 이 호스트는 D클래스꺼 중 하나
	private int port = 7777;
	private String userName = "리";

	private TextArea ta = new TextArea();
	private TextField tf = new TextField();

	/*
	 * DatagramSocket : UDP로 데이터그램 패킷을 전송하거나 수신 DatagramPacket : UDP를 이용하여 전송할수
	 * 있는 데이터 MulticastSocket : 다수의 클라이언트에 데이터그램을 전송 그룹범위 : D Class
	 * (224.0.0.0~239.255.255.255)
	 */

	public ChatCS() {

		ta.setEditable(false);// TestArea를 편집할수없게 만드는것
		add(ta, BorderLayout.CENTER);

		add(tf, BorderLayout.SOUTH);
		tf.addActionListener(this);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		setTitle("채팅");
		setSize(400, 400);
		setVisible(true);
		tf.requestFocus();

	}

	public void setup() {

		try {

			xGroup = InetAddress.getByName(host); // 호스트그룹의 IP를 가져올것이다.

			ms = new MulticastSocket(port); // 그 그룹에 port 번호를 만든것

			// 특정 그룹에 포함
			ms.joinGroup(xGroup); // 같은 그룹끼리 송수신가능

			Thread th = new Thread(this);
			th.start();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

	public void disConnect() {

		try {

			// 특정그룹에서 빠져나옴
			ms.leaveGroup(xGroup);
			ms.close();

		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	public static void main(String[] args) {
		new ChatCS().setup();
	}

	@Override
	// 받을때
	public void run() {

		try {

			while (true) {

				byte[] buffer = new byte[512];

				// 전송받을 패킷
				DatagramPacket dp = new DatagramPacket(buffer, buffer.length);

				// 전송 받기
				ms.receive(dp); // 이렇게 받을애를 처리하기위해서
				// 처리작업
				String str = new String(dp.getData()).trim(); // trim() 앞뒤 공백 제거
																// dp.getDate()
																// byte단위로 데이터를
																// "문자"로 받는것

				ta.append(str + "\r\n");
				// ----------------------여기까지 처리 및 받는 작업.

			}

		} catch (Exception e) {
			System.out.println(e.toString());
			disConnect();
		}
	}

	@Override
	// 보낼때
	public void actionPerformed(ActionEvent arg0) {

		String str = tf.getText().trim();

		if (str.equals(""))
			return;

		byte[] buffer = (userName + "  :  " + str).getBytes();
		// 여긴 스트링이라거 .이후 바이트로 형변환

		try {

			DatagramPacket dp = new DatagramPacket(buffer, buffer.length,
					xGroup, port);
			// 버퍼에있는 그룹을 버퍼의 길이만큼 xGroup에 port로 보낸다.

			ms.send(dp);

			tf.setText("");
			tf.requestFocus();

		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
