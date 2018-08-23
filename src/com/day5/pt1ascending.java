package com.day5;

import java.util.Scanner;

public class pt1ascending {

	public static void main(String[] args) {

		// Test1을 숫자를 입력하게해서 내림오름차순으로 만들기
		
//		---------------------------------------------------------------------------------------

		Scanner sc = new Scanner(System.in);

		System.out.println("원하는 다섯개의 숫자를 입력하시오.");
		
		int num[] = new int[5]; // 다섯개 입력하기위해서 5개만들어

		int i, j, temp;

//	---------------------------------------------------------------------------------------	
		
		for (i = 0; i < num.length; i++) { // i < num.length 는 0부터시작이니까
											// num-1되야한다
			num[i] = sc.nextInt();

		}
		
//		---------------------------------------------------------------------------------------

		System.out.print("Source Date: ");

		for (i = 0; i < num.length; i++) {  // i < num.length 는 0부터시작이니까
											// num-1되야한다

			System.out.printf("%4d", num[i]);
		}

		System.out.println();
		
//		---------------------------------------------------------------------------------------

		// 연산

		// Selection Sort
		for (i = 0; i < num.length - 1; i++) { // 칸수보다 -1 적게 계산

			for (j = i + 1; j < num.length; j++) {

				if (num[i] > num[j]) { // num[i] < num[j] 내림차순이 됨
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;

				}

				// System.out.println(i + ":" + j);
			}

		}
		
//		---------------------------------------------------------------------------------------

		// 출력
		System.out.print("Sorted Date: ");

		for (int n : num) { // 확장for문 //Array for문
							// i < num.length 는 0부터시작이니까 num-1되야한다

			System.out.printf("%4d", n);
		}

	}
}
