package com.class5;

import java.util.Calendar;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		// Calendar�� ����Ͽ� ����޷� �����

		Scanner sc = new Scanner(System.in); // (Object override?)
		Calendar cal = Calendar.getInstance();
		int year, month, dayNum;

		do {
			System.out.println("���ϴ� Ҵ���� �Է��ϼ���");
			year = sc.nextInt();

		} while (year < 1);

		do {
			System.out.println("���ϴ� ���� �Է��ϼ���");
			month = sc.nextInt();
		} while (month > 12 || month < 1);

		cal.set(year, month - 1, 1);

		dayNum = cal.get(Calendar.DAY_OF_WEEK);
		System.out
				.println("��\t��\tȭ\t��\t��\t��\t��\n---------------------------------------------------");

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
