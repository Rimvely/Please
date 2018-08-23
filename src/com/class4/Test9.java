package com.class4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class TestA {

	public void print(String r) {
		System.out.println(r);
	}
}

class Calc extends TestA {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int num1,num2;
	String oper;
	int result = 0;
	
	String s; //출력
	
	public void input() throws IOException{
		System.out.println("두수?([5,2]");
		String str = br.readLine();
		str = str.replaceAll("\\s", "");
		String[] n1 = str.split(",");
		num1 = Integer.parseInt(n1[0]);
		num2 = Integer.parseInt(n1[1]);
	}
	
	public void operator() throws IOException{
		System.out.println("연산자를 입력하시오");
		oper = br.readLine();
		oper = oper.replaceAll("\\s", "");
	}
	
	public void operation(){
		
		switch(oper){
			case "+" : result = num1 + num2;
			break;
			case "-" : result = num1 - num2;
			break;
			case "*" : result = num1 * num2;
			break;
			case "/" : result = num1 / num2;
			break;
		}
		
		s = String.format("%d %s %d = %d", num1, oper, num2, result);
	}
	
}


public class Test9 {

	public static void main(String[] args) throws IOException {

		// 두수[5,2]? 10,25
		// 연산자 +
		// 10 + 25 = 35
		Calc ob1 = new Calc();
		ob1.input();
		ob1.operator();
		ob1.operation();
		ob1.print(ob1.s);
		
	}
}
