package com.naver;

public class naverOperAuthen {

	public void inputId(String id) throws Exception {

		// ����1 8~15�� �̳��� ���ڿ�
		// ������ + ���� ȥ��

		System.out.println(id.length());
		if (id.length() < 8 || id.length() > 15) {
			throw new Exception("8~15 �̳��� ���ڿ��� �ٽ� �Է��ϼ���! :" + id);

		}

		boolean flag1 = false; // ����
		boolean flag2 = false; // ����

		for (int i = 0; i < id.length(); i++) {

			char c = id.charAt(i);

			// if ((c < 65 || c > 90) && (c < 97 || c > 122) && (c < 48 || c >
			// 57)) {
			// throw new Exception("������ �� ���ڷθ� ����� �ֽ��ϴ�.");
			// }
			//
			// }
			if ((65 <= c && c <= 90) && (97 <= c && c <= 122)) {
				flag1 = true;
			} else if (48 <= c && c < 57) {
				flag2 = true;
			} else {
				throw new Exception("�����ڳ�,���ڸ� �����մϴ�!");
			}
			if (flag1 == false || flag2 == false) {
				throw new Exception("������,����ȥ�븸 �����մϴ�!");
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
// throw new Exception("������,����ȥ�븸 �����մϴ�!")
//
// }

