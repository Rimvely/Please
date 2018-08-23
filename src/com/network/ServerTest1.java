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

public class ServerTest1 extends Frame implements ActionListener, Runnable {

	private static final long serialVersionUID = 1L;

	private TextArea ta = new TextArea();
	private TextField tf = new TextField();
	private ServerSocket ss = null;
	private Socket sc = null;

	public ServerTest1() {// 생성자만들기

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
		new ServerTest1().serverStart(); // 생성자실행 및 서버 스타트 실행
	}

	@Override
	// ActionListener //데이터보낼때
	public void actionPerformed(ActionEvent e) {
		// 여기선 내가 타이핑을 치는것. 엔터.
		// -------------------------------------------------------
		String str = tf.getText();// 타이핑친걸 받아내
		// 그냥 엔터 칠때를 대비해서
		if (str.trim().equals(""))
			return; // 아무것도없으면 반응안해도되.

		if (sc == null)
			return; // 너도 아무것도없으면 반응 안해도되
		            // 연결이 됐는지 확인하고 - 클라이언트와 연결되었는지 확인하는것 sc==null이면 연결x

		try {// 내보낼꺼니까
			OutputStream os = sc.getOutputStream();

			PrintWriter pw = new PrintWriter(os, true); // true란 packet이 가능차지않아도
														// 내보내
			pw.println("서버]" + str); // 클라이언트에게 내보내는거
			//pw.print일시 나가지지가 않는다. println이여야 데이터가 나간다.
			

			ta.append("\r\n서버]" + str); // 내 창에 띄우는 방법
			tf.setText("");
			tf.requestFocus();

		} catch (Exception e2) {

			ta.append("\r\n클라이언트와 연결종료...");
			sc = null; //클라이언트와 초기화 
			           //소켓을 초기화 하지않으면 다음번에 연결할때 연결이 안됨
		}

	}

	// ---------------------------------------------------------------------
	@Override
	// Runnable //데이터를 받을때
	public void run() {
		// 타이핑을 치고 있거나 다른걸 해도 채팅이 오고 가니까
		// Thread가 받는다. Runnable = Thread.

		String str;
		String ip; // 상대편은 채팅과 동시에 나에게 ip를 보내기때문에

		try {

			if (sc == null)
				return;

			// 상대편이 나에게 보내는거니까 input
			InputStream is = sc.getInputStream(); //인풋스트림으로 열어서 is에 담아두고
			BufferedReader br = new BufferedReader(new InputStreamReader(is));

			ip = sc.getInetAddress().getHostAddress(); // IP받는코딩
			ta.append("\r\n[" + ip + "]접속!!");

			while ((str = br.readLine()) != null) {
				ta.append("\r\n" + str); // 그대로 받아서 출력하면서 추가하기.
			}

		} catch (Exception e) {
			ta.append("\r\n클라이언트 종료..");
			sc = null;
			ss = null;
		}

	}

	// 클라이언트가 서버에 접속하기까지 준비과정
	// 서버 스타트는 혼자 실행되는게 아니다
	// 메인에 가서 new ServerTest1().serverStart();
	public void serverStart() {

		try {

			// 서버 소켓을 생성 - 클라이언트가 접속을 했다면 소켓을 만들어야지
			// (5555)포트번호 직접생성 포트번호(2000번이상이면 문제없음)
			ss = new ServerSocket(5555);
			ta.setText("서버시작!!");

			// ------------------------------------------------------  첫 시작이여기까지. 서버만 시작됨.

			// 클라이언트의 접속을 기다림
			// sc = 에 연결이 되면
			sc = ss.accept(); // 클라이언트가 서버를 가져오게되면 서버와 클라이언트가 접속이 된 상태

			Thread th = new Thread(this);
			th.start(); // run 호출

		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
