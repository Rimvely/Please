package com.thread;

//����ȭ��

class MyThread8 implements Runnable {

	private int bank = 10000;// �ܰ�

	private int getBank() { // Vector???
		return bank;
	}

	private int drawMoney(int m) {
		bank -= m; // ����

		return m; // ������ �ܾ�
	}

	@Override
	public void run() {

		int money_need = 6000; // ������ �ݾ�

		int money;

		String str = "";

		try {

			if (getBank() >= money_need) {

				Thread.yield();

				money = drawMoney(money_need);

				str = "���� ����!!";
			} else {

				money = 0;
				str = "���� ����!!";
			}

			System.out.println(Thread.currentThread().getName() + str
					+ ",����ݾ� : " + money + ",�ܰ� : " + getBank());

		} catch (Exception e) {

		}

	}
}

public class Test8 {

	public static void main(String[] args) {

		System.out.println("Main ����...");

		// Thread t1 = new Thread(new Mythread8());
		MyThread8 ob = new MyThread8();

		Thread t1 = new Thread(ob);
		Thread t2 = new Thread(ob);

		t1.start();
		t2.start();
	}

}
