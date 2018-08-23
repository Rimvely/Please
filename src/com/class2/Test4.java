package com.class2;

import java.util.Scanner;

class Rect{
	
	private int w,h;
	
	public void set(int w, int h){
		
		this.w = w;
		this.h = h;
		
	}
	
	public int area(){
		return w*h;
	}
	
	public int circumference(){
		return (w+h)*2;
	}
	
	public void print(int a, float c){
		System.out.println("가로: " + w);
		System.out.println("세로: " + h);
		System.out.println("넓이: "+ a);
		System.out.println("둘레: "+ c);
		
	}
	//메소드 overloading(중복정의)
	//메소드의 이름은 동일하지만 매개변수의 갯수가 다르거나
	//데이터 타입이 다르면 다른 메소드로 인식한다
	
	//하나의클래스 안에서 동일 작업을 하는 메소드의
	//이름을 통일시킴
	public void print(){
		
		System.out.println("가로: " + w);
		System.out.println("세로: " + h);
	}
	
	public void print(int a){
		System.out.println("가로: " + w);
		System.out.println("세로: " + h);
		System.out.println("넓이: "+ a);
	}
	public void print(float c){
		System.out.println("가로: " + w);
		System.out.println("세로: " + h);
		System.out.println("둘레: "+ c);
	}
	
	
	
	
	
}
public class Test4 {

	public static void main(String[] args) {
		
		int w,h;
		Scanner sc = new Scanner(System.in);
		Rect ob = new Rect();
		
		System.out.print("가로?");
		w = sc.nextInt();
		
		System.out.print("세로?");
		h = sc.nextInt();
		System.out.println();
		
		ob.set(w, h);
		
		int a = ob.area();
		float c = ob.circumference();
		
		ob.print(a);
		ob.print(a, c);
		ob.print(c);
		
		
		
		
	}

}
