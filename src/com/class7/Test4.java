package com.class7;                      //저장이 Test4$1.class (무명클래스)
//내부클래스
//anonymous, 익명의,무명의클래스



public class Test4 {
	
	public Object getTitle(){   //Object가 나왔따? 거의 UPCAST 같은데?
		
		//코딩
		//Object ob = new Object();   <<이렇게 안해도 된다. ob 가 없다 그래서 무명이다.
		return new Object(){

			@Override
			public String toString() {
				return "무명의 클래스";
			}
			
			
			
		};   //<<     [ ; ] 까먹으면 안된다
	}

	public static void main(String[] args) {

		Test4 ob = new Test4();
		
		System.out.println(ob.getTitle());
	}

}
