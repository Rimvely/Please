package com.day6;

import java.util.Scanner;

public class TestCom {

	public int w,h; //��������, instance���� [����]
	
	public void input(){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����?");
		w = sc.nextInt();
		
		System.out.print("����?");
		h = sc.nextInt();
		
		//return;  ���̵�� ������ ���� ����(��ȯ���̾�� ��������)
		
	}
	
	public int area(){  // area -> result -> return -> int.
		
		int result;//��������
		
		
		result = w*h;
		
		return result;
		
		
	}
	
	public int circumstance(){
		
		return (w+h)*2;
	}
	
	public void print(int a, int c){  //�������ϻ� ����Ÿ Ÿ�Ը� �����ָ� TestUSAó�� �̸��� �޶󵵵ȴ�
		
		System.out.println("���� : "+ w);
		System.out.println("���� : "+ h);
		System.out.println("���� :"+ a);
		System.out.println("�ѷ� :"+ c);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
