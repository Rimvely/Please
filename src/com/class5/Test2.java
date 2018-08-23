package com.class5;

import java.util.Calendar;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		// Calendar를 사용하여 만년달력 만들기

		Scanner sc = new Scanner(System.in); // (Object override?)
		Calendar cal = Calendar.getInstance();
		int year, month, dayNum;

		do {
			System.out.println("원하는 年도를 입력하세요");
			year = sc.nextInt();

		} while (year < 1);

		do {
			System.out.println("원하는 月을 입력하세요");
			month = sc.nextInt();
		} while (month > 12 || month < 1);

		cal.set(year, month - 1, 1);

		dayNum = cal.get(Calendar.DAY_OF_WEEK);
		System.out
				.println("일\t월\t화\t수\t목\t금\t토\n---------------------------------------------------");

		for (int i = 0; i < dayNum - 1; i++) {
			System.out.print("\t");
		}

		for (int i = 1; i <= cal.getActualMaximum(Calendar.DAY_OF_MONTH); i++) {
			if (dayNum % 7 != 0) {
				System.out.print(i + "\t");
			} else if (dayNum % 7 == 0) {
				System.out.println(i);
			}
			dayNum++;
		}

		if (dayNum % 7 != 1) {
			System.out.println();
		}
		System.out.println("---------------------------------------------------");

	}

}
