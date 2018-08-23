package com.stream;

import java.io.FileInputStream;

//파일내용 입출력
//FileInputStream
//FileOutputStream

public class Test5 {

	public static void main(String[] args) {

		try {

			FileInputStream fis = new FileInputStream("D:\\doc\\text.txt");

			int data; // 컴퓨터는 항상 1byte씩 읽어내고 받아낸다.
			while ((data = fis.read()) != -1) {

				// System.out.println((char)data); //찍히지가않는다 그래서 전용출력기를 생성.

				System.out.write(data);
				System.out.flush();

			}
			
			fis.close(); //무조건 클로즈를 해야한다. 그렇지않으면 쓰레기값으로 바뀐다. 

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
