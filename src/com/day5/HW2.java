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

				System.out.println("정수를 입력하세요." + n + " 번째 기회");
				answer = sc.nextInt();

				if (num == answer) {
					System.out.println("정답입니다.");

				} else {
					System.out.println("틀렸습니다.");
				}
				if (n == 3) {
					System.out.println("틀렸습니다. 정답은" + num + " 입니다.\n다음기회에...");
				}
				n++;
				
			}
			
			break;

		}

		do{
			System.out.print("계속진행하시겠습니까?(y/n)");

			check = sc.next();
			ch = check.charAt(0);// String으로 받은 문자열중에 인덱스 0인 문자를 char형 변수인
									// ch에 넣는다.

			if (ch == 'y' || ch == 'Y') {
				exit = false;// exit가 false라면 while문의 조건이 거짓이기때문에 while문을
								// 벗어난다.
			} else if (ch == 'n' || ch == 'N') {
				System.exit(1);// 강제종료하는 명령어
			} else {
				System.out.printf("다시입력하시오.\n");
				exit = true;// exit가 true라면 while문의 조건이 참이기때문에 다시 while문의
							// 첫번째 열로 돌아간다.
			}

		}while (exit);

	}

}
