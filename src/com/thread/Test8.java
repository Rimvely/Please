package com.thread;

//동기화블럭

class MyThread8 implements Runnable {

	private int bank = 10000;// 잔고

	private int getBank() { // Vector???
		return bank;
	}

	private int drawMoney(int m) {
		bank -= m; // 인출

		return m; // 인출후 잔액
	}

	@Override
	public void run() {

		int money_need = 6000; // 인출할 금액

		int money;

		String str = "";

		try {

			if (getBank() >= money_need) {

				Thread.yield();

				money = drawMoney(money_need);

				str = "인출 성공!!";
			} else {

				money = 0;
				str = "인출 실패!!";
			}

			System.out.println(Thread.currentThread().getName() + str
					+ ",인출금액 : " + money + ",잔고 : " + getBank());

		} catch (Exception e) {

		}

	}
}

public class Test8 {

	public static void main(String[] args) {

		System.out.println("Main 시작...");

		// Thread t1 = new Thread(new Mythread8());
		MyThread8 ob = new MyThread8();

		Thread t1 = new Thread(ob);
		Thread t2 = new Thread(ob);

		t1.start();
		t2.start();
	}

}
