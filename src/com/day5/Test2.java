package com.day5;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		// 10�� �̳��� �̸��� ������ �Է¹޾�
		// ������ ����������� ����������� ����Ͻÿ�(��������)

		// ����
		Scanner sc = new Scanner(System.in);

		String[] name; // �����������,so I just declare
		int[] score;

		int i, j, inwon, temp1; // for doing selection sort,
		String temp2;

		do {
			System.out.print("�ο���[1-10]?\n"); // 3
			inwon = sc.nextInt();
			System.out.println();
			
		} while (inwon < 1 || inwon > 10);

		// �迭�� �޸� �Ҵ�(��ü����)
		name = new String[inwon];
		score = new int[inwon];
		// ---------------------------------------------------------------------------------------------
		// �Է�(�ο�����ŭ �̸��� ������ �Է�)
		for (i = 0; i < inwon; i++) {

			System.out.print((i + 1) + " ��° �̸�?");
			name[i] = sc.next();
			
			
			System.out.print("����?");
			score[i] = sc.nextInt();
		}
		// ---------------------------------------------------------------------------------------------
		// ����(����)
		for(i=0;i<inwon-1;i++){
			
			for(j=i+1;j<inwon;j++){
				
				if(score[i] < score[j]){
					
					temp1 = score[i];
					score[i] = score[j];
					score[j] = temp1;
					
					temp2 = name[i];
					name[i] = name[j];
					name[j] = temp2;
					
				}

				
			}
		}
		// ---------------------------------------------------------------------------------------------
		// ���
		for (i = 0; i < inwon; i++) {
			System.out.printf("%10s %4d", name[i], score[i]); // %10s% 10��
																// �ڸ������ ��Ʈ���Է�
			// %4d% 4���� �ڸ������ �������Է�

		}

	
	}
}