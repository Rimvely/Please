
package com.thread;

//인터럽트(interrupt) : 
//우선순위가 높은 프로그램을 먼저 실행 시키고 다시 돌아옴

class MYThread7 extends Thread {

	private Thread next;

	public void setNext(Thread next) {
		this.next = next;
	}

	@Override
	public void run() {

		for (int i = 1; i <= 20; i++) {

			try {
				sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
			}

			System.out.println(getName() + " : " + i);

			if (next.isAlive())
				next.interrupt();// 다음 스레드를 깨워라
		}

	}

}

public class Test7 {

	public static void main(String[] args) {
		
		System.out.println("mian 시작...");

		MYThread7 t1 = new MYThread7();
		MYThread7 t2 = new MYThread7();
		MYThread7 t3 = new MYThread7();
		
		t1.setNext(t2); //우선순위 상관없이 순서대로
		t2.setNext(t3);
		t3.setNext(t1);
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.interrupt();
		
		try {
			t1.join();
			t2.join();
			t3.join();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("mian 종료...");
	}

}
