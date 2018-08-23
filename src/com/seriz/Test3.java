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
//Sericalizable �������̽��� ���� �������̽�
//Sericalizable ���� ����� �ϵ� ���� �� �Ϻ��� ��� ������
//writeExternal(), readExternal() �޼ҵ带 ����

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
	// ���� ȣ�� (�о��)
	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException {

		name = (String) in.readObject();
		age = in.readInt();

		System.out.println("readExternal() �����...");

	}

	@Override
	// ����Ȱ �Ҷ� ȣ�� (����Ҷ�)
	public void writeExternal(ObjectOutput out) throws IOException {

		out.writeObject(name);
		out.writeInt(age);

		System.out.println("writeExternal() �����...");

	}

}

public class Test3 {

	public static void main(String[] args) {

		try {

			DataTest ob = new DataTest("�����", 25);

			FileOutputStream fos = new FileOutputStream("d:\\doc\\a3.txt");

			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(ob);

			fos.close();
			oos.close();
			
			FileInputStream fis = new FileInputStream("d:\\doc//a3.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			DataTest dt = (DataTest)ois.readObject();  //�⺻�����ڰ���� ����� �ȵǾ���.
			
			System.out.println(dt.toString());

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
