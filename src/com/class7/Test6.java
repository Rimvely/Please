package com.class7;

import java.util.Iterator;
import java.util.Vector;

public class Test6 {

	private static final String city[] = {"����","�λ�","�뱸","��õ","����","����","���"};
	
	public static void main(String[] args) {

		Vector<String> v = new Vector<String>();   // < > generic
		
		for(String c : city){
			v.add(c);
		}
		
		//v.add(10);
		String str;
		
		str = v.firstElement();
		System.out.println("ù��° ��� : " + str);
		
		str = v. lastElement();
		System.out.println("��������� : " + str);
		
		str = v.get(2);
		System.out.println("����°��� : " + str);
		
		for(int i = 0; i < v.size(); i++){
			System.out.print(v.get(i) + " ");
		}
		System.out.println();
		
		for(String s : v){               //Ȯ�� for��
			System.out.print(s + " ");
		}
		System.out.println();
		
		//Iterator : �ݺ���
		Iterator<String> it = v.iterator();
		while(it.hasNext()){     //�ݺ����� ����������������
			
			str = it.next();  //���� �ִ� ���
			System.out.println(str + " ");
		}
		
		
//		it�ȿ��� �����Ͱ���� ����� �ȳ��´�. 
//		Iterator<String> it = v.iterator(); ���縦 �Ѱ��ε� �װԾ��⶧���̴�.
		while(it.hasNext()){   
			
			str = it.next();  
			System.out.println(str + " ");
		}
		
		
	}

}
