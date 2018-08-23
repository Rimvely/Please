package com.exec;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OperationMain {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str;
		double num1, num2, result;

		OperationAuthen auth = new OperationAuthen(); // ���� operationauthen �޼ҵ带
														// ������

		try {

			System.out.print("�� ��[a,b]?"); // 10,20
			str = br.readLine();

			auth.inputForm(str); // �Է¿����� �ִ��������� üũ from OperationAuthen

			String[] temp = str.split(",");

			auth.number(temp[0]); // �������� �Ǽ�Ȯ�� üũ
			num1 = Double.parseDouble(temp[0]);

			auth.number(temp[1]); // �������� �Ǽ�Ȯ�� üũ
			num2 = Double.parseDouble(temp[1]);

			System.out.print("������"); // +
			str = br.readLine();

			auth.operator(str.charAt(0)); // String�� �ִ� ��Ʈ 0��°�� �о��.

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
