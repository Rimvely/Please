package com.generic;

//���ʸ�(Generic)

class Box<T> {  //������ ���� generic�� ���ǵǾ� �����ʴ´�.

	private T t;

	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}
}

public class Test1 {

	public static void main(String[] args) {
		
		Box<Integer> b1 = new Box<Integer>();  //���⿡ Integer�̶�� �� �ο��ؼ� ������ Integer�� �Ǿ�����.
		
		b1.set(new Integer(10)); // 10�̶�� ����Ǵ� ������ AUTO BOXING �����Դϴ�.
		
		Integer i = b1.get();
		System.out.println(Integer.toString(i));
		System.out.println(i);
//		------------------------------------------------------------------------------------------------------
		
		Box<String>	b2 = new Box<String>();
		b2.set("����");
		String s = b2.get();
		System.out.println(s);
		
		Box b3 = new Box(); //�ڷ����� ���������ʾƼ� Box�� Object�̴�.
		b3.set(30); //UPCAST
//		Integer it = b3.get(); ERROR �ɸ��� ���� object�ε� integer�� �����޶���ؼ�
		Integer it = (Integer)b3.get();  //�׷��� DOWNCAST
		
	}

}
