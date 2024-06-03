package com.kosta.exam02;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JComboBoxImageLabelTest extends JFrame {
	JComboBox<String> jcb;
	JLabel jlb;

	ImageIcon icon1;
	ImageIcon icon2;
	ImageIcon icon3;
	ImageIcon icon4;
	ImageIcon icon5;
	
	public JComboBoxImageLabelTest() {
		jcb = new JComboBox<String>();
		jcb.addItem("apple");
		jcb.addItem("banana");
		jcb.addItem("grape");
		jcb.addItem("peach");
		jcb.addItem("persimmon");
		
		icon1 = new ImageIcon("apple.gif");
		icon2 = new ImageIcon("banana.gif");
		icon3 = new ImageIcon("grape.gif");
		icon4 = new ImageIcon("peach.gif");
		icon5 = new ImageIcon("persimmon.gif");
		
		jlb = new JLabel();
		
		
		add(jcb, BorderLayout.NORTH);
		add(jlb, BorderLayout.CENTER);
		
		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		jcb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String item = (String)jcb.getSelectedItem();
				System.out.println(item+"을 선택하였습니다");
				
				switch (item) {
				case "apple": {jlb.setIcon(icon1);break;}
				case "banana": {jlb.setIcon(icon2);break;}
				case "grape": {jlb.setIcon(icon3);break;}
				case "peach": {jlb.setIcon(icon4);break;}
				case "persimmon": {jlb.setIcon(icon5);break;}
				default:
				}
			}
		});
	}

	public static void main(String[] args) {
		new JComboBoxImageLabelTest();
	}
}
