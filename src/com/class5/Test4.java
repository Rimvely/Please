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
		System.out.println("super.b : " + super.b);   //Test4 메인쪽에다가는 ob.write(super.b) != 20 안된다. 문법이안맞다.
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
																					//.b = 부모클래스의.b
		((SuperClass)ob).write(); //sub class write() - why? -
		                          //because Method Security is so strict that we cannot fake.
		                          //인스턴스변수는 upcast or downcast 할수있지만
                                  //메소드는 부모나 자식이나 같은 메소드를 둘다 가지고잇으면 무조건 자기꺼 쓴다.
		                          //메소드는 인스턴스변수와 다르게 자신의 메소드를 호출.
		                          //메소드는 heap영역이 아닌 메소드 영역에 저장되어 있기때문에 접근이 불가하다.
		                          //메소드는 upcast를 해도 무조건 자신것을 사용한다.
		
		
		
	}

}
