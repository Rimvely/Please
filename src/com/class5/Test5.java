package com.class5;

//Calendar now = Calendar.getInstance();  now1 now2 now3 �̶�� ���� ��ü�� 1���� �����ȴ�.
//singleton ��� 
//Calendar now = Calendar.getInstance();

class Sing{
	
	private static Sing ob; // ob�� U-0�ڸ����� �������� �ʱⰪ = null
	
	public static Sing getInstance(){
		
		if(ob==null)
			ob = new Sing();
		    //heap�� ��ü����, �ּҰ��� ȹ��
		
		return ob;
  }
}
public class Test5 {

	public static void main(String[] args) {
		
		Sing ob1 = Sing.getInstance();
		Sing ob2 = Sing.getInstance();
		
		if(ob1==ob2){
			System.out.println("���ϰ�ü..."); //�ּҸ� ��
		}else{
			System.out.println("�ȵ��ϰ�ü..."); 
		}
		
		
		
		
		
	
	}

}
