package com.class7;

import java.util.Iterator;
import java.util.Vector;

public class Test6 {

	private static final String city[] = {"서울","부산","대구","인천","광주","대전","울산"};
	
	public static void main(String[] args) {

		Vector<String> v = new Vector<String>();   // < > generic
		
		for(String c : city){
			v.add(c);
		}
		
		//v.add(10);
		String str;
		
		str = v.firstElement();
		System.out.println("첫번째 요소 : " + str);
		
		str = v. lastElement();
		System.out.println("마지막요소 : " + str);
		
		str = v.get(2);
		System.out.println("세번째요소 : " + str);
		
		for(int i = 0; i < v.size(); i++){
			System.out.print(v.get(i) + " ");
		}
		System.out.println();
		
		for(String s : v){               //확장 for문
			System.out.print(s + " ");
		}
		System.out.println();
		
		//Iterator : 반복자
		Iterator<String> it = v.iterator();
		while(it.hasNext()){     //반복문을 가지고잇을때까지
			
			str = it.next();  //값을 넣는 방법
			System.out.println(str + " ");
		}
		
		
//		it안에는 데이터가없어서 결과가 안나온다. 
//		Iterator<String> it = v.iterator(); 복사를 한것인데 그게없기때문이다.
		while(it.hasNext()){   
			
			str = it.next();  
			System.out.println(str + " ");
		}
		
		
	}

}
