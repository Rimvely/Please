package com.day2;

class  Test1 {


	public static void main(String[] args) {

	
		//float,double 비교

		float f = 0;
		double d = 0;

		for(int i=1;i<=100000;i++){//i=i+1 == i++

			f=f+100000; 
			//f:10000000000 2개가 같은말
			
			d=d+100000; 
			//d:10000000000
			



		}

		System.out.println("float:" +f/100000);
		System.out.println("double:" +d/100000);

		//99996.055 float은 1000번정도는 괜찮은데 100000번정도는 더블로 써야한다. float은 에러가 생긴다.
		//100000.0




	}
}
