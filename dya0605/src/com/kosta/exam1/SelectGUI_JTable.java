package com.kosta.exam1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SelectGUI_JTable extends JFrame{
	
	Vector<String> colName;
	Vector<Vector<String>> rowData;
	JTable table;
	
	public SelectGUI_JTable() {
		
		colName = new Vector<String>();
		colName.add("이름");
		colName.add("국어");
		colName.add("영어");
		colName.add("수학");
		
		rowData = new Vector<Vector<String>>();	//처음에는 빈 rowData를 만들고
		//나중에 result set으로 반환된 데이터를 vector 객체로 한줄씩 넣어줄 것
		
		table = new JTable(rowData, colName);
		
		JButton btn = new JButton("읽어오기");
		
		JScrollPane jsp = new JScrollPane(table);
	
		JPanel p = new JPanel();
		p.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		p.add(btn);
		add(p, BorderLayout.SOUTH);
		add(jsp, BorderLayout.CENTER);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
//				jta.setText(null);
				rowData.clear();
				Connection conn=null;
				Statement stmt = null;
				ResultSet rs = null;
				String sql = "select * from student";
				
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","c##madang","madang");
					stmt = conn.createStatement();
					rs = stmt.executeQuery(sql);
					
					while (rs.next()) {
						
						Vector<String> res = new Vector<String>();
						String name = rs.getString(1);
						String kor= Integer.toString(rs.getInt(2));
						String eng= Integer.toString(rs.getInt(3));
						String math= Integer.toString(rs.getInt(4));

						res.add(name);
						res.add(kor);
						res.add(eng);
						res.add(math);
						
						rowData.add(res);
//						jta.append(res);
					}
					table.updateUI();
					
				} catch (Exception e1) {
					// TODO: handle exception
				}finally {
					try {
						if (rs!=null) {rs.close();}
						if (stmt!=null) {stmt.close();}
						if (conn!=null) {conn.close();}
					} catch (Exception e2) {
						System.out.println("예외발생 : " + e2.getMessage());
					}
				}
				
			}
		});
		
		setVisible(true);
		setSize(400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new SelectGUI_JTable();

	}

}
