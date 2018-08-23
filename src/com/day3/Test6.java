package com.day3;

class Test6 { // 다중for문(3중) 구구단 2 3 4 5
				// 6 7 8 9
				// 3가지 방법

	public static void main(String[] args) {

		int i, j;

		for (i = 1; i < 10; i++) {

			for (j = 2; j < 6; j++) {
				System.out.print(j + "x" + i + "=" + j * i);
				System.out.print("\t\t");

			}// end of for2

			System.out.println();
		}// end of for1

		System.out.println();
		for (i = 1; i < 10; i++) {
			for (j = 6; j < 10; j++) {
				System.out.print(j + "x" + i + "=" + j * i);
				System.out.print("\t\t");
			}

			System.out.println();

		}
	}// end method
}// end class
