package com.stream;

import java.io.IOException;

//����� ��Ʈ��
//������ ����½� ��� �����͸� ���¿� �������
//�Ϸõ� �帧���� �����ϴ� ��

//1.����Ʈ��Ʈ��



public class Test1 {

	public static void main(String[] args) throws IOException {
		
		int data;
		System.out.print("���ڿ� �Է� : "); //abcd
		
		while((data=System.in.read())!=-1){  //System.in�� �ѱ��ھ� �д´�. = ASCIII������ �޾Ƽ� ������ �޾����°Ŵ�
			
			char ch = (char)data;
			System.out.print(ch);
			
		}
			                            

	}

}

//����Ÿ�� 1byte�� �о �װ� char�� �ٲ㼭 ����Ʈȭ�Ѵ�.
