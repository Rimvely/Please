package com.collection;

import java.util.Hashtable;
import java.util.Iterator;

//Collection
//Map<키,값>                                   == //Map<set, 값> set은 중복컬렉션이 되지않는다.
//1.Hashtable - 동기화를지원 = Vector             //key값과 value값이 저장이 따로되어있어서 
//2.HashMap - 동기화를 미지원 = ArrayList		  //(key + " : " + value) 라고 작성해야함
 
//키는 중복적인 값을 가질수 없다. (키는 set)
//키가 ㄱ중복적인 값이면 마지막값이 저장 된다.(수정)
//Map은 Iterator가 없다.
//put : 추가
//get : 가져오기
public class Test3 {
	
	public static final String name[] = {"배수지","천송이","전지현","송지효","박신혜"};
	
	public static final String tel[] = {"111-111","222-222","333-333","111-111","444-444"};
	
	public static void main(String[] args) {

		Hashtable<String, String> h = new Hashtable<String, String>();
		
		for(int i = 0; i<name.length; i ++){
			
			h.put(tel[i], name[i]);
			
		}
		
		System.out.println(h);
		
		String str;
		
		str = h.get("111-111"); //키를 주면 값을 가져옴
		if(str==null || str.equals(""))
			System.out.println("자료없음");
		else
			System.out.println(str);
		//송지효가 뜨는이유는 중복이 되지않고 덮어씌우기 때문.
		
		//키가 존재하는지 검사
		if(h.containsKey("222-222"))
			System.out.println("222있다");
		else
			System.out.println("222없다");
		
		//데이터가 존재하는지 검사
		if(h.containsValue("천송이")){
			System.out.println("송이 있다");
		}else
			System.out.println("송이 없다");
		
		//삭제
		h.remove("222-222");
		if(h.containsKey("222-222"))
			System.out.println("222있다");
		else
			System.out.println("222. 없다");
		
		//전체출력                                   //map에는 iterator이없어서
		                                             //keyset iterator 이용
		Iterator<String> it = h.keySet().iterator(); //keySet()의 iterator 
		while(it.hasNext()){
			
			String key = it.next();  //여기서 Str은 key값을 가져온다.
			String value = h.get(key);	//value를 반환
			
			System.out.println(key + " : " + value);
			
			//key값과 value값이 저장이 따로되어있어서 
			//(key + " : " + value) 라고 작성해야함
		}
		
		
		
		
		
		
	}

}
