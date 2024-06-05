package com.kosta.exam1;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableTest extends JFrame{
	
	JTable table;
	
	public JTableTest() {
		String []colNames = {"이름","국어","영어","수학"};
		String [][]rowData = {
				{"spring","76","80","88"},
				{"summer","80","90","100"},
				{"autumn","90","70","88"}
		};	//배열은 나중에 데이터를 넣기 힘들다
		
		table = new JTable(rowData, colNames);
		JScrollPane jsp = new JScrollPane(table);
		
		add(jsp);
		
		setVisible(true);
		setSize(400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new JTableTest();

	}

}
