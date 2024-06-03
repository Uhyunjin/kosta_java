package com.kosta.exam02;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ImageButtonTest extends JFrame {
	ImageIcon icon;
	ImageIcon icon2;
	ImageIcon icon3;
	
	JButton btn;
	
	public ImageButtonTest() {
		icon = new ImageIcon("apple.gif");
		icon2 = new ImageIcon("banana.gif");
		icon3 = new ImageIcon("peach.gif");
		
		btn = new JButton(icon);
		btn.setRolloverIcon(icon2);
		btn.setPressedIcon(icon3);
		
		setLayout(new FlowLayout());
		add(btn);
		
		setSize(400,600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new ImageButtonTest();
	}
}
