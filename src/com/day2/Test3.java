package com.day2;

import java.io.*;

class Test3 {
	
	public static void main(String[] args) throws IOException {

		//char(����) - ���� ����ǥ�� ���
		//"a" �츮�� �˰��ִ� ����  String ch = "a"

		//char ch = 'a'; �ѹ��ڸ� ���尡�� (ASCIII)�� ���� ////////  'aa' ����2�� �ȵ�
				
		
		char ch,result;

		System.out.print("�ѹ���");  //a(97),  //A(65)            aaa 3���ᵵ a 1���� �ν�
		
		     //(char) ��������ȯ ���ڸ� ��ȣ��
		ch = (char)System.in.read(); //�̷��Ը��ϸ� ������.   �� ������ a�� �ν��ѰԾƴ϶� 97�� �ν��߱⶧��
		                             //�׷��� int - > char �ٲ���
		
			result = ch>=65 && ch<92?(char)(ch+32): //���׿���   A   to    Z �빮�� A to Z
		            (ch>='a' && ch<='z'?(char)(ch-32):ch);//������ �ϴ� ���� �ٽ� int �� �ٲ� >>> 
													//�׷��� �ٽ� ��ȣ�� �ٲ���� >> 
													//������ Ÿ���� ���� ������
		 	                                        //'a' = 97 �� �����
													

		    System.out.println(ch + ":" + result);

			System.out.println(ch);
			System.out.println(Integer.toString(ch)); //97





		
		}
}
