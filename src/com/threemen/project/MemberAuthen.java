package com.threemen.project;

public class MemberAuthen {

	boolean id_check = true;

	public String inputID(String id) {

		if (id.length() < 8 || id.length() > 15) {
			return ("8~15자리 이내로  입력해주세요. " + "\n방금 적으신 아이디 : " + "[" + id + "]"
					+ " (은)는 " + id.length() + " 자리입니다.\n");
		}

		int eng = 0;
		int num = 0;

		for (int i = 0; i < id.length(); i++) {

			char ch = id.charAt(i);

			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
				eng++;
			else if (ch >= '0' && ch <= '9')
				num++;
		}

		if (eng == 0 || num == 0) {
			return ("영문자 및 숫자를 사용하여 만들어주세요.");
		}
		return null;
	}

	// --------------비밀번호체크--------------------------------
	public String inputPW(String pw) {

		if (pw.length() < 8) {
			return ("8자 이상의 비밀번호를 입력하세요! :" + "\n방금 적으신 비밀번호 : " + "[" + pw
					+ "]" + "(은)는" + "[" + pw.length() + "]" + " 자리입니다.");
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
			return ("영문자와 숫자를 사용하여 비밀번호를 만들어주세요.");
		}
		return null;
	}

	// ------------------비밀번호체크2--------------------------------
	public String checkingPW(String pw1, String pw2) {

		if (!pw1.equals(pw2) && (!(pw1 == pw2))) {
			System.out.println("비밀번호가 일치 하지않습니다. 다시 입력해주세요.\n");
		} else {
			id_check = false;
		}
		return null;
	}
}
