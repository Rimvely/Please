package com.class3;

import java.io.IOException;
import java.util.Scanner;

class Calc{
	
	private int num1,num2;
	private char oper;
	
	public boolean input() throws IOException{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�μ�?");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		System.out.println("������?");
		oper = (char)System.in.read();  //�ƽ�Ű������ �ޱ⶧���� (char)�� �ٲ���
		
		//������ Ȯ��
		if(oper !='+' && oper !='-' && oper !='*' && oper !='/'){
			return false;
		}
		return true;
		
	}
	
	public int result(){
		int r = 0;
		switch(oper){
		case '+' :
			r = num1 + num2;
		case '-' :
			r = num1 - num2;
		case '*' :
			r = num1 * num2;
		case '/' :
			r = num1 / num2;
		}
		
		return r;
		
	}
	
}

public class Test6 {

	public static void main(String[] args) throws IOException {
		Calc ob = new Calc();
		
//		boolean b = ob.input();
//		
//		if(b == true){
//			System.out.println(ob.result());
//		}else{
//		}
		
//		if(ob.input()){ //������ �۾��� if�� �ȿ� �θ� ���� ���� �ڵ�
//			System.out.println(ob.result());
//		}else{
//			return;
//		}
		
		
		if(!ob.input()){ 
			return; //stop
		}
		
		System.out.println(ob.result());
			
		
	}

}
