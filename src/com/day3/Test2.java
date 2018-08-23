package com.day3;

import java.util.*;

class  Test2{
	
	public static void main(String[] args) {

		//10보다 큰수를 입력받아 1부터 합계 구하기
		
		Scanner sc = new Scanner(System.in);

		int number, sum=0;    //sum 은 지금 쓰레기값. 공간은 만들어줬는데 안에뭐가있는지 정의가안됨
		                      //쓰레기값+n 이 안되니까 숫자를 지정 sum = 0이라고

		//using do-while code
		

		do{
			System.out.print("수 입력?"); //9
			number = sc.nextInt();
		}while (number<10); //10보다 작으면 밑으로 오더가 안가게 해야되니까
			                //10보다 작은수면 다시 올라가게 만듬
							//10이상일때 밑으로 빠져나가게 만듬

		//11이상일때 연산작업을 밑에 작성
		//연산
		//for(int i=1;i<=number; i++){

		//	sum = sum + i;  //쓰레기값 + n 이 안된다.

		//}

		int i=0;
		while(i<number){
			i++;
			sum+=i; //sum = sum + i;
		}
		

		System.out.println("결과:" + sum);





		
	}
}
