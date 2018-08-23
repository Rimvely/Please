package com.class3;

//상속(부모가 자식)
//1. 부모님꺼는 내꺼(자식)꺼다
//2. private로 선언한것은 부모꺼다
//3. protected로 선언한것은 상속이 가능
//4. 내꺼는 내꺼야
//5. 같은 객체를 가지고 있으면 내꺼 쓴다. (override)

class TestB {

	private String title;

	protected int area;

	public void set(String title) { // 1.번째 방법 private 만들어서 method로 초기화

		this.title = title;

	}

	public void print() {
		System.out.println(title + " : " + area);
	}

}

// 자식 부모
class RectB extends TestB {

	private int w, l;

	// 생성자
	// overloading 된 생성자
	public RectB(int w, int l) {
		this.w = w;
		this.l = l;
	}

	public void RectArea() {

		// area = w * l (x) because parents has a private number
		area = w * l;
		// int a = w * l;

		set("사각형");

	}
}

public class Test9 {

	public static void main(String[] args) {

		RectB ob = new RectB(10, 20);

		ob.RectArea();

		ob.print(); // 1. 부모님꺼는 무조건 내가 사용할수 있다.

	}

}
