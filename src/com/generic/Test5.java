package com.generic;

import java.util.Scanner;

//5-10�� �̳��� ���ڿ��� �Է¹޾� ���
//���ڿ� abcde
//abcde

//����
//1. 5-10�� ����Ȯ��
//2.������(��ҹ��� ���о���)�� �Է�

public class Test5 {

	public void inputForm(String str) throws Exception {

		// ���� 1,2
		// String.length
		// ������ Ȯ�� ASCII ��Ȯ��

		if (str.length() < 5 || str.length() > 10) {
			throw new Exception("5~10�� �̳��� ���ڿ��� �ٽ� �Է��ϼ���! :" + str);
		}
		
		for(int i = 0; i < str.length(); i++){
			
			char c = str.charAt(i);
			
			if((c<65||c>90)&&(c<97||c>122)){
				throw new Exception("�����ڸ� �����մϴ�!");
			}
			
		}
		
			
		
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str;

		Test5 ob = new Test5();

		try {

			System.out.print("���ڿ�?");
			str = sc.next();

			ob.inputForm(str); // �˻�

			System.out.println(str);

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
