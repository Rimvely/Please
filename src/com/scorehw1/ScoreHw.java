package com.scorehw1;

import java.util.Scanner;

public class ScoreHw {

	int people;
	RecordHw[] rec;
	Scanner sc = new Scanner(System.in);
	String[] title = { "국어?", "영어?", "수학?" };

	public void set() {

		do {
			System.out.println("몇명의 성적을 알고 싶습니까?");
			people = sc.nextInt();
		} while (people < 1 || people > 10);

		rec = new RecordHw[people];
	}

	public void input() {
		
		for (int i = 0; i < people; i++) {
			rec[i] = new RecordHw();

			System.out.println((i + 1) + "번째 이름 :");
			rec[i].name = sc.next();

			for (int j = 0; j < 3; j++) {
				System.out.print(title[j]);
				rec[i].score[j] = sc.nextInt(); // 국어 영어 수학 점수받기
				rec[i].tot += rec[i].score[j];
			}

			rec[i].avg = rec[i].tot / 3;
		}

	}
	
	private String Ranking(int n){     //private voidRanking(int n){ 썼는데 void는 반환값있을시
//		                                                             안되고 반환값이 Str 이니까 
//		                                                             String을 적는다.
		if(n >= 90){
			return "(수)";
		}else if(n >80){
			return "(우)";
		}else if(n >70){
			return "(미)";
		}else if(n >60){
			return "(양)";
		}else
			return "(가)";
	}

	public void print(){
		
		for(int i = 0; i < people; i++){
			System.out.printf("%6s", rec[i].name);
			for(int j = 0; j < 3; j++){
				System.out.printf("%4s %4d %4s",title[j], rec[i].score[j], Ranking(rec[i].score[j]));
			
			}
			
			System.out.printf("\n합계 : %4d", rec[i].tot);
			System.out.printf("  평균 : %4d", rec[i].avg);
//			System.out.printf("  석차 : %4d ", rec[i].rank);
			System.out.println();
			System.out.println("--------------------------------------");
		
		}
	}
}
