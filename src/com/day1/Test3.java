package com.day1;

class Test3 {

	public static void main(String[] args) {

		int r = 10;
		float area, circumference;// �Ǽ�(�Ҽ���)

		area = r * r * 3.14f;// ���� ����
		circumference = r * 2 * 3.14f;// �ѷ� circumference
		
		System.out.printf("������:%d, ����: %f\n", r, area); // %f �Ǽ��� �ִ´ٴ� �ǹ�,
														// �Ҽ����Ѿ���
		System.out.printf("������:%d, ����: %.2f\n", r, area); // %f.2 �Ǽ��� �ִµ� �Ҽ�������
															// 2�ڸ�

		System.out.println("�ѷ�:" + circumference);

		System.out.println();// ��ĭ�ٴ� ���
		// System.out.print("aa");//�ݵ�� �Ű������� �־���� ���� �Ű������� String ��(���ڰ� �ǰڽ��ϴ�)
		// System.out.print();�� ������ �ɸ� such as no args

		// %d %s %g %f ���� ���� �Ǽ� �Ǽ�

	}
}
