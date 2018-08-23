package com.day4;

import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {

		int n,a,b;
		int s = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 항까지의 합을 입력하시오.");
		n = sc.nextInt();

		int num[] = new int[n];
		
		a = 2*(n)-1;
		b = -2*(n);
		
		for (int i = 1; i <= num.length; i++) {
			num[i - 1] = a + b;
		}

		for (int i = 0; i < num.length; i++) {
			s += num[i];
		}

		System.out.println("1부터 " + n + "까지의 합은 " + s + "입니다.");

	}
}
