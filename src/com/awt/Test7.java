package com.awt;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test7 extends Frame {

	private static final long serialVersionUID = 1L;

	private int x, y;

	private Label lbl = new Label("", Label.CENTER);

	public Test7() {

		add(lbl, BorderLayout.SOUTH);

		addMouseListener(new MouseHandler());
		addMouseMotionListener(new MouseMotionHandler());

		setBackground(new Color(150, 150, 150));// 배경색
		setForeground(new Color(0, 0, 255));// 글자색

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		setTitle("좌표출력");
		setSize(400, 400);
		setVisible(true);

	}

	public static void main(String[] args) {
		new Test7();
	}

	@Override
	public void paint(Graphics g) {

		String str;
		str = "(" + x + "," + y + ")";
		g.drawString(str, x, y);

	}

	@Override
	public void update(Graphics g) {
		paint(g);
	}

	class MouseHandler extends MouseAdapter {

		@Override
		public void mousePressed(MouseEvent evt) {
 // update()를 호출해 -> update()가 paint()를 호출해

		}

		@Override
		public void mouseReleased(MouseEvent evt) {

		}

	}

	class MouseMotionHandler extends MouseMotionAdapter {

		@Override
		public void mouseDragged(MouseEvent evt) {
			x = evt.getX();
			y = evt.getY();
			repaint();
			
		}

		@Override
		public void mouseMoved(MouseEvent evt) {
			String str = String.format("(%d,%d)", evt.getX(), evt.getY());
			
			lbl.setText(str);
		}

	}

}
