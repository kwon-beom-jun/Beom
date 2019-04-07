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
			System.out.println("����");
			e.printStackTrace(); // �����޽����� ����� �״�� �����ּ��� ��� ���.
		}

		Connection con = null;
		Statement stat = null;
		PreparedStatement pstm = null;
		// sql ���� ��Ÿ���� ��ü
		ResultSet rs = null;
		// �������� �����Ϳ� ���� ��ȯ���� ���� ��ü
		
		try {
			
			con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.180:1521:orcl","kitri","kitri");
			// url ����õ�.
			stat = con.createStatement();
			// createStatement(); = SQL�� �۽��ϱ����� Statement ������Ʈ�� �ۼ��մϴ�.
			System.out.println("����Ŭ ���Ἲ�� !!!");
		
			String sql = "insert into school values('�ǹ���', 23, 1, '�л�')";
			int result = stat.executeUpdate(sql);

			if (result > 0) {
				System.out.println("�Է¼���");
			} else {
				System.out.println("�Է½���");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("�������");
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
			System.out.println("���� �߻�");
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
