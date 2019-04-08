package com.kitri.haksa.service;

import java.sql.*;

import com.kitri.haksa.db.MakeConnection;

public class HaksaConnection {
	public static Connection dbConn;
    
    public Connection getConnection()
    {
        Connection conn = null;
        try {
    
        	String user = "kitri"; 
            String pw = "kitri";
            String url = "jdbc:oracle:thin:@192.168.14.20:1521:orcl";
            
            Class.forName("oracle.jdbc.driver.OracleDriver");        
            conn = DriverManager.getConnection(url, user, pw);
            
            System.out.println("Database에 연결되었습니다.\n");
            
        } catch (ClassNotFoundException cnfe) {
            System.out.println("DB 드라이버 로딩 실패 :"+cnfe.toString());
        } catch (SQLException sqle) {
            System.out.println("DB 접속실패!! : "+sqle.toString());
        } catch (Exception e) {
            System.out.println("Unkonwn error");
            e.printStackTrace();
        }
        return conn;     
    }
    
}
