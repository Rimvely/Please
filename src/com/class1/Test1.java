package com.class1;

import com.day6.TestCom;

public class Test1 {

	public static void main(String[] args) {
		
		//�޸��� ���尪�� �ٸ��ٴ°� �����ֱ����� tc.w �� tc1.w�� ���

		TestCom tc = new TestCom(); //��ü����. tc������Թ������
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
