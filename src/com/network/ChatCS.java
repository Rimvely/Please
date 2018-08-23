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

//  UDP    = �ӵ��� ���� �ۼ���. ������ ����x �ٰŸ������� �ۼ��ſ� ���� LAN
//  TCP/IP = TCP �����͸� ����. IP ��,���� �����͸� ����(����)=���ŷ� 100%. ��Ÿ������Ϳ� ����.���ͳ�ǥ�ر԰�.

public class ChatCS extends Frame implements ActionListener, Runnable {

	private static final long serialVersionUID = 1L;

	private MulticastSocket ms = null;
	private InetAddress xGroup = null;

	private String host = "230.0.0.1";// �� ȣ��Ʈ�� DŬ������ �� �ϳ�
	private int port = 7777;
	private String userName = "��";

	private TextArea ta = new TextArea();
	private TextField tf = new TextField();

	/*
	 * DatagramSocket : UDP�� �����ͱ׷� ��Ŷ�� �����ϰų� ���� DatagramPacket : UDP�� �̿��Ͽ� �����Ҽ�
	 * �ִ� ������ MulticastSocket : �ټ��� Ŭ���̾�Ʈ�� �����ͱ׷��� ���� �׷���� : D Class
	 * (224.0.0.0~239.255.255.255)
	 */

	public ChatCS() {

		ta.setEditable(false);// TestArea�� �����Ҽ����� ����°�
		add(ta, BorderLayout.CENTER);

		add(tf, BorderLayout.SOUTH);
		tf.addActionListener(this);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		setTitle("ä��");
		setSize(400, 400);
		setVisible(true);
		tf.requestFocus();

	}

	public void setup() {

		try {

			xGroup = InetAddress.getByName(host); // ȣ��Ʈ�׷��� IP�� �����ð��̴�.

			ms = new MulticastSocket(port); // �� �׷쿡 port ��ȣ�� �����

			// Ư�� �׷쿡 ����
			ms.joinGroup(xGroup); // ���� �׷쳢�� �ۼ��Ű���

			Thread th = new Thread(this);
			th.start();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

	public void disConnect() {

		try {

			// Ư���׷쿡�� ��������
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
	// ������
	public void run() {

		try {

			while (true) {

				byte[] buffer = new byte[512];

				// ���۹��� ��Ŷ
				DatagramPacket dp = new DatagramPacket(buffer, buffer.length);

				// ���� �ޱ�
				ms.receive(dp); // �̷��� �����ָ� ó���ϱ����ؼ�
				// ó���۾�
				String str = new String(dp.getData()).trim(); // trim() �յ� ���� ����
																// dp.getDate()
																// byte������ �����͸�
																// "����"�� �޴°�

				ta.append(str + "\r\n");
				// ----------------------������� ó�� �� �޴� �۾�.

			}

		} catch (Exception e) {
			System.out.println(e.toString());
			disConnect();
		}
	}

	@Override
	// ������
	public void actionPerformed(ActionEvent arg0) {

		String str = tf.getText().trim();

		if (str.equals(""))
			return;

		byte[] buffer = (userName + "  :  " + str).getBytes();
		// ���� ��Ʈ���̶�� .���� ����Ʈ�� ����ȯ

		try {

			DatagramPacket dp = new DatagramPacket(buffer, buffer.length,
					xGroup, port);
			// ���ۿ��ִ� �׷��� ������ ���̸�ŭ xGroup�� port�� ������.

			ms.send(dp);

			tf.setText("");
			tf.requestFocus();

		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
