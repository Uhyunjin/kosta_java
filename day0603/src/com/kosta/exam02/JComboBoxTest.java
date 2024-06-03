package com.kosta.exam02;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JComboBoxTest extends JFrame {
	JComboBox<String> jcb;
	JLabel jlb;
	public JComboBoxTest() {
		jcb = new JComboBox<String>();
		jcb.addItem("사과");
		jcb.addItem("포도");
		jcb.addItem("오렌지");
		jcb.addItem("딸기");
		jcb.addItem("수박");
		
		jlb = new JLabel();
		
		add(jcb, BorderLayout.NORTH);
		add(jlb, BorderLayout.CENTER);
		
		setSize(400,800);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		jcb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String item = (String)jcb.getSelectedItem();
				System.out.println(item+"을 선택하였습니다");
				
				jlb.setText(item+"을(를) 선택하였습니다");
			}
		});
	}

	public static void main(String[] args) {
		new JComboBoxTest();
	}
}
