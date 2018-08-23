package com.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test8 {

	public boolean fileCopy(String str1, String str2) {

		File f = new File(str1); //�� ��η� ����
//		File str1 = new File(str1)�� �ȴ�?

		if (!f.exists()) { // �����̾����� ��ž�ض�
			return false;
		}

		try {
			FileInputStream fis = new FileInputStream(f);
			// FileInputStream fis = new FileInputStream(str1);
			FileOutputStream fos = new FileOutputStream(str2);

			int data;

			byte[] buffer = new byte[1024];

			while ((data = fis.read(buffer, 0, 1024)) != -1) {

				fos.write(buffer, 0, data);
			}

			fos.close();
			fis.close();

		} catch (Exception e) {
			// TODO: handle exception
		}

		return true;

	}
	
	
	public static void main(String[]args){
		
		Test8 ob = new Test8();
		if(ob.fileCopy("D:\\doc\\text.txt", "D:\\doc\\out3.text")){
			System.out.println("���� ���� ����! ");
		}else{
			System.out.println("���� ���� ����! ");
		}
	}

}
