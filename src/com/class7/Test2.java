package com.class7;

//����Ŭ����
//Local
//�޼ҵ�ȿ� Ŭ������ �����ϴ°� ���� Ŭ������� �Ѵ�.
//�޼ҵ�ȿ��� ��ü�����ϰ� ��ȯ�ؾ��Ѵ�.

class Outer1 {

	static int a = 10; // Instance ����
	int b = 20;

	public void write(){
		
		int c = 30;    //local ����
		final int d = 40;
		
		class Local{        //�޼ҵ�ȿ� Ŭ���� = ����Ŭ����
			
			public void print(){
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
				System.out.println(d);
			}
			
		}
		
		Local ob = new Local(); //�޼ҵ� �ȿ����� ��ü���� ����
		ob.print();
	}
}

public class Test2 {

	public static void main(String[] args) {

		Outer1 out = new Outer1();
		out.write();
		
		
	}

}
