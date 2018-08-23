package com.stream1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//DataInputStream
//boolean,byte,char,int,long,float,double
//등과 같은 자료형을 직접 읽을수 있게 해주고 플랫폼과
//무관하게 동작된다




public class Test5 {

	public static void main(String[] args) throws IOException {

		FileOutputStream fos = new FileOutputStream("d:\\doc\\data.txt"); //파일을 내보내는데 
		                                                                  //DataOutputStream이 형태 그대로 내보내준다.
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeUTF("대한민국");
		dos.writeByte(10);
		dos.writeChar('A');
		dos.writeInt(20);
		dos.writeUTF("서울");
		
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
