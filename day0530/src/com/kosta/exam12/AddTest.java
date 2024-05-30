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

public class AddTest extends JFrame implements ActionListener {

	//화면구성요소 중 추후에 다른 메서드에서 접근해야 하는 요소만 멤버변수로 정한다
	//단순 라벨 출력 텍스트는 멤버변수로 만들지 않아도 된다
	JTextField jtf01;
	JTextField jtf02;
	JTextField jtf03;
	
	public AddTest() throws HeadlessException {
		
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
		
		btnAdd.addActionListener(this);
		btnClear.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		switch(e.getActionCommand()) {	//눌린 버튼의 글자
		
		case "Add":
			int sum = Integer.parseInt((jtf01.getText()))+Integer.parseInt((jtf02.getText()));	 
			jtf03.setText(sum+"");
			break;
			
		case "Clear":
			jtf01.setText(null);
			jtf02.setText(null);
			jtf03.setText(null);
			break;
		}
	}
	
	public static void main(String[] args) {
		
		new AddTest();
	}

}
