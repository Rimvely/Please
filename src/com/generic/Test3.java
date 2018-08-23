package com.generic;

import java.util.InputMismatchException;
import java.util.Scanner;

//����ó��
//Exception

public class Test3 {

	public static void main(String[] args) {

		int num1, num2, result;
		String oper;

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("�ΰ��� ��?"); // 10 20
			num1 = sc.nextInt();
			num2 = sc.nextInt();

			System.out.print("������?"); // +
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
			System.out.println("������ �Է��ض�!!");
		} catch (ArithmeticException e) {
			System.out.println("0���� ������ ����");
		}

		catch (Exception e) {
			// System.out.println(e);
			// e.printStackTrace();

			System.out.println("�� �װ� ���ڷ� ���̳�?");
		}finally{
			System.out.println("�� �׻� ���δ�!!");
		}

	}

}
