package com.generic;

//���ܸ� �ٽ� ������ ���

public class Test6 {

	public void value1(int value) throws Exception {

		try {

			value2(value);                       //1��value2(-10)�� ������ �̰� �Ʒ��� �������� if(value<0)�� Exception error �� ����
												 
		} catch (Exception e) {
			System.out.println("vlaue1");             //3�� �ٽ� value2(value); error ������ �ͼ� value2�� error msg�� catch�� �ߵ�
		}											  //�׷��� 0������������ �ƴ� System.out.println("vlaue1");�� ���.
	}

	public void value2(int value) throws Exception{
		
		if(value<0)							
			throw new Exception("0���� ������!!");		//2�� ����οԴµ�
	}

	public static void main(String[] args) {

		Test6 ob = new Test6();

		try {

			ob.value1(-10);

		} catch (Exception e) {
			System.out.println("main...");
		}

	}

}
