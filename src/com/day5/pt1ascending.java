package com.day5;

import java.util.Scanner;

public class pt1ascending {

	public static void main(String[] args) {

		// Test1�� ���ڸ� �Է��ϰ��ؼ� ���������������� �����
		
//		---------------------------------------------------------------------------------------

		Scanner sc = new Scanner(System.in);

		System.out.println("���ϴ� �ټ����� ���ڸ� �Է��Ͻÿ�.");
		
		int num[] = new int[5]; // �ټ��� �Է��ϱ����ؼ� 5�������

		int i, j, temp;

//	---------------------------------------------------------------------------------------	
		
		for (i = 0; i < num.length; i++) { // i < num.length �� 0���ͽ����̴ϱ�
											// num-1�Ǿ��Ѵ�
			num[i] = sc.nextInt();

		}
		
//		---------------------------------------------------------------------------------------

		System.out.print("Source Date: ");

		for (i = 0; i < num.length; i++) {  // i < num.length �� 0���ͽ����̴ϱ�
											// num-1�Ǿ��Ѵ�

			System.out.printf("%4d", num[i]);
		}

		System.out.println();
		
//		---------------------------------------------------------------------------------------

		// ����

		// Selection Sort
		for (i = 0; i < num.length - 1; i++) { // ĭ������ -1 ���� ���

			for (j = i + 1; j < num.length; j++) {

				if (num[i] > num[j]) { // num[i] < num[j] ���������� ��
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;

				}

				// System.out.println(i + ":" + j);
			}

		}
		
//		---------------------------------------------------------------------------------------

		// ���
		System.out.print("Sorted Date: ");

		for (int n : num) { // Ȯ��for�� //Array for��
							// i < num.length �� 0���ͽ����̴ϱ� num-1�Ǿ��Ѵ�

			System.out.printf("%4d", n);
		}

	}
}
