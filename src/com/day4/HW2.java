package com.day4;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {

		// n���� Ȧ���� ��, ¦���� ��, ��ü�� ��

		int i = 0, number, sum = 0, evensum = 0, oddsum = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("���ϴ� n������ ���� Ȧ��,¦��,��ü�� ���� �Է��Ͻÿ�.");
		number = sc.nextInt();

		while (i < 100) {
			i++;
			sum += i;

			if (i % 2 == 0) {
				evensum += i;
			} else {
				oddsum += i;
			}

		}
		System.out.printf("¦���� �� : %d", evensum);
		System.out.printf("Ȧ���� �� : %d", oddsum);
		System.out.printf("��ü�� �� : %d", sum);

	}

}
