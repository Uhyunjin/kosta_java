package com.kosta.exam1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SelectGUITest extends JFrame{
	
	JTextArea jta;
	JButton btn;
	
	public SelectGUITest() {
		
		jta = new JTextArea(5,20);
		btn = new JButton("읽어오기");
		
		JScrollPane jsp = new JScrollPane(jta);
	
		JPanel p = new JPanel();
		p.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		p.add(btn);
		add(p, BorderLayout.SOUTH);
		add(jsp, BorderLayout.CENTER);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jta.setText(null);
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
						String res="";
						res += rs.getString(1)+",";
						res += rs.getInt(2)+",";
						res += rs.getInt(3)+",";
						res += rs.getInt(4);
//						System.out.println(name+","+kor+","+eng+","+math);
						res += "\n";
						jta.append(res);
					}
					
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
		new SelectGUITest();

	}

}
