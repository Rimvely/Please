package com.class1;

import java.util.Scanner;

class Hap {

	int su, sum;// instance 변수

	public void input() {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수입력?"); // 100
		su = sc.nextInt();

	}

	public int cnt() {

		for (int i = 1; i <= su; i++) {
			sum += i;// sum=sum+i
		}

		return sum;
	}

	public void print(int sum) {

		System.out.println("합계 : " + sum);

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
