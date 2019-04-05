package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.UserDto;
import jdbcinterface.ConnectionMaker;



public class UserDao {
	// Dao의 종류 select - resultSet이 있어야 한다 select 된 정보를 담을 Dto List를 하나 만들고
//															while문 안에서 객체 정보를 담는다
//					insert, update, delete - executeUpdate()를 실행하면 작업된 row의 갯수를 리턴 해준다
//										(Dao메소드 리턴 타입을 int로 하거나 boolean으로 해서 
//										호출 dao메소드를 호출한 곳에서 작업이 제대로 끝났는지 판단할 수 있게 해줘야 한다)

	// 싱글톤 패턴을 사용해야하는 이유
//	여기서는 사용자를 클라이언트라고 하겠다
//	매번 클라이언트에서 요청이 올때마다 각 로직을 담당하는 오브젝트를 새로 만들어진다

	// 싱글톤 패턴의 한계
//	자바에서 싱글톤 패턴을 구현하는 방법
//	- 클래스 밖에서는 오브젝트를 생성하지 못하도록 생성자를 private으로 만든다
//	- 생성된 싱클톤 오브젝트를 저장할 수 있는 자신과 같은 타입의 스태틱 필드를 정의한다
//	- 스태틱 팩토리 메소드인 getInstance()를 만들고 이 메소드가 최초로 호출되는 시점에서 한 번만
//	오브젝트가 만들어지게 한다 생성된 오브젝트는 스태틱 필드에 저장된다 또는 스태틱 필드의 초기값으로 오브젝트를 
//	미리 만들어둘 수도 있다
//	- 한번오브젝트(싱글톤)가 만들어지고 난 후에는 getInstance() 메소드를 통해 이미 만들어져 스태틱 필드에 저장해둔 오브젝트를
//	넘겨준다
	private ConnectionMaker connectionMaker;
	public UserDao(ConnectionMaker connectionMaker) {
		this.connectionMaker = connectionMaker;
	}

	public List<UserDto> getAll() {
		List<UserDto> list = new ArrayList<UserDto>();
		Connection c = null; 
		PreparedStatement ps = null; 
		ResultSet rs = null;
		try {
			c = connectionMaker.makeConnection();
			ps = c.prepareStatement("select * from usertest");
			rs = ps.executeQuery();
			while (rs.next()) {
				UserDto user = new UserDto();
				user.setId(rs.getString("id"));
				user.setName(rs.getString("name"));
				user.setPassword(rs.getString("password"));
				list.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(c != null) {
				try {
					c.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return list;
	}

	public int addUser(UserDto user) {
		Connection c = null;
		PreparedStatement ps = null;
		int num = 0;
		try {
			c = connectionMaker.makeConnection();
			ps = c.prepareStatement("insert into usertest(id, name, password) values(?,?,?)");
			ps.setString(1, user.getId());
			ps.setString(2, user.getName());
			ps.setString(3, user.getPassword());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (c != null) {
				try {
					c.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

		}
		return num;
	}

	public UserDto getUserById(String id) {
		Connection c = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		UserDto user = new UserDto();
		try {
			c = connectionMaker.makeConnection();
			ps = c.prepareStatement("select * from usertest where id=?");
			ps.setString(1, id);

			rs = ps.executeQuery();
			rs.next();
			user.setId(rs.getString("id"));
			user.setName(rs.getString("name"));
			user.setPassword(rs.getString("password"));
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (c != null) {
				try {
					c.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return user;
	}

	public UserDto getUserByName(String name) {
		Connection c = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		UserDto user = new UserDto();
		try {
			c = connectionMaker.makeConnection();
			ps = c.prepareStatement("select * from usertest where name=?");
			ps.setString(1, name);

			rs = ps.executeQuery();
			rs.next();
			user.setId(rs.getString("id"));
			user.setName(rs.getString("name"));
			user.setPassword(rs.getString("password"));
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) { // 같은 try catch 안에 넣는것은 별로 좋지 않다고 한다
								// 왜냐하면 rs 가 close 될때 예외가 발생하면 바로 catch로 가기때문에 나머지 ps, c 가
//								   close가 되지 않는다
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (c != null) {
				try {
					c.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return user;
	}
}