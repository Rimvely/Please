package com.naver;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class NaverImpl implements Naver {

	Scanner sc = new Scanner(System.in);
	// private List<NaverVO> Lists = new ArrayList<NaverVO>();
	private Map<String, NaverVO> hMap = new TreeMap<String, NaverVO>();
	naverOperAuthen auth = new naverOperAuthen();
	String id;

	@Override
	public void input() {

		try {

			System.out.print("원하는 아이디를 입력하세요. (8~15자내외,적어도숫자 1개포함)");
			id = sc.next();
			
			auth.inputId(id);	

			if (findId(id)) {
				System.out.println("그 아이디는 이미 존재합니다");
				return;
			}

			

			NaverVO vo = new NaverVO();

			System.out.print("원하시는 비밀번호를 입력하세요");
			vo.setPw1(sc.next());

			System.out.print("비밀번호를 한번 더 입력해 주세요");
			vo.setPw2(sc.next());

			// Exception2. 비밀번호가 일치하는지 일치하지않으면 다시.
			// if exception != true, 다시위로 올라가게? return vo.setPw1;

			System.out.print("성별?");
			vo.setGender(sc.next());

			System.out.print("생년월일을 *예제[19790502]*처럼 빈칸없이 적어주세요");
			vo.setBirth(sc.nextInt());
			// Exception3. 숫자이외 다른걸 입력했을시에 exception

			System.out.print("이메일을 입력하세요");
			vo.setE_mail(sc.next());

			System.out.print("전화번호를 *예제[01054687511]*처럼 빈칸없이 적어주세요");
			vo.setTel(sc.next());
			// Exception4. 캐릭터 - 넣었을시에 에러메세지

			hMap.put(id, vo);

			System.out.println();
			System.out.println("입력하신 정보들이 모두 저장 되었습니다.");

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

	@Override
	public boolean findId(String id) { // 아이디를 회원번호로 만드는것
		if (hMap.containsKey(id)) { // 같은 아이디 있을시 만들어지지않음
			return true;
		}
		return false;
	}

	@Override
	public void remove() {
	}

	@Override
	public void update() {
	}

	@Override
	public void findName() {
	}

	@Override
	public void print() {

		Iterator<String> it = hMap.keySet().iterator();

		System.out.printf("%4s %8s %4s %8s %8s %6s\n", "아이디", "비밀번호", "성별",
				"생년월일", "이메일", "전화번호");
		System.out.println("-----------------------------------------");

		while (it.hasNext()) {

			String key = it.next();
			NaverVO vo = hMap.get(key);

			System.out.println("   " + key + " " + vo.toString());

		}

	}

	@Override
	public void findId() {
	}

}
