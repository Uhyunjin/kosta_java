package com.kosta.exam2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDAO {

	public final static String driver = "oracle.jdbc.driver.OracleDriver";
	public final static String url = "jdbc:oracle:thin:@localhost:1521:XE";
	public final static String username = "c##madang";
	public final static String password = "madang";
	
	Connection conn=null;
	Statement stmt=null;
	
	String sql;
	
	String name;
	int kor, eng, math;
	
	//insert 새로운 학생 추가 메서드
	public int insertStudent(StudentVO student) {
		int re=-1;
		
		name=student.getName();
		kor=student.getKor();
		eng=student.getEng();
		math=student.getMath();
		
		sql = "insert into student values('"+name+"',"+kor+","+eng+","+math+")";
		System.out.println(sql);
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,username,password);
			stmt=conn.createStatement();
			re = stmt.executeUpdate(sql);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt!=null) {stmt.close();}
				if (conn!=null) {conn.close();}
			} catch (Exception e2) {e2.getMessage();}
		}

		return re;
	}
}
