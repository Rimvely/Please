package com.class4;

public class Test6 {

	public static void main(String[] args) {

		String s1 = "서울,부산,대구";
		String[] ss = s1.split(",");
		
		for(String s : ss){      //확장for문
			System.out.println(s);
		}
		
		String s2 = "seoul";
		String s3 = "SEOUL";
		
		System.out.println(s2.equals(s3));//false
		System.out.println(s2.equalsIgnoreCase(s3));//true
		
		String s4 = "abc.def.hij";  //스트링에서 문자는 01234567890 인덱스번호가생성
//		             01234567890
		System.out.println(s4.indexOf(".")); // 뭘 찾으라구? .을찾으라구. 그래서 3이뜸
		System.out.println(s4.lastIndexOf("."));//마지막에서 .찾아라 그래서 7
		System.out.println(s4.indexOf("def"));//4
		System.out.println(s4.indexOf("x"));//index of로 x를 찾으라하는데 없어. 그럼 -1이뜸
											//이유는 01234567890 은 다 쓰는숫자. -1은 안쓰니까 이럴때뜸.
		
		String s5 = "우리나라 대한민국 좋은나라 대한민국";
		String s6 = s5.replaceAll("대한","大韓");
		System.out.println(s6);
		
		String s7 = "  a  b  c  ";
		System.out.println(s7);
		System.out.println(s7.trim());  //양쪽공백을 없애줌
		System.out.println(s7.replaceAll("\\s", ""));//모든 공백을 없애라   (" " = \\s) 한칸공백
		
		char ch = "abcdefg".charAt(2);//c  chatAt(number); number 자릿수 0부터시작해서 9까지 반복
		System.out.println(ch);//c
		
		System.out.println("abcdefg".startsWith("abc")); //시작이 이것으로하느냐 안하느냐 ( 안에께)
		System.out.println("abcdefg".length());  //배열의 갯수 7
		
		String s8 = "abcedfg";//101
		String s9 = "abcddfg";//100
		
		//사전식 배열
		System.out.println(s8.compareTo(s9)); //1
		System.out.println(s9.compareTo(s8)); //-1
		
		
		
		
		
		
		
		
		
		
		
	}

}
