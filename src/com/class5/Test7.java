package com.class5;

//추상클래스
//메모리의 낭비없이 클래스를 미리 설계
//메소드를 재정의해서 사용


abstract class ShapeClass{
	
	abstract void draw(); //error 생긴이유. 재정의하라고.
	
}

class Circle extends ShapeClass{

	@Override
	public void draw() {
		System.out.println("원을 그린다...");
	}
	
	
}

class Rect extends ShapeClass{
	
	@Override
	public void draw() {
		System.out.println("사각형을 그린다...");
	}
	
}

class Triangle extends ShapeClass{
	
	@Override
	public void draw() {
		System.out.println("삼각형을 그린다...");
	}
	
	
}




public class Test7 {

	public static void main(String[] args) {

		Circle c = new Circle();
		Rect r = new Rect();
		Triangle t = new Triangle();
		
		c.draw();
		r.draw();
		t.draw();
		
		
		
		
		
	}

}
