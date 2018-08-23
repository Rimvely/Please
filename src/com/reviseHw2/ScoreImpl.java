package com.reviseHw2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ScoreImpl implements Score {

	private List<ScoreVO> Lists = new ArrayList<ScoreVO>();
	Scanner sc = new Scanner(System.in);

	@Override
	public int input() {

		int result = 0; // needed for putting the info into Database

		ScoreVO vo = new ScoreVO();

		System.out.print("이름?");
		vo.setName(sc.next());

		System.out.print("프랑스어?");
		vo.setFrench(sc.nextInt());

		System.out.print("영어?");
		vo.setEnglish(sc.nextInt());

		System.out.print("일본어?");
		vo.setJapanese(sc.nextInt());

		Lists.add(vo);

		return 0;
	}

	@Override
	public void print() {

		Iterator<ScoreVO> it = Lists.iterator();

		System.out.printf("%4s %2s %s %4s %4s %4s\n", "이름", "프랑스어", "영어", "일본어",
				"총점", "평균");
		System.out.println("-----------------------------------------");

		while (it.hasNext()) {

			ScoreVO vo = it.next();

			System.out.println(vo.toString());

		}

	}

	@Override
	public void searchName() {
		
		String name;
		System.out.println("찾으시는 이름을입력하세요");
			name = sc.next();
		
		Iterator<ScoreVO> it = Lists.iterator();
		
		while(it.hasNext()){
			
			ScoreVO vo = it.next();
			if(vo.getName().equals(name)){
				System.out.println(name + "의 이름을 찾았습니다.");
				System.out.printf("%4s %2s %s %4s %4s %4s\n", "이름", "프랑스어", "영어", "일본어",
						"총점", "평균");
				System.out.println("-----------------------------------------");
				System.out.println(vo.toString());
				//break; 를 하지않는 이유는 동명이인이 있을수 있기때문에
			}else
				System.out.println(name + "의 이름을 찾을수 없습니다");
				break;
		}
	}
	
	@Override
	public void capabilitypersb() {

	}


	@Override
	public void descSortTot() {
		
		Comparator<ScoreVO> comp = new Comparator<ScoreVO>() {

			@Override
			public int compare(ScoreVO vo1, ScoreVO vo2) {
				return vo1.getTot() < vo2.getTot()? 1 : -1;  //내림차순 식
			}
		};
		
		Collections.sort(Lists, comp);
		
		print();
	}

	@Override
	public void ascSortTot() {
		
		Comparator<ScoreVO> comp = new Comparator<ScoreVO>() {

			@Override
			public int compare(ScoreVO vo1, ScoreVO vo2) {
				return vo1.getTot() > vo2.getTot()? 1 : -1;  //오름차순 식 부등호가 다르다.
			}
		};
		
		Collections.sort(Lists, comp);
		
		print();
	}


}
