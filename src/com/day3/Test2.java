package com.day3;

import java.util.*;

class  Test2{
	
	public static void main(String[] args) {

		//10���� ū���� �Է¹޾� 1���� �հ� ���ϱ�
		
		Scanner sc = new Scanner(System.in);

		int number, sum=0;    //sum �� ���� �����Ⱚ. ������ �������µ� �ȿ������ִ��� ���ǰ��ȵ�
		                      //�����Ⱚ+n �� �ȵǴϱ� ���ڸ� ���� sum = 0�̶��

		//using do-while code
		

		do{
			System.out.print("�� �Է�?"); //9
			number = sc.nextInt();
		}while (number<10); //10���� ������ ������ ������ �Ȱ��� �ؾߵǴϱ�
			                //10���� �������� �ٽ� �ö󰡰� ����
							//10�̻��϶� ������ ���������� ����

		//11�̻��϶� �����۾��� �ؿ� �ۼ�
		//����
		//for(int i=1;i<=number; i++){

		//	sum = sum + i;  //�����Ⱚ + n �� �ȵȴ�.

		//}

		int i=0;
		while(i<number){
			i++;
			sum+=i; //sum = sum + i;
		}
		

		System.out.println("���:" + sum);





		
	}
}
