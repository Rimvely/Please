package com.class2;

//static
//자기가 알아서 메모리로 올라감
//1000개를 만들어도메모리공간은 한개만 사용

public class Test2 {

	public static int a = 10;//class변수
	//클래스변수나 클래스메소드 로딩되는순간
	//메모리 할당이 이루어지고 [클래스이름.객체이름]으로 접근 ex[Test2.a]
	//즉 new를사용하지않고 바로사용할수있다
	
	
	
	
	private int b = 20;//instance변수
	//동일한클래스의 instance메소드 안에서 바로 접근이 가능하지만
	//클래스 메소드에서는 접근할수 없다.
	//클래스 메소드에서 접근하기위해서는 new를 통해
	//객체를 생성하고 객체이름으로만 접근이 가능하다
	
	public void write(){ //instance 메소드
		
		System.out.println("class변수: " + a);
		System.out.println("instance변수: " + b);

	}
	
	public static void print(){
		System.out.println("class변수: " + a);
//		System.out.println("instance변수: " + b);
//		System.out.println("instance변수 b: " + ob1.b); //Test2 ob1 = new Test2(); 가 밑에있어서 안됨
	}
	
	
	
	
	
	
	
	
	//class 메소드
	public static void main(String[] args) {

		System.out.println("class변수 a : " + a);
		System.out.println("class변수 Test2.a: " + Test2.a);//클래스이름.객체이름
		
		//write();
		
		print();
		Test2.print(); //<< 이렇게쓰는게 맞다
		//들어누웠네요. 스태틱 
		
		
		Test2 ob1 = new Test2(); //이걸씀으로 인해 write and b 가 올라갈수있다 15층으로
		
		System.out.println("instance변수 b: " + ob1.b);
		
		ob1.write();
		ob1.print();
		System.out.println("class변수 a : " + ob1.a);
		
		Test2 ob2 = new Test2();
		ob2.a = 100;
		ob2.b = 200;
		System.out.println("ob2--------------");
		ob2.write();
//		ob2.print();
		
		Test2 ob3 = new Test2();
		System.out.println("ob3--------------");
		ob1.write();
//		ob1.print();

		
		
	}

}
