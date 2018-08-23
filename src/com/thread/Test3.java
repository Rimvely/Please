package com.thread;

import java.util.Calendar;

class Tclock implements Runnable {

	private int num;

	public Tclock(int num) {
		this.num = num;
	}

	@Override
	public void run() {

		int i = 0;

		while (i < num) {

			System.out.printf("%1$tF %1$tT", Calendar.getInstance());// 1$는 ,뒤에
																		// 있는
																		// 벨류를
																		// 집어넣어라
																		// tF,
																		// tT?

			try {

				Thread.sleep(1000); // 0.1초

			} catch (Exception e) {

			}

			i++;
		}

	}
}

public class Test3 {

	public void main(String[] args) {

		Thread t1 = new Thread(new Tclock(100));
		t1.start();

	}
}
