package com.day2;

import java.util.*;

class Test7 {

	public static void main(String[] args) {

		//������ ���� �Է¹޾� ���������� ū������ ����غ� ��
		//������ ��  8 9 6


		Scanner sc = new Scanner(System.in);
		int n1,n2,n3,temp;

		System.out.print("������ ���� �Է��ϼ���\n");

			n1 = sc.nextInt();
			n2 = sc.nextInt();
			n3 = sc.nextInt();

		if (n1>n2){
			temp = n1;
			n1 = n2;
			n2 = temp;
		}
		if (n2>n3){
			temp = n2;
			n2 = n3;
			n3 = temp;
		}
		if (n1>n2){
			temp = n1;
			n1 = n2;
			n2 = temp;
		}

		//System.out.println(n1+" "+n2+" "+n3); 2���� ���
	
		System.out.printf("%d %d %d\n",n1,n2,n3);
		
		












	}
}
