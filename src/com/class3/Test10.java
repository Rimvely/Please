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
	protected static final double PI=3.14; //��� - ���α׷� ������ ������ �� ���� �Ұ�
	
	public Circle(int r){
		super("��"); //�θ�������߿� �����ε��� �����ڸ� ȣ��
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
		super("�簢���� �ѷ�");

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
		System.out.println("���� : " + w);
		System.out.println("���� : " + w);
		System.out.println("���� : " + area);
		System.out.println("�ѷ� : " + circumference);
	}
	
//	public void write(){    //method �� write();�� �Ȱ����� �θ�Ŭ������ �ڽ�Ŭ������ �������ֱ⶧����
////		                    method override.
//		System.out.println("���� : " + w);
//		System.out.println("���� : " + w);
//		System.out.println("���� : " + area);
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
