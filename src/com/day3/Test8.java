package com.day3;

import java.util.*;
import java.io.*;

class  Test8{

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));

		int number, sum;
		char choice;

		//���� ���Ҷ����� ����ǰ� stop �϶�� �Ҷ����� �ϱ� ���� ���

		while(true){//���ѷ��� �ϴ� ���



			do{
				System.out.print("���Է�? ");      //100e    //e200
				number = Integer.parseInt(br.readLine());  //readLine�� 100�����а� enter�� ���д´�
			}
			while (number<1||number>5000);


			sum = 0; //�ʱ�ȭ ��Ű������ ���⿡�ٰ� sum=0

			for(int i=1;i<=number;i++){
				sum+=i;
			}

			System.out.println("1~" + number + " ������ ��:" + sum);    

			System.out.print("�������?[Y/N]"); //ye(10.13)               
			choice = (char)System.in.read();       //�ѱ��ڸ� �о��

			if(choice!='Y'&&choice!='y'){  //������ �� �����̸� ��� ||(or) �ƴ϶� && �� (or)�� �ȴ�
				System.out.println("�����մϴ�.");
				break; //break�� �����ִ°� : while,do~while,for,switch
			}
			
			System.in.skip(2); //e(10.13)�� ����







		
		
		
		
		
		
		}//end of while coding







	}//end of method (main)
}
