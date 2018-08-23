package com.class6;

interface Test {

	public int total();

	public void write();

}

class TestImpl implements Test {

	private String hak, name;
	private int kor, eng;

	public TestImpl() { // 기본생성자 - 기본생성자를 부를려면 변수들을 초기화해야할 메소드가필요하다
						// 그래서 public void set(){} 만들어서 초기화시킨다
	}

	public TestImpl(String hak, String name, int kor, int eng) {
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}

	public void set(String hak, String name, int kor, int eng) {
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}

	@Override
	public int total() {
		return kor + eng;
	}

	@Override
	public void write() {
		System.out.println(hak + " : " + name + " : " + total()); // 메소드에서 메소드로
																	// 호출가능
																	// about
																	// total()
	}
	@Override //ob1.equals(ob2)-TestImpl
	public boolean equals(Object ob) { //UPCAST     

		boolean flag = false;

		if (ob instanceof TestImpl) {   //껍데기 다 벗겨 그게 TestImpl이야?  맞으면 자식으로 바꾸자 downcast
			TestImpl t = (TestImpl) ob; //downcast

			if (this.hak.equals(t.hak) && this.name.equals(t.name)) {
				flag = true;
			}
		}
		return flag;
	}

}

public class Test4 {

	public static void main(String[] args) {
		/*
		 * 초기화 가능하게하는 방법 1번 TestImpl ob = new TestImpl(); ob.set("1111", "배수지",
		 * 60, 70);
		 */

		/* 초기화 방법 2번째 */
		TestImpl ob1 = new TestImpl("1111", "배수지", 60, 70);
		TestImpl ob2 = new TestImpl("1111", "배수지", 100, 200);

		if (ob1.equals(ob2)) //Object equals는 주소지가 같냐?를 묻는다.
			System.out.println("ob1과 ob2는 동일인물...");
		else
			System.out.println("ob1과 ob2는 NOT 동일인물...");

		ob1.write();
		ob2.write();
	}

}



/*@Override
public boolean equals(Object ob) {

	boolean flag = false;

	if (ob instanceof TestImpl) {
		       [t = ob]
		TestImpl t = (TestImpl) ob; //downcast
                          t = ob1.hak                  
		if (this.hak.equals(t.hak) && this.name.equals(t.name)) {
			flag = true;
		}
	}
	return flag;
}

instanceof [sth]




*/ 












