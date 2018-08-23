package com.class1;

class Aclass {

	int a,b; //instance 변수
	
}

public class Test2{
	
	
	public static void main(String[] args){
		
		//이걸하는이유는 메모리공간을 따로쓴다
		//instance 변수의 공간은 따로쓴다      이걸 보여주기위해서
		//class 는 자료형이다
		
		//Aclass는 자료를 2개 담을수 있어요 담을수있는걸 2개만들었기때문에
		
		
		//int a 는 자료를 1개 담을수있어요
	
	Aclass ob1 = new Aclass();
	Aclass ob2 = new Aclass();
	
	ob1.a = 10;
	ob1.b = 20;
	
	System.out.println("ob1.a : "+ ob1.a);//10
	System.out.println("ob1.a : "+ ob1.b);//20
	
	System.out.println("ob2.a : "+ ob2.a);//0  기본값은 0
	System.out.println("ob2.a : "+ ob2.b);//0
	
	ob2.a = 100;
	ob2.b = 200;		
	
	System.out.println("ob2.a : "+ ob2.a);//100
	System.out.println("ob2.a : "+ ob2.b);//200
	
	System.out.println("ob1.a : "+ ob1.a);//10
	System.out.println("ob1.a : "+ ob1.b);//20
	

	
	
	}
}