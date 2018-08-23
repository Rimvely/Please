package com.generic;

//제너릭(Generic)

class Box<T> {  //위에는 아직 generic이 정의되어 있지않는다.

	private T t;

	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}
}

public class Test1 {

	public static void main(String[] args) {
		
		Box<Integer> b1 = new Box<Integer>();  //여기에 Integer이라는 걸 부여해서 위에가 Integer이 되어진다.
		
		b1.set(new Integer(10)); // 10이라고 적어도되는 이유는 AUTO BOXING 때문입니다.
		
		Integer i = b1.get();
		System.out.println(Integer.toString(i));
		System.out.println(i);
//		------------------------------------------------------------------------------------------------------
		
		Box<String>	b2 = new Box<String>();
		b2.set("서울");
		String s = b2.get();
		System.out.println(s);
		
		Box b3 = new Box(); //자료형을 정해주지않아서 Box는 Object이다.
		b3.set(30); //UPCAST
//		Integer it = b3.get(); ERROR 걸리는 이유 object인데 integer로 값을달라고해서
		Integer it = (Integer)b3.get();  //그래서 DOWNCAST
		
	}

}
