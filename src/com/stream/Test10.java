package com.stream;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class Test10 {

	public static void main(String[] args) {

		try {

			FileOutputStream fos;
			PrintStream ps;

			fos = new FileOutputStream("D:\\doc\\out5.txt");
			ps = new PrintStream(fos);

			ps.println("�����"); //print(ln)������� ��ĭ�� �������� ������
			ps.println("������");
			ps.println("Ƽ�Ĵ�");
			ps.println("õ����");

			ps.close();
			fos.close();
			
			//true : append(�߰�, ����)
			fos = new FileOutputStream("D:\\doc\\out5.txt",true);  //new������ ������ ��ü�� �ٽø����
			ps = new PrintStream(fos);						  //�ڿ� true�� ���� �����̵ȴ�. �Ⱦ��� ������ ��������.

			ps.println("�����"); 
			ps.println("������");
			ps.println("���Ĵ�");
			ps.println("������");
			
			ps.close();
			fos.close();
			

		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
