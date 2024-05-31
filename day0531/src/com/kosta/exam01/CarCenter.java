package com.kosta.exam01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CarCenter extends JFrame{
	
	String []type = {"엔진 오일 교환","자동 변속기 오일 교환","에어컨 필터 교환","타이어 교환"};
	static int []cost = {45000,80000,30000,100000};
//	Map<String, Integer> type = new HashMap<String, Integer>(){{
//		put("엔진 오일 교환",45000),put
//	}}; 맵 못하겠다
	JCheckBox []cb = new JCheckBox[type.length];
	
	
	public static void calcCost(JCheckBox []cb) {
		int totalCost=0;
		for (int i = 0; i < cb.length; i++) {
			if (cb[i].isSelected()) {
				totalCost += cost[i];
			}
		}
		if (totalCost==0) {
			System.out.println("아무것도 선택하지 않으셨어요");
		}else {
			System.out.println(totalCost +"원");
		}
		
	}
	
	
	
	public CarCenter() {
		
		setLayout(new FlowLayout());
		
		for (int i = 0; i < type.length; i++) {
			cb[i]= new JCheckBox(type[i]);
			add(cb[i]);
		}
		setVisible(true);
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		for (int i = 0; i < type.length; i++) {
			cb[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					calcCost(cb);
					add(new JLabel());
					
				}
			});
		}

		
	}
	
	
	public static void main(String[] args) {
		new CarCenter();
	}
}
