package com.class7;                      //������ Test4$1.class (����Ŭ����)
//����Ŭ����
//anonymous, �͸���,������Ŭ����



public class Test4 {
	
	public Object getTitle(){   //Object�� ���Ե�? ���� UPCAST ������?
		
		//�ڵ�
		//Object ob = new Object();   <<�̷��� ���ص� �ȴ�. ob �� ���� �׷��� �����̴�.
		return new Object(){

			@Override
			public String toString() {
				return "������ Ŭ����";
			}
			
			
			
		};   //<<     [ ; ] ������� �ȵȴ�
	}

	public static void main(String[] args) {

		Test4 ob = new Test4();
		
		System.out.println(ob.getTitle());
	}

}
