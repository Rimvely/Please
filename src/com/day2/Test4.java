package com.day2;

import java.io.*;

class Test4 {
	
	public static void main(String[] args) throws IOException {

		//제어문
		//if, for, while, do~while,switch

		//for 횟수가 정해져있을때
		//while 몇번을 돌려야할지 모를때

		BufferedReader br = new BufferedReader (
			new InputStreamReader (System.in));


		int num = 0; //초기화값
		String str=null; //"" or null//초기화값
		
		System.out.print("수입력?");
		num = Integer.parseInt(br.readLine());
		
		//단일if문
		//if(num%2==0){
		//	str ="짝수";
		
		//}
		//if(num%2!=0){
		//	str ="홀수";

		if(num%2==0){
			str ="짝수";
		
		}else  // 여기에도 원래 {} 해야하는데 1줄이라 생략가능
		
			str ="홀수";
		


		System.out.println(str);





	}
}
