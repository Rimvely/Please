package com.stream;

import java.io.File;
import java.io.FileFilter;

//FileFilter 인터페이스
//File클래스의 listFile 메소드로 리턴받을 대상을
//지정할수 있는 필터 인터페이스로 대상은 accept로 지정한다

class MyFileList implements FileFilter {

	public File f; //경로를 filePath를 만들어서 filePath 및 f로 객체를 생성했다

	public MyFileList(String filePath) { // 생성자한테 매개변수를 주고 객체생성
											// 의존성 주입(DI) D.injection
		f = new File(filePath);
	}

	public void result(){
		
		try {
			
			if(!f.exists()){
				System.out.println("파일이 존재하지 않습니다!");
				return;
			}
			
			System.out.println("절대경로 : " + f.getAbsolutePath());
			System.out.println("파일크기 : " + 
			f.length());
			
			//폴더인경우
			if(f.isDirectory()){
				
				//accept메소드에서 FileFilter인터페이스로
				//리턴할 대상을 지정
				File[] lists = f.listFiles(this); //여기 this는 override's return 값
				
				System.out.println("\n폴더의 내용...");
				for(int i = 0; i<lists.length; i++){
					System.out.println(lists[i].getName());
					System.out.println("\t" + lists[i].length());
				}
			}
			
			System.out.println("\n디렉토리 구조...");
			File[] root = File.listRoots();
			for(int i = 0; i<root.length;i++){
				System.out.println(root[i].getPath());
			}
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	@Override
	public boolean accept(File pathname) {
		return pathname.isFile() || pathname.isDirectory(); // file과 폴더의 관한 정보를
															// 반환하라
	}

}

public class Test13 {

	public static void main(String[] args) {     //드라이버 내용을 볼수있는 게 FileFilter

		MyFileList mf = new MyFileList("d:\\");  //보고싶은 장소를 지정하면 보임
		mf.result();      
		
		//cmd - > dir d: 하면 위에 명령어대로 다 볼수있다.
		
	}
}
