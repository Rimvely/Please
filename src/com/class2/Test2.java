package com.class2;

//static
//�ڱⰡ �˾Ƽ� �޸𸮷� �ö�
//1000���� �����޸𸮰����� �Ѱ��� ���

public class Test2 {

	public static int a = 10;//class����
	//Ŭ���������� Ŭ�����޼ҵ� �ε��Ǵ¼���
	//�޸� �Ҵ��� �̷������ [Ŭ�����̸�.��ü�̸�]���� ���� ex[Test2.a]
	//�� new����������ʰ� �ٷλ���Ҽ��ִ�
	
	
	
	
	private int b = 20;//instance����
	//������Ŭ������ instance�޼ҵ� �ȿ��� �ٷ� ������ ����������
	//Ŭ���� �޼ҵ忡���� �����Ҽ� ����.
	//Ŭ���� �޼ҵ忡�� �����ϱ����ؼ��� new�� ����
	//��ü�� �����ϰ� ��ü�̸����θ� ������ �����ϴ�
	
	public void write(){ //instance �޼ҵ�
		
		System.out.println("class����: " + a);
		System.out.println("instance����: " + b);

	}
	
	public static void print(){
		System.out.println("class����: " + a);
//		System.out.println("instance����: " + b);
//		System.out.println("instance���� b: " + ob1.b); //Test2 ob1 = new Test2(); �� �ؿ��־ �ȵ�
	}
	
	
	
	
	
	
	
	
	//class �޼ҵ�
	public static void main(String[] args) {

		System.out.println("class���� a : " + a);
		System.out.println("class���� Test2.a: " + Test2.a);//Ŭ�����̸�.��ü�̸�
		
		//write();
		
		print();
		Test2.print(); //<< �̷��Ծ��°� �´�
		//�����׿�. ����ƽ 
		
		
		Test2 ob1 = new Test2(); //�̰ɾ����� ���� write and b �� �ö󰥼��ִ� 15������
		
		System.out.println("instance���� b: " + ob1.b);
		
		ob1.write();
		ob1.print();
		System.out.println("class���� a : " + ob1.a);
		
		Test2 ob2 = new Test2();
		ob2.a = 100;
		ob2.b = 200;
		System.out.println("ob2--------------");
		ob2.write();
//		ob2.print();
		
		Test2 ob3 = new Test2();
		System.out.println("ob3--------------");
		ob1.write();
//		ob1.print();

		
		
	}

}
