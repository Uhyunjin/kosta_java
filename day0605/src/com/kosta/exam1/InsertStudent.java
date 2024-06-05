package com.kosta.exam1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertStudent {
	public static void main(String[] args) {
		Connection conn=null;
		Statement stmt=null;	//finally에서도 알 수 있도록 선언한다.
		
		String name="";
		int kor=0, eng=0, math=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력해주세요 : ");
		name = sc.next();
		System.out.println("국어점수를 입력해주세요 : ");
		kor = sc.nextInt();
		System.out.println("영어점수를 입력해주세요 : ");
		eng = sc.nextInt();
		System.out.println("수학점수를 입력해주세요 : ");
		math = sc.nextInt();
		
		try {
			String sql = "insert into student values('"+name+"',"+kor+","+eng+","+math+")";
			System.out.println(sql);
			//1.jdbc 드라이버를 메모리로 로드한다.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2. DB서버에 연결한다.
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","c##madang","madang");
			
			//3. 데이터베이스 실행 담당자 객체를 생성
			stmt = conn.createStatement();
			
			//4.데이터베이스 명령어 실행
			int res = stmt.executeUpdate(sql);
			
			if (res==1) {
				System.out.println("학생 정보 추가 완료");
			}else {
				System.out.println("학생 정보 추가 실패");
			}
		} catch (Exception e) {
			System.out.println("예외발생 : "+e.getMessage());
		}finally {
			try {
				if (stmt!=null) {stmt.close();}
				if (conn!=null) {conn.close();}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
