package com.threemen.project;

public class MemberAuthen {

	boolean id_check = true;

	public String inputID(String id) {

		if (id.length() < 8 || id.length() > 15) {
			return ("8~15�ڸ� �̳���  �Է����ּ���. " + "\n��� ������ ���̵� : " + "[" + id + "]"
					+ " (��)�� " + id.length() + " �ڸ��Դϴ�.\n");
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
			return ("������ �� ���ڸ� ����Ͽ� ������ּ���.");
		}
		return null;
	}

	// --------------��й�ȣüũ--------------------------------
	public String inputPW(String pw) {

		if (pw.length() < 8) {
			return ("8�� �̻��� ��й�ȣ�� �Է��ϼ���! :" + "\n��� ������ ��й�ȣ : " + "[" + pw
					+ "]" + "(��)��" + "[" + pw.length() + "]" + " �ڸ��Դϴ�.");
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
				System.out.println("������ �� ���ڸ� �����մϴ�.");
			}
		}
		if (flag1 == false || flag2 == false) {
			return ("�����ڿ� ���ڸ� ����Ͽ� ��й�ȣ�� ������ּ���.");
		}
		return null;
	}

	// ------------------��й�ȣüũ2--------------------------------
	public String checkingPW(String pw1, String pw2) {

		if (!pw1.equals(pw2) && (!(pw1 == pw2))) {
			System.out.println("��й�ȣ�� ��ġ �����ʽ��ϴ�. �ٽ� �Է����ּ���.\n");
		} else {
			id_check = false;
		}
		return null;
	}
}
