package com.day3;

class Test5 {

	public static void main(String[] args) {

		// �ﰢ�� ����� (����� *�� �̿��ؼ�)

		int i, j;

		/*
		 * for(i=1;i<=5;i++){
		 * 
		 * for (j=1;j<=5-i;j++){
		 * 
		 * System.out.print(" "); //������ĭ
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

		// �ﰢ��

		/*
		 * for(i=1;i<=5;i++){
		 * 
		 * for (j=1;j<=5-i;j++){
		 * 
		 * System.out.print(" "); //������ĭ
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

		// ���ﰢ��
		for (i = 5; i >= 1; i--) {

			for (j = 1; j <= 5 - i; j++) {

				System.out.print(" "); // ������ĭ

			}// end of for2-1

			for (j = 1; j <= i * 2 - 1; j++) {

				System.out.print("*");

			}// end of for2-2

			System.out.println();

		}// end of for1

	}
}
