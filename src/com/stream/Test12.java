package com.stream;

import java.io.File;
import java.io.FileOutputStream;

public class Test12 {

	public static void main(String[] args) {

		String str = "D:\\doc\\temp\\java\\test.txt"; //������ ����.
		//            0123456789

		String path = str.substring(0, str.lastIndexOf("\\"));  //lastIndexOf(����)  �����Ѱ�-1 �� �����Ѱ��ձ����д´�.
		// System.out.println(path);

		// ���1
		File f = new File(path);

		if (!f.exists()) {
			f.mkdirs(); // temp\\java ���ڴٴ°�
		}

		// //���2
		// if(!f.getParentFile().exists()){
		// f.getParentFile().mkdirs();
		// }

		try {

			FileOutputStream fos = new FileOutputStream(str);
			System.out.println("���ڿ� �Է� : ");

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
