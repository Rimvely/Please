package com.class4;

//StringBuffer   : 속도가 느림 - 동기화를 지원
//StringBuilder  : 속도가빠름 - 동기화를 미지원

public class Test4 {

	public void stringTime() {

		System.out.println("StringTime...");

		// long start = System.currentTimeMillis(); //밀리세컨시간
		long start = System.nanoTime();

		String str = "a";

		for (int i = 1; i <= 50000; i++) {
			str += "a";
		}

		long end = System.nanoTime();

		System.out.println("실행시간 : " + (end - start));
		
		System.out.println();
	}
		

	// --------------------------------------------------------------------

	public void stringBufferTime() {

		System.out.println("StringbufferTime...");

		// long start = System.currentTimeMillis(); //밀리세컨시간
		long start = System.nanoTime();

		StringBuffer str = new StringBuffer("a");

		for (int i = 1; i <= 50000; i++) {
			str.append("a");
		}

		long end = System.nanoTime();

		System.out.println("실행시간 : " + (end - start));
		
		System.out.println();
	}

	// --------------------------------------------------------------------
	
	public void stringBuilderTime() {

		System.out.println("StringBuilderTime...");

		// long start = System.currentTimeMillis(); //밀리세컨시간
		long start = System.nanoTime();

		StringBuilder str = new StringBuilder("a");

		for (int i = 1; i <= 50000; i++) {
			str.append("a");
		}

		long end = System.nanoTime();

		System.out.println("실행시간 : " + (end - start));
	}

	// --------------------------------------------------------------------
	
	public static void main(String[] args) {

		Test4 ob = new Test4();

		ob.stringTime();
		ob.stringBufferTime();
		ob.stringBuilderTime();
	}

}
