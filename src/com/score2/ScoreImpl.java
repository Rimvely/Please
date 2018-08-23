package com.score2;

import java.util.Scanner;

public class ScoreImpl implements Score {

	private int inwon;
	private Record[] rec; // �迭�θ����
	Scanner sc = new Scanner(System.in);

	@Override
	public void set() {   //�ο��ʱ�ȭ

		do {
			System.out.println("�ο���?");
			inwon = sc.nextInt();
		} while (inwon < 1 || inwon > 10);

		rec = new Record[inwon]; // �迭�� �ο�����ŭ�����. new �ٿ���

	}

	@Override
	public void input() {
		for (int i = 0; i < inwon; i++) {

			rec[i] = new Record();
			System.out.println("�й�?");
			rec[i].hak = sc.next();

			System.out.println("�̸�?");
			rec[i].name = sc.next();

			System.out.println("����?");
			rec[i].kor = sc.nextInt();

			System.out.println("����?");
			rec[i].eng = sc.nextInt();

			System.out.println("����?");
			rec[i].mat = sc.nextInt();

			rec[i].tot = rec[i].kor + rec[i].eng + rec[i].mat;

			rec[i].avg = rec[i].tot / 3;

		}
	}

	private String panjung(int score) {   //switch�� �������� return�� �ʿ���

		String pan = "";

		switch (score / 10) {

		case 10:
		case 9:
			pan = "��";
			break;
		case 8:
			pan = "��";
			break;
		case 7:
			pan = "��";
			break;
		case 6:
			pan = "��";
			break;
		default:
			pan = "��";
			break;

		}
		return pan;

	}

	@Override
	public void print() {
		
		for(int i = 0; i < inwon; i++){
			System.out.printf("�й�: %s  �̸�: %s\n", rec[i].hak, rec[i].name);
			System.out.printf("����: %d ����: %d ����: %d\n", rec[i].kor, rec[i].eng, rec[i].mat);
			System.out.printf("  �հ� : %4d", rec[i].tot);
			System.out.printf("  ��� : %4d\n", rec[i].avg);
			System.out.printf("  ���� : %s ", panjung(rec[i].kor));
			System.out.printf("  ���� : %s ", panjung(rec[i].eng));
			System.out.printf("  ���� : %s ", panjung(rec[i].mat));
			System.out.println();
			System.out.println("--------------------------------------");
			
		}

		
		
	}

}
