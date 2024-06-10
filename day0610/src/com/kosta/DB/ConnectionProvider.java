package com.kosta.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionProvider {
	//객체와 무관하게 사용
	//connection 반환
	
	//static 메서드이며 매개변수는 없고 connection을 반환하는 메서드
	
	public static Connection getConnection() {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String username = "c##madang";
		String password = "madang";
		
		Connection conn=null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,username,password);
			
		} catch (Exception e) {
			e.getMessage();
		}
		
		return conn;
	}
	
	
	//close 메서드 만들기
	//매개변수 connection과 statement와 rs를 받아서 close 시켜주는 메서드
	public static void close(Connection conn, Statement stmt, ResultSet rs) {
		try {
			if (rs!=null) {rs.close();}
			if (stmt!=null) {stmt.close();}
			if (conn!=null) {conn.close();}
		} catch (SQLException e) {
			e.getMessage();
			e.printStackTrace();
		}
	}
	
	
	
	public static void close2(Connection conn, Statement stmt) {
		try {
			if (stmt!=null) {stmt.close();}
			if (conn!=null) {conn.close();}
		} catch (Exception e) {
			e.getMessage();
		}
	}
}


