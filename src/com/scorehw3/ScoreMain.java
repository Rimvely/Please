package com.scorehw3;

import java.util.Scanner;

public class ScoreMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Score ob = new ScoreImpl();

		int ch;

		while (true) {

			do {
				System.out
						.print("1.입력\n2.출력\n3.삭제\n4.수정\n5.회원번호검색\n6.이름검색\n7.종료\n");
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
				ob.remove();
				break;

			case 4:
				ob.update();
				break;

			case 5:
				ob.findNumber();
				break;

			case 6:
				ob.findNumber();
				break;

			default:
				System.out.println("종료합니다.");
				System.exit(0);

			}

		}

	}

}
