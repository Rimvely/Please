package com.class3;


//������
//1.�޸� �Ҵ��� ������ ���
//2.���� �ʱ�ȭ �Ҵ� ����Ѵ�

//class�� �̸��� ����
//���ϰ��� ���⶧���� property�� ����.
//�ߺ����ǰ� ����(overloading)
//���� ���ο��� �ѹ��� ȣ�� ����





public class Test1 {
	
	private int x;
	
	public Test1(){ //�⺻ �����ڴ� ���� ����
		
		this(20);    
		System.out.println("�μ��� ���� ������");
		x = 10;
		System.out.println("x : " + x);
//		this(20); ���⿡�� �Ѽ�����. ���ο� �ѹ��� �����Ѱ��̶�.
	}
	
	public Test1(int x){ //�����ε��� ������
		
		System.out.println("�μ��� �ִ� ������..");
		this.x = x;
		System.out.println("x : " + x);

	}
	
//	public void setDate(int x){
//		this.x = x;
//		System.out.println("x : " + x);
//	}
//	

	public static void main(String[] args) {

		Test1 ob1 = new Test1();    //�ȿ������� ������ �����ε��� ��ü�� �ִٸ� �� �⺻�����ڸ� �����
		                            //�ξ����
//		ob1.setDate(10);    
		Test1 ob2 = new Test1(100); //�����ε��� ������ �����/������ ����
		                            //ob2 ó���ӵ� ����. �ʱ�ȭ�� ���� ����
		
		
		
	}

}
