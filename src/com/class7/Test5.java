package com.class7;

import java.util.Vector;

//collection (Framework)(�����)
//�⺻ object�̴�

//List(info) - ArrayList(c)
//              Vector(c)  - ����ȭ�� �������Ѵ�
//Map(info)-Hashtable(c),HashMap(c)
public class Test5 {
	
	private static final String city[] = {"����","�λ�","�뱸","��õ","����","����","���"};

	public static void main(String[] args) {
		//�⺻ ������Ÿ���� Object�̴�.
		
		Vector v = new Vector(); //Vector�� ��ü�� �����ϴ¼��� �迭�� 10���� �⺻�����θ������
		                         //�˾Ƽ� �������ʿ��ϸ� ��������
		
		                          //Vector �� Object Ŭ������ ����ȯ = �ؿ����� String ���� ��.
		v.add("����"); //UPCAST   String = > Object(Vector)  
		v.add(30); //UPCAST
		v.add('a'); //UPCAST
		
		String str = (String)v.get(0);  //Vector �� Object�� String���� DOWNCAST
		System.out.println(str);
		
		int i = (int)v.get(1);
		System.out.println(i);
		
		char c = (char)v.get(2);
		
		
	}

}
