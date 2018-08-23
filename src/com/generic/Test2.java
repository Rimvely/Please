package com.generic;

class Box2<T>{
	
	private T t;
	
	public void set(T t){
		this.t = t;
	}
	
	public T get(){
		return t;
	}
	
	public <U> void print (U u){ //메소드에서만 사용하는 U
		
		System.out.println(u);
		System.out.println("t클래스: " + t.getClass().getName());
		System.out.println("u클래스: " + u.getClass().getName());
	}
	
	
}
public class Test2 {

	public static void main(String[] args) {
		
		Box2<Integer> b = new Box2<Integer>();
		
		b.set(new Integer(30)); //래퍼클래스를 쓰려면 객체를 생성해서 써야한다.
		b.print("test");
		b.print(50);
	}

}
