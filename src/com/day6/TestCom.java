package com.day6;

import java.util.Scanner;

public class TestCom {

	public int w,h; //전역변수, instance변수 [물통]
	
	public void input(){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로?");
		w = sc.nextInt();
		
		System.out.print("세로?");
		h = sc.nextInt();
		
		//return;  보이드는 리턴은 생략 가능(반환값이없어서 생략가능)
		
	}
	
	public int area(){  // area -> result -> return -> int.
		
		int result;//지역변수
		
		
		result = w*h;
		
		return result;
		
		
	}
	
	public int circumstance(){
		
		return (w+h)*2;
	}
	
	public void print(int a, int c){  //변수명일뿐 데이타 타입만 맞춰주면 TestUSA처럼 이름이 달라도된다
		
		System.out.println("가로 : "+ w);
		System.out.println("세로 : "+ h);
		System.out.println("넓이 :"+ a);
		System.out.println("둘레 :"+ c);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
