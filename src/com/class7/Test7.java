package com.class7;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class Test7 {

	private static final String city[] = { "서울", "부산", "대구", "인천", "광주", "대전",
			"울산" };

	public static void main(String[] args) {

		Vector<String> v = new Vector<String>();
		String str;

		System.out.println("벡터의 초기용량: " + v.capacity());
		
		for (String c : city) {
			v.add(c);
		}

		System.out.println("[Iterator를 사용한 전체출력...]");

		Iterator<String> it = v.iterator();
		while (it.hasNext()) {

			str = it.next();
			System.out.println(str + " ");
		}
		System.out.println();

		System.out.println("데이터(요소) 갯수: " + v.size());

		// 데이터 변경하기
		v.set(0, "Seoul"); // index 번호로 몇번째에 element 어디요소에
		v.set(1, "Pusan");

		System.out.println("[전체출력...]");
		for (String s : v) {
			System.out.println(s + " ");
		}
		System.out.println();

		// 끼워넣기
		v.insertElementAt("대한민국", 0);
		for (String s : v) {
			System.out.println(s + " ");
		}
		System.out.println();

		// 검색
		int index = v.indexOf("대구");
		if (index != -1) {  //indexof 에서 없는 부분이 -1 인것.
			System.out.println("검색성공: " + index);
		} else {
			System.out.println("검색실패: " + index); // -1
		}
		System.out.println();

		// 오름차순
		Collections.sort(v);
		for (String s : v) {
			System.out.print(s + " ");
		}
		System.out.println();

		// 내림차순(10~1, Z~A, ㅎ~ㄱ)
		Collections.sort(v, Collections.reverseOrder());
		for (String s : v) {
			System.out.print(s + " ");
		}
		System.out.println();

		// 삭제
		v.remove("Pusan"); // v.remove(7);
		for (String s : v) {
			System.out.print(s + " ");
		}
		System.out.println();

		//용량 증가
		for(int i=1; i<=20; i++){
			v.add(Integer.toString(i));
		}
		for (String s : v) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		System.out.println("벡터의 초기용량: " + v.capacity());
		System.out.println("데이터(요소) 갯수: " + v.size());
		
		//범위삭제
		
		//v.removeRange(5,20); -X
		for(int i=1; i<= 10; i++){ //10번동안 5번째 있는 데이터
			v.remove(5);     //5번째 데이터가 지워지면 뒤에 있떤 데이터 인덱스번호가 땡겨짐
		}
		for (String s : v) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		System.out.println("벡터의 초기용량: " + v.capacity());
		System.out.println("데이터(요소) 갯수: " + v.size());
		
		//빈공간 삭제
		v.trimToSize();
		System.out.println("벡터의 초기용량: " + v.capacity());
		System.out.println("데이터(요소) 갯수: " + v.size());
		
		//전체삭제
		v.clear();
		System.out.println("벡터의 초기용량: " + v.capacity()); //공간은 그대로
		System.out.println("데이터(요소) 갯수: " + v.size());   //데이터만 삭제 
		
		//데이터가 지워진 빈공간의 공간을 삭제하기 위해서 다시 트림투사이즈
		v.trimToSize();
		System.out.println("벡터의 초기용량: " + v.capacity());
		System.out.println("데이터(요소) 갯수: " + v.size());
		
	}

}
