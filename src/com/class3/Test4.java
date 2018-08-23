package com.class3;

//되부름함수
//소스가 간단해짐
//처리속도가 느림
//stack 영억에 데이터를 저장했다가 출력하기 때문에 느림



public class Test4 {
           //기본생성자가 여기에 원래 위치 안보일뿐
	public void print(int n){
		if(n != 1){
			print(n-1);
		}
		System.out.printf("%5d", n);         //컴퓨터안에서 메모리호출을 볼수잇는 예제
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
