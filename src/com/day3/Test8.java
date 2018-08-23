package com.day3;

import java.util.*;
import java.io.*;

class  Test8{

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));

		int number, sum;
		char choice;

		//내가 원할때까지 실행되고 stop 하라고 할때까지 하기 위한 방법

		while(true){//무한루프 하는 방법



			do{
				System.out.print("수입력? ");      //100e    //e200
				number = Integer.parseInt(br.readLine());  //readLine은 100까지읽고 enter을 못읽는다
			}
			while (number<1||number>5000);


			sum = 0; //초기화 시키기위해 여기에다가 sum=0

			for(int i=1;i<=number;i++){
				sum+=i;
			}

			System.out.println("1~" + number + " 까지의 합:" + sum);    

			System.out.print("계속진행?[Y/N]"); //ye(10.13)               
			choice = (char)System.in.read();       //한글자만 읽어낸다

			if(choice!='Y'&&choice!='y'){  //양쪽이 다 부정이면 가운데 ||(or) 아니라 && 가 (or)이 된다
				System.out.println("종료합니다.");
				break; //break를 쓸수있는곳 : while,do~while,for,switch
			}
			
			System.in.skip(2); //e(10.13)을 삭제







		
		
		
		
		
		
		}//end of while coding







	}//end of method (main)
}
