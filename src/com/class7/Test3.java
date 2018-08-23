package com.class7;

//내부클래스
//중첩
//클래스안에서 static으로 만들어야한다.

class Outer2 {                               //클래스에 static. 그럼객체 생성필요가없다.

	static int a = 10;
	int b = 20;

	public static class Inner2 { // Inner 2는 이미 메모리에 객체생성이 되어있기때문에
		                         // Inner2가 Outer2를 객체생성해야한다.그래서 중첩이다.

		int c = 30;

		public void write() {

			System.out.println("a : " + a);
			//System.out.println("b : " + b); 아직 1층에 있어.
			System.out.println("c : " + c);
			
			Outer2 out = new Outer2();                  // [1번]여기에서 객체생성하는 방법과
			System.out.println("out.b: " + out.b);      // 이미 올라간 inner 에서 outer 객체를 생성하는 방법
		}
	}
	
	public void print(){            // [2번]  outer2 메소드안에서 생성가능
		Inner2 ob = new Inner2();
		ob.write();
	}
	
}

public class Test3 {

	public static void main(String[] args) {

		Outer2 out = new Outer2();   // 1번 생성과 프린트방법     아우터를 생성해서
		out.print();
		
		Outer2.Inner2 inner = new Outer2.Inner2();  // 2번        이너를 만들고 실행하는것?
		inner.write();
		
	}

}
