package com.network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;

public class Test1 {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {

			String host;

			System.out.print("ȣ��Ʈ[www.naver.com]?");
			host = br.readLine();

			InetAddress ia = InetAddress.getByName(host);
			//�̹� �ѹ� ã�ư��� �� ����� cashe ������ �ִ�.
			//�ٲﳻ�븸 �����ͼ� ���� ���� ����.
			//dns�� ���� ip�� �������°� ������ ���ο� �� ip�� ���� �������ִٸ�
			//���ο� �� ip�� ���� ������ �������� �޶��� ����� ä���ش�.

			System.out.println("ip�ּ�: " + ia.getHostAddress());
			System.out.println("ȣ��Ʈ: " + ia.getHostName());

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
