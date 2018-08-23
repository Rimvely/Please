package com.class3;

//���(�θ� �ڽ�)
//1. �θ�Բ��� ����(�ڽ�)����
//2. private�� �����Ѱ��� �θ𲨴�
//3. protected�� �����Ѱ��� ����� ����
//4. ������ ������
//5. ���� ��ü�� ������ ������ ���� ����. (override)

class TestB {

	private String title;

	protected int area;

	public void set(String title) { // 1.��° ��� private ���� method�� �ʱ�ȭ

		this.title = title;

	}

	public void print() {
		System.out.println(title + " : " + area);
	}

}

// �ڽ� �θ�
class RectB extends TestB {

	private int w, l;

	// ������
	// overloading �� ������
	public RectB(int w, int l) {
		this.w = w;
		this.l = l;
	}

	public void RectArea() {

		// area = w * l (x) because parents has a private number
		area = w * l;
		// int a = w * l;

		set("�簢��");

	}
}

public class Test9 {

	public static void main(String[] args) {

		RectB ob = new RectB(10, 20);

		ob.RectArea();

		ob.print(); // 1. �θ�Բ��� ������ ���� ����Ҽ� �ִ�.

	}

}
