package com.class3; 

import java.util.Calendar;

//call by Value
//stack������ �����Ͱ� heap�������� ������ ��ü�� �Ѿ
//call by Reference
//���� �ѱ涧 ��ü�� ������ �ּҰ� �Ѿ

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
		System.out.println("sub() �޼ҵ� ���� �� : " + ob.x);
		ob.sub(a); //call by value
		System.out.println("sub() �޼ҵ� ���� �� : " + ob.x);
		
		sub ob1;
		ob1 = ob; //�ּҸ� �Ѱ��༭ �Ȱ��� ����ü ����   //call by Reference
		
		System.out.println("sub() �޼ҵ� ���� �� : " + ob.x);
		System.out.println("sub() �޼ҵ� ���� �� : " + ob1.x);
		  
		ob1.sub(a);
		
		System.out.println("sub() �޼ҵ� ���� �� : " + ob.x);
		System.out.println("sub() �޼ҵ� ���� �� : " + ob1.x);
		
		Calendar now1 = Calendar.getInstance();   // <<-- ���� ��ü�� �ִ°� 
		Calendar now2 = Calendar.getInstance();   //�ؿ� 4���� �ƹ��͵��ƴ�
		Calendar now3 = Calendar.getInstance();   // now1�� 10�̸� �װ� 2~5���� �޾ư�
		Calendar now4 = Calendar.getInstance();
		Calendar now5 = Calendar.getInstance(); //call by Reference
//		heap ������ ���ο� Calendar ��ü�� ������ �ʰ� ó��������� ��ü �޸� 
//		�ּҸ������Ҽ��ֵ��� ����
	
		System.out.println(now1.getTime());
	
		}
		
		
		
		
		
	}


