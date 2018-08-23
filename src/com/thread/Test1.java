package com.thread;

class MyThread1 extends Thread { 

	private int num;
	private String name;

	public MyThread1(int num, String name) { // �� �������� �ʱ�ȭ�Ϸ���
		this.num = num; // ��ü���������.
		this.name = name;
	}

	@Override
	public void run() {// Thread�� �޼ҵ�

		int i = 0;

		while (i < num) {

			System.out.println(this.getName() + " : " + name + i);
			i++;

			try {

				sleep(100); // 1�ʽ���

			} catch (Exception e) {

			}

		}

	}

}

public class Test1 {

	public static void main(String[] args) {

		System.out.println("main ����...");
		
		MyThread1 t1 = new MyThread1(100, "ù��°");
		MyThread1 t2 = new MyThread1(200, "�ι�°");
		
		t1.start();
		t2.start();
		
		//������� ����� ������ : 3��(main,t1,t2)
		
		System.out.println("main ����...");
		
	}

}
