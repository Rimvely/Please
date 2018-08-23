package com.swing;

//Class라는 클래스
//특정 클래스나 인터페이스의 정보를 
//검색할수 있는 메소드를 제공한다.

class Test {

	public void wrtie() {

		System.out.println("테스트...");
	}
}

public class Test3 {

	public static void main(String[] args) throws Exception {

		Class<?> c = Class.forName("com.swing.Test"); //클래스에게 com.swing.Test에 있는정보를읽어와라
		
		//Test ob = new TesT();
		Object ob = c.newInstance(); //클래스에서 객체생성했구나
		
		Test t = (Test)ob;//DOWNCAST
		
		t.wrtie();
		
	}

}
