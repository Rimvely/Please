package com.class3;

//���(�θ� �ڽ�)
//1. �θ�Բ��� ����(�ڽ�)����
//2. private�� �����Ѱ��� �θ𲨴�
//3. protected�� �����Ѱ��� ����� ����
//4. ������ ������
//5. ���� ��ü�� ������ ������ ���� ����.


class Test{
	
	private String title;
	private int area;
	
	public void set(String title, int area){ // 1.��° ��� private ���� method�� �ʱ�ȭ
		
		this.title = title;
		this.area = area;
	
	}
	
	public void print(){
		System.out.println(title + " : " + area);
	}
		
}



//     �ڽ�          �θ�
class RectA extends Test{
	
	private int w,l;
	//������
	//overloading �� ������
	public RectA(int w, int l){
		this.w = w;
		this.l = l;
	}
		
	public void RectArea(){
		
		int a = w * l;
		set("�簢��", a);
		
		
		
	}
}

public class Test8 {

	public static void main(String[] args) {

		RectA ob = new RectA(10, 20);
		
		ob.RectArea();

		ob.print();
		
	}

}
