package com.day5;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		// ----------------------------------------------------------------------------------------------------------
		// ���� ���ϴ� ��ŭ�� ������ŭ num[] ����� operation
		Scanner sc = new Scanner(System.in);

		int i, j, temp;
		int num[] = new int[5];
		// ----------------------------------------------------------------------------------------------------------
		System.out.println("5���� ������ �Է��ϼ���."); // 5

		for (i = 0; i < num.length; i++) { // i < num.length �� 0���ͽ����̴ϱ�
											// num-1�Ǿ��Ѵ�
			num[i] = sc.nextInt();
		}
		// ----------------------------------------------------------------------------------------------------------
		System.out.println();
		System.out.print("Source Date: ");

		for (i = 0; i < num.length; i++) { // i < num.length �� 0���ͽ����̴ϱ�
											// num-1�Ǿ��Ѵ�

			System.out.printf("%4d", num[i]);
		}

		System.out.println();
		// ----------------------------------------------------------------------------------------------------------
		for (i = 0; i < num.length-1; i++) {
			for (j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;

				}
			}
		}
		System.out.println();
		System.out.printf("������ :%2d\nū  �� :%2d",num[0], num[4]);

	}

}
