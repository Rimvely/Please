package com.day2;

class  Test1 {


	public static void main(String[] args) {

	
		//float,double ��

		float f = 0;
		double d = 0;

		for(int i=1;i<=100000;i++){//i=i+1 == i++

			f=f+100000; 
			//f:10000000000 2���� ������
			
			d=d+100000; 
			//d:10000000000
			



		}

		System.out.println("float:" +f/100000);
		System.out.println("double:" +d/100000);

		//99996.055 float�� 1000�������� �������� 100000�������� ����� ����Ѵ�. float�� ������ �����.
		//100000.0




	}
}
