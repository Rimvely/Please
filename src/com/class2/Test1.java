package com.class2;

//private
//this :Circle �ڱ��ڽ�(class), ME 

class Circle {

	private int r;// instance ������ ���� ������ 100% ������ ����.

	public void setData(int r){//SetData(int r, Circle this) //���� �ʱ�ȭ�޼ҵ�

		this.r = r;         //this.r => private int r �� �ǹ�
	}
	
	public double area(){//area(Circle this)
		
		return r*r*3.14;
		
	}
	
	public void write(double a){//write(double a, Circle this)
		
		System.out.println("������: " + this.r);
		System.out.println("���� :" + a);
	}
	
	
	
	
	
}

public class Test1 {

	public static void main(String[] args) {

		Circle ob1 = new Circle();
		
		ob1.setData(10);//setData(10,ob1);
		//ob1.r = 100;
		double a = ob1.area();//ob1.area(ob1);
		ob1.write(a);//write(a, ob1);
		
		System.out.println();
		
		ob1.setData(200);
		a = ob1.area();
		ob1.write(a);
	}

}
