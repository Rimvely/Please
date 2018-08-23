package com.day1;

import java.io.*; //원래는 import java.io.BufferedReader; 
                  //       import java.io.InputStreamReader 다 지정해야하는데 *는 전부다 올릴게 너가 찾아서해줘

class Test5 {

	public static void main(String[] args) throws IOException {

		//이름,국어,영어점수를 물어봐서 총점 계산
          





		//선언
		String name; //문자는 String 으로만든다  Char은 다를때 쓰는데 알아보기
		int kor,eng,tot;

		BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));
        

		//입력
		System.out.print("이름?");//suzi
		name = br.readLine();          //readline 쓸대는 문조건 IOException 
		
		System.out.print("국어?");//60
		kor = Integer.parseInt(br.readLine());

		System.out.print("영어?");//70
		eng = Integer.parseInt(br.readLine());
        

		//연산
		tot = kor + eng;
        

		//출력
		System.out.printf("이름:%s 총점:%d\n",name,tot);   //string 출력할땐 %s //정수출력 %d //실수출력 %f

		//*br.readLine 을 쓰려면 무조건 throws IOException 을 써야한다.
		









	}
}
