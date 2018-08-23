package com.day2;

import java.io.*;

class HW1 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader (
			new InputStreamReader (System.in));

		int num = 0; 
		String str=null; 
		
		System.out.println("숫자를 입력하세요");
		num = Integer.parseInt(br.readLine());

		if(num%2==0){
			str ="짝수";
		
		}else
		
			str ="홀수";
		


		System.out.println(str);






	}
}
