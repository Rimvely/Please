package com.day6;

public class Test3 {

	public static void main(String[] args) {

		// 배열의 배열 n x n 배열

		int[][] arr = new int[6][6];

		int i, j;
		int n = 0;

		for (i = 0; i < 5; i++) {  //줄 바꿈은 for문이 할꺼니까
			for (j = 0; j < 5; j++) {
				// System.out.println(i + " : " + j); (자리값 보여줌)
				n++;
				arr[i][j] = n;
				
				arr[i][5] += n;
				arr[5][j] += n;
				arr[5][5] += n;     //배열의초기값 int = 0, string = null
				
				
				
				
				
				
			}
		}

		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < arr.length; j++) {

				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}
		

	}

}
