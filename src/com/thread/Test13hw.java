package com.thread;

import java.util.Random;
import java.util.Scanner;

public class Test13hw extends Thread {

	private int num;

	Random rd = new Random();

	static String[] name = { "�忹��", "��ȫ��", "�ֿ���", "����", "������", "������", "�强��",
			"�ѽ´�", "������", "������", "�贩��", "������", "��뱤", "������", "������", "�̾��",
			"�����", "������", "���Ѱ�", "������", "�Ӵܺ�", "���س�", "������", "������", "�ڿ���",
			"��ο�", "������", "�ڸ�", "�㵵��", "�Ż�" };

	// -------------------------------------------------------------------------------------------------------

	public Test13hw(int inwon) {
		this.num = inwon;
	}

	@Override
	public void run() {

		int i= 0;
		int[] arr = new int[num];

		System.out.print("�����.");
		while (i < 10) {

			System.out.print(".");
			try {
				sleep(300);
			} catch (Exception e) {
				// TODO: handle exception
			}
			i++;
		}
		System.out.println();

		for (int j = 0; j < num; j++) {

			int n = rd.nextInt(30);

			arr[j] = n;

			for (int k = 0; k < j; k++) {
				if (arr[k] == n) {
					j--;
					break;
				}
			}
		}
		

		for (int k = 0; k < num; k++) {
			System.out.println((k + 1) + "�� ��ǥ�� :"
					+ " " + name[arr[k]]);
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int inwon;

		System.out.println("����� �����ǲ��ϱ�?");
		inwon = sc.nextInt();

		Test13hw ob = new Test13hw(inwon);
		ob.start();
		

	}

}

//private final 