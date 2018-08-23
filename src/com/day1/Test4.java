package com.day1;

import java.io.*;  //import java.io.*; 를 써야한다 밑에 있는 r는 뭔지 물어보게하려면
                   // 이걸 왜 넣었는지

class Test4 {

	public static void main(String[] args) throws IOException { //throws IOException 왜 넣었을까


		//System.in : 키보드를 통해 1byte문자를 입력받음
		//InputStreamReader: System.in으로 입력받은 
		//1byte문자를 2바이트의 문자로 변경
		//BufferedReader : 버퍼(메모리)에 저장
		//BufferedReader 이란걸 br 로 만들어놨는데 이걸 (객체생성 이라고한다)


		BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));       //system.in 모니터에있는걸 가져와라
		                                             //키보드로 입력하는 a,A,#,3 같은 문자를 1byte 씩 읽어낸다
													 //한글 일본어 등등 2byte
													 //system in --> InputStreamReader 로 넘기면서 문자로 만들어냅니다.
													 //system in > inputstreamreader > br = 10 1,0 이라는 문자로 보냅니다.
													 //그래서 문자를 br.readLine 로 보여주는데 그걸 숫자로 바꾸려면
													 //r = Integer.parseInt(br.readLine());
													 //r = Double.parseDouble(br.readLine());
		//명령어 알아보기 
		//BufferedReader br = new BufferedReader(
	         //new InputStreamReader(System.in));

		int r;  //랜덤 입력하기 위한 r 을 만들어줌
		double a,c; //a = area, c = circumference
	
		
		System.out.print("반지름?");//10 넣었다고 가정

		r = Integer.parseInt(br.readLine());
		// Readline은 String 형태로 받는다. 문자를 숫자로 만들기 위해서  r = Integer.parseInt(br.readLine())
		//r = br.readLine(); ==> r = Integer.parseInt(br.readLine())

		//readline을 쓰려면 throws IOException 을 쓰느냐 안쓰느냐 throws Exception이라고해도된다.
		//IOException 보다 IOException < Exception 이 더 포괄적


		a=r*r*3.14;
		c=r*2*3.14;

		System.out.println("반지름:" +r);
		System.out.println("넓이:" +a);
		System.out.println("둘레:" +c);

     // 자바8 명령어 https://docs.oracle.com/javase/8/docs/api/












	}
}
