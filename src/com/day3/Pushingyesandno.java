package com.day3;

import java.util.*;
import java.io.*;

class Pushingyesandno {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		String check;
		char ch;
		int su, sum = 0;
		boolean exit = true;// boolean�� ���� exit

		while (true) {// ���ѷ���
			sum = 0;
			do {
				System.out.printf("���Է�?");
				su = sc.nextInt();
			} while (su < 1 || su > 5000);

			for (int i = 1; i <= su; i++) {
				sum += i;
			}

			System.out.printf("1~%d ������ ��: %d\n", su, sum);

			do {
				System.out.print("��������Ͻðڽ��ϱ�?(y/n)");

				
				check = sc.next();
				ch = check.charAt(0);// String���� ���� ���ڿ��߿� �ε��� 0�� ���ڸ� char�� ������
										// ch�� �ִ´�.

				if (ch == 'y' || ch == 'Y') {
					exit = false;// exit�� false��� while���� ������ �����̱⶧���� while����
									// �����.
				} else if (ch == 'n' || ch == 'N') {
					System.exit(1);// ���������ϴ� ��ɾ�
				} else {
					System.out.printf("�ٽ��Է��Ͻÿ�.\n");
					exit = true;// exit�� true��� while���� ������ ���̱⶧���� �ٽ� while����
								// ù��° ���� ���ư���.
				}

			} while (exit);

		}// end..while
	}
}// end..main
