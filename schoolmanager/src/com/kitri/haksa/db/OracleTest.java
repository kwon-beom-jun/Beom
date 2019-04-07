package com.kitri.haksa.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
 
 
public class OracleTest 
{
    public static void main(String args[])
    {
        Connection conn = null; // DB����� ����(����)�� ���� ��ü
        PreparedStatement pstm = null;  // SQL ���� ��Ÿ���� ��ü
        ResultSet rs = null;  // �������� �����Ϳ� ���� ��ȯ���� ���� ��ü
        
        try {
            // SQL ������ ����� ���� ������ ���Ǿ�(SELECT��)���
            // �� ����� ���� ResulSet ��ü�� �غ��� �� �����Ų��.
            String quary = "SELECT * FROM COUNTRIES";
            
            conn = DBConnection.getConnection();
            pstm = conn.prepareStatement(quary);
            rs = pstm.executeQuery();
            
            /*  COUNTRIES ���̺��� ������ Ÿ��
             * 
                EMPNO NOT NULL NUMBER(4) -- int
                ENAME VARCHAR2(10) -- String
                JOB VARCHAR2(9) -- String
                MGR NUMBER(4) -- int
                HIREDATE DATE -- Date
                SAL NUMBER(7,2) -- float/double
                COMM NUMBER(7,2) -- float/double
                DEPTNO NUMBER(2) -- int
                
                COUNTRYID CHAR(2 BYTE) -- String
                COUNTRYNAME VARCHAR2(40 BYTE) -- String
                REGIONID NUMBER -- int
            */
            
//          System.out.println("EMPNO ENAME JOB MGR HIREDATE SAL COMM DEPTNO");
            System.out.println("COUNTRY_ID COUNTRY_NAME REGION_ID");
            System.out.println("==================================");
            
            while(rs.next()){
//                int empno = rs.getInt(1);
//                //int empno = rs.getInt("empno"); ���� ��� �÷� �̸��� ��� �ȴ�.
//                String ename = rs.getString(2);
//                String job = rs.getString(3);
//                int mgr = rs.getInt(4);
//                java.sql.Date hiredate = rs.getDate(5); // Date Ÿ�� ó��
//                int sal = rs.getInt(6);
//                int comm = rs.getInt(7);
//                int deptno = rs.getInt(8);
            	String countryid = rs.getString(1);
            	String countryname = rs.getString(2);
            	Number regionid = rs.getInt(3);
                
                String result = countryid+" "+countryname+" "+regionid;
                System.out.println(result);
            }
            
        } catch (SQLException sqle) {
            System.out.println("SELECT������ ���� �߻�");
            sqle.printStackTrace();
            
        }finally{
            // DB ������ �����Ѵ�.
            try{
                if ( rs != null ){rs.close();}   
                if ( pstm != null ){pstm.close();}   
                if ( conn != null ){conn.close(); }
            }catch(Exception e){
                throw new RuntimeException(e.getMessage());
            }
            
        }
    }
}

