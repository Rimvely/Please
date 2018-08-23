package com.day5;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		// ----------------------------------------------------------------------------------------------------------
		// 내가 원하는 만큼의 갯수만큼 num[] 만드는 operation
		Scanner sc = new Scanner(System.in);

		int i, j, temp;
		int num[] = new int[5];
		// ----------------------------------------------------------------------------------------------------------
		System.out.println("5개의 정수를 입력하세요."); // 5

		for (i = 0; i < num.length; i++) { // i < num.length 는 0부터시작이니까
											// num-1되야한다
			num[i] = sc.nextInt();
		}
		// ----------------------------------------------------------------------------------------------------------
		System.out.println();
		System.out.print("Source Date: ");

		for (i = 0; i < num.length; i++) { // i < num.length 는 0부터시작이니까
											// num-1되야한다

			System.out.printf("%4d", num[i]);
		}

		System.out.println();
		// ----------------------------------------------------------------------------------------------------------
		for (i = 0; i < num.length-1; i++) {
			for (j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;

				}
			}
		}
		System.out.println();
		System.out.printf("작은수 :%2d\n큰  수 :%2d",num[0], num[4]);

	}

}
