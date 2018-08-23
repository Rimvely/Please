package com.day6;

import java.util.Scanner;

public class Hw2 {

	int uppperLength, bottomLength, height;
	
	public void input(){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("upperLength for a trapezoid?");
			uppperLength = sc.nextInt();
		 
		System.out.printf("bottomLengthfor a trapezoid?");
			bottomLength = sc.nextInt();
		System.out.printf("height for a trapezoid?");
			height = sc.nextInt();
		//return;  생략가능 void에 쓰이는 리턴은 생략가능
	}
	
	public int area(){
		
		return (uppperLength+bottomLength)*height/2;
		
	}
	
	public String circumference(){
		
		return "lazy to get the answer";
		
	}
	
	public void print(int a, String c){
		
		System.out.println("upperLength : "+ uppperLength);
		System.out.println("bottomLength : "+ bottomLength);
		System.out.println("height : " + height);
		System.out.println("area :"+ a);
		System.out.println("circumference :"+ c);
	}
}
