package com.class3;

class SuperClass{
	
	protected String title;
	protected double area;
	protected double circumference;
	
	public SuperClass(){
		
		
	}
	
	public SuperClass(String title){
		this.title = title;
		
	}
	
	public void write(){
		System.out.println("title = " + title + " : " + area);
	}
	
}

class Circle extends SuperClass{
	
	private int r;
	protected static final double PI=3.14; //상수 - 프로그램 끝나기 전까지 값 변경 불가
	
	public Circle(int r){
		super("원"); //부모생성자중에 오버로딩된 생성자를 호출
		this.r = r;
	}
	
	public void circleArea(){
		area = (double)r * r * PI;
	}
}

class RectC extends SuperClass{
	private int w,l;
	private int c;
	
	public void rectArea(int w, int l){
		this.w = w;
		this.l = l;
		area = w * l;
	}
	
	public RectC(){
		super("사각형의 둘레");

	}	
	
	public void rectCircumference(int w, int l){
		this.w = w;
		this.l = l;
		circumference = (double)(w+l)*2;
	}
	

	

	//method override
	@Override //annotation
	public void write() {
		System.out.println("title = " + super.title);
		System.out.println("가로 : " + w);
		System.out.println("세로 : " + w);
		System.out.println("넓이 : " + area);
		System.out.println("둘레 : " + circumference);
	}
	
//	public void write(){    //method 가 write();로 똑같지만 부모클래스와 자식클래스로 나뉘어있기때문에
////		                    method override.
//		System.out.println("가로 : " + w);
//		System.out.println("세로 : " + w);
//		System.out.println("넓이 : " + area);
//	}
	

	
}

public class Test10 {

	
	public static void main(String[] args) {

		Circle ob1 = new Circle(10);
		ob1.circleArea();
		ob1.write();
		
		System.out.println("---------------------");
		
		RectC ob2 = new RectC();
		ob2.rectArea(10, 20);
		ob2.rectCircumference(10, 20);
		ob2.write();
		
	}

}
