package com.threemen.project;

import java.util.Scanner;

public class TempMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Member ob = new Member();

		int ch;

		while (true) {

			do {
				System.out
						.print("1.�Է�\n2.���\n3.����\n4.����\n5.ȸ���̸��˻�\n6.ȸ�����̵�˻�\n6.����\n");
				ch = sc.nextInt();
			} while (ch < 1);

			switch (ch) {

			case 1:
				ob.signup();
				break;
			case 2:
				ob.printMemberInfo();
				break;
			case 3:

				break;
			case 4:

				break;
			case 5:

				break;
			case 6:
				break;
			default:
				System.out.println("�����մϴ�.");
				System.exit(0);
			}
		}

	}

}
