package com.seriz;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

//Externalizable
//Sericalizable 인퍼페이스의 하위 인터페이스
//Sericalizable 같은 기능을 하되 ㄷ좀 더 완벽한 제어가 가능함
//writeExternal(), readExternal() 메소드를 정의

class DataTest implements Externalizable {

	String name;
	int age;
	
	public DataTest(){
		
	}

	public DataTest(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + " : " + age;
	}

	@Override
	// 복원 호출 (읽어볼때)
	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException {

		name = (String) in.readObject();
		age = in.readInt();

		System.out.println("readExternal() 실행됨...");

	}

	@Override
	// 직렬활 할때 호출 (출력할때)
	public void writeExternal(ObjectOutput out) throws IOException {

		out.writeObject(name);
		out.writeInt(age);

		System.out.println("writeExternal() 실행됨...");

	}

}

public class Test3 {

	public static void main(String[] args) {

		try {

			DataTest ob = new DataTest("배수지", 25);

			FileOutputStream fos = new FileOutputStream("d:\\doc\\a3.txt");

			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(ob);

			fos.close();
			oos.close();
			
			FileInputStream fis = new FileInputStream("d:\\doc//a3.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			DataTest dt = (DataTest)ois.readObject();  //기본생성자가없어서 출력이 안되었다.
			
			System.out.println(dt.toString());

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
