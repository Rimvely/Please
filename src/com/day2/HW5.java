package com.day2;

import java.util.*;

class HW5 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String name;
		int n1,n2,n3;
		float sum;
		float avg;
		
		System.out.print("�̸��� �Է��ϼ���:");

		name = sc.next();

		System.out.print("3������ ������ �Է��ϼ���.:");

		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();

		sum = (float)n1+n2+n3;
		avg = (float)sum/3;

		if (n1>=40 && n2>=40 && n3>=40 && avg>=60) {
			System.out.println("\n�̸�:"+name);
			System.out.printf("3���� ������:"+n1+" "+n2+" "+n3);
			System.out.printf("����:%f ���:%f ����:�հ�\n",sum,avg);
		}
		if ((n1<40 || n2<40 || n3<40) && avg>=60) {
			System.out.println("\n�̸�:"+name);
			System.out.printf("3���� ������:"+n1+" "+n2+" "+n3);
			System.out.printf("����:%f ���:%f ����:����\n",sum,avg);
		}
		if (avg<60) {
			System.out.println("\n�̸�:"+name);
			System.out.printf("3���� ������:"+n1+" "+n2+" "+n3);
			System.out.printf("����:%f ���:%f ����:���հ�\n",sum,avg);

		}


		





	}
}
