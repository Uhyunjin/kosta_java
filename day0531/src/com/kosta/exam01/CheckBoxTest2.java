package com.kosta.exam01;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBoxTest2 extends JFrame{

	JLabel jlb_res;
	String []arr = {"사과","포도","오렌지","수박","바나나"};
	JCheckBox []btnArray=new JCheckBox[arr.length];
	String res;


	public static String isChecked(String res,JCheckBox[]btnList) {
		res="";
		for (JCheckBox btn : btnList) {
			if (btn.isSelected()) {
				res += btn.getText()+" ";
			}
		}
		if (res.isBlank()) {
			res = "아무것도 선택하지 않았습니다.";
		}else {
//			res.trim();
			res += "를(을) 선택하셨습니다.";
			
		}
		return res;
	}
	
	
	public CheckBoxTest2() throws HeadlessException {
		setLayout(new FlowLayout());
//		jcb01=new JCheckBox("사과");
//		jcb02=new JCheckBox("포도");
		
		for (int i = 0; i < arr.length; i++) {
			btnArray[i] = new JCheckBox(arr[i]);
			add(btnArray[i]);
		}
		
		setLayout(new FlowLayout());

		
		jlb_res = new JLabel("     선택해주세요!     ");
		add(jlb_res);
		
		setSize(400,300);
		setVisible(true);
		setResizable(false);	// 크기 조절 제한
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		for (int i = 0; i < arr.length; i++) {
			btnArray[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					jlb_res.setText(isChecked(res, btnArray));

				}
			});
		}
	}
	
	public static void main(String[] args) {
		new CheckBoxTest2();
	}
	
}
