package com.kosta.exam1;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class InsertSelectUpdateDeleteGUI extends JFrame {
	JTextField jtf_name;
	JTextField jtf_kor;
	JTextField jtf_eng;
	JTextField jtf_math;
	JButton btnInsert;
	JButton btnUpdate;
	JButton btnDelete;
	
	Vector<String> colName;
	Vector<Vector<String>> rowData;
	JTable table;
	String sql;
	
	public static final String driver="oracle.jdbc.driver.OracleDriver";
	public static final String url="jdbc:oracle:thin:@localhost:1521:XE";
	public static final String username="c##madang";
	public static final String password="madang";
	
	public void loadStudent() {
		String sql = "select * from student";
		
		Connection conn=null;
		Statement stmt = null;
		ResultSet rs = null;
		rowData.clear();
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,username,password);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				
				Vector<String> row = new Vector<String>();
				String name = rs.getString(1);
				String kor= Integer.toString(rs.getInt(2));
				String eng= Integer.toString(rs.getInt(3));
				String math= Integer.toString(rs.getInt(4));

				row.add(name);
				row.add(kor);
				row.add(eng);
				row.add(math);
				
				rowData.add(row);
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
	
	public InsertSelectUpdateDeleteGUI() {
		jtf_name = new JTextField(10);
		jtf_kor = new JTextField(10);
		jtf_eng = new JTextField(10);
		jtf_math = new JTextField(10);
		btnInsert = new JButton("입력");
		btnUpdate = new JButton("수정");
		btnDelete = new JButton("삭제");
		
		JPanel p1 = new JPanel();
		p1.add(new JLabel("이름"));
		p1.add(jtf_name);
		p1.add(new JLabel("국어"));
		p1.add(jtf_kor);
		p1.add(new JLabel("영어"));
		p1.add(jtf_eng);
		p1.add(new JLabel("수학"));
		p1.add(jtf_math);
		p1.add(btnInsert);
		p1.add(btnUpdate);
		p1.add(btnDelete);
		
		colName = new Vector<String>();
		colName.add("이름");
		colName.add("국어");
		colName.add("영어");
		colName.add("수학");
		rowData = new Vector<Vector<String>>();
		table = new JTable(rowData, colName);
		
		JScrollPane jsp = new JScrollPane(table);

		add(p1, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);
				
		
		//버튼을 누르면 입력 후 다시 테이블 새로고침
		btnInsert.addActionListener(new ActionListener() {
			
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
					Class.forName(driver);
					conn = DriverManager.getConnection(url,username,password);
					stmt = conn.createStatement();
					
					int re = stmt.executeUpdate(sql);
					
					if (re==1) {
						System.out.println(sql+" 성공");
						loadStudent();
					}else {
						System.out.println("실패");
					}
					
					
				} catch (Exception e2) {
					
				}finally {
					try {
						if (stmt!=null) {stmt.close();}
						if (conn!=null) {conn.close();}
					} catch (Exception e3) {
						// TODO: handle exception
					}
				}
				
			}
		});
		
		btnUpdate.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Connection conn = null;
				Statement stmt = null;
				String sql = "update student set "
						+ "name='"+jtf_name.getText()+"'"
						+ ",kor="+Integer.parseInt(jtf_kor.getText())
						+ ",eng="+Integer.parseInt(jtf_eng.getText())   
						+ ",math="+Integer.parseInt(jtf_math.getText())
						+ " where name = '"+jtf_name.getText()+"'";
				try {
					Class.forName(driver);
					conn = DriverManager.getConnection(url, username, password);
					stmt = conn.createStatement();	//DB명령 실행 담당자
					int re = stmt.executeUpdate(sql);
					if (re>0) {
						// 조건에 맞는 식 여러개가 update 될 수 있다
						loadStudent();
						JOptionPane.showMessageDialog(null, "학생의 정보를 수정하였습니다.");
					}else {
						System.out.println("수정 실패");
					}
					
				} catch (Exception e2) {
					e2.getMessage();
				}finally {
					try {
						if (stmt!=null) {stmt.close();}
						if (conn!=null) {conn.close();}
					} catch (Exception e3) {
						// TODO: handle exception
					}
				}	
				
				
			}
		});
		
		btnDelete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//삭제하는 명령은 좀 위험한 작업이다보니
				//무조건 삭제시키기 보다는 한번 확인하는 과정을 거치면 좋을것~
				if (jtf_name.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "삭제할 학생을 선택하세요");
					return;	//삭제할 학생을 선택하지 않았기 때문에 여기서 멈추기
				}
				int r =JOptionPane.showConfirmDialog(null, "정말로 삭제할까요?", "회원삭제", JOptionPane.YES_NO_OPTION);
				if (r != 0) {
					return;
				}
				Connection conn=null;
				Statement stmt = null;
				String sql="delete student where name = '"
						+ jtf_name.getText()+"'";
				try {
					Class.forName(driver);
					conn = DriverManager.getConnection(url, username, password);
					stmt = conn.createStatement();
					int re = stmt.executeUpdate(sql);
					System.out.println(sql);
					if (re>0) {
						System.out.println("삭제 성공");
						loadStudent();
//						JOptionPane.showMessageDialog(null, "삭제완료");
						
					}else {
						System.out.println("삭제 실패");
					}
				} catch (Exception e2) {
					e2.getMessage();
				}finally {
					try {
						if (stmt!=null) {stmt.close();}
						if (conn!=null) {conn.close();}
					} catch (Exception e3) {
						// TODO: handle exception
					}
				}	
			}
		});
		
		//테이블에서 선택한 레코드 jtf에 불러오기!
		table.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				int index = table.getSelectedRow();
				Vector<String>row = rowData.get(index);
				String selectedName = row.get(0);
				System.out.println(selectedName);
				
				Connection conn=null;
				Statement stmt=null;
				ResultSet rs=null;
				sql = "select * from student where name = '"+selectedName+"'";
				try {
					Class.forName(driver);
					conn = DriverManager.getConnection(url,username,password);
					stmt = conn.createStatement();
					rs = stmt.executeQuery(sql);
					
					if (rs.next()) {
						jtf_name.setText(rs.getString(1));
						jtf_kor.setText(rs.getInt(2)+"");
						jtf_eng.setText(rs.getInt(3)+"");
						jtf_math.setText(rs.getInt(4)+"");
						
					}
				} catch (Exception e2) {
					e2.getMessage();
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
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		// 생성자에서 테이블 조회해서 가져오기
		loadStudent();
		
		setVisible(true);
		setSize(850,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}
	
	public static void main(String[] args) {
		new InsertSelectUpdateDeleteGUI();

	}
}
