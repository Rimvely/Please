package com.swing;

import java.lang.reflect.Method;

//Reflect������ ����Ѹ޼ҵ� ȣ����

class Exam {

	public Integer hap(Integer a, Integer b) {
		return a + b;
	}

	public int sub(int a, int b) {
		return a - b;
	}

	public void write(String title, int result) {
		System.out.println(title + " : " + result);
	}

}

public class Test5 {

	public static void main(String[] args) throws Exception {
		
		Class cls = Class.forName("com.swing.Exam");
		
		//Ŭ������ ��ü����
		Object ob = cls.newInstance();
		
		//hap �޼ҵ�
		Method hap = cls.getDeclaredMethod("hap", new Class[]{Integer.class,Integer.class});
		
		//sub�޼ҵ� ������ ���Ϲ���
		Method sub = cls.getDeclaredMethod("sub", new Class[]{int.class,int.class});
		
		//write�޼ҵ� ������ ���Ϲ���
		Method write = cls.getDeclaredMethod("write", new Class[]{String.class,int.class});
		
		//�μ��� ���� �޼ҵ�
		//Method write =
		//		cls.getDeclaredMEthod("write",null);
		
		//�޼ҵ� ȣ��(invoke() ���)
		Object h = hap.invoke(ob, new Object[]{20,10});
		write.invoke(ob, new Object[]{"��:",h});
		
		Integer i = (Integer)sub.invoke(ob, new Object[]{20,10});
		write.invoke(ob, new Object[]{"��",i});
		
		//�μ��� ���� ���
		//write.invoke(ob, null);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
