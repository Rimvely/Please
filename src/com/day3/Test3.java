package com.day3;

import java.util.*;
import java.io.*;

class Test3 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int number, sum;
		char choice;

		// ���� ���Ҷ����� ����ǰ� stop �϶�� �Ҷ����� �ϱ� ���� ���

		while (true) {// ���ѷ��� �ϴ� ���

			do {
				System.out.print("���Է�? ");
				number = sc.nextInt();
			} while (number < 1 || number > 5000);

			sum = 0; // �ʱ�ȭ ��Ű������ ���⿡�ٰ� sum=0

			for (int i = 1; i <= number; i++) {
				sum += i;
			}

			System.out.println("1~" + number + " ������ ��:" + sum);

			System.out.print("�������?[Y/N]"); // Y-enter(10,13) ,y, N,n
			choice = (char) System.in.read();

			if (choice != 'Y' && choice != 'y') { // ������ �� �����̸� ��� ||(or) �ƴ϶�
													// && �� (or)�� �ȴ�
				System.out.println("�����մϴ�.");
				break; // break�� �����ִ°� : while,do~while,for,switch
			}

		}// end of while coding

	}// end of method (main)
}
