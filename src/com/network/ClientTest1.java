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
	private int port = 5555; //2000���̻󶧸� �����ؾ��Ѵ�. 
	                         //Client �ʿ��Ѱ� Port number
	private String host = "192.168.16.0";// 127.0.0.1 network ���� �ڱ� �ڽ��ּ�

	public ClientTest1() {// �����ڸ����

		add(ta, BorderLayout.CENTER);
		add(tf, BorderLayout.SOUTH);
		// ä�ó����� �����۾���ġ�ϱ�
		tf.addActionListener(this);// �����۾�ģ�� �ޱ����ؼ�

		// �����ϱ����ؼ�
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}

		});

		setTitle("ä�� ����");
		setSize(300, 400);
		setVisible(true);

	}

	public static void main(String[] args) {
		new ClientTest1().connect();
	}

	@Override
	// ActionListener //�����ͺ�����
	public void actionPerformed(ActionEvent e) {
		// ���⼱ ���� Ÿ������ ġ�°�. ����.
		// -------------------------------------------------------
		String str = tf.getText();//�о�ͼ�
		// Ÿ����ģ�� �޾Ƴ�
		// �׳� ���� ĥ���� ����ؼ�
		if (str.trim().equals(""))//�˻��ϰ�
			return; // �ƹ��͵������� �������ص���.

		if (sc == null)//�ǰ˻��ϰ�
			return; // �ʵ� �ƹ��͵������� ���� ���ص���

		try {// ���������ϱ�
			OutputStream os = sc.getOutputStream();

			PrintWriter pw = new PrintWriter(os, true); // true�� packet�� ���������ʾƵ�
														// ������
			pw.println("����]" + str); // �������� �������°�

			ta.append("\r\n����]" + str); // ������ �߰��ϴ°�
			tf.setText("");
			tf.requestFocus();

		} catch (Exception e2) {

			ta.append("\r\n�������� ��������...");
			sc = null; // ������ �ʱ�ȭ ���������� �������� �����Ҷ� ������ �ȵ�
		}

	}

	// ---------------------------------------------------------------------
	@Override
	// Runnable //�����͸� ������
	public void run() {
		// Ÿ������ ġ�� �ְų� �ٸ��� �ص� ä���� ���� ���ϱ�
		// Thread�� �޴´�. Runnable = Thread.

		String str;
		// �����϶� ip�� �޴°Ŷ� ip�� �ʿ����.

		try {

			if (sc == null)
				return;

			// ������� ������ �����°Ŵϱ� input
			InputStream is = sc.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));

			while ((str = br.readLine()) != null) {
				ta.append("\r\n" + str); // �״�� �޾Ƽ� ����ϸ鼭 �߰��ϱ�.
			}

		} catch (Exception e) {
			ta.append("\r\n�������� ����..");
			sc = null;

		}

	}

	public void connect() { //Thread�� �ϳ���� �Ѹ� ���Ӱ���

		try {

			sc = new Socket(host, port);

			Thread th = new Thread(this);
			th.start(); // run ȣ��

		} catch (Exception e) {
			System.out.println("������ �׾��ִ�."); // �����Ϸ��ٰ� ������ ���Ŵϱ�
		}
	}

}
