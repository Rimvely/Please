package com.day2;

import java.util.*;

class HW4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double price,ea,pay,totpay,discountedpay;

		System.out.println("������ ������ ������ �Է��ϼ���.");
		
		price = 15800;
		double discount = 0;
		
		ea = sc.nextDouble();
		
		if (ea>=10){
			discount = (double)0.1;
		}
		if (ea>=20){
			discount = (double)0.15;
		}
		if (ea>=30){
			discount = (double)0.2;
		}

		totpay = price*ea;
		discountedpay = (double)(price*ea)*discount;
		pay = totpay-discountedpay;

		System.out.print("���η�:" + discount + "%\n");
		System.out.print("�ѱݾ�:" + totpay + "��\n");
		System.out.println("���ұݾ�:" + pay + "��");


	}
}
