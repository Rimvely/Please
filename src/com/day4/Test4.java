package com.day4;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {

		//��,��,���� �Է¹޾� ������ ��ȯ
		//2018�� 5��21�� ������ 
		
		
		
		Scanner sc = new Scanner(System.in);
		
		
		int months[] = {31,28,31,30,31,30,31,31,30,31,30,31}; 

		
		int year,month,day,i,week;
		
		do{
			System.out.print("�⵵?");
			year = sc. nextInt();
		}
		while(year<1);
		
		do{
			System.out.print("��?");
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
	
		//year�� month�� 1�ϱ����� ����
		    day = day +1;
		    
		//���Ǽ� ���
		    week = day%7;//0~6
		    
		String[] date = {"��", "��","ȭ","��","��","��","��"}; 
		
	    System.out.printf("%d�� %d�� %d�� %s����", year,month,day,date[week]);
		
		
		
		
		
		
		
	}

}
