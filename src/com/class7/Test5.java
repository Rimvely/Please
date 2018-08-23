package com.class7;

import java.util.Vector;

//collection (Framework)(방법론)
//기본 object이다

//List(info) - ArrayList(c)
//              Vector(c)  - 동기화를 지원안한다
//Map(info)-Hashtable(c),HashMap(c)
public class Test5 {
	
	private static final String city[] = {"서울","부산","대구","인천","광주","대전","울산"};

	public static void main(String[] args) {
		//기본 데이터타입은 Object이다.
		
		Vector v = new Vector(); //Vector는 객체를 생성하는순간 배열이 10개가 기본적으로만들어짐
		                         //알아서 공간이필요하면 더열려줘
		
		                          //Vector 가 Object 클래스라서 형변환 = 밑에서는 String 으로 함.
		v.add("서울"); //UPCAST   String = > Object(Vector)  
		v.add(30); //UPCAST
		v.add('a'); //UPCAST
		
		String str = (String)v.get(0);  //Vector 가 Object라서 String으로 DOWNCAST
		System.out.println(str);
		
		int i = (int)v.get(1);
		System.out.println(i);
		
		char c = (char)v.get(2);
		
		
	}

}
