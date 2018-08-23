package com.scorehw2;

import java.util.Scanner;

public class ScoreImpl implements Score {

	int playerNumber;
	Record[] rec;
	Scanner sc = new Scanner(System.in);
	String[] title = { "French? ", "English? ", "Japaense? " };
	
	@Override
	public void set() {
		System.out.println("10분안에 100개의 언어별 단어를 몇개씩 외울수 있나!\n\n\n");
		System.out.println("참가자 인원수?");
		playerNumber = sc.nextInt();

		rec = new Record[playerNumber];

	}

	@Override
	public void input() {


		for (int i = 0; i < playerNumber; i++) {
			rec[i] = new Record();
			System.out.println((i + 1) + "번째 참가자 이름?");
			rec[i].name = sc.next();

			for (int j = 0; j < 3; j++) {
				System.out.println(title[j]);
				rec[i].score[j] = sc.nextInt();

				rec[i].tot += rec[i].score[j];
			}

			rec[i].avg = rec[i].tot / 3;
		}

	}

	private String capability(int score) { // switch는 마지막에 return이 필요함

		String ca = "";

		switch (score / 10) {

		case 10:
			ca = "순간기억능력자급!";
			break;
		case 9:
			ca = "거의 능력자!";
			break;
		case 8:
			ca = "똑똑하시네요!";
			break;
		case 7:
			ca = "평범하면서 아닌듯한";
			break;
		case 6:
			ca = "평균입니다";
			break;
		default:
			ca = "분발하세요";
			break;

		}
		return ca;

	}

	@Override
	public void print() {
		
		
		for (int i = 0; i < playerNumber; i++) {
			System.out.printf("%6s\n", rec[i].name);

			for (int j = 0; j < 3; j++) {

				System.out.printf("과목 : %s 점수 : %d 평가 : %s \n", title[j], rec[i].score[j],capability(rec[i].score[j]));
			}

			System.out.printf("  합계 : %4d", rec[i].tot);
			System.out.printf("  평균 : %4d", rec[i].avg);
			System.out.println();
			System.out.println("--------------------------------------");

		}
	}



}
