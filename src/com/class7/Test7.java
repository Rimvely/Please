package com.class7;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class Test7 {

	private static final String city[] = { "����", "�λ�", "�뱸", "��õ", "����", "����",
			"���" };

	public static void main(String[] args) {

		Vector<String> v = new Vector<String>();
		String str;

		System.out.println("������ �ʱ�뷮: " + v.capacity());
		
		for (String c : city) {
			v.add(c);
		}

		System.out.println("[Iterator�� ����� ��ü���...]");

		Iterator<String> it = v.iterator();
		while (it.hasNext()) {

			str = it.next();
			System.out.println(str + " ");
		}
		System.out.println();

		System.out.println("������(���) ����: " + v.size());

		// ������ �����ϱ�
		v.set(0, "Seoul"); // index ��ȣ�� ���°�� element ����ҿ�
		v.set(1, "Pusan");

		System.out.println("[��ü���...]");
		for (String s : v) {
			System.out.println(s + " ");
		}
		System.out.println();

		// �����ֱ�
		v.insertElementAt("���ѹα�", 0);
		for (String s : v) {
			System.out.println(s + " ");
		}
		System.out.println();

		// �˻�
		int index = v.indexOf("�뱸");
		if (index != -1) {  //indexof ���� ���� �κ��� -1 �ΰ�.
			System.out.println("�˻�����: " + index);
		} else {
			System.out.println("�˻�����: " + index); // -1
		}
		System.out.println();

		// ��������
		Collections.sort(v);
		for (String s : v) {
			System.out.print(s + " ");
		}
		System.out.println();

		// ��������(10~1, Z~A, ��~��)
		Collections.sort(v, Collections.reverseOrder());
		for (String s : v) {
			System.out.print(s + " ");
		}
		System.out.println();

		// ����
		v.remove("Pusan"); // v.remove(7);
		for (String s : v) {
			System.out.print(s + " ");
		}
		System.out.println();

		//�뷮 ����
		for(int i=1; i<=20; i++){
			v.add(Integer.toString(i));
		}
		for (String s : v) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		System.out.println("������ �ʱ�뷮: " + v.capacity());
		System.out.println("������(���) ����: " + v.size());
		
		//��������
		
		//v.removeRange(5,20); -X
		for(int i=1; i<= 10; i++){ //10������ 5��° �ִ� ������
			v.remove(5);     //5��° �����Ͱ� �������� �ڿ� �ֶ� ������ �ε�����ȣ�� ������
		}
		for (String s : v) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		System.out.println("������ �ʱ�뷮: " + v.capacity());
		System.out.println("������(���) ����: " + v.size());
		
		//����� ����
		v.trimToSize();
		System.out.println("������ �ʱ�뷮: " + v.capacity());
		System.out.println("������(���) ����: " + v.size());
		
		//��ü����
		v.clear();
		System.out.println("������ �ʱ�뷮: " + v.capacity()); //������ �״��
		System.out.println("������(���) ����: " + v.size());   //�����͸� ���� 
		
		//�����Ͱ� ������ ������� ������ �����ϱ� ���ؼ� �ٽ� Ʈ����������
		v.trimToSize();
		System.out.println("������ �ʱ�뷮: " + v.capacity());
		System.out.println("������(���) ����: " + v.size());
		
	}

}
