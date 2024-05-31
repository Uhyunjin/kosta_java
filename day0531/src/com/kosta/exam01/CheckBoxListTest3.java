package com.kosta.exam01;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBoxListTest3 extends JFrame{

	JCheckBox jcb01;
	JCheckBox jcb02;
	String res;
	JCheckBox[]btnList;
	
	public static String isChecked(String res,JCheckBox jcb01,JCheckBox jcb02) {
		if (jcb01.isSelected()&&jcb02.isSelected()) {
			res = "둘 다 선택하셨습니다";
		}else if (jcb01.isSelected()) {
			res="사과만 선택하셨습니다";					
		}else if (jcb02.isSelected()) {
			res = "포도만 선택하셨습니다";					
		}else if(!jcb01.isSelected()&&!jcb02.isSelected()) {
			res = "아무것도 선택하지 않았습니다.";					
		}
		return res;
	}
	
	public static String isChecked2(String res,JCheckBox[]btnList) {
		for (JCheckBox btn : btnList) {
			if (btn.isSelected()) {
				res += btn.getText()+" ";
			}
		}
		res += "선택하셨습니다.";
		return res;
	}
	
	
	public CheckBoxListTest3() throws HeadlessException {
		setLayout(new FlowLayout());
		jcb01=new JCheckBox("사과");
		jcb02=new JCheckBox("포도");
		
		setLayout(new FlowLayout());
		add(jcb01);
		add(jcb02);
		JLabel jlb_res = new JLabel("선택");
		add(jlb_res);
		
		setSize(400,300);
		setVisible(true);
		setResizable(false);	// 크기 조절 제한
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jcb01.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
								
				jlb_res.setText(isChecked(res, jcb01,jcb02));
			}
		});
		
		jcb02.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				jlb_res.setText(isChecked(res, jcb01,jcb02));
			}
		});
		
	}
	
	public static void main(String[] args) {
		new CheckBoxListTest3();
	}
	
}
