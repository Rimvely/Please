package com.class3;

class Rect{
	
	private int w,l;
	
	public Rect(){ //기본 생성자(property such as void, static? 같은게 없으면 생성자임)
	
	}
	
	public Rect(int w, int l){ //overloading 생성자
		this.w = w;
		this.l = l;
	}
	
	public void set(int w, int l){ //초기화 메소드
		this.w = w;
		this.l = l;
	}
	
	public int area(){
		return w*l;
	}
	
	public int circumference(){
		return (w*l)*2;
	}
	
	public void print(int a){                //메소드 오버로딩(안에 자료를 다르게나 변수의 갯수를 다르게)
		System.out.println("가로: " + w);
		System.out.println("세로: " + l);
		System.out.println("넓이: " + a);
	}
	
	public void print(int a, int c){          //메소드 오버로딩은 
		System.out.println("가로: " + w);
		System.out.println("세로: " + l);
		System.out.println("넓이: " + a);
		System.out.println("둘레: " + c);
	}

	
}





public class Test2 {

	public static void main(String[] args) {

		Rect ob1 = new Rect();    //ob2에 set up 시킨것과 ob1에 밑에 따로 지정
		ob1.set(10, 20);
		
		int a = ob1.area();
		int c = ob1.circumference();

		
		ob1.print(a);
		System.out.println();
		ob1.print(a, c);
		System.out.println("-------------------------");
		
		Rect ob2 = new Rect(100, 200);    //초반에 초기값을 받는것은 나중에 값이 잘 안바뀜
		a = ob2.area();
		c = ob2.circumference();
		ob2.print(a);
		System.out.println();
		ob2.print(a, c);
		
		
		
		
	}

}
