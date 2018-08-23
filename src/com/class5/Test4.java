package com.class5;

class SuperClass {

	protected int a = 10, b = 20;

	public void write() {
		System.out.println("Super class write()....");
		System.out.println("a: " + a + " b: " + b);
		System.out.println();
	}
	
}

class SubClass extends SuperClass {

	protected int b = 30, c = 40;

	
	@Override
	public void write() {
		System.out.println("sub class write()...");
		System.out.println("a: " + a + " b: " + b + " c: " + c);
		System.out.println("super.b : " + super.b);   //Test4 �����ʿ��ٰ��� ob.write(super.b) != 20 �ȵȴ�. �����̾ȸ´�.
		System.out.println();                     
	}

	public void print1(){
		System.out.println("Sub class print1()...");
		write();
		
	}
	
	public void print2(){
		System.out.println("Sub class print2()...");
		super.write();
	}
	
	
	
	
}

public class Test4 {

	public static void main(String[] args) {

		SubClass ob = new SubClass();
		ob.write();
		ob.print1();
		ob.print2();
		
		System.out.println("-----------------");
		
		System.out.println("ob.b = " + ob.b); //30
		System.out.println("(SuperClass)ob).b : " + ((SuperClass)ob).b);
		 																			//11. ((SuperClass)ob).b)
		System.out.println("-----------------");								    //(SuperClass)ob (upcast)
																					//.b = �θ�Ŭ������.b
		((SuperClass)ob).write(); //sub class write() - why? -
		                          //because Method Security is so strict that we cannot fake.
		                          //�ν��Ͻ������� upcast or downcast �Ҽ�������
                                  //�޼ҵ�� �θ� �ڽ��̳� ���� �޼ҵ带 �Ѵ� ������������ ������ �ڱⲨ ����.
		                          //�޼ҵ�� �ν��Ͻ������� �ٸ��� �ڽ��� �޼ҵ带 ȣ��.
		                          //�޼ҵ�� heap������ �ƴ� �޼ҵ� ������ ����Ǿ� �ֱ⶧���� ������ �Ұ��ϴ�.
		                          //�޼ҵ�� upcast�� �ص� ������ �ڽŰ��� ����Ѵ�.
		
		
		
	}

}
