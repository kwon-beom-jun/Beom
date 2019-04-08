package com.kitri.haksa.db;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.kitri.haksa.data.HaksaDto;

public class HaksaDao {
	
	public HaksaDao() {
	}

	public List<HaksaDto> selectAll() {
		List<HaksaDto> list = new ArrayList<HaksaDto>();
		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String quary = "SELECT * FROM SCHOOL";
		
		try {
			con = DBConnection.getConnection();
			pstm = con.prepareStatement(quary);
			rs = pstm.executeQuery();
			
			while(rs.next()) {
				HaksaDto haksaDto = new HaksaDto(rs.getInt(2), rs.getString(1), rs.getInt(3), rs.getString(4));
				//String result = name + " \t" + age + " \t" + key + " \t" + value;
				//System.out.println(result);
				list.add(haksaDto);
			}
			return list;
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
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
		return list;
	}

	public void delete(String name) {
		Connection con = null;
		PreparedStatement pstm = null;
		String sql = "delete school where name = ?";
		
		try {
			con = DBConnection.getConnection(); //연결
			pstm = con.prepareStatement(sql);   //준비
			pstm.setString(1, name);
			
			pstm.executeUpdate();
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			try {
				if (con != null) {		
					con.close();
				} 
				if (pstm != null) {
					pstm.close();
				} 
			}catch (SQLException e) {
					e.printStackTrace();
			}
		}
	}

	public void register(HaksaDto haksa) {
		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		String sql = "insert into school values(?, ?, ?, ?)";

		try {
			con = DBConnection.getConnection(); //연결
			pstm = con.prepareStatement(sql);    //준비
			pstm.setString(1, haksa.getName());
			pstm.setInt(2, haksa.getAge());
			pstm.setInt(3, haksa.getKey());
			pstm.setString(4, haksa.getValue());
			
			pstm.executeUpdate();
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			try {
				if (con != null) {		
					con.close();
				} 
				if (pstm != null) {
					pstm.close();
				} 
			}catch (SQLException e) {
					e.printStackTrace();
			}
		}
	}

	public void findName(String name) {
		Connection con = null;
		PreparedStatement pstm = null;
		String sql = "select name from school where name = ?";
		ResultSet rs = null;
		
		try {
			con = DBConnection.getConnection(); //연결
			pstm = con.prepareStatement(sql);   //준비
			rs = pstm.executeQuery(); // 결과값 반환하기 위해 생성
			
			System.out.println("name \tage \tkey \tvalue");
			System.out.println("==============================");
			
			
				name = rs.getString(1);
				
				System.out.println(rs);
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			try {
				if (con != null) {		
					con.close();
				} 
				if (pstm != null) {
					pstm.close();
				} 
			}catch (SQLException e) {
					e.printStackTrace();
			}
		}
	}

	
}
