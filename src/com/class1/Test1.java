package com.class1;

import com.day6.TestCom;

public class Test1 {

	public static void main(String[] args) {
		
		//메모리의 저장값이 다르다는걸 보여주기위해 tc.w 랑 tc1.w랑 출력

		TestCom tc = new TestCom(); //객체생성. tc라는출입문만들기
		TestCom tc1 = new TestCom();
		
		
		tc1.input();tc.input();
		
		int a = tc.area();
		int l = tc.circumstance();
		tc.print(a, l);
		
		
		
		
		a = tc1.area();
		l = tc1.circumstance();
		tc1.print(a, l);
		
		System.out.println("tc.w : "+ tc.w);
		System.out.println("tc1.w :"+ tc1.w);
	}

}
