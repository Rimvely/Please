package com.class5;

//�߻�Ŭ����
//�޸��� ������� Ŭ������ �̸� ����
//�޼ҵ带 �������ؼ� ���


abstract class ShapeClass{
	
	abstract void draw(); //error ��������. �������϶��.
	
}

class Circle extends ShapeClass{

	@Override
	public void draw() {
		System.out.println("���� �׸���...");
	}
	
	
}

class Rect extends ShapeClass{
	
	@Override
	public void draw() {
		System.out.println("�簢���� �׸���...");
	}
	
}

class Triangle extends ShapeClass{
	
	@Override
	public void draw() {
		System.out.println("�ﰢ���� �׸���...");
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
