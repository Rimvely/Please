package com.day2;

import java.io.*;

class Test2 { //���⸸���

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader (
			new InputStreamReader (System.in));
		
		int num1,num2;
        //������� �ʿ��Ѱ� ���´�. (����ܰ�)

		System.out.print("ù��° ��?");
		num1 = Integer.parseInt(br.readLine());

		System.out.print("�ι�° ��?");
		num2 = Integer.parseInt(br.readLine());

		System.out.printf("%d + %d = %d\t",num1,num2,(num1+num2));  // %d\t  >>>>> \t �� tab �ǹ�
		System.out.printf("%d - %d = %d\n",num1,num2,(num1-num2));
		System.out.printf("%d * %d = %d\t",num1,num2,(num1*num2));
		System.out.printf("%d / %d = %d\n",num1,num2,(num1/num2)); //�� ���ϱ�
		System.out.printf("%d %% %d = %d\n",num1,num2,(num1%num2)); //������ ���ϱ� //�ۼ�Ʈ������ %% �̴� such as %d,%f,%s ó��


		//���ڸ� �ε�ȣ�� ���ϸ� true, false�� ����
		System.out.println("num1>num2:" + (num1>num2)); //true
		System.out.println("num1<num2:" + (num1<num2));

		//String= + str = "������"; ��Ʈ���� �����ٶ��� ���������ڸ� �����Ҽ��ִ� ����
		String str;

		//���׿�����
		str = num1%2==0?"¦��":"Ȧ��";

		str = num1>0?"���":(num1<0?"����":"��");

		//a &&(and) b, a||(or) b

		str = num1%4==0 && num1%100!=0 || num1%400==0?"����":"���";     //������ 4�⸶�� �������ϱ� 4�� ������
		                                                                 //���� ����
		
		System.out.println(str);


		











































































































	}
}
