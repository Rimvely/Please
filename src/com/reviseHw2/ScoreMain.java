package com.reviseHw2;

import java.util.Scanner;

public class ScoreMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Score ob = new ScoreImpl();

		int n;
		
		System.out.println("Memorize 100 words for 10 minutes. How many words can you get out of 100?");
		System.out.println();
		while (true) {

			do {
				System.out.print("1.입력\n2.출력\n3.이름검색\n4.총점내림\n5.총점오름\n6.종료:\n");
				n = sc.nextInt();
			} while (n < 1);

			switch (n) {

			case 1:
				ob.input();
				break;
			case 2:
				ob.print();
				break;
			case 3:
				ob.searchName();
				break;
			case 4:
				ob.descSortTot();
				break;
			case 5:
				ob.ascSortTot();
				break;
			default:
				System.out.println("종료합니다..");
				System.exit(0); // exit(0)

			}

		}

	}

}
