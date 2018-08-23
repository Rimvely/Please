package com.class5;

//Calendar now = Calendar.getInstance();  now1 now2 now3 이라고 만들어도 객체는 1번만 생성된다.
//singleton 기법 
//Calendar now = Calendar.getInstance();

class Sing{
	
	private static Sing ob; // ob에 U-0자리값만 만들어놓고 초기값 = null
	
	public static Sing getInstance(){
		
		if(ob==null)
			ob = new Sing();
		    //heap에 객체생성, 주소값을 획득
		
		return ob;
  }
}
public class Test5 {

	public static void main(String[] args) {
		
		Sing ob1 = Sing.getInstance();
		Sing ob2 = Sing.getInstance();
		
		if(ob1==ob2){
			System.out.println("동일객체..."); //주소를 비교
		}else{
			System.out.println("안동일객체..."); 
		}
		
		
		
		
		
	
	}

}
