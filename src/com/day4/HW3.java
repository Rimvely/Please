package com.day4;

import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {

		int n,a,b;
		int s = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("���ϴ� �ױ����� ���� �Է��Ͻÿ�.");
		n = sc.nextInt();

		int num[] = new int[n];
		
		a = 2*(n)-1;
		b = -2*(n);
		
		for (int i = 1; i <= num.length; i++) {
			num[i - 1] = a + b;
		}

		for (int i = 0; i < num.length; i++) {
			s += num[i];
		}

		System.out.println("1���� " + n + "������ ���� " + s + "�Դϴ�.");

	}
}
