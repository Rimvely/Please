package com.class3;

//상속(부모가 자식)
//1. 부모님꺼는 내꺼(자식)꺼다
//2. private로 선언한것은 부모꺼다
//3. protected로 선언한것은 상속이 가능
//4. 내꺼는 내꺼야
//5. 같은 객체를 가지고 있으면 내꺼 쓴다.


class Test{
	
	private String title;
	private int area;
	
	public void set(String title, int area){ // 1.번째 방법 private 만들어서 method로 초기화
		
		this.title = title;
		this.area = area;
	
	}
	
	public void print(){
		System.out.println(title + " : " + area);
	}
		
}



//     자식          부모
class RectA extends Test{
	
	private int w,l;
	//생성자
	//overloading 된 생성자
	public RectA(int w, int l){
		this.w = w;
		this.l = l;
	}
		
	public void RectArea(){
		
		int a = w * l;
		set("사각형", a);
		
		
		
	}
}

public class Test8 {

	public static void main(String[] args) {

		RectA ob = new RectA(10, 20);
		
		ob.RectArea();

		ob.print();
		
	}

}
