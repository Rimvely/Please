package com.stream;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

//File 클래스
//파일 및폴더를 관리할수 있도록기능을 제공해주는 클래스
//파일의 복사 또는 이름변경 등의 조작을 할경우에 사용될뿐
//파일의 내용을 입출력하기위한 메소드는 제공하지 않는다

public class Test11 {

	public static void main(String[] args) throws IOException {
		
		File f = new File("D:\\doc\\text.txt");  //내용이아니라 정보를 저장
		
		System.out.println("파일 정보 .........");
		System.out.println("파일명 : " + f.getName());
		System.out.println("파일길이 : " + f.length());
		System.out.println("파일경로 : " + f.getAbsolutePath());
		System.out.println("표준경로 : " + f.getCanonicalPath());
		System.out.println("만든날짜 : " + new Date(f.lastModified()));
		System.out.println("파일상위폴더경로: " + f.getParent());
		System.out.println("읽기속성 : " + f.canRead());
		System.out.println("쓰기속성 : " + f.canWrite());
		
		//현재 경로
		String path = System.getProperty("user.dir");
		System.out.println("현재경로 : " + path);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
