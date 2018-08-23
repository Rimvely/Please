package com.scorehw1;

import java.util.Scanner;

public class ScoreHw {

	int people;
	RecordHw[] rec;
	Scanner sc = new Scanner(System.in);
	String[] title = { "����?", "����?", "����?" };

	public void set() {

		do {
			System.out.println("����� ������ �˰� �ͽ��ϱ�?");
			people = sc.nextInt();
		} while (people < 1 || people > 10);

		rec = new RecordHw[people];
	}

	public void input() {
		
		for (int i = 0; i < people; i++) {
			rec[i] = new RecordHw();

			System.out.println((i + 1) + "��° �̸� :");
			rec[i].name = sc.next();

			for (int j = 0; j < 3; j++) {
				System.out.print(title[j]);
				rec[i].score[j] = sc.nextInt(); // ���� ���� ���� �����ޱ�
				rec[i].tot += rec[i].score[j];
			}

			rec[i].avg = rec[i].tot / 3;
		}

	}
	
	private String Ranking(int n){     //private voidRanking(int n){ ��µ� void�� ��ȯ��������
//		                                                             �ȵǰ� ��ȯ���� Str �̴ϱ� 
//		                                                             String�� ���´�.
		if(n >= 90){
			return "(��)";
		}else if(n >80){
			return "(��)";
		}else if(n >70){
			return "(��)";
		}else if(n >60){
			return "(��)";
		}else
			return "(��)";
	}

	public void print(){
		
		for(int i = 0; i < people; i++){
			System.out.printf("%6s", rec[i].name);
			for(int j = 0; j < 3; j++){
				System.out.printf("%4s %4d %4s",title[j], rec[i].score[j], Ranking(rec[i].score[j]));
			
			}
			
			System.out.printf("\n�հ� : %4d", rec[i].tot);
			System.out.printf("  ��� : %4d", rec[i].avg);
//			System.out.printf("  ���� : %4d ", rec[i].rank);
			System.out.println();
			System.out.println("--------------------------------------");
		
		}
	}
}
