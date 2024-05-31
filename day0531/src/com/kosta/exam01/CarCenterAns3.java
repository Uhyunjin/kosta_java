package com.kosta.exam01;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CarCenterAns3 extends JFrame{
	
	LinkedHashMap<String, Integer> map;
	JCheckBox []jcb;
	
	//라벨에 계산해서 접근할거니가 멤버변수
	JLabel jlb_result;
	int total;
	
	public void calc() {
		for (int i=0;i<jcb.length;i++) {
			JCheckBox b = jcb[i];
			if (b.isSelected()) {
				String item = b.getText();	//수리항목
				int price = map.get(item);
				total += price;
			}
		}
		jlb_result.setText("총 금액 : "+total);
	}
	
	
	
	public CarCenterAns3() {
		JPanel p_center = new JPanel();
		p_center.setLayout(new GridLayout(6,2));
		p_center.add(new JLabel("수리"));
		p_center.add(new JLabel("가격(원)"));
		
		int totalCost=0;
		map = new LinkedHashMap<String, Integer>();
		map.put("엔진오일교환", 45000);
		map.put("자동변속기오일교환", 80000);
		map.put("에어컨필터교환", 30000);
		map.put("타이어교환", 100000);
		
//		setLayout(new FlowLayout());
		
		jcb = new JCheckBox[map.keySet().size()];//사이즈만큼 버튼만들기
		Iterator<String>iter = map.keySet().iterator();
		int i=0;
		while (iter.hasNext()) {
			String item = iter.next();
//			jcb[i]=new JCheckBox(iter.next());	
			jcb[i]=new JCheckBox(item);	
			
			p_center.add(jcb[i]);
			p_center.add(new JLabel(map.get(item)+""));
			jcb[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {	
//					for (int i=0;i<jcb.length;i++) {
//						JCheckBox b = jcb[i];
//						if (b.isSelected()) {
//							String item = b.getText();	//수리항목
//							int price = map.get(item);
//							total += price;
//						}
//					}
//					jlb_result.setText("총 금액 : "+total);
					calc();
				}
			});
		}
		
		jlb_result = new JLabel("총 금액");
		
		add(p_center, BorderLayout.CENTER);	//프레임은 기본이 보더레이아웃
		add(jlb_result, BorderLayout.SOUTH);
		//참고로 패널은 기본이 flow 레이아웃
		setSize(500,500);
		setVisible(true);
		
		
	}
	
	
	public static void main(String[] args) {
		new CarCenterAns3();
	}
}
