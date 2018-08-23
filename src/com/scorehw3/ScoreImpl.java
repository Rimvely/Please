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

		// return hMap.containsKey(hak); ���� 3���� 1�ٷθ���¹��

	}

	@Override
	public void print() {

		Iterator<Integer> it = hMap.keySet().iterator();

		System.out.printf("%4s %4s %4s %4s %4s %6s %8s %8s\n", "ȸ����ȣ", "�̸�",
				"����", "����", "����", "������", "�ּ�", "���ڵ�");
		System.out.println("-----------------------------------------");

		while (it.hasNext()) {

			int key = it.next();
			ScoreVO vo = hMap.get(key);

			System.out.println("   " + key + " " + vo.toString());

		}

	}

	@Override
	public void remove() {

		System.out.print("�����ϰ� ���� ȸ����ȣ�� �Է��ϼ���");
		number = sc.nextInt();

		if (!hMap.containsKey(number)) {
			System.out.println("�ش��ϴ� ȸ���ڵ�� �������� �ʽ��ϴ�.");
			return;
		}

		hMap.remove(number);
		System.out.println("�ش��ϴ� ȸ����ȣ �� ������ �����Ǿ����ϴ�.");

	}

	@Override
	public void update() {

		System.out.print("������ ȸ�� ��ȣ�� �Է��ϼ���");
		number = sc.nextInt();

		if (!findNumber(number)) {
			System.out.println("���������Ͽ����ϴ�");
			return;
		}

		ScoreVO preVO = hMap.get(number);
		String preName = preVO.getName();

		ScoreVO vo = new ScoreVO();

		vo.setName(preName);

		System.out.print("�̸�?");
		vo.setName(sc.next());

		System.out.print("����?");
		vo.setAge(sc.nextInt());

		System.out.print("����?");
		vo.setName(sc.next());

		System.out.print("����?");
		vo.setHeight(sc.nextInt());

		System.out.print("������?");
		vo.setWeight(sc.nextInt());

		System.out.print("�ּ�?");
		vo.setAddress(sc.next());

		System.out.print("���ڵ�?");
		vo.setZip_Code(sc.next());

		hMap.put(number, vo);

		System.out.println();
		System.out.println("�����Ǿ����ϴ�!\n");

	}

	@Override
	public void findNumber() {

		System.out.print("�˻��� ȸ����ȣ�� �Է��ϼ���");
		number = sc.nextInt();

		if (!findNumber(number)) {
			System.out.println("ȸ����ȣ�� �����ϴ�!");
			return;
		}

		ScoreVO vo = hMap.get(number);

		System.out.println(number + " " + vo.toString());
	}

	@Override
	public void findName() {

		System.out.print("�˻��� �̸��� �Է��ϼ���");
		String name = sc.next();

		Iterator<Integer> it = hMap.keySet().iterator();

		boolean flag = false;

		while (it.hasNext()) {

			int number = it.next();
			ScoreVO vo = hMap.get(number);

			if (name.equals(vo.getName())) {
				System.out.println(name + " �� �̸��� ã�ҽ��ϴ�");
				System.out.println(vo.toString());
				flag = true;

			}
		}

		if (!flag) {
			System.out.println("�̸��� �����ϴ�!");
		}

	}

}
