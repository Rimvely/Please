package com.day1;

import java.io.*; //������ import java.io.BufferedReader; 
                  //       import java.io.InputStreamReader �� �����ؾ��ϴµ� *�� ���δ� �ø��� �ʰ� ã�Ƽ�����

class Test5 {

	public static void main(String[] args) throws IOException {

		//�̸�,����,���������� ������� ���� ���
          





		//����
		String name; //���ڴ� String ���θ����  Char�� �ٸ��� ���µ� �˾ƺ���
		int kor,eng,tot;

		BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));
        

		//�Է�
		System.out.print("�̸�?");//suzi
		name = br.readLine();          //readline ����� ������ IOException 
		
		System.out.print("����?");//60
		kor = Integer.parseInt(br.readLine());

		System.out.print("����?");//70
		eng = Integer.parseInt(br.readLine());
        

		//����
		tot = kor + eng;
        

		//���
		System.out.printf("�̸�:%s ����:%d\n",name,tot);   //string ����Ҷ� %s //������� %d //�Ǽ���� %f

		//*br.readLine �� ������ ������ throws IOException �� ����Ѵ�.
		









	}
}
