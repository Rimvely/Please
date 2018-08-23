package com.day5;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {

		// 10명이내의 이름과 점수를 입력받아
		// --------------------------------------------------------------------------------------------
		// 석차 구하기

		Scanner sc = new Scanner(System.in);

		String[] name;
		int[] score, rank;
		int i, j, inwon, temp1;
		String temp2;
		// --------------------------------------------------------------------------------------------

		do {
			System.out.print("인원수[1-10]?");
			inwon = sc.nextInt();

		} while (inwon < 1 || inwon > 10);

		name = new String[inwon];
		score = new int[inwon];
		rank = new int[inwon];

		for (i = 0; i < inwon; i++) {
			rank[i] = 1;
		}

		// --------------------------------------------------------------------------------------------

		for (i = 0; i < inwon; i++) {
			System.out.print((i + 1) + " 번째 이름?");
			name[i] = sc.next();

			System.out.print("점수?");
			score[i] = sc.nextInt();
		}
		// --------------------------------------------------------------------------------------------

		for (i = 0; i < inwon - 1; i++) {

			for (j = i + 1; j < inwon; j++) {

				if (score[i] > score[j]) {

					rank[j]++;
				} else if (score[i] < score[j]) {
					rank[i]++;
				}
			}
		}
		// --------------------------------------------------------------------------------------------
		System.out.println();

		for (i = 0; i < inwon; i++) {
			System.out.printf("%8s %4d %4d", name[i], score[i], rank[i]);
			System.out.println();
		}

	}

}
