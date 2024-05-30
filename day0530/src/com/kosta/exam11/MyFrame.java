package com.kosta.exam11;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

	JButton []button = new JButton[15];
	
	public MyFrame() {
		setLayout(new GridLayout(3,5));
		for (int i = 1; i < 16; i++) {
			add(new JButton("버튼" +i));
		}

		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new MyFrame();
	}

}
