package com.class4;

//String
///int, double
//String�� class�̴�(�ڷ����� �ƴϴ�)

public class Test3 {

	public static void main(String[] args) {

		String ob1 = "Seoul";
		String ob2 = "Seoul";
		String ob3 = new String("Seoul");
		Integer aa = new Integer(20);
		
		System.out.println("ob1==ob2: " + (ob1==ob2)); //true
		System.out.println("ob1==ob3: " + (ob1==ob3)); //false
		System.out.println("ob1.equals(ob3): " + ob1.equals(ob3));
							//String�� object�� equals�� override��. �ּҰ��� �ƴ� ��ü�� ��.
							//String�� ���ڸ� ���ϴ°ž�.object equalsó���ּҰ��� ���ϴ°� �ƴ϶�.
		
		ob2 = "korea";
		System.out.println("ob1 == ob2 " + (ob1 == ob2)); //false
		//String�� �Һ��� ��Ģ - String�� �ѹ� heap ������ ����Ǹ� ���� �������۴´�.
		ob2 = "japan";
		System.out.println("ob1 == ob2 " + (ob1 == ob2)); //false
		
		ob2 = "Seoul";
		System.out.println("ob1 == ob2 " + (ob1 == ob2)); //true
		//�����ִ� 10������ Seoul�� �־ ���ο�� �ȸ���� �ٽ� 10���ΰ�
		//�׷��� �ٽ� ob1 == ob2�� ������
		
		System.out.println(ob2); //Seoul
		System.out.println(ob2.toString());//Seoul
		
		//ó���ϴ� �����ʹ� ����ϰ� ���󵵴� ���⶧����
		//�����ʹ� heap ������ �����ϰ� ����ϴ� ����� �ڷ���ó�� ����Ѵ�		
		
	}

}
