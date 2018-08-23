package com.class7;

//내부클래스
//Local
//메소드안에 클래스를 생성하는걸 로컬 클래스라고 한다.
//메소드안에서 객체생성하고 소환해야한다.

class Outer1 {

	static int a = 10; // Instance 변수
	int b = 20;

	public void write(){
		
		int c = 30;    //local 변수
		final int d = 40;
		
		class Local{        //메소드안에 클래스 = 로컬클래스
			
			public void print(){
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
				System.out.println(d);
			}
			
		}
		
		Local ob = new Local(); //메소드 안에서만 객체생성 가능
		ob.print();
	}
}

public class Test2 {

	public static void main(String[] args) {

		Outer1 out = new Outer1();
		out.write();
		
		
	}

}
