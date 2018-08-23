package com.seriz;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Hashtable;
import java.util.Iterator;

public class MyDataMain {

	public static void main(String[] args) {

		try {

			// 직렬화
			FileOutputStream fos = new FileOutputStream("d:\\doc\\a2.txt");

			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(new MyData("홍길동", 90));
			oos.writeObject(new MyData("가길동", 10));
			oos.writeObject(new MyData("나길동", 50));
			oos.writeObject(new MyData("다길동", 70));
			oos.writeObject(new MyData("라길동", 50));

			oos.close();
			fos.close();

			System.out.println("저장성공!");

		} catch (Exception e) {
			// TODO: handle exception
		}

		try {

			// 꺼내오는작업.
			// 역직렬화
			FileInputStream fis = new FileInputStream("d:\\doc\\a2.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);

			MyData ob = null;

			while (true) {

				ob = (MyData) ois.readObject();

				if (ob == null)
					break;

				System.out.println(ob.toString());

			}

			ois.close();
			fis.close();

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
