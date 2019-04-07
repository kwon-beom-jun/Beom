package com.kitri.haksa.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.management.RuntimeErrorException;

public class OracleTest2 {
	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(Exception e) {
			System.out.println("실패");
			e.printStackTrace(); // 에러메시지가 생기면 그대로 보여주세요 라는 명령.
		}

		Connection con = null;
		Statement stat = null;
		PreparedStatement pstm = null;
		// sql 문을 나타내는 객체
		ResultSet rs = null;
		// 쿼리문을 날린것에 대한 반환값을 담을 객체
		
		try {
			
			con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.180:1521:orcl","kitri","kitri");
			// url 연결시도.
			stat = con.createStatement();
			// createStatement(); = SQL를 송신하기위한 Statement 오브젝트를 작성합니다.
			System.out.println("오라클 연결성공 !!!");
		
			String sql = "insert into school values('권범준', 23, 1, '학생')";
			int result = stat.executeUpdate(sql);

			if (result > 0) {
				System.out.println("입력성공");
			} else {
				System.out.println("입력실패");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("연결실패");
		} finally {
			try {
				con.commit();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		try {
			
			String quary = "SELECT * FROM SCHOOL";
			
			con = DBConnection.getConnection();
			pstm = con.prepareStatement(quary);
			rs = pstm.executeQuery();
			
			System.out.println("name \tage \tkey \tvalue");
			System.out.println("==============================");
			
			while(rs.next()) {
				
				String name = rs.getString(1);
				int age = rs.getInt(2);
				int key = rs.getInt(3);
				String value = rs.getString(4);
				
				String result = name + " \t" + age + " \t" + key + " \t" + value;
				System.out.println(result);
			}

		} catch (SQLException e) {
			System.out.println("에러 발생");
		}finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstm != null) {
					pstm.close();
				}
				if (con != null) {
					con.close();
				}
				
			}catch (Exception e) {
				throw new RuntimeException(e.getMessage());
			}
		}
	}
}
