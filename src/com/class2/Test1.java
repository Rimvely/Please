package com.class2;

//private
//this :Circle 자기자신(class), ME 

class Circle {

	private int r;// instance 변수는 거의 무조건 100% 정보의 은닉.

	public void setData(int r){//SetData(int r, Circle this) //변수 초기화메소드

		this.r = r;         //this.r => private int r 을 의미
	}
	
	public double area(){//area(Circle this)
		
		return r*r*3.14;
		
	}
	
	public void write(double a){//write(double a, Circle this)
		
		System.out.println("반지름: " + this.r);
		System.out.println("넓이 :" + a);
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
