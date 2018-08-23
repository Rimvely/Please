package com.class6;

//Interface
//1. 추상클래스의 일종 선언만있고 정의(내용)가 없다.
//2. final변수만 정의할수 있다.
//3. 인터페이스를 구현하기 위해서는 implements를 사용한다.
//4. 하나이상의 인터페이스를 implements한 클래스는
//   인터페이스의 모든 메소드를 override해야한다.
//5. 인터페이스가 인터페이스를 상속받을수 있으면 이때 extends
//   키워드를 사용한다.
//6. 인터페이스는 다중 상속이 가능하다
//7. 인터페이스는 저장소이다
//8. 강제적용이 가능하다

interface Fruit{
	
	String Won = "원"; //interface는 public  생략되어 있다.
	                   //첫글자가 대문자면 static final 생략 이다.
	
	int getPrice(); //메소드를 만든다.  //public abstract 생략.
	
	public String getName();

}

class FruitImpl implements Fruit {

	@Override
	public int getPrice() {
		return 1000;
	}

	@Override
	public String getName() {
		return "사과";
	}  //Fruit() and getPrice() 둘다 오버라이드해야해 
	
	public String getItems(){
		return "과일";
	}
	
	
	
}


public class Test3Interface {

	public static void main(String[] args) {
		
		FruitImpl ob1 = new FruitImpl(); //자식클래스로 자식 객체를 만들면 부모의 능력을 쓸수있다. super();때문에?
		
		//Fruilt ob1 = new FruiltImpl();  - 자식클래스로 부모객체를 만들었는데 부모능력2개 자식은3개
//		부모는 능력이 2개 자식은 2+1개 라서 안된다.
		
		System.out.println(ob1.getItems() + " : " + ob1.getName() + " : " + ob1.getPrice() + Fruit.Won);
		
		Fruit ob2 = ob1; //UPCAST
		
		System.out.println(ob2.getName()); //추상클래스의 일종. 부모꺼 내꺼 있으니 내꺼쓴다
		
//		System.out.println(ob2.getItem()); // 부모한테는 있는데 자식한테 있는건 못쓴다
		
		
		
		
	}

}
