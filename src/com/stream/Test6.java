package com.stream;

import java.io.FileOutputStream;

//FileInputStream = 파일을 읽어내는것

//FileOutputStream = 입력한 값을 파일로 내보내는것(입출력)

public class Test6 {

	public static void main(String[] args) {

		try {

			FileOutputStream fos = new FileOutputStream("D:\\doc\\text.txt");

			int data;

			System.out.println("문자열 입력 : ");

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
