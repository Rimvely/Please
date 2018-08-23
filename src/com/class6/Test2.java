package com.class6;

class SuperTest{
	
	public int a = 10, b = 20;
	
	public void write(){
		System.out.println("����Ŭ���� write()�޼ҵ�");
	}
	
	public int hap(){
		return a + b;
	}
}

class SubTest extends SuperTest{
	
	public int b = 100, c = 200;
	
	public void print(){
		System.out.println("����Ŭ���� print()�޼ҵ�");
	}
	
	@Override
	public int hap() {
		return a+b+c;
	}
	
}
public class Test2 {

	public static void main(String[] args) {

		SubTest ob1 = new SubTest();
		
		System.out.println("b : " + ob1.b); //100
		
		SuperTest ob2 = ob1; //UPCAST
		
		System.out.println("ob2.b : " + ob2.b); //20
		
		System.out.println("�� : " + ob2.hap()); //220(x)  310(o) �޼ҵ�(�޼ҵ�� ������ �ڱⲨ����)
		                                         
		ob2.write();
//		ob2.print(); �������� ����
		//���(�θ� �ڽ�)
		//1. �θ�Բ��� ����(�ڽ�)����
		//2. private�� �����Ѱ��� �θ𲨴�
		//3. protected�� �����Ѱ��� ����� ����
		//4. ������ ������
		//5. ���� ��ü�� ������ ������ ���� ����. (override)
		
		((SubTest)ob2).print(); //downcast
		ob1.print();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
