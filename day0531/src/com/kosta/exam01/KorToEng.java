package com.kosta.exam01;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class KorToEng extends JFrame{
	
	JTextArea jta01;
	JTextArea jta02;
	//텍스트 필드는 한 줄, 에리어는 여러줄
	//textarea를 스크롤바에 감싸주었지만 스크롤바 자체는 의미가 있지 않기 때문에 멤버변수는 textarea가 온다
	
	public KorToEng() {
		jta01 = new JTextArea(10, 10);
		jta02 = new JTextArea(10, 10);
		
		JButton btnOK = new JButton("변환");
		JButton btnCancel = new JButton("취소");
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		
		p1.setLayout(new GridLayout(1,2,10,10));	//가로 세로 여백을 줄 수 있다
		p2.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		JScrollPane jsp01 = new JScrollPane(jta01);
		JScrollPane jsp02 = new JScrollPane(jta02);
		
		p1.add(jsp01);
		p1.add(jsp02);
		// 스크롤 바에 감싸서 사용하기
		
		p2.add(btnOK);
		p2.add(btnCancel);
		
		setLayout(new BorderLayout());
		add(p1, BorderLayout.CENTER);
		add(p2, BorderLayout.SOUTH);
	
		setSize(400,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Map<String, String> dic = new HashMap<String, String>();
		dic.put("영어", "English");
		dic.put("텍스트", "Text");
//		dic.put("영어", "English");
//		dic.put("영어", "English");
		
		
		//OK 버튼이벤트 처리하기
		btnOK.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//루프 돌면서 조사 자르기
				String kor = jta01.getText();
				String []wordList = kor.split(" ");
				String []josa = {"은", "는","이","가"};
				for (String k : wordList) {
					for (String j : josa) {
						if (k.endsWith(j)) {//만약 조사가 단어에 있으면
							k=dic.get(k.substring(0,  k.length()-1))+j;
							
							System.out.println(dic.get(k));
						}
					}
				}
				
//				다시 루프 돌면서 Map에 있는 단어 변환
				String eng="";
				for (String k : wordList) {
					if (dic.get(k)!=null) {
						k = dic.get(k);
					}
					
					eng += k;
					eng += " ";
				}
				
				jta02.setText(eng);
			}
			
		});
		
		
		btnCancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				jta01.setText(null);
				jta02.setText(null);
			}
		});
	}
	
	public static void main(String[] args) {
		new KorToEng();
	}

}
