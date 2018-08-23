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

			System.out.print("���ϴ� ���̵� �Է��ϼ���. (8~15�ڳ���,������� 1������)");
			id = sc.next();
			
			auth.inputId(id);	

			if (findId(id)) {
				System.out.println("�� ���̵�� �̹� �����մϴ�");
				return;
			}

			

			NaverVO vo = new NaverVO();

			System.out.print("���Ͻô� ��й�ȣ�� �Է��ϼ���");
			vo.setPw1(sc.next());

			System.out.print("��й�ȣ�� �ѹ� �� �Է��� �ּ���");
			vo.setPw2(sc.next());

			// Exception2. ��й�ȣ�� ��ġ�ϴ��� ��ġ���������� �ٽ�.
			// if exception != true, �ٽ����� �ö󰡰�? return vo.setPw1;

			System.out.print("����?");
			vo.setGender(sc.next());

			System.out.print("��������� *����[19790502]*ó�� ��ĭ���� �����ּ���");
			vo.setBirth(sc.nextInt());
			// Exception3. �����̿� �ٸ��� �Է������ÿ� exception

			System.out.print("�̸����� �Է��ϼ���");
			vo.setE_mail(sc.next());

			System.out.print("��ȭ��ȣ�� *����[01054687511]*ó�� ��ĭ���� �����ּ���");
			vo.setTel(sc.next());
			// Exception4. ĳ���� - �־����ÿ� �����޼���

			hMap.put(id, vo);

			System.out.println();
			System.out.println("�Է��Ͻ� �������� ��� ���� �Ǿ����ϴ�.");

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

	@Override
	public boolean findId(String id) { // ���̵� ȸ����ȣ�� ����°�
		if (hMap.containsKey(id)) { // ���� ���̵� ������ �������������
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

		System.out.printf("%4s %8s %4s %8s %8s %6s\n", "���̵�", "��й�ȣ", "����",
				"�������", "�̸���", "��ȭ��ȣ");
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
