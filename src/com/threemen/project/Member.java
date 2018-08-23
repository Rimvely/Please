package com.threemen.project;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Member {

	private List<MemberVO> lists = new ArrayList<MemberVO>();
	private String path = System.getProperty("user.dir");
	private File f = new File(path, "\\data\\memberInfoList.txt");
	MemberAuthen auth = new MemberAuthen();
	Scanner sc = new Scanner(System.in);
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	boolean flag = true;

	@SuppressWarnings("unchecked")
	public Member() {

		try {

			if (!f.getParentFile().exists()) {
				f.getParentFile().mkdirs();
			}

			if (f.exists()) {

				FileInputStream fis = new FileInputStream(f);
				ObjectInputStream ois = new ObjectInputStream(fis);

				lists = (ArrayList<MemberVO>) ois.readObject();

				fis.close();
				ois.close();
				System.out.println("파일불러오기성공!");
			}

		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	public boolean findId(String id) {

		// if (lists == null) {
		// return false;
		// }

		// if (lists.contains(id)) {
		// return true;
		// }
		// return false;

		Iterator<MemberVO> it = lists.iterator();

		while (it.hasNext()) {
			MemberVO vo = it.next();
			if (id.equals(vo.getId())) {
				return true;
			}
		}
		return false;

	}

	// --------------비밀번호체크--------------------------------
	public void inputPW(String pw) {

		if (pw.length() < 8) {
			System.out.println("8자 이상의 비밀번호를 입력하세요! :" + "\n방금 적으신 비밀번호 : "
					+ "[" + pw + "]" + "(은)는" + "[" + pw.length() + "]"
					+ " 자리입니다.");
		}

		boolean flag1 = false;
		boolean flag2 = false;

		for (int i = 0; i < pw.length(); i++) {

			char c = pw.charAt(i);

			if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
				flag1 = true;
			} else if (c >= '0' && c <= '9') {
				flag2 = true;
			} else {
				System.out.println("영문자 및 숫자만 가능합니다.");
			}
		}
		if (flag1 == false || flag2 == false) {
			System.out.println("영문자와 숫자를 사용하여 비밀번호를 만들어주세요.");
		}
	}

	// ------------------비밀번호체크2--------------------------------
	public void checkingPW(String pw1, String pw2) {
		if (!pw1.equals(pw2) && (!(pw1 == pw2))) {
			System.out.println("비밀번호가 일치 하지않습니다. 다시 입력해주세요.\n");
		} else
			flag = false;
	}

	public void signup() {

		MemberVO vo = new MemberVO();
		String id;
		String pw1;
		String pw2;
		String name;
		String check;
		String tel;
		String address;
		char ch;

		try {

			System.out
					.print("원하시는 ID를 입력하세요.\n*숫자를 1개이상 포함한 8~15자리를 입력해주세요*\n");
			id = sc.next();

			auth.inputID(id);

			if (findId(id)) {
				System.out.println("입력하신 아이디 : " + "[" + id + "]"
						+ " (은)는 이미 존재합니다. 다시 입력해주세요.");
				return;
			}

			vo.setId(id);

			// --------------------------------------------------------
			while (true) {

				do {
					flag = true;
					System.out
							.print("원하시는 PASSWORD를 입력하세요.\n*숫자를 1개이상 포함한 8이상을 입력해주세요*\n");
					pw1 = sc.next();

					if (pw1.equals(vo.getId())) {
						System.out
								.println("아이디와 동일한 비밀번호를 입력할 수 없습니다. 다시 입력해주세요.\n");
						continue;
					}

					inputPW(pw1);

					System.out.print("비밀번호를 한번 더 입력해주세요.\n");
					pw2 = sc.next();

					inputPW(pw2);
					checkingPW(pw1, pw2);

				} while (flag);
				break;
			}
			vo.setPw(pw1);

			// -----------------------------------------------------
			while (true) {

				do {
					flag = true;

					System.out.println("이름을 입력하세요.");
					name = sc.next();

					System.out.print("입력하신 이름이 맞습니까? ex)[Y/N,y/n]");
					check = sc.next();
					ch = check.charAt(0);

					if (ch == 'y' || ch == 'Y') {
						vo.setName(name);
						flag = false;
					} else if (ch == 'n' || ch == 'N') {
						flag = true;
					} else {
						System.out
								.printf("잘못 입력하셨습니다. [Y/N] or [y/n]만 입력 가능합니다.\n");
						flag = true;
					}

				} while (flag);

				break;

			}

			while (true) {

				do {
					flag = true;

					System.out.println("전화번호를 입력하세요.");
					tel = sc.next();

					System.out.print("입력하신 전화번호가 맞습니까? ex)[Y/N,y/n]");
					check = sc.next();
					ch = check.charAt(0);

					if (ch == 'y' || ch == 'Y') {
						vo.setTel(tel);
						flag = false;
					} else if (ch == 'n' || ch == 'N') {
						flag = true;
					} else {
						System.out
								.printf("잘못 입력하셨습니다. [Y/N] or [y/n]만 입력 가능합니다.\n");
						flag = true;
					}

				} while (flag);

				break;
			}

			while (true) {

				do {
					flag = true;

					System.out.println("주소를를 입력하세요.");
					address = br.readLine();

					System.out.print("입력하신 주소가 맞습니까? ex)[Y/N,y/n]");
					check = sc.next();
					ch = check.charAt(0);

					if (ch == 'y' || ch == 'Y') {
						vo.setAddress(address);
						flag = false;
					} else if (ch == 'n' || ch == 'N') {
						flag = true;
					} else {
						System.out
								.printf("잘못 입력하셨습니다. [Y/N] or [y/n]만 입력 가능합니다.\n");
						flag = true;
					}

				} while (flag);

				break;

			}

			lists.add(vo);

			System.out.println();
			System.out.println("축하드립니다! 회원가입이 완료되었습니다.");
			// -------------------------[[자동저장]]--------------------
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(lists);

			fos.close();
			oos.close();
			// -------------------------[[저장성공프린트]]-------------------
			System.out.println("파일 저장 성공 확인프린트");

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

	public void printMemberInfo() {
		String id;

		System.out.print("검색하고 싶은 회원 ID를 입력하세요 : ");
		id = sc.next();

		Iterator<MemberVO> it = lists.iterator();

		while (it.hasNext()) {

			MemberVO vo = it.next();
			if (vo.getId().equals(id)) {
				System.out.println(id + "님의 회원정보를 찾았습니다.\n\n");
				System.out
						.println("======================================================================================================================");
				System.out
						.println("||    Name    ||     Phone Number    ||                  Address                  ||     Status of Renting Book     ||");
				System.out
						.println("======================================================================================================================");
				System.out.println(vo.toString() + "\n\n");
			} else {
				System.out.println(id + "에 대한 회원정보가 없습니다.\n\n");
				break;
			}
		}
	}

	public void logIn() {
		String id;
		String pw;

		System.out.print("아이디를 입력해 주세요 : ");
		id = sc.next();

		Iterator<MemberVO> it1 = lists.iterator();

		boolean flag = false;

		while (it1.hasNext()) {
			MemberVO vo = it1.next();
			if (id.equals(vo.getId())) {
				flag = true;
			}
		}

		if (flag == true) {
			System.out.print("비밀번호를 입력해 주세요 : ");
			pw = sc.next();

			Iterator<MemberVO> it2 = lists.iterator();

			while (it2.hasNext()) {

				MemberVO vo = it2.next();

				if (pw.equals(vo.getPw()))
					;

			}

		}
	}
}
