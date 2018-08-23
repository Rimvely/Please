package com.score2;

import java.util.Scanner;

public class ScoreImpl implements Score {

	private int inwon;
	private Record[] rec; // 배열로만들기
	Scanner sc = new Scanner(System.in);

	@Override
	public void set() {   //인원초기화

		do {
			System.out.println("인원수?");
			inwon = sc.nextInt();
		} while (inwon < 1 || inwon > 10);

		rec = new Record[inwon]; // 배열을 인원수만큼만들기. new 붙여라

	}

	@Override
	public void input() {
		for (int i = 0; i < inwon; i++) {

			rec[i] = new Record();
			System.out.println("학번?");
			rec[i].hak = sc.next();

			System.out.println("이름?");
			rec[i].name = sc.next();

			System.out.println("국어?");
			rec[i].kor = sc.nextInt();

			System.out.println("영어?");
			rec[i].eng = sc.nextInt();

			System.out.println("수학?");
			rec[i].mat = sc.nextInt();

			rec[i].tot = rec[i].kor + rec[i].eng + rec[i].mat;

			rec[i].avg = rec[i].tot / 3;

		}
	}

	private String panjung(int score) {   //switch는 마지막에 return이 필요함

		String pan = "";

		switch (score / 10) {

		case 10:
		case 9:
			pan = "수";
			break;
		case 8:
			pan = "우";
			break;
		case 7:
			pan = "미";
			break;
		case 6:
			pan = "양";
			break;
		default:
			pan = "가";
			break;

		}
		return pan;

	}

	@Override
	public void print() {
		
		for(int i = 0; i < inwon; i++){
			System.out.printf("학번: %s  이름: %s\n", rec[i].hak, rec[i].name);
			System.out.printf("국어: %d 영어: %d 수학: %d\n", rec[i].kor, rec[i].eng, rec[i].mat);
			System.out.printf("  합계 : %4d", rec[i].tot);
			System.out.printf("  평균 : %4d\n", rec[i].avg);
			System.out.printf("  국어 : %s ", panjung(rec[i].kor));
			System.out.printf("  영어 : %s ", panjung(rec[i].eng));
			System.out.printf("  수학 : %s ", panjung(rec[i].mat));
			System.out.println();
			System.out.println("--------------------------------------");
			
		}

		
		
	}

}
