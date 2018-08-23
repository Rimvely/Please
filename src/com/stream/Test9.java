package com.stream;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Test9 {

	public static void main(String[] args) {

		try {

			FileOutputStream fos = new FileOutputStream("D:\\doc\\out4.txt"); // 파일로출력해주는스트림

			PrintStream ps = new PrintStream(fos);  //출력한건 여기로 들어감. 근데 프린트는 fos로 간대. 그래서 fos는 fineoutputstream이라서 파일로 저장

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String str;
			
			System.out.println("문자열을 입력하세요!");
			 
			while((str = br.readLine())!=null){   //문자가없을때까지 집어넣고 출력하기
				
				ps.println(str);
				
			}
			
			ps.close();
			fos.close();
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
