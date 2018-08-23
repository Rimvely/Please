package com.day2;

import java.io.*;

class Test3 {
	
	public static void main(String[] args) throws IOException {

		//char(문자) - 작은 따옴표를 사용
		//"a" 우리가 알고있는 에이  String ch = "a"

		//char ch = 'a'; 한문자만 저장가능 (ASCIII)만 저장 ////////  'aa' 문자2개 안됨
				
		
		char ch,result;

		System.out.print("한문자");  //a(97),  //A(65)            aaa 3개써도 a 1개만 인식
		
		     //(char) 강제형변환 숫자를 기호로
		ch = (char)System.in.read(); //이렇게만하면 에러뜸.   그 이유는 a를 인식한게아니라 97을 인식했기때문
		                             //그래서 int - > char 바꿔줌
		
			result = ch>=65 && ch<92?(char)(ch+32): //삼항연산   A   to    Z 대문자 A to Z
		            (ch>='a' && ch<='z'?(char)(ch-32):ch);//연산을 하는 순간 다시 int 로 바뀜 >>> 
													//그래서 다시 기호로 바꿔야함 >> 
													//데이터 타입을 맞축 ㅣ위해
		 	                                        //'a' = 97 로 적어도됨
													

		    System.out.println(ch + ":" + result);

			System.out.println(ch);
			System.out.println(Integer.toString(ch)); //97





		
		}
}
