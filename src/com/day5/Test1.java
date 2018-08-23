package com.day5;

public class Test1 {

	public static void main(String[] args) {

		// selection sort 선택정렬

		// 5개 숫자에서 작은수부터 나열하기
		// 1번째돌릴때 4번돌리고
		// 2번째에 3번
		// 3번째에 2번 [4-i]
		// 4번째에 1번

		// 배열안에 있는 숫자를 정렬
		// 오름차순 ascending 내림차순descending

		int num[] = { 28, 65, 7, 4, 10 };

		int i, j, temp;

//		---------------------------------------------------------------------------------------
		System.out.print("Source Date: ");

		for (i = 0; i < num.length; i++) { // i < num.length 는 0부터시작이니까
											// num-1되야한다

			System.out.printf("%4d", num[i]);
		}

//		---------------------------------------------------------------------------------------
		System.out.println();
//		---------------------------------------------------------------------------------------
		
// 연산
		
//Selection Sort
		for (i = 0; i < num.length - 1; i++) { // 칸수보다 -1 적게 계산

			for (j = i + 1; j < num.length; j++) {

				if (num[i] > num[j]) {   //num[i] < num[j] 내림차순이 됨
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;

				}
//		---------------------------------------------------------------------------------------
				// System.out.println(i + ":" + j);
//		---------------------------------------------------------------------------------------
			}

		}

		// 출력
		System.out.print("Sorted Date: ");

		for (int n : num) { // 확장for문 //Array for문
							// i < num.length 는 0부터시작이니까 num-1되야한다

			System.out.printf("%4d", n);
		}
//		---------------------------------------------------------------------------------------

	}
}
