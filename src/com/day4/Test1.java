package com.day4;

import java.io.IOException;
import java.util.Scanner;

public class Test1 {
	
	public static void main(String[] args) throws IOException {	
		
		Scanner sc = new Scanner(System.in);
		
		int n1,n2;
		char oper;
		int result =0;
		
		
		System.out.println("ù��° ��?");
		n1 = sc.nextInt();
		
		System.out.println("�ι�° ��?");
		n2 = sc.nextInt();
		
		System.out.print("������[+,-,*,/]?"); //+
		oper = (char)System.in.read(); //read�� 1���� ĳ���͸� �д°Ŵ�
		
		System.out.println();
		
		
		switch(oper){
		
		case '+':
			result = n1+n2;
//			System.out.printf("%d+%d=%d",n1,n2,n1+n2);
			break;
		case '-':
			result = n1-n2;
//			System.out.printf("%d-%d=%d",n1,n2,n1-n2);
			break;
		case '*':
			result = n1*n2;
//			System.out.printf("%d*%d=%d",n1,n2,n1*n2);
			break;
		case '/':
			result = n1/n2;
//			System.out.printf("%d/%d=%d",n1,n2,n1/n2);
			break;
		default:
			System.out.print("�߸��� ������!");
			
			
		}
		
		System.out.printf("%d%c%d=%d\n",n1,oper,n2,result);
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}


/*
[�ڷ���]

boolean : true/false

[����]
byte	:	-128~127
short	:	-32768~32767  
int		:	4byte
long	:	8byte

10����:10 8����:016 16����:0x17

[�Ǽ�]
float	:	4byte
double	:	8byte
������ �Ǽ�(float): 3.14f
������ �Ǽ�(double):3.14
�ڹٴ� �Ҽ����� ���� double�� �ν��Ѵ�.

[����] ���ĺ� a �ϳ��� ACIII ��
char	:	2byte(UTF-16):'a'  UTF�� ���ڵ�. �� ���ڸ� ǥ���ϱ����� ���

[������]
+,-,/,%,++,--

[������������]
>,>=,<,<= : ���: true or false (boolean ��)

[�������]
==,!= ����, �����ʴ�

[��������]
&&(and), ||(or), !(not)

[��Ʈ����] 2�������� ���� ����
&, |, ~, >>, <<, >>>

[���׿�����]
����?���϶�����:�����϶���
                (����?T:F)

[���Կ�����]
=,+=,-=,*=
-----------------------------------------------------------------------------------
int a=10;
float b;

b=a;        //�Ͻ�������ȯ
b=(float)a; //���������ȯ

a=b; 		X
a=(int)b;   O //���������ȯ
-------------------------------------------------------------------------------------
[���]

if(����){
�۾�1;
}

if(����){
�۾�1;
}else{
�۾�2
}

if(����1){
�۾�1;
}else if(����2){
}else{             //������ else ��������
�۾�3; 
}

for(���۰�;�ִ밪;������){
	�۾�;
}


while(����){
�۾�;
}

do{
�۾�;
}while(����);

while(true){     //���ѷ���
�۾�
}

break; //���ѷ����� ���߰��ϴ°�













 */















