package com.kosta.exam_game;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	MyPanel panel;
	public MyFrame() {
		panel = new MyPanel();
		add(panel);
		setSize(400,300);
		setVisible(true);
	}
}
