package com.class4;

class Test { //extends Object
	
	private int a = 10;
	
	public void write(){
		System.out.println("a : " + a);
	}
}

public class Test2 {
	
	public static void main(String[] args){
		
		Test ob1 = new Test();
		Test ob2 = new Test();
		
		
		//Object�� equals�� �ּҸ� ���Ѵ�
		System.out.println("ob1 == ob2 " + (ob1 == ob2)); //false
		
		System.out.println("ob1.equals(ob2) : " + ob1.equals(ob2)); //false
		
		System.out.println("ob1 :" + ob1); //ob1 :com.class4.Test@15db9742 �ּ�
										   //15db9742�� heap �ּ�
		
		System.out.println(ob1.toString());  //com.class4.Test@15db9742
		
		
		
		
		
		
	}														
	

}
