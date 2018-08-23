package com.day6;

public class Test1 {

	public static void main(String[] args) {

		// Bubble sort[오른쪽부터채워진다]

		int[] num = { 36, 30, 26, 10, 4 };
		int i, j, temp;

		System.out.print("Source Date: ");

		for (i = 0; i < num.length; i++) {
			System.out.printf("%4d", num[i]);
		}

		System.out.println();

		// Bubble sort
		for (i = 1; i < num.length; i++) {

			for (j = 0; j < num.length - i; j++) {

				if (num[j] > num[j + 1]) {

					temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;

				}

			}
		}

		System.out.print("sourted Date: ");

		for (int su : num) {
			System.out.printf("%4d", su);
		}
		System.out.println();
	}

}
