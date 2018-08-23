package com.day3;

class Test5 {

	public static void main(String[] args) {

		// 삼각형 만들기 (공백과 *를 이용해서)

		int i, j;

		/*
		 * for(i=1;i<=5;i++){
		 * 
		 * for (j=1;j<=5-i;j++){
		 * 
		 * System.out.print(" "); //공백한칸
		 * 
		 * }//end of for2-1
		 * 
		 * for (j=1;j<=i;j++){
		 * 
		 * System.out.print("*");
		 * 
		 * }//end of for2-2
		 * 
		 * System.out.println();
		 * 
		 * }//end of for1
		 */

		// 삼각형

		/*
		 * for(i=1;i<=5;i++){
		 * 
		 * for (j=1;j<=5-i;j++){
		 * 
		 * System.out.print(" "); //공백한칸
		 * 
		 * }//end of for2-1
		 * 
		 * for (j=1;j<=i*2-1;j++){
		 * 
		 * System.out.print("*");
		 * 
		 * }//end of for2-2
		 * 
		 * System.out.println();
		 * 
		 * }//end of for1
		 */

		// 역삼각형
		for (i = 5; i >= 1; i--) {

			for (j = 1; j <= 5 - i; j++) {

				System.out.print(" "); // 공백한칸

			}// end of for2-1

			for (j = 1; j <= i * 2 - 1; j++) {

				System.out.print("*");

			}// end of for2-2

			System.out.println();

		}// end of for1

	}
}
