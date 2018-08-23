package com.awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.sound.midi.Soundbank;

public class Test4 extends Frame implements ActionListener {

	private static final long serialVersionUID = 1L;

	private Button btn;
	private TextArea ta;
	private TextField tf; // 대문자니까 class 그럼 객체생성해줘야한다

	public Test4() {

		tf = new TextField();
		ta = new TextArea();
		btn = new Button("추가");
		
		tf.addActionListener(this);
		btn.addActionListener(this);
		

		add(tf, BorderLayout.NORTH);
		add(ta, BorderLayout.CENTER);
		add(btn, BorderLayout.SOUTH);

		setTitle("윈도우");
		setSize(200, 300);
		setVisible(true);

		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}

		});

	}

	public static void main(String[] args) {
		new Test4();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object ob = e.getSource();
		if(ob instanceof Button || ob instanceof TextField){   //null이 아니고 무언가있을때 작동하게 만듬
			
			String str = tf.getText();
			
			if(!str.equals("")){
				
				ta.append(str + "\n\r");
				
			}
			
			tf.setText("");
			tf.requestFocus();
			
			
			
			
		}
		
		
		
		
	}

}
