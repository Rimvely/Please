package com.collection;

import java.util.Vector;


class Test{
	
	String name;
	int age;
	
	
}
public class Test1 {

	public static void main(String[] args) {
		
		Vector<Test> v = new Vector<Test>();
		
//		Test ob = new Test(); 밑에거랑 같은거다.
		Test ob;
		ob = new Test();
		ob.name = "배수지";
		ob.age = 25;
		v.add(ob);
		
//		//잘못작성하는 경우
//		ob.name = "박신혜";
//		ob.age = 28;
//		v.add(ob);
		
		ob = new Test();
		ob.name = "박신혜";
	    ob.age = 28;
	    v.add(ob);
	    
		for(Test t : v){
			System.out.println(t.name + " : " + t.age);
		}
		
		
		
		
		
		
		

	}

}
