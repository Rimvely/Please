package com.scorehw1;

import java.io.IOException;

class Cal {
	int number; // String input�� �ִ� ���� ���������� ����
	String input = ""; // System.in.read()�� �о�� String�迭�� ����
	int key; // �ƽ�Ű�ڵ尪
	int sum = 0;

	// System.in.read() �� ���� �޾ƿ���
	public int input_number() {
		System.out.print("���ڸ� �Է����ּ��� :");

		try {
			while ((key = System.in.read()) != 13) {
				input += Character.toString((char) key);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		this.number = Integer.parseInt(input);
		return number;
	}

	// �Է¹��� ���ڱ����� �հ� ���ϱ�
	public int addToNumber() {

		for (int i = 1; i <= number; i++) {
			this.sum += i;
		}
		return this.sum;
	}

}

public class Hw1 {
	public static void main(String[] args) {

		Cal obj = new Cal();
		int num2 = obj.input_number();
		int sum2 = obj.addToNumber();

		System.out.println(num2 + "������ ���� " + sum2

		+ " �Դϴ�.");

	}
}