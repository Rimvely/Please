package com.class4;

class A{
	
	public int x = 10;
	
//	public A(){                �����Ǿ��ִ� �κ�
//		super(); ->class A ���� ���� Ŭ���� Object�� ���ӵǾ��ִ�.
//	}
	
	public A(int x){              
	this.x = x;
} 
	public void print(){
		System.out.println("x: "+ x );
	}
	
}

class B extends A{
	
	public int y = 20;
	
//	public B(){                                      //public A(){ }  <-- define �� �����ʾƼ� �ȵ�
////		super();
//		System.out.println("aaa");                   //�����Ǿ��ִºκ�
//		
//	} 
	
	public B(int x){              
	super(x);
} 
	public void write(){
		System.out.println("y: " + y);
	}
}


public class Test1 {

	public static void main(String[] args) {

		B ob = new B(100);                               //new �������� ��üB�� ��������.
		
		ob.write();//����
		ob.print();//�θ�
		
		
		
		
		
	}

}
