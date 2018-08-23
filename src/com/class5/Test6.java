package com.class5;

//final을 사용하는 3가지 경우
//1. 멤버변수에 final을 붙이면 단한번만 초기화가능
//2. 메소드에 final을 붙이면 override가 불가
//3. 클래스에 final을 붙이면 상속이 불가

//final class Test - 3.클래스에 final을 붙이면 상속이 불가
class Test{
	public static final double PI; //1. 멤버변수에 final을 붙이면 단한번만 초기화가능
	
	static{
		PI = 3.14;
	}
	
	public double area;
	//2. 메소드에 final을 붙이면 override가 불가
	public final void write(String title){
		System.out.println(title + " : " + area);
	}
}



public class Test6 extends Test {
	
//	public void write(String title) - override 불가능
	
	public void circleArea(int r){
		area = (double)r * r * PI;
	}

	public static void main(String[] args) {
		
		Test6 ob = new Test6();
		
		ob.circleArea(10);
		ob.write("원");


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
