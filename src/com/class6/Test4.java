package com.class6;

interface Test {

	public int total();

	public void write();

}

class TestImpl implements Test {

	private String hak, name;
	private int kor, eng;

	public TestImpl() { // �⺻������ - �⺻�����ڸ� �θ����� �������� �ʱ�ȭ�ؾ��� �޼ҵ尡�ʿ��ϴ�
						// �׷��� public void set(){} ���� �ʱ�ȭ��Ų��
	}

	public TestImpl(String hak, String name, int kor, int eng) {
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}

	public void set(String hak, String name, int kor, int eng) {
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}

	@Override
	public int total() {
		return kor + eng;
	}

	@Override
	public void write() {
		System.out.println(hak + " : " + name + " : " + total()); // �޼ҵ忡�� �޼ҵ��
																	// ȣ�Ⱑ��
																	// about
																	// total()
	}
	@Override //ob1.equals(ob2)-TestImpl
	public boolean equals(Object ob) { //UPCAST     

		boolean flag = false;

		if (ob instanceof TestImpl) {   //������ �� ���� �װ� TestImpl�̾�?  ������ �ڽ����� �ٲ��� downcast
			TestImpl t = (TestImpl) ob; //downcast

			if (this.hak.equals(t.hak) && this.name.equals(t.name)) {
				flag = true;
			}
		}
		return flag;
	}

}

public class Test4 {

	public static void main(String[] args) {
		/*
		 * �ʱ�ȭ �����ϰ��ϴ� ��� 1�� TestImpl ob = new TestImpl(); ob.set("1111", "�����",
		 * 60, 70);
		 */

		/* �ʱ�ȭ ��� 2��° */
		TestImpl ob1 = new TestImpl("1111", "�����", 60, 70);
		TestImpl ob2 = new TestImpl("1111", "�����", 100, 200);

		if (ob1.equals(ob2)) //Object equals�� �ּ����� ����?�� ���´�.
			System.out.println("ob1�� ob2�� �����ι�...");
		else
			System.out.println("ob1�� ob2�� NOT �����ι�...");

		ob1.write();
		ob2.write();
	}

}



/*@Override
public boolean equals(Object ob) {

	boolean flag = false;

	if (ob instanceof TestImpl) {
		       [t = ob]
		TestImpl t = (TestImpl) ob; //downcast
                          t = ob1.hak                  
		if (this.hak.equals(t.hak) && this.name.equals(t.name)) {
			flag = true;
		}
	}
	return flag;
}

instanceof [sth]




*/ 












