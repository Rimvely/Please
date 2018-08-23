package com.day1;

import java.io.*;

class Test6 {

	public static void main(String[] args) throws IOException {

       
		double w,h,a;

		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

		System.out.printf("밑변?");
		w = Double.parseDouble(br.readLine());

		System.out.printf("높이?");
		h = Double.parseDouble(br.readLine());

		a = w*h/2;

		System.out.printf("삼각형넓이:%.2f\n",a);

        //밑변(w)과 높이 (h)를 입력받아 삼각형의 넓이 (a) 구하기
	   //밑변? 10
	   //높이? 20
	   //넓이? xx
	   //삼각형 넓이 = w * h/2

       //System.in 도 import를 해야하는데 Java는 Java.lang 이라는것들을 이미 다 메모리에 넣어와서
	   //import를 안해도 된다.
 
		//System.out.print("밑변?";
		//w = Integer.parseInt(br.readLine());
		//System.out.print("높이?");
		//h = Integer.parseInt(br.readLine());

		//a = (double)w*h/2; 강제형변환

		//System.out.println("넓이:"+a);



        





		
	}
}
