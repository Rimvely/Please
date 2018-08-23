package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.Spring;

//java.util.regex
//정규화 표현식
//단어바꾸기, 메일주소검색

/*
 c[a-z]* : c로시작하는 영단어(c,ca,cbvf)
 c[a-z]  : c로시작하는 두단어(ca, cb, cg)
 c[a-zA-Z0-9] : ca, cA, c4
 c. : c로 시작하는 두글자 (ca, cB, c&)
 c.* : c로 시작하는 모든문자
 c.*t : ct, chhwer56t, c7457t
 [b|c].* 또는 [bc].* 또는 [b-c].* : b, c, bbb, cad, b와c로만 시작하고 아무거나와도된다
 [^b|c].* 또는 [^bc].* 또는 [^b-c].* : b 또는 c로 시작하지 않는 문자
 .*c.* : c가 포함된 문자열(s45c78g)
 [\\d]+ 또는 [0-9]+ : 하나이상의 숫자



 */

public class Test1 {

	public static void main(String[] args) {

		String[] str = { "bat", "baby", "bonus", "c", "cA", "ca", "c.", "c0",
				"car", "combat", "count", "date", "disc" };

		Pattern p;

		p = Pattern.compile("c[a-z]*");// 패턴정의
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
		
		//메일확인
		String[] mail = {"aaa@aaa.com","@aaa.co.kr",",@bbb.com","aaa@vvv.co.kr","sss.co.kr","abc@bbb"};
		
		//[\\w]+ : 한글자 이상의 영,숫자
		//@
		//(\\.[\\w]+) : 괄호안에 있는것은 반드시 한번은 사용
		
		String pat = "[\\w]+@[\\w]+(\\.[\\w]+)+";
		
		for(String s : mail){
			if(Pattern.matches(pat, s))
				System.out.println(s);
		}
	}

}
