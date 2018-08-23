package com.day3;

import java.util.*;
import java.io.*;

class Test3 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int number, sum;
		char choice;

		// 내가 원할때까지 실행되고 stop 하라고 할때까지 하기 위한 방법

		while (true) {// 무한루프 하는 방법

			do {
				System.out.print("수입력? ");
				number = sc.nextInt();
			} while (number < 1 || number > 5000);

			sum = 0; // 초기화 시키기위해 여기에다가 sum=0

			for (int i = 1; i <= number; i++) {
				sum += i;
			}

			System.out.println("1~" + number + " 까지의 합:" + sum);

			System.out.print("계속진행?[Y/N]"); // Y-enter(10,13) ,y, N,n
			choice = (char) System.in.read();

			if (choice != 'Y' && choice != 'y') { // 양쪽이 다 부정이면 가운데 ||(or) 아니라
													// && 가 (or)이 된다
				System.out.println("종료합니다.");
				break; // break를 쓸수있는곳 : while,do~while,for,switch
			}

		}// end of while coding

	}// end of method (main)
}
