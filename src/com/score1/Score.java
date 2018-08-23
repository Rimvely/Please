package com.score1;

import java.util.Scanner;

public class Score {

	int inwon;
	Record[] rec;
	Scanner sc = new Scanner(System.in);

	public void set() {

		do {

			System.out.print("인원수?"); // /3
			inwon = sc.nextInt();
		} while (inwon < 1 || inwon > 10);

		rec = new Record[inwon];

	}

	public void input() {

		String[] title = { "국어?", "영어?", "수학?" };

		for (int i = 0; i < inwon; i++) {

			rec[i] = new Record();

			System.out.print((i + 1) + " 번째 이름?");
			rec[i].name = sc.next();

			for (int j = 0; j < 3; j++) {

				System.out.print(title[j]);
				rec[i].score[j] = sc.nextInt();// 국영수 점수받기

				rec[i].tot += rec[i].score[j];// 총점수더하기
			}

			rec[i].avg = rec[i].tot / 3;

		}

	}

	
	//석차 계산
	private void ranking() {      //selection sort
		int i, j;

		for (i = 0; i < inwon; i++) {
			rec[i].rank = 1;
		}

		for (i = 0; i < inwon - 1; i++) {
			for (j = i + 1; j < inwon; j++) {

				if (rec[i].tot > rec[j].tot) {
					rec[j].rank++;
				} else if (rec[i].tot < rec[j].tot) {
					rec[i].rank++;
				}

			}
		}

	}
	//성적 출력
	public void print() {

		ranking();

		for (int i = 0; i < inwon; i++) {
			System.out.printf("%6s",rec[i].name);

			for (int j = 0; j < 3; j++) {

				System.out.printf("%4d", rec[i].score[j]);
			}

			System.out.printf("\n합계 : %4d", rec[i].tot);
			System.out.printf("  평균 : %4d", rec[i].avg);
			System.out.printf("  석차 : %4d ", rec[i].rank);
			System.out.println();
			System.out.println("--------------------------------------");

		}
	}
}
