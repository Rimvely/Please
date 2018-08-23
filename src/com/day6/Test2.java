package com.day6;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		// �ֹι�ȣ �˻�
		// str : 01234567890123(�����ε���)
		// jumin : 941231-2053128
		// check : 234567 892345(�ֹι�ȣ�� ����ٴϴ� ����Ű��)

		// ��=(9*2)+(4*3)+...+(2*5)
		// ��=11-%11
		// ��=��%10
		// ��==8

		Scanner sc = new Scanner(System.in);

		String str;
		int[] check = { 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5 };
		int i, total, number;

		System.out.print("�ֹι�ȣ�� �Է��ϼ���."); // 6�ڸ� -1�ڸ� 7�ڸ� = 14�ڸ�
		str = sc.next();

		if (str.length() != 14) {

			System.out.println("�Է¿���!");
			return;// main�޼ҵ带 ��������(stop)
		}

		total = 0;

		for (i = 0; i < 12; i++) {

			if (i >= 6) {

				total += check[i]
						* Integer.parseInt(str.substring(i + 1, i + 2));

			} else {
				total += check[i] * Integer.parseInt(str.substring(i, i + 1));
			}

		}
		
		number = 11 - total % 11;
		number = number % 10;
		
		if (number==Integer.parseInt(str.substring(13))){
			System.out.println("��Ȯ�� �ֹι�ȣ!!");
		}else{
			System.out.println("Ʋ���ֹι�ȣ!!");
		}
	}
}

/*
 * String str = "Seoul Korea"; //01234567890 ����ڸ� �ۼ��ϴ� �ε����� �������
 * 
 * System.out.println(str.substring(0, 3)); //Seo
 * System.out.println(str.substring(6, 8)); //Ko
 * System.out.println(str.substring(6)); //Korea 6�������ͳ�����
 */