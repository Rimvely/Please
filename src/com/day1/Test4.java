package com.day1;

import java.io.*;  //import java.io.*; �� ����Ѵ� �ؿ� �ִ� r�� ���� ������Ϸ���
                   // �̰� �� �־�����

class Test4 {

	public static void main(String[] args) throws IOException { //throws IOException �� �־�����


		//System.in : Ű���带 ���� 1byte���ڸ� �Է¹���
		//InputStreamReader: System.in���� �Է¹��� 
		//1byte���ڸ� 2����Ʈ�� ���ڷ� ����
		//BufferedReader : ����(�޸�)�� ����
		//BufferedReader �̶��� br �� �������µ� �̰� (��ü���� �̶���Ѵ�)


		BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));       //system.in ����Ϳ��ִ°� �����Ͷ�
		                                             //Ű����� �Է��ϴ� a,A,#,3 ���� ���ڸ� 1byte �� �о��
													 //�ѱ� �Ϻ��� ��� 2byte
													 //system in --> InputStreamReader �� �ѱ�鼭 ���ڷ� �������ϴ�.
													 //system in > inputstreamreader > br = 10 1,0 �̶�� ���ڷ� �����ϴ�.
													 //�׷��� ���ڸ� br.readLine �� �����ִµ� �װ� ���ڷ� �ٲٷ���
													 //r = Integer.parseInt(br.readLine());
													 //r = Double.parseDouble(br.readLine());
		//��ɾ� �˾ƺ��� 
		//BufferedReader br = new BufferedReader(
	         //new InputStreamReader(System.in));

		int r;  //���� �Է��ϱ� ���� r �� �������
		double a,c; //a = area, c = circumference
	
		
		System.out.print("������?");//10 �־��ٰ� ����

		r = Integer.parseInt(br.readLine());
		// Readline�� String ���·� �޴´�. ���ڸ� ���ڷ� ����� ���ؼ�  r = Integer.parseInt(br.readLine())
		//r = br.readLine(); ==> r = Integer.parseInt(br.readLine())

		//readline�� ������ throws IOException �� ������ �Ⱦ����� throws Exception�̶���ص��ȴ�.
		//IOException ���� IOException < Exception �� �� ������


		a=r*r*3.14;
		c=r*2*3.14;

		System.out.println("������:" +r);
		System.out.println("����:" +a);
		System.out.println("�ѷ�:" +c);

     // �ڹ�8 ��ɾ� https://docs.oracle.com/javase/8/docs/api/












	}
}
