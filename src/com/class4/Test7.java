package com.class4; //String에 method만 가지고 계산기 만들기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test7 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("수식[3+5]?");//  12 + 30 
		String str = br.readLine();
		
		str = str.replaceAll("\\s", ""); //위에 수식어를쓸때 모든 공백을 다 없애기 위함
		
//		String[] oper = {"+","-","*","/"};     
//		for(String op : oper){
//		}
//		저 위에 코딩을 한방에하는 코딩 밑으로
		
		for(String op : new String[]{"+","-","*","/"}){
			
			int pos = str.indexOf(op);  //12+30
			
			if(pos>-1){
				int num1 = Integer.parseInt(str.substring(0, pos));  //substring은 마지막값이 (n-1)  (0. pos) 는 0부터 - (pos-1)
				
				int num2 = Integer.parseInt(str.substring(pos+1));   //(pos+1)은 pos 다음부터 쭉이라는 말
				
				int result = 0;
				
				char oper = str.charAt(pos);
				
				switch(oper){
				
				case '+':
					result = num1 + num2;
					break;
				case '-':
					result = num1 - num2;
					break;
				case '*':
					result = num1 * num2;
					break;
				case '/':
					result = num1 / num2;
					break;
				}
				
//				System.out.printf("%d %c %d = %d",num1,oper,num2,result);
//				위와 똑같은거
				String s = String.format("[%d %c %d] = %d",num1,oper,num2,result); //여기담아두고 나중에 필요할때 나에게줘
				
				System.out.println(s); //그리고 이걸적은곳에다가 출력
				
				
				
			}
			
			
		}
		
		
		
		
		
		
	}

}
