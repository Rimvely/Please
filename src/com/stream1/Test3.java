package com.stream1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

//FileWriter
//FileWriterŬ������ ����� �����ڵ� ���ڿ��� �ý��ۿ� �´� 
//����Ʈ ���� ���ڵ��� ����Ʈ�� ��ȯ�Ͽ� ���Ͽ� �����Ѵ�

//BufferedWriter
//���� ��Ʈ������ �ٸ� ��� ��Ʈ���� �����������ڷ� �޾�
//�����ϸ� ���ڸ� ���۸��ϴ°Ϳ� ���� ����,�迭 �Ǵ� ��Ʈ����
//�������·� ����Ѵ�
//����,����Ʈ��Ʈ���� ���ۿ� ����Ѵ�

public class Test3 {

	public static void main(String[] args) {

		try {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			FileWriter fw = new FileWriter("d:\\doc\\out7.txt");
			BufferedWriter bw = new BufferedWriter(fw);//�ٸ�������� ��Ʈ���� �������� ���ڷ� ����. �׷��� (fw)
			
			System.out.println("���ڿ��Է�?");
			
			String str;
			while((str = br.readLine())!=null){
				
				bw.write(str);
				bw.newLine(); //���� �Է��ϰ� ���� (enter = str + "\r\n")
			}
			
			bw.close();
			fw.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
		
		
		
		
		
	}

}