package com.score4;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ScoreImpl implements Score {

	// private Map<String, ScoreVO> hMap = new HashMap<String, ScoreVO>();
	// ������������
	// �׷��� �������ִ¾ִ� �ؿ� ����
	private Map<String, ScoreVO> hMap = new TreeMap<String, ScoreVO>();// ������������

	Scanner sc = new Scanner(System.in);
	String hak; // key��

	@Override
	public void input() {

		System.out.print("�й�?");
		hak = sc.next();

		if (searchHak(hak)) {
			System.out.println("�й��� �̹� �ֽ��ϴ�!!");
			return;
		}
		// ------------------------------------��������ϰ� �̸��� �־���ϴµ� ScoreVO�������
		// �׷��� ��ü�� �����ؾ���

		ScoreVO vo = new ScoreVO();

		System.out.print("�̸�?");
		vo.setName(sc.next());

		System.out.print("����?");
		vo.setKor(sc.nextInt());

		System.out.print("����?");
		vo.setEng(sc.nextInt());

		System.out.print("����?");
		vo.setMat(sc.nextInt());

		hMap.put(hak, vo);
		System.out.println();
		System.out.println("�߰�����!\n");

	}

	@Override
	public boolean searchHak(String hak) {

		if (hMap.containsKey(hak)) { //
			return true;
		}
		return false;

		// return hMap.containsKey(hak); ���� 3���� 1�ٷθ���¹��

	}

	@Override
	public void print() {

		Iterator<String> it = hMap.keySet().iterator();

		while (it.hasNext()) {

			String key = it.next(); // key�� �й�
			ScoreVO vo = hMap.get(key);

			System.out.println(key + " " + vo.toString());
		}
	}

	@Override
	public void delete() {

		System.out.println("����� ���� �й��� �Է��ϼ���.");
			String num = sc.next();
			
			if(!hMap.containsKey(num)){
				System.out.println("�ش��ϴ� �й��� �������� �ʽ��ϴ�.");
				return;	
			}
			
			hMap.remove(num);
			System.out.println("�й� �� ���� ���� ����!");
	
		
		
		
	}

	@Override
	public void update() { // *

		System.out.print("������ �й�?");
		hak = sc.next();

		if (!searchHak(hak)) {
			System.out.println("��������!");
			return;
		}

		ScoreVO preVO = hMap.get(hak);
		String preName = preVO.getName();

		ScoreVO vo = new ScoreVO();

		vo.setName(preName);

		System.out.print("�̸�?");
		vo.setName(sc.next());

		System.out.print("����?");
		vo.setKor(sc.nextInt());

		System.out.print("����?");
		vo.setEng(sc.nextInt());

		System.out.print("����?");
		vo.setMat(sc.nextInt());

		hMap.put(hak, vo);

		System.out.println();
		System.out.println("�߰�����!\n");

	}

	@Override
	public void findHak() {

		System.out.print("�˻��� �й��� �Է��ϼ���");
		hak = sc.next();

		if (!searchHak(hak)) {
			System.out.println("�й��� �����ϴ�!");
			return;
		}

		ScoreVO vo = hMap.get(hak);

		System.out.println(hak + " " + vo.toString());

		/*
		 * String classOf; System.out.print("�˻��� �й��� �Է��ϼ���"); classOf =
		 * sc.next();
		 * 
		 * Iterator<String> it = hMap.keySet().iterator();
		 * 
		 * while (it.hasNext()) {
		 * 
		 * String key = it.next(); ScoreVO vo = hMap.get(key); if
		 * (hMap.get(key).equals(classOf)) { System.out.println(classOf +
		 * "�� �й��� ã�ҽ��ϴ�.\n�ε���..."); System.out.println(vo.toString()); } else
		 * System.out.println("���� �й��Դϴ�.\n" + classOf + "�� ���� ������ ã���� �����ϴ�.");
		 * break;
		 * }
		 */

	}

	@Override
	public void findName() {
		
		System.out.print("�˻��� �̸��� �Է��ϼ���");
		String name = sc.next();
		
		Iterator<String> it = hMap.keySet().iterator();
		
		boolean flag = false;
		
		while(it.hasNext()){
			
			String hak = it.next();
			ScoreVO vo = hMap.get(hak);
			
//			if(vo.getName().equals(name))
			if(name.equals(vo.getName())){
				System.out.println(name + "�� �̸��� ã�ҽ��ϴ�");
//				System.out.println(hak + " " + vo.toString());
//				flag = true;
				System.out.println(vo.toString());
				flag = true;
			}
		}
		
		if(!flag){
			System.out.println("�̸��� �����ϴ�!");
		}

	}

}
