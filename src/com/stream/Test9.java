package com.stream;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Test9 {

	public static void main(String[] args) {

		try {

			FileOutputStream fos = new FileOutputStream("D:\\doc\\out4.txt"); // ���Ϸ�������ִ½�Ʈ��

			PrintStream ps = new PrintStream(fos);  //����Ѱ� ����� ��. �ٵ� ����Ʈ�� fos�� ����. �׷��� fos�� fineoutputstream�̶� ���Ϸ� ����

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String str;
			
			System.out.println("���ڿ��� �Է��ϼ���!");
			 
			while((str = br.readLine())!=null){   //���ڰ����������� ����ְ� ����ϱ�
				
				ps.println(str);
				
			}
			
			ps.close();
			fos.close();
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
