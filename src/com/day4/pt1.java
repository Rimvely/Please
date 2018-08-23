package com.day4;

class pt1 {

	public static void main(String[] args) {

		int i, j;

		for (i = 1; i < 10; i++) {

			for (j = 2; j < 6; j++) {

				System.out.printf("%d*%d=%d", j, i, j * i);
				System.out.print("\t\t");

			}// for inner

			System.out.println();

		}// for outer
		
		System.out.println();
		
		for (i = 1; i < 10; i++) {

			for (j = 6; j < 10; j++) {

				System.out.printf("%d*%d=%d", j, i, j * i);
				System.out.print("\t\t");

			}

			System.out.println();
		}

	}
}
