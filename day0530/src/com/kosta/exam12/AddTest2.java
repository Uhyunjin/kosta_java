package com.kosta.exam12;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

//만약 더 많은 버튼이 있다면?
//이너클래스 사용하기
public class AddTest2 extends JFrame {

	JTextField jtf01;
	JTextField jtf02;
	JTextField jtf03;
	
	public AddTest2() throws HeadlessException {
		
		jtf01 = new JTextField(10);
		jtf02 = new JTextField(10);
		jtf03 = new JTextField(10);
		
		JPanel p_center = new JPanel();
		JPanel p_south = new JPanel();
		
		p_center.setLayout(new GridLayout(3,2));
		p_south.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		p_center.add(new JLabel("첫번째 정수:"));
		p_center.add(jtf01);
		p_center.add(new JLabel("두번째 정수:"));
		p_center.add(jtf02);
		p_center.add(new JLabel("세번째 정수:"));
		p_center.add(jtf03);
		
		JButton btnAdd = new JButton("Add");
		JButton btnClear = new JButton("Clear");
		
		p_south.add(btnAdd);
		p_south.add(btnClear);
		
		setLayout(new BorderLayout());
		add(p_center, BorderLayout.CENTER);
		add(p_south, BorderLayout.SOUTH);
		
		setSize(400,150);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btnAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int sum = Integer.parseInt((jtf01.getText()))+Integer.parseInt((jtf02.getText()));	 
				jtf03.setText(sum+"");		
			}
		});
		
		btnClear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jtf01.setText(null);
				jtf02.setText(null);
				jtf03.setText(null);
			}
		});
	}

//	@Override
//	public void actionPerformed(ActionEvent e) {
//
//		switch(e.getActionCommand()) {	//눌린 버튼의 글자
//		
//		case "Add":
//			int sum = Integer.parseInt((jtf01.getText()))+Integer.parseInt((jtf02.getText()));	 
//			jtf03.setText(sum+"");
//			break;
//			
//		case "Clear":
//			jtf01.setText(null);
//			jtf02.setText(null);
//			jtf03.setText(null);
//			break;
//		}
//	}
	
	public static void main(String[] args) {
		
		new AddTest2();
	}

}
