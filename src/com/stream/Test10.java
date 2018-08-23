package com.stream;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class Test10 {

	public static void main(String[] args) {

		try {

			FileOutputStream fos;
			PrintStream ps;

			fos = new FileOutputStream("D:\\doc\\out5.txt");
			ps = new PrintStream(fos);

			ps.println("배수지"); //print(ln)을써야지 한칸씩 내려가서 써진다
			ps.println("한지혜");
			ps.println("티파니");
			ps.println("천송이");

			ps.close();
			fos.close();
			
			//true : append(추가, 누적)
			fos = new FileOutputStream("D:\\doc\\out5.txt",true);  //new를쓰면 무조건 객체를 다시만든다
			ps = new PrintStream(fos);						  //뒤에 true를 쓰면 누적이된다. 안쓰면 내용이 덮어진다.

			ps.println("김수지"); 
			ps.println("최지혜");
			ps.println("땅파니");
			ps.println("만송이");
			
			ps.close();
			fos.close();
			

		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
