package com.class4;

public class Test5 {

	public static void main(String[] args) {

			StringBuffer sb = new StringBuffer();
			
			sb.append("����");
			sb.append("�λ�");
			sb.append("�뱸");  //������Ÿ�� = ���� StringBuffer
			
			System.out.println(sb);
			
			//StringBuilder - �۾��ѵڿ� - String���� ��ȯ
			
			String str = sb.toString();  //������Ÿ���� String���� ��ȯ
			System.out.println(str);
			
			//Integer Wrapper class
			int a = 24;
			System.out.println(a);
			System.out.println(Integer.toString(a));//���ڷ�
			System.out.println(Integer.toString(a,2));//2������ ���
			System.out.println(Integer.toString(a,16));//16����
	}

}
