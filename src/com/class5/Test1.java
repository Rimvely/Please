package com.class5;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test1 {

	public static void main(String[] args) {

		//���� �ý����� ��¥ �� �ð��� ����
		
		Calendar now = Calendar.getInstance();   
		Calendar now1 = new GregorianCalendar(); //(UPCAST)
		
		int y = now.get(Calendar.YEAR);  //Ŭ����.����
		int m = now.get(Calendar.MONTH)+1; //�ε������ڰ� 0���� �����̶� 0�� 1�̶� +1���Ѵ�.
		int d = now.get(Calendar.DATE);
		int w = now.get(Calendar.DAY_OF_WEEK); //�� �� ȭ �� �� �� ��
	                                           // 1	 2  3  4  5  6  7
		System.out.println(y + "-" + m + "-" + d);
		System.out.println(w);    // (1 - 7) //�ƹ��͵����ϰ� syso(w) 3�� �ȳ����� 4������
		
		String[] week = {"��","��","ȭ","��","��","��","��"};
		
		System.out.println(y + "-" + m + "-" + d + "-" + week[w-1]);
		
		int startDay = now.getActualMinimum(Calendar.DATE);  //�ſ��� ù�� 1��
		int endDay = now.getActualMaximum(Calendar.DATE);    //�ſ��� ��������
		
		System.out.println("ù�� : " + startDay);
		System.out.println("���� : " + endDay);
		
		System.out.printf("%tF\n",now); //2018-05-30       //��¥   
		System.out.printf("%tT\n",now); //11:53:51         //�ð�
		
		//2018-05-30 11:53:51
		System.out.printf("%tF %tT\n", now,now); //now�� �ѹ��� ����ϸ� �Ʒ�ó������
		
		System.out.printf("%1$tF %1$tT\n", now);
		
		now.set(2019, 10-1, 10);                         //set + add
		
		y = now.get(Calendar.YEAR);  //Ŭ����.����
		m = now.get(Calendar.MONTH)+1; //�ε������ڰ� 0���� �����̶� 0�� 1�̶� +1���Ѵ�.
		d = now.get(Calendar.DATE);
		w = now.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(y + "-" + m + "-" + d + "-" + week[w-1]);
	}

}
