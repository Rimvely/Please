package com.day1;

public class Test2 {

	public static void main(String[] args) {


		//int : �ڷ��� of ������ ex) -1, 0, 1, etc
		int a=20; //=���Կ����� 20 ----> a �� ����   a�� ����
		int b=5;
		int c,d; //�����Ⱚ

		System.out.println(a);
		System.out.println(b);
		
		//System.out.println(c);//�����Ⱚ�� ��������.

		c=a+b;
		System.out.println(c); //25

		d=a-b;
		System.out.println(d); //15

		b = 10;

		c=a+b;
		d=a-b;

		System.out.println(c); //30
	
		System.out.println(d); //15


		System.out.println(a+"+"+b+"="+c);

		System.out.printf("%d+%d=%d%n",a,b,c);

		System.out.printf("%d-%d=%d\n",a,b,d);












	}
}
