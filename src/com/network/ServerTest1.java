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

	public ServerTest1() {// �����ڸ����

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
		new ServerTest1().serverStart(); // �����ڽ��� �� ���� ��ŸƮ ����
	}

	@Override
	// ActionListener //�����ͺ�����
	public void actionPerformed(ActionEvent e) {
		// ���⼱ ���� Ÿ������ ġ�°�. ����.
		// -------------------------------------------------------
		String str = tf.getText();// Ÿ����ģ�� �޾Ƴ�
		// �׳� ���� ĥ���� ����ؼ�
		if (str.trim().equals(""))
			return; // �ƹ��͵������� �������ص���.

		if (sc == null)
			return; // �ʵ� �ƹ��͵������� ���� ���ص���
		            // ������ �ƴ��� Ȯ���ϰ� - Ŭ���̾�Ʈ�� ����Ǿ����� Ȯ���ϴ°� sc==null�̸� ����x

		try {// ���������ϱ�
			OutputStream os = sc.getOutputStream();

			PrintWriter pw = new PrintWriter(os, true); // true�� packet�� ���������ʾƵ�
														// ������
			pw.println("����]" + str); // Ŭ���̾�Ʈ���� �������°�
			//pw.print�Ͻ� ���������� �ʴ´�. println�̿��� �����Ͱ� ������.
			

			ta.append("\r\n����]" + str); // �� â�� ���� ���
			tf.setText("");
			tf.requestFocus();

		} catch (Exception e2) {

			ta.append("\r\nŬ���̾�Ʈ�� ��������...");
			sc = null; //Ŭ���̾�Ʈ�� �ʱ�ȭ 
			           //������ �ʱ�ȭ ���������� �������� �����Ҷ� ������ �ȵ�
		}

	}

	// ---------------------------------------------------------------------
	@Override
	// Runnable //�����͸� ������
	public void run() {
		// Ÿ������ ġ�� �ְų� �ٸ��� �ص� ä���� ���� ���ϱ�
		// Thread�� �޴´�. Runnable = Thread.

		String str;
		String ip; // ������� ä�ð� ���ÿ� ������ ip�� �����⶧����

		try {

			if (sc == null)
				return;

			// ������� ������ �����°Ŵϱ� input
			InputStream is = sc.getInputStream(); //��ǲ��Ʈ������ ��� is�� ��Ƶΰ�
			BufferedReader br = new BufferedReader(new InputStreamReader(is));

			ip = sc.getInetAddress().getHostAddress(); // IP�޴��ڵ�
			ta.append("\r\n[" + ip + "]����!!");

			while ((str = br.readLine()) != null) {
				ta.append("\r\n" + str); // �״�� �޾Ƽ� ����ϸ鼭 �߰��ϱ�.
			}

		} catch (Exception e) {
			ta.append("\r\nŬ���̾�Ʈ ����..");
			sc = null;
			ss = null;
		}

	}

	// Ŭ���̾�Ʈ�� ������ �����ϱ���� �غ����
	// ���� ��ŸƮ�� ȥ�� ����Ǵ°� �ƴϴ�
	// ���ο� ���� new ServerTest1().serverStart();
	public void serverStart() {

		try {

			// ���� ������ ���� - Ŭ���̾�Ʈ�� ������ �ߴٸ� ������ ��������
			// (5555)��Ʈ��ȣ �������� ��Ʈ��ȣ(2000���̻��̸� ��������)
			ss = new ServerSocket(5555);
			ta.setText("��������!!");

			// ------------------------------------------------------  ù �����̿������. ������ ���۵�.

			// Ŭ���̾�Ʈ�� ������ ��ٸ�
			// sc = �� ������ �Ǹ�
			sc = ss.accept(); // Ŭ���̾�Ʈ�� ������ �������ԵǸ� ������ Ŭ���̾�Ʈ�� ������ �� ����

			Thread th = new Thread(this);
			th.start(); // run ȣ��

		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
