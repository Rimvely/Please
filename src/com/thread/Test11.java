package com.thread;

public class Test11 {

	public static void main(String[] args) {
		
		System.out.println("���ν�����׷� : " + Thread.currentThread().getThreadGroup());
		
		System.out.println("���ν������̸� : " + Thread.currentThread());
		
		Thread t1 = new Thread();
		
		System.out.println("t1������׷� : " + Thread.currentThread().getThreadGroup());
		
		//�������̸�.�켱����.�׷��
		System.out.println("t1 : " + t1);
		
		System.out.println("-------------------------------");
		
		ThreadGroup tg = new ThreadGroup("suzi");//�׷��̸�
		Thread t2 = new Thread(tg,"t2");
		Thread t3 = new Thread(tg,"t3");
		
		System.out.println("t2 : " + t2);
		System.out.println("t3 : " + t3
				);
	}

}

