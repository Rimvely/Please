package com.class6;

import java.util.Scanner;


interface FruitA{
	
	String Won = "원"; //public static final 생략
	
	public int getPrice();
	public String getName();


}

interface ItemFruit extends FruitA{   //인터페이스가 인터페이스 상속가능
	
	public String getItems();

}

class Orange implements ItemFruit{

	@Override
	public int getPrice() {
		return 1000;
	}

	@Override
	public String getName() {
		return "오렌지";
	}

	@Override
	public String getItems() {
		return "과일";
	}
	
	
	
	
}

class Apple implements	ItemFruit{

	@Override
	public int getPrice() {
		return 2000;
	}

	@Override
	public String getName() {
		return "사과";
	}

	@Override
	public String getItems() {
		return "과일";
	}

}



public class Test5 {

	public void packing(ItemFruit ob){
		
		System.out.println(ob.getItems());
		System.out.println(ob.getName());
		System.out.println(ob.getPrice() + FruitA.Won);
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Test5 t = new Test5();
		
		System.out.println("1.오렌지 2.사과?");
		int n =sc.nextInt();
		
		if(n==1){
			t.packing(new Orange());
		}else if(n==2){
			t.packing(new Apple());
		}
		
		
		
//		ItemFruit ob = new Orange();
//		ItemFruit ob = new Apple();
		
		
		
//		System.out.println(ob.getItems());
//		System.out.println(ob.getName());
//		System.out.println(ob.getPrice() + FruitA.Won);
//		
//		ob = new Apple();
//		
//		System.out.println(ob.getItems());
//		System.out.println(ob.getName());
//		System.out.println(ob.getPrice() + FruitA.Won);
		
		
//		Orange ob1 = new Orange();
//		
//		ob1.getItems();
//		
//		System.out.println(ob1.getItems());
//		System.out.println(ob1.getName());
//		System.out.println(ob1.getPrice() + FruitA.Won);
//		
//		Apple ob2 = new Apple();
//		
//		System.out.println(ob2.getItems());
//		System.out.println(ob2.getName());
//		System.out.println(ob2.getPrice() + FruitA.Won);
//		int a;
//		
//		a = 10;
//		System.out.println(a); //10
//		
//		a = 20;
//		System.out.println(a); //20
		
		
		
		
		
		
		
		
	}

}
