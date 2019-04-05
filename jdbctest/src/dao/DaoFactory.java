package dao;

import jdbcimpl.OracleConnectionMaker;
import jdbcinterface.ConnectionMaker;

public class DaoFactory {
	public ConnectionMaker connectionMaker() { 
		return new OracleConnectionMaker();
	}
	public UserDao userDao() {
		ConnectionMaker connectionMaker = connectionMaker();
		UserDao userDao = new UserDao(connectionMaker);
		return userDao;
	}
	
	public MemberDao memberDao() {
		ConnectionMaker connectionMaker = connectionMaker();
		MemberDao memberDao = new MemberDao(connectionMaker);
		return memberDao;
	}
	
}