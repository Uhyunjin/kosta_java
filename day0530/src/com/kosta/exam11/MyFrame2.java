package com.kosta.exam11;

import java.awt.Component;
import java.awt.FlowLayout;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame2 extends JFrame {

	JButton []button = new JButton[15];
	
	public MyFrame2() {
		setLayout(new FlowLayout());
		for (int i = 1; i < 16; i++) {
			add(new JButton("버튼" +i));
//			add(button.get(i-1));
		}

		
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new MyFrame2();
	}

}
