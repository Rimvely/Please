package com.day4;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {

		int number;
		int an = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("������ number�ױ����� ���� �Է��Ͻÿ�.");
		number = sc.nextInt();

		int num[] = new int[number];

		for (int i = 1; i <= num.length; i++) {

			num[i - 1] = i * (i + 1) / 2;
		}

		for (int i = 0; i < num.length; i++) {
			an += num[i];
			
		}

		System.out.println("��� : " + an);

		// System.out.print(n + "��°������ ���� " + s + "�Դϴ�.\n");

	}

}
