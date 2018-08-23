package com.day1;

public class Test2 {

	public static void main(String[] args) {


		//int : 자료형 of 정수형 ex) -1, 0, 1, etc
		int a=20; //=대입연산자 20 ----> a 에 들어가는   a는 변수
		int b=5;
		int c,d; //쓰레기값

		System.out.println(a);
		System.out.println(b);
		
		//System.out.println(c);//쓰레기값은 볼수없다.

		c=a+b;
		System.out.println(c); //25

		d=a-b;
		System.out.println(d); //15

		b = 10;

		c=a+b;
		d=a-b;

		System.out.println(c); //30
	
		System.out.println(d); //15


		System.out.println(a+"+"+b+"="+c);

		System.out.printf("%d+%d=%d%n",a,b,c);

		System.out.printf("%d-%d=%d\n",a,b,d);












	}
}
