package com.stream1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

//FileReader
//파일에서 바이트를 읽어들여 문자,바이트 스트림으로 변환

public class Test4 {

	public static void main(String[] args) throws FileNotFoundException {

		FileReader fr = new FileReader("d:\\doc\\test.txt");
		BufferedReader br = new BufferedReader(fr);
		// fr이 2바이트로 바꿔주기때문에 new inputstreamreader을 할필요가없다

		try {

			String str;
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
			fr.close();

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
