package com.thread;

class MyThread1 extends Thread { 

	private int num;
	private String name;

	public MyThread1(int num, String name) { // 위 변수들을 초기화하려고
		this.num = num; // 객체를만들었다.
		this.name = name;
	}

	@Override
	public void run() {// Thread의 메소드

		int i = 0;

		while (i < num) {

			System.out.println(this.getName() + " : " + name + i);
			i++;

			try {

				sleep(100); // 1초쉬어

			} catch (Exception e) {

			}

		}

	}

}

public class Test1 {

	public static void main(String[] args) {

		System.out.println("main 시작...");
		
		MyThread1 t1 = new MyThread1(100, "첫번째");
		MyThread1 t2 = new MyThread1(200, "두번째");
		
		t1.start();
		t2.start();
		
		//여기까지 실행된 스레드 : 3개(main,t1,t2)
		
		System.out.println("main 종료...");
		
	}

}
