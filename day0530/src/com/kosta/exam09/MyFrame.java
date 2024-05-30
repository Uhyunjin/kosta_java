package com.kosta.exam09;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	JButton button01;
	JButton button02;
	
	public MyFrame() {
		button01=new JButton("남자");
		button02=new JButton("여자");
		add(button01);
		add(button02);
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new MyFrame();
	}

}
