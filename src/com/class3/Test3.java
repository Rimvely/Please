package com.class3;

public class Test3 {
	
	int a = 5;
	
	{ //초기화 블럭
		System.out.println("초기화블럭 a = " + a);
		a = 10;
		System.out.println("초기화블럭 a = " + a);
	}
	
	static int b;
	static{//static 초기화 블럭
		b = 10;
		System.out.println("Static 초기화블럭 b = " + b);
	}
	
	final int C; //상수 - 는 항상 대문자 + 초기값이 있어야함 
//	 (한번 값이 지정되면프로그램이종료되기 전까지 값 변경불가)
	
	public Test3(){
		System.out.println("생성자...");
		C = 100;
		System.out.println("상수 C = " + C);
	}
	

	public static void main(String[] args) {

		Test3 ob1 = new Test3();
		System.out.println("-------------------------");
		Test3 ob2 = new Test3();
		
	}

}
