package com.class7;   //������ Outer$Inner.class

//����Ŭ����
//Inner

class Outer {   //Ŭ�����ȿ� Ŭ����   

	static int a = 10;
	int b = 20;

	public class Inner {  //�̳�Ŭ���������� ������ ������ ����ȴ�

		int c = 30;

		public void write() {
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}

	}

	public void print(){
		Inner ob = new Inner(); 
		ob.write();
		
	}
	
	
}

public class Test1 {

	public static void main(String[] args) {

		Outer out = new Outer(); //�ܺ�Ŭ���� ��ü����. �ݵ�� �ܺΰ� ���� �����������.
		out.print();
		
		Outer.Inner inner = out.new Inner();  //�ι�° �����ϰ� ����¹��
		inner.write();
		
		
		
	}

}
