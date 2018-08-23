package com.awt;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test3 extends Frame {

	private static final long serialVersionUID = 1L;

	public Test3() { 

		setTitle("윈도우");
		setSize(200, 300);
		
		addWindowListener(new MYwindowAdapter());
		
		setVisible(true);
		
	

	}

	// nested class
	class MYwindowAdapter extends WindowAdapter {
		//class를 만들어주는 이유는 원하는 것들만 오버라이드하기위해서

		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}

	}

	public static void main(String[] args) {
		new Test3();
	}

}
