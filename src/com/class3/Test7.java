package com.class3; 

import java.util.Calendar;

//call by Value
//stack영역의 데이터가 heap영역으로 데이터 자체가 넘어감
//call by Reference
//값을 넘길때 객체의 시작점 주소가 넘어감

class sub{
	public int x = 10;
	
	public void sub(int a){
		x += a;
		
	}
}
public class Test7 {                                      

	public static void main(String[] args) {

		sub ob = new sub();
		
		int a = 20;
		System.out.println("sub() 메소드 실행 전 : " + ob.x);
		ob.sub(a); //call by value
		System.out.println("sub() 메소드 실행 전 : " + ob.x);
		
		sub ob1;
		ob1 = ob; //주소를 넘겨줘서 똑같은 도미체 생성   //call by Reference
		
		System.out.println("sub() 메소드 실행 전 : " + ob.x);
		System.out.println("sub() 메소드 실행 전 : " + ob1.x);
		  
		ob1.sub(a);
		
		System.out.println("sub() 메소드 실행 전 : " + ob.x);
		System.out.println("sub() 메소드 실행 전 : " + ob1.x);
		
		Calendar now1 = Calendar.getInstance();   // <<-- 여기 객체만 있는고 
		Calendar now2 = Calendar.getInstance();   //밑에 4개는 아무것도아님
		Calendar now3 = Calendar.getInstance();   // now1이 10이면 그걸 2~5에서 받아감
		Calendar now4 = Calendar.getInstance();
		Calendar now5 = Calendar.getInstance(); //call by Reference
//		heap 영역에 새로운 Calendar 객체를 만들지 않고 처음만들어진 객체 메모리 
//		주소를참조할수있도록 해줌
	
		System.out.println(now1.getTime());
	
		}
		
		
		
		
		
	}


