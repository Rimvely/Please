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
import java.net.URL;
import java.net.URLConnection;

public class Test2 extends Frame implements ActionListener {

	private static final long serialVersionUID = 1L;

	private TextArea ta;
	private TextField tf;

	private Test2() {

		ta = new TextArea();
		add(ta);

		tf = new TextField("http://"); // TextField() 가로에 초기값을 넣어줄수있다.
		tf.addActionListener(this);
		add(tf, BorderLayout.NORTH);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		setTitle("HTML VIEWER");
		setSize(400, 300);
		setVisible(true);

	}

	public static void main(String[] args) {
		new Test2();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

		try {

			String str;
			URL url = new URL(tf.getText());

			ta.setText("");// 초기화 시키기

/*//			-----방법1----
			InputStream is = url.openStream();

			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			// is라인에 있는 그 파이프라인에 있는 정보를 읽어서 br에 넣어놔
//			-----방법1---
*/			
			//방법2
			URLConnection conn = url.openConnection();
			//connd은 파이프를 담고있다.
			
			InputStream is = conn.getInputStream();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			
			String s = conn.getContentType();
			ta.setText("mime type : " + s);
			//charset 타입="utf-8"
			//content 타입=인 이거다라고 알려주는명령어
			
			
			
			while ((str = br.readLine()) != null) {

				if (ta.getText().equals(""))
					ta.setText(str);
				else
					ta.setText(ta.getText() + "\r\n" + str);// 누적

			}

			is.close();

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
