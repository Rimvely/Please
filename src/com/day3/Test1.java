package com.day3;

import java.util.*;

class Test1 {

	public static void main(String[] args) {

		// 반본문 (for,while,do~while)

		Scanner sc = new Scanner(System.in);

		int dan;

		System.out.print("원하는 단?"); // 7
		dan = sc.nextInt();

		// for(변수선언, 초기값을 지정;최대값도 지정;증가값도 지정)
		// for(초기값;최대값;증가값;)
		for (int i = 1; i <= 9; i++) { // i=i+1

			// System.out.println(dan + "*" + i + "=" + (dan*i)); 두개 다 가능한것
			System.out.printf("%d*%d=%d\n", dan, i, (dan * i));

		}

		System.out.println("----------");

		// while(최대값)

		int j = 0; // while 문은 기본값은 0

		while (j < 9) {

			j++; // 그래서 j가 늘어나게 명령어를 작성
			System.out.printf("%d*%d=%d\n", dan, j, (dan * j)); // 이렇게만쓰면 j=1 계속
																// 일이라서 무한루프됨

		}

		System.out.println("----------");

		// Dd~while(증가값);

		int k = 0;
		do {
			k++;
			System.out.printf("%d*%d=%d\n", dan, k, (dan * k));

		} while (k < 9);

	}
}
