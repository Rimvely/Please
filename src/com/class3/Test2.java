package com.class3;

class Rect{
	
	private int w,l;
	
	public Rect(){ //�⺻ ������(property such as void, static? ������ ������ ��������)
	
	}
	
	public Rect(int w, int l){ //overloading ������
		this.w = w;
		this.l = l;
	}
	
	public void set(int w, int l){ //�ʱ�ȭ �޼ҵ�
		this.w = w;
		this.l = l;
	}
	
	public int area(){
		return w*l;
	}
	
	public int circumference(){
		return (w*l)*2;
	}
	
	public void print(int a){                //�޼ҵ� �����ε�(�ȿ� �ڷḦ �ٸ��Գ� ������ ������ �ٸ���)
		System.out.println("����: " + w);
		System.out.println("����: " + l);
		System.out.println("����: " + a);
	}
	
	public void print(int a, int c){          //�޼ҵ� �����ε��� 
		System.out.println("����: " + w);
		System.out.println("����: " + l);
		System.out.println("����: " + a);
		System.out.println("�ѷ�: " + c);
	}

	
}





public class Test2 {

	public static void main(String[] args) {

		Rect ob1 = new Rect();    //ob2�� set up ��Ų�Ͱ� ob1�� �ؿ� ���� ����
		ob1.set(10, 20);
		
		int a = ob1.area();
		int c = ob1.circumference();

		
		ob1.print(a);
		System.out.println();
		ob1.print(a, c);
		System.out.println("-------------------------");
		
		Rect ob2 = new Rect(100, 200);    //�ʹݿ� �ʱⰪ�� �޴°��� ���߿� ���� �� �ȹٲ�
		a = ob2.area();
		c = ob2.circumference();
		ob2.print(a);
		System.out.println();
		ob2.print(a, c);
		
		
		
		
	}

}
