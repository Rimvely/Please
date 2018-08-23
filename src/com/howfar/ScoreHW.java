package com.howfar;

import java.util.Scanner;

public class ScoreHW {

	int people;
	RecordHW[] rec;
	Scanner sc = new Scanner(System.in);
	// --------QUESTION------------------------------------------------------------------
	public void set() {

		while (true) {

			System.out.printf("몇분이세요?");
			people = sc.nextInt();
			if (people < 1 || people >= 5) {
				System.out.printf("5명이상은 칠수없습니다.\n");
			} else
				break;
		}
		rec = new RecordHW[people];
	}
	// ---------DATA INPUT---------------------------------------------------------------
	public void input() {

		String[] title = { "1st shot", "2nd shot", "3rd shot" };

		for (int i = 0; i < people; i++) {

			rec[i] = new RecordHW();

			System.out.print((i + 1) + " 번째의 이름은?");
			rec[i].name = sc.next();

			for (int j = 0; j < 3; j++) {
				System.out.print(title[j]);
				rec[i].meter[j] = sc.nextDouble();//
				rec[i].tot += rec[i].meter[j];
			}
			rec[i].avg = rec[i].tot / 3;
		}
	}
// ---------RANKING---------------------------------------------------------------
	private void ranking(){
		
		int i,j;
		for(i = 0; i < people; i++){
			rec[i].rank = 1;
		}
		
		for(i = 0; i < people - 1; i++){
			for(j = 0; j < people; j++){
				
				if(rec[i].tot > rec[j].tot){
					rec[j].rank++;
				}else if(rec[i].tot < rec[j].tot){
					rec[i].rank++;
				}
			}
		}
	}
		
	public void print(){
		
		ranking(); //private 이기때문에 직원이 그 부서에가서 가져와야한다.
		
		for(int i = 0; i < people; i++){
			System.out.printf("%6s\n", rec[i].name);
			
			for(int j = 0; j < 3; j++){
				System.out.printf("%.2f meters\n", rec[i].meter[j]);
			}
			
			System.out.printf("\n합계 : %.2f meters", rec[i].tot);
			System.out.printf("\n평균 : %.2f meters", rec[i].avg);
			System.out.printf("\n석차 : %4d 등", rec[i].rank);
			System.out.println();
			System.out.println("--------------------------------------");
		}
		
		System.out.println();
		
		
		
		
		
		
	}

}
