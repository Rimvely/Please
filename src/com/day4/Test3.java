package com.day4;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		//����޷�
		
		Scanner sc = new Scanner(System.in);
		
		//���� ��¥�� �迭�� ����
		int months[] = {31,28,31,30,31,30,31,31,30,31,30,31}; 
		//12���� ��������� ���ÿ� �ʱ�ȭ�� ��   { };
		
		int year,month,day,i,week;
		
		do{
			System.out.print("�⵵?");//2000
			year = sc. nextInt();
		}
		while(year<1);
		
		do{
			System.out.print("��?");
			month = sc.nextInt();
		}
		while(month<1||month>12);
		
		//���⿡���� 2���� ���� ���
		if(year%4==0&&year%100!=0||year%400==0){
			months[1] = 29;
		}
		
		//1��1��1�Ϻ��� ���⵵ (year-1) 12��31�ϱ����� ����  (2���� - �� and + �� or)
		day = (year-1)*365 + (year-1)/4-(year-1)/100+(year-1)/400;
		
//		int yy = (year-1)/4-(year-1)/100+(year-1)/400;
//		System.out.println(yy);
//		System.out.println(day);

//		����(m-1)������ ����
//		 �ε����� ��ȣ    0  1  2  3  4  5  6  7  8  9  10 11
//		                 {31,28,31,30,31,30,31,31,30,31,30,31};
//		     ���� ��ȣ    1  2  3  4  5  6  7  8  9  10 11 12
		
		for(i=0;i<month-1;i++){
		
			day += months[i];
		}
	
		//year�� month�� 1�ϱ����� ����
		    day = day +1;
		    
		//���Ǽ� ���
		    week = day%7;//0~6
		    
	    //System.out.println(week);
		    
		System.out.println("\n  ��  ��  ȭ  ��  ��  ��  ��");
		System.out.println("------------------------------");
		
		//Ư�� ���Ϻ��� �����ϵ��� ������ ���� (1ĭ�� 4byte from ���� to ����)
		for(i=0;i<week;i++){
			System.out.print("    ");//����4ĭ �����̽� 1ĭ�� 1byte
		}
		//�ش� ���� ��¥�� ���
		for(i=1;i<=months[month-1];i++){
			
			System.out.printf("%4d",i);
			
			//������ ��¥�� 
			week++;
			
			if(week%7==0)
				System.out.println();
			

		}
		
		if(week%7 !=0)
			System.out.println();
		
		System.out.println("------------------------------");
		
		
		
		
		
		
		
		
	}

}
