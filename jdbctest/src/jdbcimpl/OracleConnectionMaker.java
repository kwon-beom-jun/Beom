package jdbcimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import jdbcinterface.ConnectionMaker;





public class OracleConnectionMaker implements ConnectionMaker{

	@Override
	public Connection makeConnection() {
		Connection c = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			c = DriverManager.getConnection(
					"jdbc:oracle:thin:@192.168.14.89:1521:orcl", "kitri", "kitri");
					//ip주소 변경.
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return c;
	}
}