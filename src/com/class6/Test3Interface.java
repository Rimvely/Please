package com.class6;

//Interface
//1. �߻�Ŭ������ ���� �����ְ� ����(����)�� ����.
//2. final������ �����Ҽ� �ִ�.
//3. �������̽��� �����ϱ� ���ؼ��� implements�� ����Ѵ�.
//4. �ϳ��̻��� �������̽��� implements�� Ŭ������
//   �������̽��� ��� �޼ҵ带 override�ؾ��Ѵ�.
//5. �������̽��� �������̽��� ��ӹ����� ������ �̶� extends
//   Ű���带 ����Ѵ�.
//6. �������̽��� ���� ����� �����ϴ�
//7. �������̽��� ������̴�
//8. ���������� �����ϴ�

interface Fruit{
	
	String Won = "��"; //interface�� public  �����Ǿ� �ִ�.
	                   //ù���ڰ� �빮�ڸ� static final ���� �̴�.
	
	int getPrice(); //�޼ҵ带 �����.  //public abstract ����.
	
	public String getName();

}

class FruitImpl implements Fruit {

	@Override
	public int getPrice() {
		return 1000;
	}

	@Override
	public String getName() {
		return "���";
	}  //Fruit() and getPrice() �Ѵ� �������̵��ؾ��� 
	
	public String getItems(){
		return "����";
	}
	
	
	
}


public class Test3Interface {

	public static void main(String[] args) {
		
		FruitImpl ob1 = new FruitImpl(); //�ڽ�Ŭ������ �ڽ� ��ü�� ����� �θ��� �ɷ��� �����ִ�. super();������?
		
		//Fruilt ob1 = new FruiltImpl();  - �ڽ�Ŭ������ �θ�ü�� ������µ� �θ�ɷ�2�� �ڽ���3��
//		�θ�� �ɷ��� 2�� �ڽ��� 2+1�� �� �ȵȴ�.
		
		System.out.println(ob1.getItems() + " : " + ob1.getName() + " : " + ob1.getPrice() + Fruit.Won);
		
		Fruit ob2 = ob1; //UPCAST
		
		System.out.println(ob2.getName()); //�߻�Ŭ������ ����. �θ� ���� ������ ��������
		
//		System.out.println(ob2.getItem()); // �θ����״� �ִµ� �ڽ����� �ִ°� ������
		
		
		
		
	}

}
