package com.exec;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OperationMain {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str;
		double num1, num2, result;

		OperationAuthen auth = new OperationAuthen(); // 나는 operationauthen 메소드를
														// 쓸꺼야

		try {

			System.out.print("두 수[a,b]?"); // 10,20
			str = br.readLine();

			auth.inputForm(str); // 입력오류가 있는지없는지 체크 from OperationAuthen

			String[] temp = str.split(",");

			auth.number(temp[0]); // 정수인지 실수확인 체크
			num1 = Double.parseDouble(temp[0]);

			auth.number(temp[1]); // 정수인지 실수확인 체크
			num2 = Double.parseDouble(temp[1]);

			System.out.print("연산자"); // +
			str = br.readLine();

			auth.operator(str.charAt(0)); // String에 있는 차트 0번째를 읽어라.

			result = 0;

			if (str.equals("+")) {
				result = num1 + num2;
			} else if (str.equals("-")) {
				result = num1 - num2;
			} else if (str.equals("*")) {
				result = num1 * num2;
			} else if (str.equals("/")) {
				result = num1 / num2;
			}

			System.out.printf("%g %s %g = %g\n", num1, str, num2, result);

		} catch (IOException e) {

		} catch (MyException e) {

			System.out.println(e.toString());
		}

	}

}
