package com.class1;

class Aclass {

	int a,b; //instance ����
	
}

public class Test2{
	
	
	public static void main(String[] args){
		
		//�̰��ϴ������� �޸𸮰����� ���ξ���
		//instance ������ ������ ���ξ���      �̰� �����ֱ����ؼ�
		//class �� �ڷ����̴�
		
		//Aclass�� �ڷḦ 2�� ������ �־�� �������ִ°� 2��������⶧����
		
		
		//int a �� �ڷḦ 1�� �������־��
	
	Aclass ob1 = new Aclass();
	Aclass ob2 = new Aclass();
	
	ob1.a = 10;
	ob1.b = 20;
	
	System.out.println("ob1.a : "+ ob1.a);//10
	System.out.println("ob1.a : "+ ob1.b);//20
	
	System.out.println("ob2.a : "+ ob2.a);//0  �⺻���� 0
	System.out.println("ob2.a : "+ ob2.b);//0
	
	ob2.a = 100;
	ob2.b = 200;		
	
	System.out.println("ob2.a : "+ ob2.a);//100
	System.out.println("ob2.a : "+ ob2.b);//200
	
	System.out.println("ob1.a : "+ ob1.a);//10
	System.out.println("ob1.a : "+ ob1.b);//20
	

	
	
	}
}