package com.class6;

class SuperTest{
	
	public int a = 10, b = 20;
	
	public void write(){
		System.out.println("슈퍼클래스 write()메소드");
	}
	
	public int hap(){
		return a + b;
	}
}

class SubTest extends SuperTest{
	
	public int b = 100, c = 200;
	
	public void print(){
		System.out.println("서브클래스 print()메소드");
	}
	
	@Override
	public int hap() {
		return a+b+c;
	}
	
}
public class Test2 {

	public static void main(String[] args) {

		SubTest ob1 = new SubTest();
		
		System.out.println("b : " + ob1.b); //100
		
		SuperTest ob2 = ob1; //UPCAST
		
		System.out.println("ob2.b : " + ob2.b); //20
		
		System.out.println("합 : " + ob2.hap()); //220(x)  310(o) 메소드(메소드는 무조건 자기꺼쓴다)
		                                         
		ob2.write();
//		ob2.print(); 쓸쑤없는 이유
		//상속(부모가 자식)
		//1. 부모님꺼는 내꺼(자식)꺼다
		//2. private로 선언한것은 부모꺼다
		//3. protected로 선언한것은 상속이 가능
		//4. 내꺼는 내꺼야
		//5. 같은 객체를 가지고 있으면 내꺼 쓴다. (override)
		
		((SubTest)ob2).print(); //downcast
		ob1.print();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
