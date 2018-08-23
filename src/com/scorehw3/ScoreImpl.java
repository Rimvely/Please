package com.scorehw3;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ScoreImpl implements Score {

	private Map<Integer, ScoreVO> hMap = new TreeMap<Integer, ScoreVO>();

	Scanner sc = new Scanner(System.in);
	int number;

	@Override
	public void input() {

		System.out.println("Put your member's number in.");
		number = sc.nextInt();

		if (findNumber(number)) {
			System.out.println("the number has already existed");
			return;
		}

		ScoreVO vo = new ScoreVO();

		System.out.print("Name?");
		vo.setName(sc.next());

		System.out.print("Age?");
		vo.setAge(sc.nextInt());

		System.out.print("Gender?");
		vo.setGender(sc.next());

		System.out.print("Height?");
		vo.setHeight(sc.nextInt());

		System.out.print("Weight?");
		vo.setWeight(sc.nextInt());

		System.out.print("Address?");
		vo.setAddress(sc.next());

		System.out.print("Zip_Code?");
		vo.setZip_Code(sc.next());

		hMap.put(number, vo);

		System.out.println();
		System.out.println("the information has saved\n");

	}

	@Override
	public boolean findNumber(int number) {
		if (hMap.containsKey(number)) { //
			return true;
		}
		return false;

		// return hMap.containsKey(hak); 위에 3줄을 1줄로만드는방법

	}

	@Override
	public void print() {

		Iterator<Integer> it = hMap.keySet().iterator();

		System.out.printf("%4s %4s %4s %4s %4s %6s %8s %8s\n", "회원번호", "이름",
				"나이", "성별", "신장", "몸무게", "주소", "집코드");
		System.out.println("-----------------------------------------");

		while (it.hasNext()) {

			int key = it.next();
			ScoreVO vo = hMap.get(key);

			System.out.println("   " + key + " " + vo.toString());

		}

	}

	@Override
	public void remove() {

		System.out.print("삭제하고 싶은 회원번호를 입력하세요");
		number = sc.nextInt();

		if (!hMap.containsKey(number)) {
			System.out.println("해당하는 회원코드는 존재하지 않습니다.");
			return;
		}

		hMap.remove(number);
		System.out.println("해당하는 회원번호 및 정보가 삭제되었습니다.");

	}

	@Override
	public void update() {

		System.out.print("수정할 회원 번호를 입력하세요");
		number = sc.nextInt();

		if (!findNumber(number)) {
			System.out.println("수정실패하였습니다");
			return;
		}

		ScoreVO preVO = hMap.get(number);
		String preName = preVO.getName();

		ScoreVO vo = new ScoreVO();

		vo.setName(preName);

		System.out.print("이름?");
		vo.setName(sc.next());

		System.out.print("나이?");
		vo.setAge(sc.nextInt());

		System.out.print("성별?");
		vo.setName(sc.next());

		System.out.print("신장?");
		vo.setHeight(sc.nextInt());

		System.out.print("몸무게?");
		vo.setWeight(sc.nextInt());

		System.out.print("주소?");
		vo.setAddress(sc.next());

		System.out.print("집코드?");
		vo.setZip_Code(sc.next());

		hMap.put(number, vo);

		System.out.println();
		System.out.println("수정되었습니다!\n");

	}

	@Override
	public void findNumber() {

		System.out.print("검색할 회원번호를 입력하세요");
		number = sc.nextInt();

		if (!findNumber(number)) {
			System.out.println("회원번호가 없습니다!");
			return;
		}

		ScoreVO vo = hMap.get(number);

		System.out.println(number + " " + vo.toString());
	}

	@Override
	public void findName() {

		System.out.print("검색할 이름을 입력하세요");
		String name = sc.next();

		Iterator<Integer> it = hMap.keySet().iterator();

		boolean flag = false;

		while (it.hasNext()) {

			int number = it.next();
			ScoreVO vo = hMap.get(number);

			if (name.equals(vo.getName())) {
				System.out.println(name + " 의 이름을 찾았습니다");
				System.out.println(vo.toString());
				flag = true;

			}
		}

		if (!flag) {
			System.out.println("이름이 없습니다!");
		}

	}

}
