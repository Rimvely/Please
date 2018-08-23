package com.day6;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		// 주민번호 검색
		// str : 01234567890123(고유인덱스)
		// jumin : 941231-2053128
		// check : 234567 892345(주민번호에 따라다니느 고유키값)

		// 합=(9*2)+(4*3)+...+(2*5)
		// 합=11-%11
		// 합=합%10
		// 합==8

		Scanner sc = new Scanner(System.in);

		String str;
		int[] check = { 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5 };
		int i, total, number;

		System.out.print("주민번호를 입력하세요."); // 6자리 -1자리 7자리 = 14자리
		str = sc.next();

		if (str.length() != 14) {

			System.out.println("입력오류!");
			return;// main메소드를 빠져나감(stop)
		}

		total = 0;

		for (i = 0; i < 12; i++) {

			if (i >= 6) {

				total += check[i]
						* Integer.parseInt(str.substring(i + 1, i + 2));

			} else {
				total += check[i] * Integer.parseInt(str.substring(i, i + 1));
			}

		}
		
		number = 11 - total % 11;
		number = number % 10;
		
		if (number==Integer.parseInt(str.substring(13))){
			System.out.println("정확한 주민번호!!");
		}else{
			System.out.println("틀린주민번호!!");
		}
	}
}

/*
 * String str = "Seoul Korea"; //01234567890 어떤문자를 작성하는 인덱스가 만들어짐
 * 
 * System.out.println(str.substring(0, 3)); //Seo
 * System.out.println(str.substring(6, 8)); //Ko
 * System.out.println(str.substring(6)); //Korea 6에서부터끝까지
 */