package com.class1;

import java.util.Scanner;

class Hap {

	int su, sum;// instance ����

	public void input() {

		Scanner sc = new Scanner(System.in);

		System.out.print("�����Է�?"); // 100
		su = sc.nextInt();

	}

	public int cnt() {

		for (int i = 1; i <= su; i++) {
			sum += i;// sum=sum+i
		}

		return sum;
	}

	public void print(int sum) {

		System.out.println("�հ� : " + sum);

	}

}

public class Test3 {

	public static void main(String[] args) {

		Hap ob = new Hap();
		
		ob.input();
		int sum = ob.cnt();
		ob.print(sum);
		
		
		
		
		
		
	}

}
