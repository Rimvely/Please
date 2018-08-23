package com.day4;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		//만년달력
		
		Scanner sc = new Scanner(System.in);
		
		//월별 날짜수 배열에 저장
		int months[] = {31,28,31,30,31,30,31,31,30,31,30,31}; 
		//12개가 만들어짐과 동시에 초기화가 됨   { };
		
		int year,month,day,i,week;
		
		do{
			System.out.print("년도?");//2000
			year = sc. nextInt();
		}
		while(year<1);
		
		do{
			System.out.print("월?");
			month = sc.nextInt();
		}
		while(month<1||month>12);
		
		//윤년에따른 2월의 날수 계산
		if(year%4==0&&year%100!=0||year%400==0){
			months[1] = 29;
		}
		
		//1년1월1일부터 전년도 (year-1) 12월31일까지의 날수  (2진수 - 가 and + 가 or)
		day = (year-1)*365 + (year-1)/4-(year-1)/100+(year-1)/400;
		
//		int yy = (year-1)/4-(year-1)/100+(year-1)/400;
//		System.out.println(yy);
//		System.out.println(day);

//		전월(m-1)까지의 날수
//		 인덱스의 번호    0  1  2  3  4  5  6  7  8  9  10 11
//		                 {31,28,31,30,31,30,31,31,30,31,30,31};
//		     월의 번호    1  2  3  4  5  6  7  8  9  10 11 12
		
		for(i=0;i<month-1;i++){
		
			day += months[i];
		}
	
		//year년 month월 1일까지의 날수
		    day = day +1;
		    
		//주의수 계산
		    week = day%7;//0~6
		    
	    //System.out.println(week);
		    
		System.out.println("\n  일  월  화  수  목  금  토");
		System.out.println("------------------------------");
		
		//특정 요일부터 시작하도록 공백을 지정 (1칸에 4byte from 공백 to 요일)
		for(i=0;i<week;i++){
			System.out.print("    ");//공백4칸 스페이스 1칸에 1byte
		}
		//해당 월의 날짜를 출력
		for(i=1;i<=months[month-1];i++){
			
			System.out.printf("%4d",i);
			
			//한주의 날짜가 
			week++;
			
			if(week%7==0)
				System.out.println();
			

		}
		
		if(week%7 !=0)
			System.out.println();
		
		System.out.println("------------------------------");
		
		
		
		
		
		
		
		
	}

}
