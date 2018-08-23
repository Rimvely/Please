package com.class4;

import java.io.IOException;
import java.util.Scanner;



class TestC {

	public void print(String r) {
		System.out.println(r);
	}
}

class CalcC extends TestC {

	int num1, num2;
	String num;
	char op;   //char 형은 ' ';
	
	public void input() throws IOException{
		
		Scanner sc = new Scanner(System.in); //스캐너는 기본생성자 없다     
		                                     //생성자는 overloading했냐, 기본생성자로 객체생성할수있어없어.
	    System.out.println("두수?[5,2]"); //5,2 25,2
	    num = sc.next();
	    
	    String ss[] = num.split(",");
	    num1 = Integer.parseInt(ss[0]);
	    num2 = Integer.parseInt(ss[1]);
	    
	    System.out.println("연산자?");
	    op = (char)System.in.read();
}
	public String calcC(){
	    	
	    	int result = 0;
	    	
	    	switch(op){
	    	case '+' :
	    		result = num1 + num2;
	    		break;
	    	case '-' :
	    		result = num1 - num2;
	    		break;
	    	case '*' :
	    		result = num1 * num2;
	    		break;
	    	case '/' :
	    		result = num1 / num2;
	    		break;
	    	}
	    	
	    	return String.format("%d %c %d = %d", num1,op,num2,result);
	    }
	    
		
		
		
	}

public class Test10 {

	public static void main(String[] args) throws IOException{

		// 두수[5,2]? 10,25
		// 연산자 +
		// 10 + 25 = 35
		CalcC ob = new CalcC();
		ob.input();
		String s = ob.calcC();
		ob.print(s);	
		

	}
}
