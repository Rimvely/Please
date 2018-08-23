package com.day4;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {

		//년,월,일을 입력받아 요일을 반환
		//2018년 5월21일 월요일 
		
		
		
		Scanner sc = new Scanner(System.in);
		
		
		int months[] = {31,28,31,30,31,30,31,31,30,31,30,31}; 

		
		int year,month,day,i,week;
		
		do{
			System.out.print("년도?");
			year = sc. nextInt();
		}
		while(year<1);
		
		do{
			System.out.print("월?");
			month = sc.nextInt();
		}
		while(month<1||month>12);
		
		
		if(year%4==0&&year%100!=0||year%400==0){
			months[1] = 29;
		}
		
		
		day = (year-1)*365 + (year-1)/4-(year-1)/100+(year-1)/400;
		
		
		for(i=0;i<month-1;i++){
		
			day += months[i];
		}
	
		//year년 month월 1일까지의 날수
		    day = day +1;
		    
		//주의수 계산
		    week = day%7;//0~6
		    
		String[] date = {"일", "월","화","수","목","금","토"}; 
		
	    System.out.printf("%d년 %d월 %d일 %s요일", year,month,day,date[week]);
		
		
		
		
		
		
		
	}

}
