package com.thread;

//������ �����ֱ�

class MyThread6 extends Thread {

	@Override
	public void run() {

		try {

			System.out.println("������ ����...");

			System.out.println("�켱���� : " + getPriority());
			System.out.println("�������̸� : " + getName());

			// 0.5��
			sleep(500);

			// �켱��������
			setPriority(2);
			System.out.println("����� �켱����:" + getPriority());

			System.out.println("������ ����...");

		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}

public class Test6 {

	public static void main(String[] args) {
		
		Thread t1 = Thread.currentThread();	//main
		Thread t2 = new MyThread6();
		
		System.out.println("���ν����� �켱���� : " + t1.getPriority());
		System.out.println("���ν������̸� : " + t1.getName());
		
		System.out.println("start �޼ҵ� ȣ���� is Alive : " + t2.isAlive());
		
		t2.start();
		
		//t2�� �켱���� Ȯ��
		System.out.println("t2�켱���� : " + t2.getPriority());
		
		//t2�� �켱���� ����
		t2.setPriority(1);
		
		try {
			
			//0.1�� sleep
			Thread.sleep(100); //Main
			
			//t2�� ����Ǿ����� Ȯ��
			System.out.println("t2 ����ֳ�? : " + t2.isAlive());
			
			//1�� sleep
			Thread.sleep(1000);
			System.out.println("1���� t2 ����ֳ�? : " + t2.isAlive());
			
			t2.join();//Main���� ����ؼ� t2�� ���� �ɶ����� ������ ��ٷ�.
			System.out.println("�׷��� ����ֳ�? : " + t2.isAlive());
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
