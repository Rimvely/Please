package com.collection;

import java.util.Hashtable;
import java.util.Iterator;

//Collection
//Map<Ű,��>                                   == //Map<set, ��> set�� �ߺ��÷����� �����ʴ´�.
//1.Hashtable - ����ȭ������ = Vector             //key���� value���� ������ ���εǾ��־ 
//2.HashMap - ����ȭ�� ������ = ArrayList		  //(key + " : " + value) ��� �ۼ��ؾ���
 
//Ű�� �ߺ����� ���� ������ ����. (Ű�� set)
//Ű�� ���ߺ����� ���̸� ���������� ���� �ȴ�.(����)
//Map�� Iterator�� ����.
//put : �߰�
//get : ��������
public class Test3 {
	
	public static final String name[] = {"�����","õ����","������","����ȿ","�ڽ���"};
	
	public static final String tel[] = {"111-111","222-222","333-333","111-111","444-444"};
	
	public static void main(String[] args) {

		Hashtable<String, String> h = new Hashtable<String, String>();
		
		for(int i = 0; i<name.length; i ++){
			
			h.put(tel[i], name[i]);
			
		}
		
		System.out.println(h);
		
		String str;
		
		str = h.get("111-111"); //Ű�� �ָ� ���� ������
		if(str==null || str.equals(""))
			System.out.println("�ڷ����");
		else
			System.out.println(str);
		//����ȿ�� �ߴ������� �ߺ��� �����ʰ� ������ ����.
		
		//Ű�� �����ϴ��� �˻�
		if(h.containsKey("222-222"))
			System.out.println("222�ִ�");
		else
			System.out.println("222����");
		
		//�����Ͱ� �����ϴ��� �˻�
		if(h.containsValue("õ����")){
			System.out.println("���� �ִ�");
		}else
			System.out.println("���� ����");
		
		//����
		h.remove("222-222");
		if(h.containsKey("222-222"))
			System.out.println("222�ִ�");
		else
			System.out.println("222. ����");
		
		//��ü���                                   //map���� iterator�̾��
		                                             //keyset iterator �̿�
		Iterator<String> it = h.keySet().iterator(); //keySet()�� iterator 
		while(it.hasNext()){
			
			String key = it.next();  //���⼭ Str�� key���� �����´�.
			String value = h.get(key);	//value�� ��ȯ
			
			System.out.println(key + " : " + value);
			
			//key���� value���� ������ ���εǾ��־ 
			//(key + " : " + value) ��� �ۼ��ؾ���
		}
		
		
		
		
		
		
	}

}
