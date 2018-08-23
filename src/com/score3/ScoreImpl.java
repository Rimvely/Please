package com.score3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ScoreImpl implements Score {

	Scanner sc = new Scanner(System.in);

	// 이안에 뭐만들어간다? ScoreVO형태만[여기에서는]
	private List<ScoreVO> Lists = new ArrayList<ScoreVO>(); // UPCAST   //직접적으로 부모쪽에 명령

	// private ArrayList<ScoreVO> lists = new ArrayList<ScoreVO>();     //자식쪽이 부모꺼를써서 부모꺼에 값을 넣고 다시자식이
																	 	//받은 데이터를 가져오는것

	@Override
	public int input() {

		int result = 0; //데이터 베이스에 넣을때필요한것.

		Scanner sc = new Scanner(System.in);
		ScoreVO vo = new ScoreVO(); // String hak = sc.next(); 안해도됨. ScoreVO를
									// 만들어놔서
									// 객체를 만들어줘서 입력받을때 마다 VO에서 받아온다.

		System.out.print("학번?"); // 111
		vo.setHak(sc.next());

		System.out.print("이름?");
		vo.setName(sc.next());

		System.out.print("국어?");
		vo.setKor(sc.nextInt());

		System.out.print("영어?");
		vo.setEng(sc.nextInt());

		System.out.print("수학?");
		vo.setMat(sc.nextInt());

		Lists.add(vo);

		return 0;  //리턴값 의미가없음. 나중에 DB에 필요함.
	}

	@Override
	public void print() {

		Iterator<ScoreVO> it = Lists.iterator();

		System.out.printf("%4s %4s %6s %s %s %s %s\n", "학번", "이름", "국어", "영어",
				"수학", "총점", "평균");
		System.out.println("-----------------------------------------");

		while (it.hasNext()) {

			ScoreVO vo = it.next();

			System.out.println(vo.toString());

		}

	}

	// 중요해
	@Override
	public void searchHak() {
		String classOf;
		System.out.print("찾고싶은 학번을 입력하세요");
		classOf = sc.next();

		Iterator<ScoreVO> it = Lists.iterator(); // 복사해놓고

		while (it.hasNext()) {

			ScoreVO vo = it.next(); // 값을 넣는 방법
			if (vo.getHak().equals(classOf)) {
				System.out.println(classOf + "의 학번을 찾았습니다.");
				System.out.println(vo.toString());
				break;
			} else {
				System.out.println("학번이 존재하지 않습니다.");
				break;
			}
		}

	}

	@Override
	public void searchName() {
		String nameof;
		System.out.print("찾고싶은 이름을 입력하세요");
		nameof = sc.next();

		Iterator<ScoreVO> it = Lists.iterator(); // 복사해놓고

		while (it.hasNext()) {

			ScoreVO vo = it.next(); // 값을 넣는 방법
			if (vo.getName().equals(nameof)) {
				System.out.println(nameof + "의 이름을 찾았습니다.");
				System.out.println(vo.toString());
				
			} else {
				System.out.println("이름이 존재하지 않습니다.");
				break;
			}
		}
	}

	@Override
	public void descSortTot() {

		// 무명의 클래스
		Comparator<ScoreVO> comp = new Comparator<ScoreVO>() {

			@Override
			public int compare(ScoreVO vo1, ScoreVO vo2) {
				return vo1.getTot() < vo2.getTot() ? 1 : -1; // 정렬하는 방법 //내림차순
			}
		};

		Collections.sort(Lists, comp); // 정렬만해준것. 그다음 프린트해야지.

		print();

	}

	@Override
	public void ascSortHak() {
		
		// 무명의 클래스
				Comparator<ScoreVO> comp = new Comparator<ScoreVO>() {

					@Override
					public int compare(ScoreVO vo1, ScoreVO vo2) {
						return vo1.getHak().compareTo(vo2.getHak()); // 정렬하는 방법 //내림차순
					}
				};

				Collections.sort(Lists, comp); // 정렬만해준것. 그다음 프린트해야지.

				print();
			
	
		
		
	}

}

// --------------------------이거는 정렬만해준것--------------------
/*
 * //무명의 클래스 Comparator<ScoreVO> comp = new Comparator<ScoreVO>() {
 * 
 * @Override public int compare(ScoreVO o1, ScoreVO o2) { return vo1.getTot() <
 * vo2.getTot()?1:-1; //정렬하는 방법 //내림차순 } };
 * 
 * Collections.sort(Lists, comp); //정렬
 */