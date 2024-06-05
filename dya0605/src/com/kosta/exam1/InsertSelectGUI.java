package com.kosta.exam1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Statement;
import java.util.Vector;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import oracle.net.nt.ConnectDescription;

public class InsertSelectGUI extends JFrame{
	
	JTextField jtf_name;
	JTextField jtf_kor;
	JTextField jtf_eng;
	JTextField jtf_math;
	JButton btn;
	
	Vector<String> colName;
	Vector<Vector<String>> rowData;
	JTable table;
	String sql;
	
	public static void selectStudent(Vector colName, Vector rowData, JTable t) {
		Connection conn=null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select * from student";
		rowData.clear();
		
		
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
//				jta.append(res);
			}
			t.updateUI();
			
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
	
	public InsertSelectGUI() {
		jtf_name = new JTextField(10);
		jtf_kor = new JTextField(10);
		jtf_eng = new JTextField(10);
		jtf_math = new JTextField(10);
		btn = new JButton("입력");
		
		JPanel p1 = new JPanel();
		p1.setLayout(new FlowLayout());
		p1.add(new JLabel("이름"));
		p1.add(jtf_name);
		p1.add(new JLabel("국어"));
		p1.add(jtf_kor);
		p1.add(new JLabel("영어"));
		p1.add(jtf_eng);
		p1.add(new JLabel("수학"));
		p1.add(jtf_math);
		p1.add(btn);
		
		colName = new Vector<String>();
		colName.add("이름");
		colName.add("국어");
		colName.add("영어");
		colName.add("수학");
		rowData = new Vector<Vector<String>>();
		table = new JTable(rowData, colName);
		
		JPanel p2 = new JPanel();
		JScrollPane jsp = new JScrollPane(table);
		p2.setLayout(new FlowLayout());
		p2.add(jsp, BorderLayout.CENTER);

		setLayout(new FlowLayout());
		add(p1);
		add(p2);
				
		// 생성자에서 테이블 조회해서 가져오기
		selectStudent(colName, rowData, table);
		
		//버튼을 누르면 입력 후 다시 테이블 새로고침
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Connection conn=null;
				Statement stmt=null;				
				String name=jtf_name.getText();
				int kor = Integer.parseInt(jtf_kor.getText());
				int eng = Integer.parseInt(jtf_eng.getText());
				int math = Integer.parseInt(jtf_math.getText());
				
				try {
					String sql = "insert into student values('"+name+"',"+kor+","+eng+","+math+")";
			
					Class.forName("oracle.jdbc.driver.OracleDriver");
					
					String url = "jdbc:oracle:thin:@localhost:1521:XE";
					String username="c##madang";
					String password="madang";
					
					conn = DriverManager.getConnection(url,username,password);
					stmt = conn.createStatement();
					
					int re = stmt.executeUpdate(sql);
					
					if (re==1) {
						System.out.println(sql+" 성공");
					}else {
						System.out.println("실패");
					}
					
					
				} catch (Exception e2) {
					
				}finally {
					try {
						if (stmt!=null) {
							stmt.close();
						}
						if (conn!=null) {
							conn.close();
						}
					} catch (Exception e3) {
						// TODO: handle exception
					}
				}
				
				selectStudent(colName, rowData, table);
			}
		});
		
		setVisible(true);
		setSize(700,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}
	
	public static void main(String[] args) {
		new InsertSelectGUI();

	}

}
