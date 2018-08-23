package com.class3;


//생성자
//1.메모리 할당을 받을때 사용
//2.변수 초기화 할대 사용한다

//class의 이름과 동일
//리턴값이 없기때문에 property가 없다.
//중복정의가 가능(overloading)
//제일 선두에서 한번만 호출 가능





public class Test1 {
	
	private int x;
	
	public Test1(){ //기본 생성자는 원래 생략
		
		this(20);    
		System.out.println("인수가 없는 생성자");
		x = 10;
		System.out.println("x : " + x);
//		this(20); 여기에는 둘수없다. 선두에 한번만 가능한것이라서.
	}
	
	public Test1(int x){ //오버로딩된 생성자
		
		System.out.println("인수가 있는 생성자..");
		this.x = x;
		System.out.println("x : " + x);

	}
	
//	public void setDate(int x){
//		this.x = x;
//		System.out.println("x : " + x);
//	}
//	

	public static void main(String[] args) {

		Test1 ob1 = new Test1();    //안에내용은 없더라도 오버로딩된 객체가 있다면 꼭 기본생성자를 만들어
		                            //두어야함
//		ob1.setDate(10);    
		Test1 ob2 = new Test1(100); //오버로딩된 생성자 사용방법/의존성 주입
		                            //ob2 처리속도 빠름. 초기화도 같이 진행
		
		
		
	}

}
