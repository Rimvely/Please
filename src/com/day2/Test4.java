package com.day2;

import java.io.*;

class Test4 {
	
	public static void main(String[] args) throws IOException {

		//���
		//if, for, while, do~while,switch

		//for Ƚ���� ������������
		//while ����� ���������� �𸦶�

		BufferedReader br = new BufferedReader (
			new InputStreamReader (System.in));


		int num = 0; //�ʱ�ȭ��
		String str=null; //"" or null//�ʱ�ȭ��
		
		System.out.print("���Է�?");
		num = Integer.parseInt(br.readLine());
		
		//����if��
		//if(num%2==0){
		//	str ="¦��";
		
		//}
		//if(num%2!=0){
		//	str ="Ȧ��";

		if(num%2==0){
			str ="¦��";
		
		}else  // ���⿡�� ���� {} �ؾ��ϴµ� 1���̶� ��������
		
			str ="Ȧ��";
		


		System.out.println(str);





	}
}
