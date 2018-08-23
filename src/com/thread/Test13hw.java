package com.thread;

import java.util.Random;
import java.util.Scanner;

public class Test13hw extends Thread {

	private int num;

	Random rd = new Random();

	static String[] name = { "장예진", "노홍현", "최원경", "라영준", "송재훈", "정재훈", "장성진",
			"한승덕", "류정아", "이현진", "김누리", "조일준", "김용광", "박종훈", "서영진", "이양규",
			"김희민", "박현재", "김한결", "여정민", "임단비", "김해나", "문승준", "조기현", "박원빈",
			"김민영", "이태현", "박명성", "허도휘", "신상엽" };

	// -------------------------------------------------------------------------------------------------------

	public Test13hw(int inwon) {
		this.num = inwon;
	}

	@Override
	public void run() {

		int i= 0;
		int[] arr = new int[num];

		System.out.print("고민중.");
		while (i < 10) {

			System.out.print(".");
			try {
				sleep(300);
			} catch (Exception e) {
				// TODO: handle exception
			}
			i++;
		}
		System.out.println();

		for (int j = 0; j < num; j++) {

			int n = rd.nextInt(30);

			arr[j] = n;

			for (int k = 0; k < j; k++) {
				if (arr[k] == n) {
					j--;
					break;
				}
			}
		}
		

		for (int k = 0; k < num; k++) {
			System.out.println((k + 1) + "번 발표자 :"
					+ " " + name[arr[k]]);
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int inwon;

		System.out.println("몇명을 뽑으실껍니까?");
		inwon = sc.nextInt();

		Test13hw ob = new Test13hw(inwon);
		ob.start();
		

	}

}

//private final 