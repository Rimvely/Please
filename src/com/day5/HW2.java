package com.day5;

import java.util.Random;
import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		int num, n = 1;
		int answer;
		num = rd.nextInt(10) + 1;
		String check;
		char ch;
		boolean exit = true;

		while (true) {

			while (n < 4) {

				System.out.println("������ �Է��ϼ���." + n + " ��° ��ȸ");
				answer = sc.nextInt();

				if (num == answer) {
					System.out.println("�����Դϴ�.");

				} else {
					System.out.println("Ʋ�Ƚ��ϴ�.");
				}
				if (n == 3) {
					System.out.println("Ʋ�Ƚ��ϴ�. ������" + num + " �Դϴ�.\n������ȸ��...");
				}
				n++;
				
			}
			
			break;

		}

		do{
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

		}while (exit);

	}

}
