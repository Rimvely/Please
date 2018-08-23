package com.class4;

class A{
	
	public int x = 10;
	
//	public A(){                생략되어있는 부분
//		super(); ->class A 보다 상위 클래스 Object에 종속되어있다.
//	}
	
	public A(int x){              
	this.x = x;
} 
	public void print(){
		System.out.println("x: "+ x );
	}
	
}

class B extends A{
	
	public int y = 20;
	
//	public B(){                                      //public A(){ }  <-- define 이 되지않아서 안되
////		super();
//		System.out.println("aaa");                   //생략되어있는부분
//		
//	} 
	
	public B(int x){              
	super(x);
} 
	public void write(){
		System.out.println("y: " + y);
	}
}


public class Test1 {

	public static void main(String[] args) {

		B ob = new B(100);                               //new 를가지고 객체B를 만들었어요.
		
		ob.write();//내꺼
		ob.print();//부모
		
		
		
		
		
	}

}
