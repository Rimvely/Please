package com.class4;

public class Test6 {

	public static void main(String[] args) {

		String s1 = "����,�λ�,�뱸";
		String[] ss = s1.split(",");
		
		for(String s : ss){      //Ȯ��for��
			System.out.println(s);
		}
		
		String s2 = "seoul";
		String s3 = "SEOUL";
		
		System.out.println(s2.equals(s3));//false
		System.out.println(s2.equalsIgnoreCase(s3));//true
		
		String s4 = "abc.def.hij";  //��Ʈ������ ���ڴ� 01234567890 �ε�����ȣ������
//		             01234567890
		System.out.println(s4.indexOf(".")); // �� ã����? .��ã����. �׷��� 3�̶�
		System.out.println(s4.lastIndexOf("."));//���������� .ã�ƶ� �׷��� 7
		System.out.println(s4.indexOf("def"));//4
		System.out.println(s4.indexOf("x"));//index of�� x�� ã�����ϴµ� ����. �׷� -1�̶�
											//������ 01234567890 �� �� ���¼���. -1�� �Ⱦ��ϱ� �̷�����.
		
		String s5 = "�츮���� ���ѹα� �������� ���ѹα�";
		String s6 = s5.replaceAll("����","����");
		System.out.println(s6);
		
		String s7 = "  a  b  c  ";
		System.out.println(s7);
		System.out.println(s7.trim());  //���ʰ����� ������
		System.out.println(s7.replaceAll("\\s", ""));//��� ������ ���ֶ�   (" " = \\s) ��ĭ����
		
		char ch = "abcdefg".charAt(2);//c  chatAt(number); number �ڸ��� 0���ͽ����ؼ� 9���� �ݺ�
		System.out.println(ch);//c
		
		System.out.println("abcdefg".startsWith("abc")); //������ �̰������ϴ��� ���ϴ��� ( �ȿ���)
		System.out.println("abcdefg".length());  //�迭�� ���� 7
		
		String s8 = "abcedfg";//101
		String s9 = "abcddfg";//100
		
		//������ �迭
		System.out.println(s8.compareTo(s9)); //1
		System.out.println(s9.compareTo(s8)); //-1
		
		
		
		
		
		
		
		
		
		
		
	}

}
