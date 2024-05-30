package com.kosta.exam11;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame3 extends JFrame {

	JButton []button = new JButton[15];
	
	public MyFrame3() {
		setLayout(new BorderLayout());
		add(new JButton("위"), BorderLayout.NORTH);
		add(new JButton("아래"), BorderLayout.SOUTH);
		add(new JButton("왼쪽"), BorderLayout.WEST);
		add(new JButton("오른쪽"), BorderLayout.EAST);
//		add(new JButton("가운데"), BorderLayout.CENTER);

		
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new MyFrame3();
	}

}
