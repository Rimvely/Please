package com.stream;

import java.io.FileOutputStream;

//FileInputStream = ������ �о�°�

//FileOutputStream = �Է��� ���� ���Ϸ� �������°�(�����)

public class Test6 {

	public static void main(String[] args) {

		try {

			FileOutputStream fos = new FileOutputStream("D:\\doc\\text.txt");

			int data;

			System.out.println("���ڿ� �Է� : ");

			while ((data = System.in.read()) != -1) {

				fos.write(data);
				fos.flush();
			}
			
			fos.close();

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
