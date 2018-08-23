package com.score4;

import java.util.Scanner;

public class ScoreMain {

	public static void main(String[] args) {

		// 인터페이스를 부모로해서 만들어준것
		// 이건 한번만 나오니까 반복문을 만들어서 계속 물어보게 할꺼야
		// Score ob = new ScoreImpl();
		//
		// ob.input();
		// ob.print();

		Scanner sc = new Scanner(System.in);
		Score ob = new ScoreImpl();


		int ch;

		while (true) {

			do {
				System.out.print("1.입력\n2.출력\n3.삭제\n4.수정\n5.학번검색\n6.이름검색\n7.종료: ");
				ch = sc.nextInt();
			} while (ch < 1);

			switch (ch) {

			case 1:
				ob.input();
				break;
			case 2:
				ob.print();
				break;
			case 3:
				ob.delete();
				break;
			case 4:
				ob.update();
				break;
			case 5:
				ob.findHak();
				break;
			case 6:
				ob.findName();
				break;
			default:
				System.out.println("종료합니다..");
				System.exit(0); // exit(0)
			}

		}

	}

}

// Score ob = new ScoreImpl();
// 인터페이스를

// ScoreImpl의 input and print 호출해야해
//
// Score 부모를 생성 ScoreImpl 자식이된것.
//
// ScoreImpl ob = new ScoreImpl();
//

