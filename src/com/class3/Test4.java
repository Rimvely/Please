package com.class3;

//�Ǻθ��Լ�
//�ҽ��� ��������
//ó���ӵ��� ����
//stack ���￡ �����͸� �����ߴٰ� ����ϱ� ������ ����



public class Test4 {
           //�⺻�����ڰ� ���⿡ ���� ��ġ �Ⱥ��ϻ�
	public void print(int n){
		if(n != 1){
			print(n-1);
		}
		System.out.printf("%5d", n);         //��ǻ�;ȿ��� �޸�ȣ���� �����մ� ����
	}

	public int sum(int n){
		
		return n>1 ? n+ sum(n-1) : n ;
		
	}
	
	public int pow(int a, int b){
		return b >= 1 ? a*pow(a, b-1) : 1;
	}
	
	public static void main(String[] args) {
		Test4 ob = new Test4();
		ob.print(5);
		
		System.out.print(" : ");
		int s = ob.sum(5);
		System.out.println(s);
		
		System.out.println();
		int d = ob.pow(2, 10);
		System.out.print(d);   //2e10
	}
	

		


}
