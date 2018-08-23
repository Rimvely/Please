package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.Spring;

//java.util.regex
//����ȭ ǥ����
//�ܾ�ٲٱ�, �����ּҰ˻�

/*
 c[a-z]* : c�ν����ϴ� ���ܾ�(c,ca,cbvf)
 c[a-z]  : c�ν����ϴ� �δܾ�(ca, cb, cg)
 c[a-zA-Z0-9] : ca, cA, c4
 c. : c�� �����ϴ� �α��� (ca, cB, c&)
 c.* : c�� �����ϴ� ��繮��
 c.*t : ct, chhwer56t, c7457t
 [b|c].* �Ǵ� [bc].* �Ǵ� [b-c].* : b, c, bbb, cad, b��c�θ� �����ϰ� �ƹ��ų��͵��ȴ�
 [^b|c].* �Ǵ� [^bc].* �Ǵ� [^b-c].* : b �Ǵ� c�� �������� �ʴ� ����
 .*c.* : c�� ���Ե� ���ڿ�(s45c78g)
 [\\d]+ �Ǵ� [0-9]+ : �ϳ��̻��� ����



 */

public class Test1 {

	public static void main(String[] args) {

		String[] str = { "bat", "baby", "bonus", "c", "cA", "ca", "c.", "c0",
				"car", "combat", "count", "date", "disc" };

		Pattern p;

		p = Pattern.compile("c[a-z]*");// ��������
		for (String s : str) {

			Matcher m = p.matcher(s);

			if (m.matches()) {
				System.out.println(s);
			}

		}

		System.out.println("-------------------------");

		p = Pattern.compile("c[a-z]+");
		for (String s : str) {
			Matcher m = p.matcher(s);

			if (m.matches()) {
				System.out.println(s);
			}
		}

		System.out.println("-------------------------");

		p = Pattern.compile("c.");
		for (String s : str) {
			Matcher m = p.matcher(s);

			if (m.matches()) {
				System.out.println(s);
			}
		}
		
		System.out.println("-------------------------");
		
		//����Ȯ��
		String[] mail = {"aaa@aaa.com","@aaa.co.kr",",@bbb.com","aaa@vvv.co.kr","sss.co.kr","abc@bbb"};
		
		//[\\w]+ : �ѱ��� �̻��� ��,����
		//@
		//(\\.[\\w]+) : ��ȣ�ȿ� �ִ°��� �ݵ�� �ѹ��� ���
		
		String pat = "[\\w]+@[\\w]+(\\.[\\w]+)+";
		
		for(String s : mail){
			if(Pattern.matches(pat, s))
				System.out.println(s);
		}
	}

}
