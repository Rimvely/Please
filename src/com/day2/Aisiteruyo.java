package com.day2;

import java.io.*;

class Aisiteruyo {

	public static void main(String[] args) throws IOException {
		
		String name, name2, name3;

		BufferedReader br = new BufferedReader (
			new InputStreamReader (System.in));

			

			System.out.println("�Ƴ����� �ٷ�������?");

				name = br.readLine();

			System.out.println("����ϴ� ����� �ֽ��ϱ�?");
				
				name2 = br.readLine();

			System.out.println("�ҷ��� �ٷ�������");
				
				name3 = br.readLine();


			System.out.print(name + "�� " + "����ϴ� �����" + name2 + "��� �߽��ϴ�\n" +
				"�ٷ� "+name3+" �����Դϴ�. �m."+"\n������ ���õ� �ʹ� ����մϴ�. ������ �־� �ູ�� ��.\n\n");






	}
}
