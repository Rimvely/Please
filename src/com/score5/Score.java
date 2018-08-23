package com.score5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Score {

	private List<ScoreVO> lists = null;
	private String path = System.getProperty("user.dir");
	private File f = new File(path, "\\data\\score.txt");

	@SuppressWarnings("unchecked")
	public Score() {// 생성자 객체를 생성할때 파일을 없으면 만들고 있으면 읽어라

		try {

			if (!f.getParentFile().exists()) { // 이경로가있냐? 없으면 만들어
				f.getParentFile().mkdirs();
			}

			if (f.exists()) {// 파일있으면 읽어야지

				FileInputStream fis = new FileInputStream(f);
				ObjectInputStream ois = new ObjectInputStream(fis);

				lists = (ArrayList<ScoreVO>) ois.readObject();// 리스트에 넣어주면된다.

				fis.close();
				ois.close();
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public void writeFile() { // 파일저장

		try {

			if (lists != null) {

				FileOutputStream fos = new FileOutputStream(f);
				ObjectOutputStream oos = new ObjectOutputStream(fos);

				oos.writeObject(lists);

				fos.close();
				oos.close();
				System.out.println("파일 저장 성공!");

			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public void print() {// 출력

		Iterator<ScoreVO> it = lists.iterator();

		while (it.hasNext()) {

			ScoreVO vo = it.next();
			System.out.println(vo.toString());

		}

	}
	
	public void input(){//입력
		
		Scanner sc = new Scanner(System.in);
		
		ScoreVO vo = new ScoreVO();
		
		System.out.print("이름?");
		vo.setName(sc.next());
		
		System.out.print("생일?");
		vo.setBirth(sc.next());
		
		System.out.print("점수?");
		vo.setScore(sc.nextInt());
		
		if(lists==null)
			lists = new ArrayList<ScoreVO>();
		
		lists.add(vo);
		
		
		
	}
	
	
	
	
	
	
	
	

}
