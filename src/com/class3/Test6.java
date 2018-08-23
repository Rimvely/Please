package com.class3;

import java.io.IOException;
import java.util.Scanner;

class Calc{
	
	private int num1,num2;
	private char oper;
	
	public boolean input() throws IOException{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("두수?");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		System.out.println("연산자?");
		oper = (char)System.in.read();  //아스키값으로 받기때문에 (char)로 바꿔줌
		
		//연산자 확인
		if(oper !='+' && oper !='-' && oper !='*' && oper !='/'){
			return false;
		}
		return true;
		
	}
	
	public int result(){
		int r = 0;
		switch(oper){
		case '+' :
			r = num1 + num2;
		case '-' :
			r = num1 - num2;
		case '*' :
			r = num1 * num2;
		case '/' :
			r = num1 / num2;
		}
		
		return r;
		
	}
	
}

public class Test6 {

	public static void main(String[] args) throws IOException {
		Calc ob = new Calc();
		
//		boolean b = ob.input();
//		
//		if(b == true){
//			System.out.println(ob.result());
//		}else{
//		}
		
//		if(ob.input()){ //복잡한 작업을 if문 안에 두면 좋지 않은 코딩
//			System.out.println(ob.result());
//		}else{
//			return;
//		}
		
		
		if(!ob.input()){ 
			return; //stop
		}
		
		System.out.println(ob.result());
			
		
	}

}
