package com.day2;

import java.io.*;

class Test2 { //계산기만든것

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader (
			new InputStreamReader (System.in));
		
		int num1,num2;
        //여기까지 필요한걸 적는다. (선언단계)

		System.out.print("첫번째 수?");
		num1 = Integer.parseInt(br.readLine());

		System.out.print("두번째 수?");
		num2 = Integer.parseInt(br.readLine());

		System.out.printf("%d + %d = %d\t",num1,num2,(num1+num2));  // %d\t  >>>>> \t 는 tab 의미
		System.out.printf("%d - %d = %d\n",num1,num2,(num1-num2));
		System.out.printf("%d * %d = %d\t",num1,num2,(num1*num2));
		System.out.printf("%d / %d = %d\n",num1,num2,(num1/num2)); //몫 구하기
		System.out.printf("%d %% %d = %d\n",num1,num2,(num1%num2)); //나머지 구하기 //퍼센트를쓸때 %% 이다 such as %d,%f,%s 처럼


		//숫자를 부등호로 비교하면 true, false가 생성
		System.out.println("num1>num2:" + (num1>num2)); //true
		System.out.println("num1<num2:" + (num1<num2));

		//String= + str = "가나다"; 스트링은 가나다라라는 여러개문자를 저장할수있는 연산
		String str;

		//삼항연산자
		str = num1%2==0?"짝수":"홀수";

		str = num1>0?"양수":(num1<0?"음수":"영");

		//a &&(and) b, a||(or) b

		str = num1%4==0 && num1%100!=0 || num1%400==0?"윤년":"평년";     //윤년은 4년마다 떨어지니까 4로 나눈거
		                                                                 //수학 공식
		
		System.out.println(str);


		











































































































	}
}
