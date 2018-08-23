package com.generic;

//예외를 다시 던지는 방법

public class Test6 {

	public void value1(int value) throws Exception {

		try {

			value2(value);                       //1번value2(-10)이 들어오고 이게 아래로 내려가서 if(value<0)의 Exception error 로 가서
												 
		} catch (Exception e) {
			System.out.println("vlaue1");             //3번 다시 value2(value); error 가지고 와서 value2의 error msg인 catch가 발동
		}											  //그래서 0보다작은수가 아닌 System.out.println("vlaue1");이 뜬다.
	}

	public void value2(int value) throws Exception{
		
		if(value<0)							
			throw new Exception("0보다 작은수!!");		//2번 여기로왔는데
	}

	public static void main(String[] args) {

		Test6 ob = new Test6();

		try {

			ob.value1(-10);

		} catch (Exception e) {
			System.out.println("main...");
		}

	}

}
