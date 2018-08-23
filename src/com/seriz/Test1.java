package com.seriz;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Hashtable;

//객체의 직렬화
//메모리에 생성된 클래스객체의 멤버변수의 현재상태를
//그대로 보조해서 파일에 저장하거나 네트워크를 통해
//전달할수있는 기능
//오로지 바이트 단위로만 데이터를 송수신할수있다.

//장점은 객체자체의 내용을 입출력 형식에 구애받지않고
//객체를 파일에 저장함으로써 연속성을 제공할수있고
//객체 자체를 네트워크를 통해 손쉽게 교환할수 있다.
//implements Serializable 로 구현한다( 난 메소드는 없다)


public class Test1 {

	public static void main(String[] args) throws IOException {

		Hashtable<String, String> hMap = new Hashtable<String, String>();
		
		hMap.put("1", "이효리");
		hMap.put("2", "전지현");
		hMap.put("3", "한효주");
		
//	-----------------------------이밑부턴 파일에 저장을 해볼꺼야--------
		FileOutputStream fos = new FileOutputStream("d:\\doc\\a1.txt"); //직렬화기능이없어
//		-------------------------직렬화 작업 시키기위해서 밑에 명령어---
		ObjectOutputStream oos = new ObjectOutputStream(fos); //직렬화가 HashTable에 상속되어있이때문에 oos로 바로출력가능
//		----------------------------------------------------------------------------------
//		이제 내보낼꺼야
		oos.writeObject(hMap);//파일로 출력 //UPCAST
		oos.close();
		fos.close();
		
		System.out.println("파일 내보내기 성공!!");
		
//		Objectoutputstream는 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
