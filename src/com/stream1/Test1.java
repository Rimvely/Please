package com.stream1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

//RandomAccessFile
//일반적인 파일은 순차적으로 data를 읽어옴(카세트테입)
//RandomAccessFile은 원하는 곳으로이동해서 읽기가 가능(CD)

public class Test1 {

	public static void main(String[] args) throws IOException {

		File f = File.createTempFile("imsi", ",tmp");
		f.deleteOnExit(); //프로그램이 끝나면 지워라라는 명령어
		
		FileOutputStream fos = new FileOutputStream(f);
		
		for(int i=1;i<=100;i++){
			fos.write(i);
		}
		
		fos.close();
		
		RandomAccessFile raf = new RandomAccessFile(f, "rw");
		
		raf.seek(30);
		System.out.println("seek(30): " + raf.readByte());
		raf.seek(1);
		System.out.println("seek(1): " + raf.readByte());
		
		for(int i=0;i<100;i++){
			raf.seek(i);
			System.out.println(raf.readByte());
		}
		raf.close();
		
		
		
		
		
		
		
		
		
		
		
	}

}
