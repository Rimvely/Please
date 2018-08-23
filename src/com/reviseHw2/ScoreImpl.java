package com.reviseHw2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ScoreImpl implements Score {

	private List<ScoreVO> Lists = new ArrayList<ScoreVO>();
	Scanner sc = new Scanner(System.in);

	@Override
	public int input() {

		int result = 0; // needed for putting the info into Database

		ScoreVO vo = new ScoreVO();

		System.out.print("�̸�?");
		vo.setName(sc.next());

		System.out.print("��������?");
		vo.setFrench(sc.nextInt());

		System.out.print("����?");
		vo.setEnglish(sc.nextInt());

		System.out.print("�Ϻ���?");
		vo.setJapanese(sc.nextInt());

		Lists.add(vo);

		return 0;
	}

	@Override
	public void print() {

		Iterator<ScoreVO> it = Lists.iterator();

		System.out.printf("%4s %2s %s %4s %4s %4s\n", "�̸�", "��������", "����", "�Ϻ���",
				"����", "���");
		System.out.println("-----------------------------------------");

		while (it.hasNext()) {

			ScoreVO vo = it.next();

			System.out.println(vo.toString());

		}

	}

	@Override
	public void searchName() {
		
		String name;
		System.out.println("ã���ô� �̸����Է��ϼ���");
			name = sc.next();
		
		Iterator<ScoreVO> it = Lists.iterator();
		
		while(it.hasNext()){
			
			ScoreVO vo = it.next();
			if(vo.getName().equals(name)){
				System.out.println(name + "�� �̸��� ã�ҽ��ϴ�.");
				System.out.printf("%4s %2s %s %4s %4s %4s\n", "�̸�", "��������", "����", "�Ϻ���",
						"����", "���");
				System.out.println("-----------------------------------------");
				System.out.println(vo.toString());
				//break; �� �����ʴ� ������ ���������� ������ �ֱ⶧����
			}else
				System.out.println(name + "�� �̸��� ã���� �����ϴ�");
				break;
		}
	}
	
	@Override
	public void capabilitypersb() {

	}


	@Override
	public void descSortTot() {
		
		Comparator<ScoreVO> comp = new Comparator<ScoreVO>() {

			@Override
			public int compare(ScoreVO vo1, ScoreVO vo2) {
				return vo1.getTot() < vo2.getTot()? 1 : -1;  //�������� ��
			}
		};
		
		Collections.sort(Lists, comp);
		
		print();
	}

	@Override
	public void ascSortTot() {
		
		Comparator<ScoreVO> comp = new Comparator<ScoreVO>() {

			@Override
			public int compare(ScoreVO vo1, ScoreVO vo2) {
				return vo1.getTot() > vo2.getTot()? 1 : -1;  //�������� �� �ε�ȣ�� �ٸ���.
			}
		};
		
		Collections.sort(Lists, comp);
		
		print();
	}


}
