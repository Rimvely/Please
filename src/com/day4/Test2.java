package com.day4;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		//배열 --> 무조건 for문
		
//		int num[] = new int[5];
		int[] num = new int[5];
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("다섯개의 정수"); //5 6 7 9 4
		
		
		for(int i=0;i<num.length;i++){    //num.length num의 갯수
		num[i] = sc.nextInt();
		}
		
		for(int i=0;i<num.length;i++){
		System.out.println("num[" + i + "]: " + num[i]);

		}
		
		/*		System.out.println("num[1]: " + num[1]);
		System.out.println("num[2]: " + num[2]);
		System.out.println("num[3]: " + num[3]);
		System.out.println("num[4]: " + num[4]);
		}
		num[3] = 400;
		System.out.println("num[3]: " + num[3]);
		
		int a = num[0];
				System.out.println(a);
				System.out.println(num.length); //배열의 length에는 ()가없다
*/		
		
		
		
		
		

	}

}
