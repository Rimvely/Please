package com.score4;

import java.util.Scanner;

public class ScoreMain {

	public static void main(String[] args) {

		// �������̽��� �θ���ؼ� ������ذ�
		// �̰� �ѹ��� �����ϱ� �ݺ����� ���� ��� ����� �Ҳ���
		// Score ob = new ScoreImpl();
		//
		// ob.input();
		// ob.print();

		Scanner sc = new Scanner(System.in);
		Score ob = new ScoreImpl();


		int ch;

		while (true) {

			do {
				System.out.print("1.�Է�\n2.���\n3.����\n4.����\n5.�й��˻�\n6.�̸��˻�\n7.����: ");
				ch = sc.nextInt();
			} while (ch < 1);

			switch (ch) {

			case 1:
				ob.input();
				break;
			case 2:
				ob.print();
				break;
			case 3:
				ob.delete();
				break;
			case 4:
				ob.update();
				break;
			case 5:
				ob.findHak();
				break;
			case 6:
				ob.findName();
				break;
			default:
				System.out.println("�����մϴ�..");
				System.exit(0); // exit(0)
			}

		}

	}

}

// Score ob = new ScoreImpl();
// �������̽���

// ScoreImpl�� input and print ȣ���ؾ���
//
// Score �θ� ���� ScoreImpl �ڽ��̵Ȱ�.
//
// ScoreImpl ob = new ScoreImpl();
//

