package com.thread;

//데몬스레드
//다른 스레드에 도움을 주는 스레드로 다른 스레드가 종료되면 
//데몬스레드가 종료되지않아도 프로세스가 종료된다

class MyThread5 implements Runnable {

	@Override
	public void run() {

		for (int i = 1; i <= 20; i++) {

			System.out.println(i);

			try {

				Thread.sleep(1000);

			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}

public class Test5 {

	public static void main(String[] args) {
		
		System.out.println("main 시작...");
		
		Thread t1 = new Thread(new MyThread5());
		Thread t2 = new Thread(new MyThread5());
		Thread t3 = new Thread(new MyThread5());
		
		//Demon스레드
		t1.setDaemon(true);
		t2.setDaemon(true);
		t3.setDaemon(true);

		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("main 종료...");
		
		//메인스레드 1초 쉼
		try {
			
			Thread.sleep(1000);
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		//main스레드에게 너 다 끝날때까지 기다려
		try {
			
			t1.join();
			t2.join();
			t3.join();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
		

	}

}
