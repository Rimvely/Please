package com.day4;

import java.io.IOException;
import java.util.Scanner;

public class Test1 {
	
	public static void main(String[] args) throws IOException {	
		
		Scanner sc = new Scanner(System.in);
		
		int n1,n2;
		char oper;
		int result =0;
		
		
		System.out.println("첫번째 수?");
		n1 = sc.nextInt();
		
		System.out.println("두번째 수?");
		n2 = sc.nextInt();
		
		System.out.print("연산자[+,-,*,/]?"); //+
		oper = (char)System.in.read(); //read는 1개의 캐릭터를 읽는거다
		
		System.out.println();
		
		
		switch(oper){
		
		case '+':
			result = n1+n2;
//			System.out.printf("%d+%d=%d",n1,n2,n1+n2);
			break;
		case '-':
			result = n1-n2;
//			System.out.printf("%d-%d=%d",n1,n2,n1-n2);
			break;
		case '*':
			result = n1*n2;
//			System.out.printf("%d*%d=%d",n1,n2,n1*n2);
			break;
		case '/':
			result = n1/n2;
//			System.out.printf("%d/%d=%d",n1,n2,n1/n2);
			break;
		default:
			System.out.print("잘못된 연산자!");
			
			
		}
		
		System.out.printf("%d%c%d=%d\n",n1,oper,n2,result);
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}


/*
[자료형]

boolean : true/false

[정수]
byte	:	-128~127
short	:	-32768~32767  
int		:	4byte
long	:	8byte

10진수:10 8진수:016 16진수:0x17

[실수]
float	:	4byte
double	:	8byte
단정도 실수(float): 3.14f
배정도 실수(double):3.14
자바는 소수점을 쓰면 double로 인식한다.

[문자] 알파벳 a 하나에 ACIII 값
char	:	2byte(UTF-16):'a'  UTF는 인코딩. 한 글자를 표시하기위한 방법

[연산자]
+,-,/,%,++,--

[관계형연산자]
>,>=,<,<= : 결과: true or false (boolean 값)

[등가연산자]
==,!= 같다, 같지않다

[논리연산자]
&&(and), ||(or), !(not)

[비트단위] 2진수에서 쓰는 단위
&, |, ~, >>, <<, >>>

[삼항연산자]
조건?참일때값을:거짓일때값
                (조건?T:F)

[대입연산자]
=,+=,-=,*=
-----------------------------------------------------------------------------------
int a=10;
float b;

b=a;        //암시적형변환
b=(float)a; //명시적형변환

a=b; 		X
a=(int)b;   O //명시적형변환
-------------------------------------------------------------------------------------
[제어문]

if(조건){
작업1;
}

if(조건){
작업1;
}else{
작업2
}

if(조건1){
작업1;
}else if(조건2){
}else{             //마지막 else 생략가능
작업3; 
}

for(시작값;최대값;증가값){
	작업;
}


while(조건){
작업;
}

do{
작업;
}while(조건);

while(true){     //무한루프
작업
}

break; //무한루프를 멈추게하는것













 */















