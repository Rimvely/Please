package com.class7;   //저장이 Outer$Inner.class

//내부클래스
//Inner

class Outer {   //클래스안에 클래스   

	static int a = 10;
	int b = 20;

	public class Inner {  //이너클래스이지만 저장은 별개로 저장된다

		int c = 30;

		public void write() {
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}

	}

	public void print(){
		Inner ob = new Inner(); 
		ob.write();
		
	}
	
	
}

public class Test1 {

	public static void main(String[] args) {

		Outer out = new Outer(); //외부클래스 객체생성. 반드시 외부가 먼저 만들어져야함.
		out.print();
		
		Outer.Inner inner = out.new Inner();  //두번째 생성하고 만드는방법
		inner.write();
		
		
		
	}

}
