package com.naver;

import java.util.Scanner;

public class NaverMain {
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Naver ob = new NaverImpl();

		int ch;

		while (true) {

			do {
				System.out
						.print("1.�Է�\n2.���\n3.����\n4.����\n5.ȸ���̸��˻�\n6.ȸ�����̵�˻�\n6.����\n");
				ch = sc.nextInt();
			} while (ch < 1);
			
			switch(ch){
			
			case 1:
				ob.input();
				break;
			case 2:
				ob.print();
				break;
			case 3:
				ob.remove();
				break;
			case 4:
				ob.update();
				break;
			case 5:
				ob.findName();
				break;
			case 6:
				ob.findId();
				break;
			default:
				System.out.println("�����մϴ�.");
				System.exit(0);
			}
		}

	}

}
