package com.day1;

import java.io.*;

class Test6 {

	public static void main(String[] args) throws IOException {

       
		double w,h,a;

		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

		System.out.printf("�غ�?");
		w = Double.parseDouble(br.readLine());

		System.out.printf("����?");
		h = Double.parseDouble(br.readLine());

		a = w*h/2;

		System.out.printf("�ﰢ������:%.2f\n",a);

        //�غ�(w)�� ���� (h)�� �Է¹޾� �ﰢ���� ���� (a) ���ϱ�
	   //�غ�? 10
	   //����? 20
	   //����? xx
	   //�ﰢ�� ���� = w * h/2

       //System.in �� import�� �ؾ��ϴµ� Java�� Java.lang �̶�°͵��� �̹� �� �޸𸮿� �־�ͼ�
	   //import�� ���ص� �ȴ�.
 
		//System.out.print("�غ�?";
		//w = Integer.parseInt(br.readLine());
		//System.out.print("����?");
		//h = Integer.parseInt(br.readLine());

		//a = (double)w*h/2; ��������ȯ

		//System.out.println("����:"+a);



        





		
	}
}
