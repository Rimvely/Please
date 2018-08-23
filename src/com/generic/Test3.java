package com.generic;

import java.util.InputMismatchException;
import java.util.Scanner;

//예외처리
//Exception

public class Test3 {

	public static void main(String[] args) {

		int num1, num2, result;
		String oper;

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("두개의 수?"); // 10 20
			num1 = sc.nextInt();
			num2 = sc.nextInt();

			System.out.print("연산자?"); // +
			oper = sc.next();

			result = 0;

			if (oper.equals("+")) {
				result = num1 + num2;
			} else if (oper.equals("-")) {
				result = num1 - num2;
			} else if (oper.equals("*")) {
				result = num1 * num2;
			} else if (oper.equals("/")) {
				result = num1 / num2;
			}

			System.out.printf("%d %s %d = %d\n", num1, oper, num2, result);
		} catch (NumberFormatException e) {
			System.out.println("정수를 입력해라!!");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌수 없다");
		}

		catch (Exception e) {
			// System.out.println(e);
			// e.printStackTrace();

			System.out.println("넌 그게 숫자로 보이냐?");
		}finally{
			System.out.println("난 항상 보인다!!");
		}

	}

}
