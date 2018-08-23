package com.awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test6 extends Frame implements ActionListener {

	private static final long serialVersionUID = 1L;

	private TextField tf1, tf2, tf3;
	private Button btn1, btn2, btn3, btn4;

	public Test6() {

		setLayout(new GridLayout(4, 1));

		tf1 = new TextField();
		add(tf1);

		tf2 = new TextField();
		add(tf2);

		// ------------------------패널에 버튼 +기를 넣은것
		Panel p = new Panel();

		btn1 = new Button("+");
		btn1.addActionListener(this);
		p.add(btn1);

		btn2 = new Button("-");
		btn2.addActionListener(this);
		p.add(btn2);

		btn3 = new Button("*");
		btn3.addActionListener(this);
		p.add(btn3);

		btn4 = new Button("/");
		btn4.addActionListener(this);
		p.add(btn4);

		add(p);

		tf3 = new TextField();
		add(tf3);

		// 누군가 더하기를 누르면 + 작동하는걸 들어야겟지.(그래서 btn1.addActionListener(this);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		setTitle("계산기");
		setSize(200, 150);
		setVisible(true);

	}

	public static void main(String[] args) {
		new Test6();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Object ob = e.getSource();

		int num1 = Integer.parseInt(tf1.getText());
		int num2 = Integer.parseInt(tf2.getText());
		String ch;
		int result;
		if (ob instanceof Button) {

			Button b = (Button) ob;

			ch = b.getLabel();

			switch (ch) {
			case "+":
				result = num1 + num2;
				break;

			case "-":
				result = num1 - num2;
				break;

			case "*":
				result = num1 * num2;
				break;

			case "/":
				result = num1 / num2;
				break;
			}
			
			
			
		}
		
		

	}

}

/*if(ob instance of Button){
 * 
 * Button b = (Button)ob;
 * 
 * String result;
 * 
 * if(b==btn1){
 * 	result = String.format("%d+%d=%d", num1,num2(num1+num2));
 * 
 * 
 * }else if(b==btn2){
 * result = String.format("%d-%d=%d", num1,num2(num1-num2));
 * 
 * }else if(b==btn3){
 * result = String.format("%d*%d=%d", num1,num2(num1*num2));
 * 
 * }else if(b==btn4){
 * result = String.format("%d/%d=%d", num1,num2(num1/num2));
 * 
 * }
 * 
 * tf3.setText(result);


*/

