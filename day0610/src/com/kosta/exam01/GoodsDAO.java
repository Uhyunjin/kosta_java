package com.kosta.exam01;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.sql.ConnectionPoolDataSource;

import com.kosta.DB.ConnectionProvider;

public class GoodsDAO {
	
	// 새로운 상품을 등록하기 위한 메소드를 만들어 봅니다.
	public int insertGoods(GoodsVO g) {
		int re = -1;
		String sql = "insert into goods values("+g.getNo()+",'"+g.getItem()+"',"+g.getQty()+","+g.getPrice()+")";
		Connection conn = null;
		Statement stmt = null;
		try {
			
			conn = ConnectionProvider.getConnection();
			stmt = conn.createStatement();
			re = stmt.executeUpdate(sql);
		}catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}finally {
			try {
				ConnectionProvider.close2(conn, stmt);
			}catch (Exception e) {				
			}
		}		
		return re;
	}
	
	public ArrayList<GoodsVO> listGoods(){
		String sql = "select * from goods";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		ArrayList<GoodsVO> list = new ArrayList<GoodsVO>();
		try {
//			Class.forName(driver);
//			conn = DriverManager.getConnection(url, username, password);
			conn = ConnectionProvider.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
//				int no = rs.getInt(1);
//				String item = rs.getString(2);
//				int qty = rs.getInt(3);
				
				GoodsVO g = new GoodsVO(rs.getInt(1), rs.getString(2),rs.getInt(3),rs.getInt(4));
				list.add(g);	
			}
		}catch (Exception e) {
			e.getMessage();
		}finally {
			try {
				ConnectionProvider.close(conn, stmt, rs);
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return list;
	}
	
	//상품 수정을 위한 메서드 정의
	//매개변수 : GoodsVO
	//반환값 : int
	public int updateGoods(GoodsVO goods) {
		int re = -1;
		String sql = "update goods set item='"+goods.getItem()
									+"',qty="+goods.getQty()
									+",price="+goods.getPrice()
									+" where no="+goods.getNo();
		Connection conn = null;
		Statement stmt = null;
		try {
//			Class.forName(driver);
//			conn = DriverManager.getConnection(url,username,password);
			conn = ConnectionProvider.getConnection();
			stmt = conn.createStatement();
			re = stmt.executeUpdate(sql);
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}finally {
			try {
				ConnectionProvider.close2(conn, stmt);
		} catch (Exception e2) {
			
		}
	}
		return re;
	}
	
	//goodsvo 매개변수
	public int deleteGoods(int no) {
		int re = -1;
		String sql = "delete goods where no="+no;
		Connection conn=null;
		Statement stmt = null;
		try {
			conn=ConnectionProvider.getConnection();
			stmt=conn.createStatement();
			re = stmt.executeUpdate(sql);
		} catch (Exception e) {
			e.getMessage();
		}finally {
			ConnectionProvider.close2(conn, stmt);
		}
		
		return re;
	}

}
