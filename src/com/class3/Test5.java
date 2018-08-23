package com.class3;

//비정형 인수(인수의 갯수가정해지지않은것)

public class Test5 {

		int sum(int ...args){    //(int ...args)인수의 갯수가정해지지않은것 & 배열처럼만들어짐
			
			int s = 0;
			for(int i=0;i<args.length;i++){
				s += args[i];
			}
			return s;
			
			
			
		}
	public static void main(String[] args) {
		
		Test5 ob = new Test5();
		
		int result;
		
		result = ob.sum(2,4,6,8,10);
		System.out.println(result);

		result = ob.sum(1,3,5,7,9,11,13,15,17,19);
		System.out.println(result);
	}

}
