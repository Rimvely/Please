package com.class5;

import java.util.Calendar;
import java.util.Scanner;

public class CalculateDates2 {

	public static void main(String[] args) {
		
		//���÷� ���� x�� �� �� �� �� ����
		//2018�� 5�� 30�� ������
		//1000
		//1000�� �� : 201x�� x�� xx�� x����
		
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1;
		int day = now.get(Calendar.DATE);
		int week = now.get(Calendar.DAY_OF_WEEK);
		
		String[] weekDay = {"��","��","ȭ","��","��","��","��"};
		
		System.out.println(year+"�� "+month+"�� "+day+"�� "+weekDay[week-1]+"����");
		
		Scanner sc = new Scanner(System.in);
		
		int days = sc.nextInt();
		
		now.add(Calendar.DATE, days);
		
		year = now.get(Calendar.YEAR);
		month = now.get(Calendar.MONTH)+1;
		day = now.get(Calendar.DATE);
		week = now.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(days+"���� "+year+"�� "+month+"�� "+day+"�� "+weekDay[week-1]+"����");
	}

}