package com.day2;

import java.util.*;

class HW5 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String name;
		int n1,n2,n3;
		float sum;
		float avg;
		
		System.out.print("이름을 입력하세요:");

		name = sc.next();

		System.out.print("3과목의 점수를 입력하세요.:");

		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();

		sum = (float)n1+n2+n3;
		avg = (float)sum/3;

		if (n1>=40 && n2>=40 && n3>=40 && avg>=60) {
			System.out.println("\n이름:"+name);
			System.out.printf("3과목 점수들:"+n1+" "+n2+" "+n3);
			System.out.printf("총점:%f 평균:%f 판정:합격\n",sum,avg);
		}
		if ((n1<40 || n2<40 || n3<40) && avg>=60) {
			System.out.println("\n이름:"+name);
			System.out.printf("3과목 점수들:"+n1+" "+n2+" "+n3);
			System.out.printf("총점:%f 평균:%f 판정:과락\n",sum,avg);
		}
		if (avg<60) {
			System.out.println("\n이름:"+name);
			System.out.printf("3과목 점수들:"+n1+" "+n2+" "+n3);
			System.out.printf("총점:%f 평균:%f 판정:불합격\n",sum,avg);

		}


		





	}
}
