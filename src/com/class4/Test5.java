package com.class4;

public class Test5 {

	public static void main(String[] args) {

			StringBuffer sb = new StringBuffer();
			
			sb.append("서울");
			sb.append("부산");
			sb.append("대구");  //데이터타입 = 현재 StringBuffer
			
			System.out.println(sb);
			
			//StringBuilder - 작업한뒤에 - String으로 변환
			
			String str = sb.toString();  //데이터타입을 String으로 변환
			System.out.println(str);
			
			//Integer Wrapper class
			int a = 24;
			System.out.println(a);
			System.out.println(Integer.toString(a));//문자로
			System.out.println(Integer.toString(a,2));//2진수로 출력
			System.out.println(Integer.toString(a,16));//16진수
	}

}
