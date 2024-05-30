package com.kosta.exam11;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutTest extends JFrame {
	public GridLayoutTest() {
		
		setLayout(new GridLayout(4,5));
		for (int i = 1; i < 13; i++) {
			add(new JButton("버튼"+i));
		}
		
		setSize(500,500);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new GridLayoutTest();
	}
	//설정한 그리드의 수와 컴포넌트의 수가 맞지 않고
	//컴포넌트의 수를 행렬에 맞출 수 있으면 알아서 맞춰준다.
}
