package com.swing;

//Class��� Ŭ����
//Ư�� Ŭ������ �������̽��� ������ 
//�˻��Ҽ� �ִ� �޼ҵ带 �����Ѵ�.

class Test {

	public void wrtie() {

		System.out.println("�׽�Ʈ...");
	}
}

public class Test3 {

	public static void main(String[] args) throws Exception {

		Class<?> c = Class.forName("com.swing.Test"); //Ŭ�������� com.swing.Test�� �ִ��������о�Ͷ�
		
		//Test ob = new TesT();
		Object ob = c.newInstance(); //Ŭ�������� ��ü�����߱���
		
		Test t = (Test)ob;//DOWNCAST
		
		t.wrtie();
		
	}

}
