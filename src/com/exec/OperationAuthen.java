package com.exec;

public class OperationAuthen {

	// 입력 형식 오류 검사
	public void inputForm(String str) throws MyException {

		String temp[] = str.split(",");

		if (temp.length != 2) {
			throw new MyException("숫자의 입력 형식 오류입니다! :" + str);
		}

	}

	// 입력된 값이 실수인지 정수인지 검사하는것

	@SuppressWarnings("unused") //Annotation
	public void number(String str) throws MyException {

		try {

			if (str.indexOf(".") != -1) {// .이 있지않으면                (이거 이해해라)
				double num = Double.parseDouble(str);
			} else {
				int num = Integer.parseInt(str);
			}

		} catch (Exception e) {
			throw new MyException("숫자변환 불가!:" + str);
		}

	}
	
	public void operator(char ch) throws MyException{
		
		switch(ch){
		case '+':case '-':case '*':case '/':
			return;
		default:
			throw new MyException("연산자 오류!:" + ch);
		}
	}

}
