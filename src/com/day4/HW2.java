package com.day4;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {

		// n까지 홀수의 합, 짝수의 합, 전체의 합

		int i = 0, number, sum = 0, evensum = 0, oddsum = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("원하는 n까지의 수의 홀수,짝수,전체의 합을 입력하시오.");
		number = sc.nextInt();

		while (i < 100) {
			i++;
			sum += i;

			if (i % 2 == 0) {
				evensum += i;
			} else {
				oddsum += i;
			}

		}
		System.out.printf("짝수의 합 : %d", evensum);
		System.out.printf("홀수의 합 : %d", oddsum);
		System.out.printf("전체의 합 : %d", sum);

	}

}
