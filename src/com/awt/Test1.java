package com.awt;

import java.awt.Color;
import java.awt.Frame;

//AWT(Abstract Window Toolkit)
//Swing


public class Test1 extends Frame{

		private static final long serialVersionUID = 1L;
		
		public Test1(){
			
			this.setTitle("자바 윈도우");
			setSize(200, 300);
			
			setBackground(new Color(255, 255, 0));
			setVisible(true);
			
			
			
			
		}

	public static void main(String[] args) {
		
//		Test1 ob = new Test();
//		ob.xxxx                 으로 실행을해야하나 객체가 없어
		new Test1(); //그래서 그냥 바로 메모리상에 올려
		

	}

}
