package com.kosta.exam01;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBoxTest extends JFrame{

	JCheckBox jcb01;
	JCheckBox jcb02;
	
	public CheckBoxTest() throws HeadlessException {
		setLayout(new FlowLayout());
		jcb01=new JCheckBox("사과");
		jcb02=new JCheckBox("포도");
		
		add(jcb01);
		add(jcb02);
		
		setSize(400,300);
		setVisible(true);
		setResizable(false);	// 크기 조절 제한
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jcb01.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(jcb01.isSelected());	
			}
		});
		
		jcb02.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(jcb02.isSelected());
				
			}
		});
		
	}
	
	public static void main(String[] args) {
		new CheckBoxTest();
	}
	
}
