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
						.print("1.입력\n2.출력\n3.삭제\n4.수정\n5.회원이름검색\n6.회원아이디검색\n6.종료\n");
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
				System.out.println("종료합니다.");
				System.exit(0);
			}
		}

	}

}
