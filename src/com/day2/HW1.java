package com.day2;

import java.io.*;

class HW1 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader (
			new InputStreamReader (System.in));

		int num = 0; 
		String str=null; 
		
		System.out.println("���ڸ� �Է��ϼ���");
		num = Integer.parseInt(br.readLine());

		if(num%2==0){
			str ="¦��";
		
		}else
		
			str ="Ȧ��";
		


		System.out.println(str);






	}
}
