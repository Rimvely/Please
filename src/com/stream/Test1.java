package com.stream;

import java.io.IOException;

//입출력 스트림
//데이터 입출력시 모든 데이터를 형태와 상관없이
//일련된 흐름으로 전송하는 것

//1.바이트스트림



public class Test1 {

	public static void main(String[] args) throws IOException {
		
		int data;
		System.out.print("문자열 입력 : "); //abcd
		
		while((data=System.in.read())!=-1){  //System.in은 한글자씩 읽는다. = ASCIII값으로 받아서 정수로 받아지는거다
			
			char ch = (char)data;
			System.out.print(ch);
			
		}
			                            

	}

}

//데이타를 1byte씩 읽어서 그걸 char로 바꿔서 프린트화한다.
