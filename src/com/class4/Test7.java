package com.class4; //String�� method�� ������ ���� �����

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test7 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("����[3+5]?");//  12 + 30 
		String str = br.readLine();
		
		str = str.replaceAll("\\s", ""); //���� ���ľ���� ��� ������ �� ���ֱ� ����
		
//		String[] oper = {"+","-","*","/"};     
//		for(String op : oper){
//		}
//		�� ���� �ڵ��� �ѹ濡�ϴ� �ڵ� ������
		
		for(String op : new String[]{"+","-","*","/"}){
			
			int pos = str.indexOf(op);  //12+30
			
			if(pos>-1){
				int num1 = Integer.parseInt(str.substring(0, pos));  //substring�� ���������� (n-1)  (0. pos) �� 0���� - (pos-1)
				
				int num2 = Integer.parseInt(str.substring(pos+1));   //(pos+1)�� pos �������� ���̶�� ��
				
				int result = 0;
				
				char oper = str.charAt(pos);
				
				switch(oper){
				
				case '+':
					result = num1 + num2;
					break;
				case '-':
					result = num1 - num2;
					break;
				case '*':
					result = num1 * num2;
					break;
				case '/':
					result = num1 / num2;
					break;
				}
				
//				System.out.printf("%d %c %d = %d",num1,oper,num2,result);
//				���� �Ȱ�����
				String s = String.format("[%d %c %d] = %d",num1,oper,num2,result); //�����Ƶΰ� ���߿� �ʿ��Ҷ� ��������
				
				System.out.println(s); //�׸��� �̰����������ٰ� ���
				
				
				
			}
			
			
		}
		
		
		
		
		
		
	}

}
