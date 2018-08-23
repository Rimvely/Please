package com.day6;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {  //일단메인문만들기
		
		TestCom tc = new TestCom(); //객체생성. tc라는출입문만들기
		
		tc.input();
		int a = tc.area();
		int l = tc.circumstance();
		tc.print(a, l);

		System.out.println("--------------------");
		
		tc.input();
		a = tc.area();
		l = tc.circumstance();
		tc.print(a, l);
		
		System.out.println("--------------------");
		
		TestCom tc1 = new TestCom();
		tc1.input();
		a = tc1.area();
		l = tc1.circumstance();
		tc1.print(a, l);
		

	}

}
