package com.score3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ScoreImpl implements Score {

	Scanner sc = new Scanner(System.in);

	// �̾ȿ� ��������? ScoreVO���¸�[���⿡����]
	private List<ScoreVO> Lists = new ArrayList<ScoreVO>(); // UPCAST   //���������� �θ��ʿ� ���

	// private ArrayList<ScoreVO> lists = new ArrayList<ScoreVO>();     //�ڽ����� �θ𲨸��Ἥ �θ𲨿� ���� �ְ� �ٽ��ڽ���
																	 	//���� �����͸� �������°�

	@Override
	public int input() {

		int result = 0; //������ ���̽��� �������ʿ��Ѱ�.

		Scanner sc = new Scanner(System.in);
		ScoreVO vo = new ScoreVO(); // String hak = sc.next(); ���ص���. ScoreVO��
									// ��������
									// ��ü�� ������༭ �Է¹����� ���� VO���� �޾ƿ´�.

		System.out.print("�й�?"); // 111
		vo.setHak(sc.next());

		System.out.print("�̸�?");
		vo.setName(sc.next());

		System.out.print("����?");
		vo.setKor(sc.nextInt());

		System.out.print("����?");
		vo.setEng(sc.nextInt());

		System.out.print("����?");
		vo.setMat(sc.nextInt());

		Lists.add(vo);

		return 0;  //���ϰ� �ǹ̰�����. ���߿� DB�� �ʿ���.
	}

	@Override
	public void print() {

		Iterator<ScoreVO> it = Lists.iterator();

		System.out.printf("%4s %4s %6s %s %s %s %s\n", "�й�", "�̸�", "����", "����",
				"����", "����", "���");
		System.out.println("-----------------------------------------");

		while (it.hasNext()) {

			ScoreVO vo = it.next();

			System.out.println(vo.toString());

		}

	}

	// �߿���
	@Override
	public void searchHak() {
		String classOf;
		System.out.print("ã����� �й��� �Է��ϼ���");
		classOf = sc.next();

		Iterator<ScoreVO> it = Lists.iterator(); // �����س���

		while (it.hasNext()) {

			ScoreVO vo = it.next(); // ���� �ִ� ���
			if (vo.getHak().equals(classOf)) {
				System.out.println(classOf + "�� �й��� ã�ҽ��ϴ�.");
				System.out.println(vo.toString());
				break;
			} else {
				System.out.println("�й��� �������� �ʽ��ϴ�.");
				break;
			}
		}

	}

	@Override
	public void searchName() {
		String nameof;
		System.out.print("ã����� �̸��� �Է��ϼ���");
		nameof = sc.next();

		Iterator<ScoreVO> it = Lists.iterator(); // �����س���

		while (it.hasNext()) {

			ScoreVO vo = it.next(); // ���� �ִ� ���
			if (vo.getName().equals(nameof)) {
				System.out.println(nameof + "�� �̸��� ã�ҽ��ϴ�.");
				System.out.println(vo.toString());
				
			} else {
				System.out.println("�̸��� �������� �ʽ��ϴ�.");
				break;
			}
		}
	}

	@Override
	public void descSortTot() {

		// ������ Ŭ����
		Comparator<ScoreVO> comp = new Comparator<ScoreVO>() {

			@Override
			public int compare(ScoreVO vo1, ScoreVO vo2) {
				return vo1.getTot() < vo2.getTot() ? 1 : -1; // �����ϴ� ��� //��������
			}
		};

		Collections.sort(Lists, comp); // ���ĸ����ذ�. �״��� ����Ʈ�ؾ���.

		print();

	}

	@Override
	public void ascSortHak() {
		
		// ������ Ŭ����
				Comparator<ScoreVO> comp = new Comparator<ScoreVO>() {

					@Override
					public int compare(ScoreVO vo1, ScoreVO vo2) {
						return vo1.getHak().compareTo(vo2.getHak()); // �����ϴ� ��� //��������
					}
				};

				Collections.sort(Lists, comp); // ���ĸ����ذ�. �״��� ����Ʈ�ؾ���.

				print();
			
	
		
		
	}

}

// --------------------------�̰Ŵ� ���ĸ����ذ�--------------------
/*
 * //������ Ŭ���� Comparator<ScoreVO> comp = new Comparator<ScoreVO>() {
 * 
 * @Override public int compare(ScoreVO o1, ScoreVO o2) { return vo1.getTot() <
 * vo2.getTot()?1:-1; //�����ϴ� ��� //�������� } };
 * 
 * Collections.sort(Lists, comp); //����
 */