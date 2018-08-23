package com.day2;

import java.util.*;

class HW2 {
	public static void main(String[] args) {

		
		
		Scanner sc = new Scanner(System.in);

		int n1,n2;
		int temp;

		System.out.print("두개의 정수를 입력하세요\n");

		n1 = sc.nextInt();
		n2 = sc.nextInt();
	

		if (n1>n2){
			temp=n2;
			n2=n1;
			n1=temp;
		}else
			n1=n1;
			n2=n2;
		

		System.out.printf("큰 숫자:%d 작은 숫자:%d\n",n2,n1);
		
		






	}
}
