package com.day3;

import java.util.*;

class Test1 {

	public static void main(String[] args) {

		// �ݺ��� (for,while,do~while)

		Scanner sc = new Scanner(System.in);

		int dan;

		System.out.print("���ϴ� ��?"); // 7
		dan = sc.nextInt();

		// for(��������, �ʱⰪ�� ����;�ִ밪�� ����;�������� ����)
		// for(�ʱⰪ;�ִ밪;������;)
		for (int i = 1; i <= 9; i++) { // i=i+1

			// System.out.println(dan + "*" + i + "=" + (dan*i)); �ΰ� �� �����Ѱ�
			System.out.printf("%d*%d=%d\n", dan, i, (dan * i));

		}

		System.out.println("----------");

		// while(�ִ밪)

		int j = 0; // while ���� �⺻���� 0

		while (j < 9) {

			j++; // �׷��� j�� �þ�� ��ɾ �ۼ�
			System.out.printf("%d*%d=%d\n", dan, j, (dan * j)); // �̷��Ը����� j=1 ���
																// ���̶� ���ѷ�����

		}

		System.out.println("----------");

		// Dd~while(������);

		int k = 0;
		do {
			k++;
			System.out.printf("%d*%d=%d\n", dan, k, (dan * k));

		} while (k < 9);

	}
}
