package com.naver;

public class naverOperAuthen {

	public void inputId(String id) throws Exception {

		// 조건1 8~15자 이내의 문자열
		// 영문자 + 숫자 혼합

		System.out.println(id.length());
		if (id.length() < 8 || id.length() > 15) {
			throw new Exception("8~15 이내의 문자열을 다시 입력하세요! :" + id);

		}

		boolean flag1 = false; // 문자
		boolean flag2 = false; // 숫자

		for (int i = 0; i < id.length(); i++) {

			char c = id.charAt(i);

			// if ((c < 65 || c > 90) && (c < 97 || c > 122) && (c < 48 || c >
			// 57)) {
			// throw new Exception("영문자 및 숫자로만 만들수 있습니다.");
			// }
			//
			// }
			if ((65 <= c && c <= 90) && (97 <= c && c <= 122)) {
				flag1 = true;
			} else if (48 <= c && c < 57) {
				flag2 = true;
			} else {
				throw new Exception("영문자나,숫자만 가능합니다!");
			}
			if (flag1 == false || flag2 == false) {
				throw new Exception("영문자,숫자혼용만 가능합니다!");
			}

		}

	}
}

// int eng = 0;
// int num = 0;
//
// for(int i=0;i<str.length();i++){
// char ch = str.charAt(i);
// if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
// eng++;
// else if(ch >='0'&&ch<='9')
// num++;
// }
// if(eng==0||num==0){
// throw new Exception("영문자,숫자혼용만 가능합니다!")
//
// }

