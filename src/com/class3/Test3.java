package com.class3;

public class Test3 {
	
	int a = 5;
	
	{ //�ʱ�ȭ ��
		System.out.println("�ʱ�ȭ�� a = " + a);
		a = 10;
		System.out.println("�ʱ�ȭ�� a = " + a);
	}
	
	static int b;
	static{//static �ʱ�ȭ ��
		b = 10;
		System.out.println("Static �ʱ�ȭ�� b = " + b);
	}
	
	final int C; //��� - �� �׻� �빮�� + �ʱⰪ�� �־���� 
//	 (�ѹ� ���� �����Ǹ����α׷�������Ǳ� ������ �� ����Ұ�)
	
	public Test3(){
		System.out.println("������...");
		C = 100;
		System.out.println("��� C = " + C);
	}
	

	public static void main(String[] args) {

		Test3 ob1 = new Test3();
		System.out.println("-------------------------");
		Test3 ob2 = new Test3();
		
	}

}
