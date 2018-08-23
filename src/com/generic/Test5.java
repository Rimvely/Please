package com.generic;

import java.util.Scanner;

//5-10자 이내의 문자열을 입력받아 출력
//문자열 abcde
//abcde

//조건
//1. 5-10자 인지확인
//2.영문자(대소문자 구분없이)만 입력

public class Test5 {

	public void inputForm(String str) throws Exception {

		// 조건 1,2
		// String.length
		// 영문자 확인 ASCII 값확인

		if (str.length() < 5 || str.length() > 10) {
			throw new Exception("5~10자 이내의 문자열을 다시 입력하세요! :" + str);
		}
		
		for(int i = 0; i < str.length(); i++){
			
			char c = str.charAt(i);
			
			if((c<65||c>90)&&(c<97||c>122)){
				throw new Exception("영문자만 가능합니다!");
			}
			
		}
		
			
		
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str;

		Test5 ob = new Test5();

		try {

			System.out.print("문자열?");
			str = sc.next();

			ob.inputForm(str); // 검사

			System.out.println(str);

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
