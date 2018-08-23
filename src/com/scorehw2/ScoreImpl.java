package com.scorehw2;

import java.util.Scanner;

public class ScoreImpl implements Score {

	int playerNumber;
	Record[] rec;
	Scanner sc = new Scanner(System.in);
	String[] title = { "French? ", "English? ", "Japaense? " };
	
	@Override
	public void set() {
		System.out.println("10�оȿ� 100���� �� �ܾ ��� �ܿ�� �ֳ�!\n\n\n");
		System.out.println("������ �ο���?");
		playerNumber = sc.nextInt();

		rec = new Record[playerNumber];

	}

	@Override
	public void input() {


		for (int i = 0; i < playerNumber; i++) {
			rec[i] = new Record();
			System.out.println((i + 1) + "��° ������ �̸�?");
			rec[i].name = sc.next();

			for (int j = 0; j < 3; j++) {
				System.out.println(title[j]);
				rec[i].score[j] = sc.nextInt();

				rec[i].tot += rec[i].score[j];
			}

			rec[i].avg = rec[i].tot / 3;
		}

	}

	private String capability(int score) { // switch�� �������� return�� �ʿ���

		String ca = "";

		switch (score / 10) {

		case 10:
			ca = "�������ɷ��ڱ�!";
			break;
		case 9:
			ca = "���� �ɷ���!";
			break;
		case 8:
			ca = "�ȶ��Ͻó׿�!";
			break;
		case 7:
			ca = "����ϸ鼭 �ƴѵ���";
			break;
		case 6:
			ca = "����Դϴ�";
			break;
		default:
			ca = "�й��ϼ���";
			break;

		}
		return ca;

	}

	@Override
	public void print() {
		
		
		for (int i = 0; i < playerNumber; i++) {
			System.out.printf("%6s\n", rec[i].name);

			for (int j = 0; j < 3; j++) {

				System.out.printf("���� : %s ���� : %d �� : %s \n", title[j], rec[i].score[j],capability(rec[i].score[j]));
			}

			System.out.printf("  �հ� : %4d", rec[i].tot);
			System.out.printf("  ��� : %4d", rec[i].avg);
			System.out.println();
			System.out.println("--------------------------------------");

		}
	}



}
