package com.class4;

//String
///int, double
//String은 class이다(자료형이 아니다)

public class Test3 {

	public static void main(String[] args) {

		String ob1 = "Seoul";
		String ob2 = "Seoul";
		String ob3 = new String("Seoul");
		Integer aa = new Integer(20);
		
		System.out.println("ob1==ob2: " + (ob1==ob2)); //true
		System.out.println("ob1==ob3: " + (ob1==ob3)); //false
		System.out.println("ob1.equals(ob3): " + ob1.equals(ob3));
							//String이 object의 equals를 override함. 주소값이 아닌 객체를 비교.
							//String은 문자를 비교하는거야.object equals처럼주소값을 비교하는게 아니라.
		
		ob2 = "korea";
		System.out.println("ob1 == ob2 " + (ob1 == ob2)); //false
		//String의 불변의 법칙 - String은 한번 heap 영역에 저장되면 절대 변하지앟는다.
		ob2 = "japan";
		System.out.println("ob1 == ob2 " + (ob1 == ob2)); //false
		
		ob2 = "Seoul";
		System.out.println("ob1 == ob2 " + (ob1 == ob2)); //true
		//원래있던 10번지에 Seoul이 있어서 새로운걸 안만들고 다시 10으로감
		//그래서 다시 ob1 == ob2가 같아짐
		
		System.out.println(ob2); //Seoul
		System.out.println(ob2.toString());//Seoul
		
		//처리하는 데이터는 방대하고 사용빈도는 높기때문에
		//데이터는 heap 영역에 저장하고 사용하는 방법은 자료형처럼 사용한다		
		
	}

}
