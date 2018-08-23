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
				System.out.println("���Ϻҷ����⼺��!");
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

	// --------------��й�ȣüũ--------------------------------
	public void inputPW(String pw) {

		if (pw.length() < 8) {
			System.out.println("8�� �̻��� ��й�ȣ�� �Է��ϼ���! :" + "\n��� ������ ��й�ȣ : "
					+ "[" + pw + "]" + "(��)��" + "[" + pw.length() + "]"
					+ " �ڸ��Դϴ�.");
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
			System.out.println("�����ڿ� ���ڸ� ����Ͽ� ��й�ȣ�� ������ּ���.");
		}
	}

	// ------------------��й�ȣüũ2--------------------------------
	public void checkingPW(String pw1, String pw2) {
		if (!pw1.equals(pw2) && (!(pw1 == pw2))) {
			System.out.println("��й�ȣ�� ��ġ �����ʽ��ϴ�. �ٽ� �Է����ּ���.\n");
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
					.print("���Ͻô� ID�� �Է��ϼ���.\n*���ڸ� 1���̻� ������ 8~15�ڸ��� �Է����ּ���*\n");
			id = sc.next();

			auth.inputID(id);

			if (findId(id)) {
				System.out.println("�Է��Ͻ� ���̵� : " + "[" + id + "]"
						+ " (��)�� �̹� �����մϴ�. �ٽ� �Է����ּ���.");
				return;
			}

			vo.setId(id);

			// --------------------------------------------------------
			while (true) {

				do {
					flag = true;
					System.out
							.print("���Ͻô� PASSWORD�� �Է��ϼ���.\n*���ڸ� 1���̻� ������ 8�̻��� �Է����ּ���*\n");
					pw1 = sc.next();

					if (pw1.equals(vo.getId())) {
						System.out
								.println("���̵�� ������ ��й�ȣ�� �Է��� �� �����ϴ�. �ٽ� �Է����ּ���.\n");
						continue;
					}

					inputPW(pw1);

					System.out.print("��й�ȣ�� �ѹ� �� �Է����ּ���.\n");
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

					System.out.println("�̸��� �Է��ϼ���.");
					name = sc.next();

					System.out.print("�Է��Ͻ� �̸��� �½��ϱ�? ex)[Y/N,y/n]");
					check = sc.next();
					ch = check.charAt(0);

					if (ch == 'y' || ch == 'Y') {
						vo.setName(name);
						flag = false;
					} else if (ch == 'n' || ch == 'N') {
						flag = true;
					} else {
						System.out
								.printf("�߸� �Է��ϼ̽��ϴ�. [Y/N] or [y/n]�� �Է� �����մϴ�.\n");
						flag = true;
					}

				} while (flag);

				break;

			}

			while (true) {

				do {
					flag = true;

					System.out.println("��ȭ��ȣ�� �Է��ϼ���.");
					tel = sc.next();

					System.out.print("�Է��Ͻ� ��ȭ��ȣ�� �½��ϱ�? ex)[Y/N,y/n]");
					check = sc.next();
					ch = check.charAt(0);

					if (ch == 'y' || ch == 'Y') {
						vo.setTel(tel);
						flag = false;
					} else if (ch == 'n' || ch == 'N') {
						flag = true;
					} else {
						System.out
								.printf("�߸� �Է��ϼ̽��ϴ�. [Y/N] or [y/n]�� �Է� �����մϴ�.\n");
						flag = true;
					}

				} while (flag);

				break;
			}

			while (true) {

				do {
					flag = true;

					System.out.println("�ּҸ��� �Է��ϼ���.");
					address = br.readLine();

					System.out.print("�Է��Ͻ� �ּҰ� �½��ϱ�? ex)[Y/N,y/n]");
					check = sc.next();
					ch = check.charAt(0);

					if (ch == 'y' || ch == 'Y') {
						vo.setAddress(address);
						flag = false;
					} else if (ch == 'n' || ch == 'N') {
						flag = true;
					} else {
						System.out
								.printf("�߸� �Է��ϼ̽��ϴ�. [Y/N] or [y/n]�� �Է� �����մϴ�.\n");
						flag = true;
					}

				} while (flag);

				break;

			}

			lists.add(vo);

			System.out.println();
			System.out.println("���ϵ帳�ϴ�! ȸ�������� �Ϸ�Ǿ����ϴ�.");
			// -------------------------[[�ڵ�����]]--------------------
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(lists);

			fos.close();
			oos.close();
			// -------------------------[[���强������Ʈ]]-------------------
			System.out.println("���� ���� ���� Ȯ������Ʈ");

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

	public void printMemberInfo() {
		String id;

		System.out.print("�˻��ϰ� ���� ȸ�� ID�� �Է��ϼ��� : ");
		id = sc.next();

		Iterator<MemberVO> it = lists.iterator();

		while (it.hasNext()) {

			MemberVO vo = it.next();
			if (vo.getId().equals(id)) {
				System.out.println(id + "���� ȸ�������� ã�ҽ��ϴ�.\n\n");
				System.out
						.println("======================================================================================================================");
				System.out
						.println("||    Name    ||     Phone Number    ||                  Address                  ||     Status of Renting Book     ||");
				System.out
						.println("======================================================================================================================");
				System.out.println(vo.toString() + "\n\n");
			} else {
				System.out.println(id + "�� ���� ȸ�������� �����ϴ�.\n\n");
				break;
			}
		}
	}

	public void logIn() {
		String id;
		String pw;

		System.out.print("���̵� �Է��� �ּ��� : ");
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
			System.out.print("��й�ȣ�� �Է��� �ּ��� : ");
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
