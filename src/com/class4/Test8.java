package com.class4;

//Wrapper클래스
//기본데이터(자료형)를 객체로 사용할수 있게해줌
//자바자료형: boolean, byte, char, short, int, long, float, double
//Reference Data: Boolean, Byte, Character, Short, Integer, Long, Float, Double

//Auto-Boxing(stack -> heap)
//Auto-UnBoxing(heap -> stack

public class Test8 {

	public static void main(String[] args) {

		int n1 = 10;
		int n2;
		Integer num1;
		Integer num2 = new Integer(20);
		
		num1 = n1; //Auto-Boxing(stack -> heap)
		n2 = num2; //Auto-UnBoxing(heap -> stack)
		
		System.out.println(n1 + " : " + num1); //10:10
		System.out.println(n2 + " : " + num2); //20:20
		
		
		
		
		
	}

}
