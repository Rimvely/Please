package com.class5;

//final�� ����ϴ� 3���� ���
//1. ��������� final�� ���̸� ���ѹ��� �ʱ�ȭ����
//2. �޼ҵ忡 final�� ���̸� override�� �Ұ�
//3. Ŭ������ final�� ���̸� ����� �Ұ�

//final class Test - 3.Ŭ������ final�� ���̸� ����� �Ұ�
class Test{
	public static final double PI; //1. ��������� final�� ���̸� ���ѹ��� �ʱ�ȭ����
	
	static{
		PI = 3.14;
	}
	
	public double area;
	//2. �޼ҵ忡 final�� ���̸� override�� �Ұ�
	public final void write(String title){
		System.out.println(title + " : " + area);
	}
}



public class Test6 extends Test {
	
//	public void write(String title) - override �Ұ���
	
	public void circleArea(int r){
		area = (double)r * r * PI;
	}

	public static void main(String[] args) {
		
		Test6 ob = new Test6();
		
		ob.circleArea(10);
		ob.write("��");


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
