package com.class5;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test1 {

	public static void main(String[] args) {

		//현재 시스템의 날짜 및 시간을 관리
		
		Calendar now = Calendar.getInstance();   
		Calendar now1 = new GregorianCalendar(); //(UPCAST)
		
		int y = now.get(Calendar.YEAR);  //클래스.변수
		int m = now.get(Calendar.MONTH)+1; //인덱스숫자가 0부터 시작이라 0이 1이라서 +1을한다.
		int d = now.get(Calendar.DATE);
		int w = now.get(Calendar.DAY_OF_WEEK); //일 월 화 수 목 금 토
	                                           // 1	 2  3  4  5  6  7
		System.out.println(y + "-" + m + "-" + d);
		System.out.println(w);    // (1 - 7) //아무것도안하고 syso(w) 3기 안나오고 4가나옴
		
		String[] week = {"일","월","화","수","목","금","토"};
		
		System.out.println(y + "-" + m + "-" + d + "-" + week[w-1]);
		
		int startDay = now.getActualMinimum(Calendar.DATE);  //매월의 첫날 1일
		int endDay = now.getActualMaximum(Calendar.DATE);    //매월의 마지막날
		
		System.out.println("첫날 : " + startDay);
		System.out.println("말일 : " + endDay);
		
		System.out.printf("%tF\n",now); //2018-05-30       //날짜   
		System.out.printf("%tT\n",now); //11:53:51         //시간
		
		//2018-05-30 11:53:51
		System.out.printf("%tF %tT\n", now,now); //now를 한번만 사용하면 아래처럼가능
		
		System.out.printf("%1$tF %1$tT\n", now);
		
		now.set(2019, 10-1, 10);                         //set + add
		
		y = now.get(Calendar.YEAR);  //클래스.변수
		m = now.get(Calendar.MONTH)+1; //인덱스숫자가 0부터 시작이라 0이 1이라서 +1을한다.
		d = now.get(Calendar.DATE);
		w = now.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(y + "-" + m + "-" + d + "-" + week[w-1]);
	}

}
