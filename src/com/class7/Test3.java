package com.class7;

//����Ŭ����
//��ø
//Ŭ�����ȿ��� static���� �������Ѵ�.

class Outer2 {                               //Ŭ������ static. �׷���ü �����ʿ䰡����.

	static int a = 10;
	int b = 20;

	public static class Inner2 { // Inner 2�� �̹� �޸𸮿� ��ü������ �Ǿ��ֱ⶧����
		                         // Inner2�� Outer2�� ��ü�����ؾ��Ѵ�.�׷��� ��ø�̴�.

		int c = 30;

		public void write() {

			System.out.println("a : " + a);
			//System.out.println("b : " + b); ���� 1���� �־�.
			System.out.println("c : " + c);
			
			Outer2 out = new Outer2();                  // [1��]���⿡�� ��ü�����ϴ� �����
			System.out.println("out.b: " + out.b);      // �̹� �ö� inner ���� outer ��ü�� �����ϴ� ���
		}
	}
	
	public void print(){            // [2��]  outer2 �޼ҵ�ȿ��� ��������
		Inner2 ob = new Inner2();
		ob.write();
	}
	
}

public class Test3 {

	public static void main(String[] args) {

		Outer2 out = new Outer2();   // 1�� ������ ����Ʈ���     �ƿ��͸� �����ؼ�
		out.print();
		
		Outer2.Inner2 inner = new Outer2.Inner2();  // 2��        �̳ʸ� ����� �����ϴ°�?
		inner.write();
		
	}

}
