package com.day1;

class Test3 {

	public static void main(String[] args) {

		int r = 10;
		float area, circumference;// 실수(소수점)

		area = r * r * 3.14f;// 넓이 면적
		circumference = r * 2 * 3.14f;// 둘레 circumference
		
		System.out.printf("반지름:%d, 넓이: %f\n", r, area); // %f 실수를 넣는다는 의미,
														// 소수제한없음
		System.out.printf("반지름:%d, 넓이: %.2f\n", r, area); // %f.2 실수를 넣는데 소수제한점
															// 2자리

		System.out.println("둘레:" + circumference);

		System.out.println();// 한칸뛰는 기능
		// System.out.print("aa");//반드시 매개변수가 있어야함 보통 매개변수는 String 값(문자가 되겠습니다)
		// System.out.print();는 오류가 걸림 such as no args

		// %d %s %g %f 정수 문자 실수 실수

	}
}
