package com.stream;

import java.io.FileInputStream;

//���ϳ��� �����
//FileInputStream
//FileOutputStream

public class Test5 {

	public static void main(String[] args) {

		try {

			FileInputStream fis = new FileInputStream("D:\\doc\\text.txt");

			int data; // ��ǻ�ʹ� �׻� 1byte�� �о�� �޾Ƴ���.
			while ((data = fis.read()) != -1) {

				// System.out.println((char)data); //���������ʴ´� �׷��� ������±⸦ ����.

				System.out.write(data);
				System.out.flush();

			}
			
			fis.close(); //������ Ŭ��� �ؾ��Ѵ�. �׷��������� �����Ⱚ���� �ٲ��. 

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
