package com.stream1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//DataInputStream
//boolean,byte,char,int,long,float,double
//��� ���� �ڷ����� ���� ������ �ְ� ���ְ� �÷�����
//�����ϰ� ���۵ȴ�




public class Test5 {

	public static void main(String[] args) throws IOException {

		FileOutputStream fos = new FileOutputStream("d:\\doc\\data.txt"); //������ �������µ� 
		                                                                  //DataOutputStream�� ���� �״�� �������ش�.
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeUTF("���ѹα�");
		dos.writeByte(10);
		dos.writeChar('A');
		dos.writeInt(20);
		dos.writeUTF("����");
		
		fos.close();
		
		FileInputStream fis = new FileInputStream("d:\\doc\\data.txt");
		DataInputStream dis = new DataInputStream(fis);
		
		System.out.println(dis.readUTF());
		System.out.println(dis.readByte());
		System.out.println(dis.readChar());
		System.out.println(dis.readInt());
		System.out.println(dis.readUTF());
		
		
		
		
		
		
	}

}
