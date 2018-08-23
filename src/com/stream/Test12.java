package com.stream;

import java.io.File;
import java.io.FileOutputStream;

public class Test12 {

	public static void main(String[] args) {

		String str = "D:\\doc\\temp\\java\\test.txt"; //폴더를 만듬.
		//            0123456789

		String path = str.substring(0, str.lastIndexOf("\\"));  //lastIndexOf(지정)  지정한곳-1 즉 지정한곳앞까지읽는다.
		// System.out.println(path);

		// 방법1
		File f = new File(path);

		if (!f.exists()) {
			f.mkdirs(); // temp\\java 쓰겠다는것
		}

		// //방법2
		// if(!f.getParentFile().exists()){
		// f.getParentFile().mkdirs();
		// }

		try {

			FileOutputStream fos = new FileOutputStream(str);
			System.out.println("문자열 입력 : ");

			int data;
			while ((data = System.in.read()) != 01) {

				fos.write(data);
				fos.flush();
			}
			

			fos.close();

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
