package com.score4;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ScoreImpl implements Score {

	// private Map<String, ScoreVO> hMap = new HashMap<String, ScoreVO>();
	// 정렬을안해줘
	// 그래서 정렬해주는애는 밑에 문장
	private Map<String, ScoreVO> hMap = new TreeMap<String, ScoreVO>();// 오름차순정렬

	Scanner sc = new Scanner(System.in);
	String hak; // key값

	@Override
	public void input() {

		System.out.print("학번?");
		hak = sc.next();

		if (searchHak(hak)) {
			System.out.println("학번이 이미 있습니다!!");
			return;
		}
		// ------------------------------------여기까지하고 이름을 넣어야하는데 ScoreVO를써야해
		// 그래서 객체를 생성해야지

		ScoreVO vo = new ScoreVO();

		System.out.print("이름?");
		vo.setName(sc.next());

		System.out.print("국어?");
		vo.setKor(sc.nextInt());

		System.out.print("영어?");
		vo.setEng(sc.nextInt());

		System.out.print("수학?");
		vo.setMat(sc.nextInt());

		hMap.put(hak, vo);
		System.out.println();
		System.out.println("추가성공!\n");

	}

	@Override
	public boolean searchHak(String hak) {

		if (hMap.containsKey(hak)) { //
			return true;
		}
		return false;

		// return hMap.containsKey(hak); 위에 3줄을 1줄로만드는방법

	}

	@Override
	public void print() {

		Iterator<String> it = hMap.keySet().iterator();

		while (it.hasNext()) {

			String key = it.next(); // key는 학번
			ScoreVO vo = hMap.get(key);

			System.out.println(key + " " + vo.toString());
		}
	}

	@Override
	public void delete() {

		System.out.println("지우고 싶은 학번을 입력하세요.");
			String num = sc.next();
			
			if(!hMap.containsKey(num)){
				System.out.println("해당하는 학번이 존재하지 않습니다.");
				return;	
			}
			
			hMap.remove(num);
			System.out.println("학번 및 정보 삭제 성공!");
	
		
		
		
	}

	@Override
	public void update() { // *

		System.out.print("수정할 학번?");
		hak = sc.next();

		if (!searchHak(hak)) {
			System.out.println("수정실패!");
			return;
		}

		ScoreVO preVO = hMap.get(hak);
		String preName = preVO.getName();

		ScoreVO vo = new ScoreVO();

		vo.setName(preName);

		System.out.print("이름?");
		vo.setName(sc.next());

		System.out.print("국어?");
		vo.setKor(sc.nextInt());

		System.out.print("영어?");
		vo.setEng(sc.nextInt());

		System.out.print("수학?");
		vo.setMat(sc.nextInt());

		hMap.put(hak, vo);

		System.out.println();
		System.out.println("추가성공!\n");

	}

	@Override
	public void findHak() {

		System.out.print("검색할 학번을 입력하세요");
		hak = sc.next();

		if (!searchHak(hak)) {
			System.out.println("학번이 없습니다!");
			return;
		}

		ScoreVO vo = hMap.get(hak);

		System.out.println(hak + " " + vo.toString());

		/*
		 * String classOf; System.out.print("검색할 학번을 입력하세요"); classOf =
		 * sc.next();
		 * 
		 * Iterator<String> it = hMap.keySet().iterator();
		 * 
		 * while (it.hasNext()) {
		 * 
		 * String key = it.next(); ScoreVO vo = hMap.get(key); if
		 * (hMap.get(key).equals(classOf)) { System.out.println(classOf +
		 * "의 학번을 찾았습니다.\n로딩중..."); System.out.println(vo.toString()); } else
		 * System.out.println("없는 학번입니다.\n" + classOf + "의 대한 내용을 찾을수 없습니다.");
		 * break;
		 * }
		 */

	}

	@Override
	public void findName() {
		
		System.out.print("검색할 이름을 입력하세요");
		String name = sc.next();
		
		Iterator<String> it = hMap.keySet().iterator();
		
		boolean flag = false;
		
		while(it.hasNext()){
			
			String hak = it.next();
			ScoreVO vo = hMap.get(hak);
			
//			if(vo.getName().equals(name))
			if(name.equals(vo.getName())){
				System.out.println(name + "의 이름을 찾았습니다");
//				System.out.println(hak + " " + vo.toString());
//				flag = true;
				System.out.println(vo.toString());
				flag = true;
			}
		}
		
		if(!flag){
			System.out.println("이름이 없습니다!");
		}

	}

}
