package com.stream;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

//File Ŭ����
//���� �������� �����Ҽ� �ֵ��ϱ���� �������ִ� Ŭ����
//������ ���� �Ǵ� �̸����� ���� ������ �Ұ�쿡 ���ɻ�
//������ ������ ������ϱ����� �޼ҵ�� �������� �ʴ´�

public class Test11 {

	public static void main(String[] args) throws IOException {
		
		File f = new File("D:\\doc\\text.txt");  //�����̾ƴ϶� ������ ����
		
		System.out.println("���� ���� .........");
		System.out.println("���ϸ� : " + f.getName());
		System.out.println("���ϱ��� : " + f.length());
		System.out.println("���ϰ�� : " + f.getAbsolutePath());
		System.out.println("ǥ�ذ�� : " + f.getCanonicalPath());
		System.out.println("���糯¥ : " + new Date(f.lastModified()));
		System.out.println("���ϻ����������: " + f.getParent());
		System.out.println("�б�Ӽ� : " + f.canRead());
		System.out.println("����Ӽ� : " + f.canWrite());
		
		//���� ���
		String path = System.getProperty("user.dir");
		System.out.println("������ : " + path);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
