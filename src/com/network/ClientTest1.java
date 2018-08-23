package com.network;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ClientTest1 extends Frame implements ActionListener, Runnable {

	private static final long serialVersionUID = 1L;

	private TextArea ta = new TextArea();
	private TextField tf = new TextField();
	private Socket sc = null;
	private int port = 5555; //2000번이상때를 기입해야한다. 
	                         //Client 필요한것 Port number
	private String host = "192.168.16.0";// 127.0.0.1 network 에서 자기 자신주소

	public ClientTest1() {// 생성자만들기

		add(ta, BorderLayout.CENTER);
		add(tf, BorderLayout.SOUTH);
		// 채팅끝나면 엔터작업을치니까
		tf.addActionListener(this);// 엔터작업친걸 받기위해서

		// 종료하기위해서
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}

		});

		setTitle("채팅 서버");
		setSize(300, 400);
		setVisible(true);

	}

	public static void main(String[] args) {
		new ClientTest1().connect();
	}

	@Override
	// ActionListener //데이터보낼때
	public void actionPerformed(ActionEvent e) {
		// 여기선 내가 타이핑을 치는것. 엔터.
		// -------------------------------------------------------
		String str = tf.getText();//읽어와서
		// 타이핑친걸 받아내
		// 그냥 엔터 칠때를 대비해서
		if (str.trim().equals(""))//검사하고
			return; // 아무것도없으면 반응안해도되.

		if (sc == null)//또검사하고
			return; // 너도 아무것도없으면 반응 안해도되

		try {// 내보낼꺼니까
			OutputStream os = sc.getOutputStream();

			PrintWriter pw = new PrintWriter(os, true); // true란 packet이 가능차지않아도
														// 내보내
			pw.println("라영준]" + str); // 서버에게 내보내는거

			ta.append("\r\n라영준]" + str); // 나한테 추가하는거
			tf.setText("");
			tf.requestFocus();

		} catch (Exception e2) {

			ta.append("\r\n서버와의 연결종료...");
			sc = null; // 소켓을 초기화 하지않으면 다음번에 연결할때 연결이 안됨
		}

	}

	// ---------------------------------------------------------------------
	@Override
	// Runnable //데이터를 받을때
	public void run() {
		// 타이핑을 치고 있거나 다른걸 해도 채팅이 오고 가니까
		// Thread가 받는다. Runnable = Thread.

		String str;
		// 서버일때 ip를 받는거라 ip가 필요없다.

		try {

			if (sc == null)
				return;

			// 상대편이 나에게 보내는거니까 input
			InputStream is = sc.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));

			while ((str = br.readLine()) != null) {
				ta.append("\r\n" + str); // 그대로 받아서 출력하면서 추가하기.
			}

		} catch (Exception e) {
			ta.append("\r\n서버연결 종료..");
			sc = null;

		}

	}

	public void connect() { //Thread가 하나라면 한명만 접속가능

		try {

			sc = new Socket(host, port);

			Thread th = new Thread(this);
			th.start(); // run 호출

		} catch (Exception e) {
			System.out.println("서버가 죽어있다."); // 연결하려다가 에러가 난거니까
		}
	}

}
