package com.swing;

import java.lang.reflect.Method;

//Reflect개념을 사용한메소드 호출방법

class Exam {

	public Integer hap(Integer a, Integer b) {
		return a + b;
	}

	public int sub(int a, int b) {
		return a - b;
	}

	public void write(String title, int result) {
		System.out.println(title + " : " + result);
	}

}

public class Test5 {

	public static void main(String[] args) throws Exception {
		
		Class cls = Class.forName("com.swing.Exam");
		
		//클래스의 객체생성
		Object ob = cls.newInstance();
		
		//hap 메소드
		Method hap = cls.getDeclaredMethod("hap", new Class[]{Integer.class,Integer.class});
		
		//sub메소드 정보를 리턴받음
		Method sub = cls.getDeclaredMethod("sub", new Class[]{int.class,int.class});
		
		//write메소드 정보를 리턴받음
		Method write = cls.getDeclaredMethod("write", new Class[]{String.class,int.class});
		
		//인수가 없는 메소드
		//Method write =
		//		cls.getDeclaredMEthod("write",null);
		
		//메소드 호출(invoke() 사용)
		Object h = hap.invoke(ob, new Object[]{20,10});
		write.invoke(ob, new Object[]{"합:",h});
		
		Integer i = (Integer)sub.invoke(ob, new Object[]{20,10});
		write.invoke(ob, new Object[]{"차",i});
		
		//인수가 없는 경우
		//write.invoke(ob, null);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
