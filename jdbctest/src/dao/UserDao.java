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
	// Dao�� ���� select - resultSet�� �־�� �Ѵ� select �� ������ ���� Dto List�� �ϳ� �����
//															while�� �ȿ��� ��ü ������ ��´�
//					insert, update, delete - executeUpdate()�� �����ϸ� �۾��� row�� ������ ���� ���ش�
//										(Dao�޼ҵ� ���� Ÿ���� int�� �ϰų� boolean���� �ؼ� 
//										ȣ�� dao�޼ҵ带 ȣ���� ������ �۾��� ����� �������� �Ǵ��� �� �ְ� ����� �Ѵ�)

	// �̱��� ������ ����ؾ��ϴ� ����
//	���⼭�� ����ڸ� Ŭ���̾�Ʈ��� �ϰڴ�
//	�Ź� Ŭ���̾�Ʈ���� ��û�� �ö����� �� ������ ����ϴ� ������Ʈ�� ���� ���������

	// �̱��� ������ �Ѱ�
//	�ڹٿ��� �̱��� ������ �����ϴ� ���
//	- Ŭ���� �ۿ����� ������Ʈ�� �������� ���ϵ��� �����ڸ� private���� �����
//	- ������ ��Ŭ�� ������Ʈ�� ������ �� �ִ� �ڽŰ� ���� Ÿ���� ����ƽ �ʵ带 �����Ѵ�
//	- ����ƽ ���丮 �޼ҵ��� getInstance()�� ����� �� �޼ҵ尡 ���ʷ� ȣ��Ǵ� �������� �� ����
//	������Ʈ�� ��������� �Ѵ� ������ ������Ʈ�� ����ƽ �ʵ忡 ����ȴ� �Ǵ� ����ƽ �ʵ��� �ʱⰪ���� ������Ʈ�� 
//	�̸� ������ ���� �ִ�
//	- �ѹ�������Ʈ(�̱���)�� ��������� �� �Ŀ��� getInstance() �޼ҵ带 ���� �̹� ������� ����ƽ �ʵ忡 �����ص� ������Ʈ��
//	�Ѱ��ش�
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
			if (rs != null) { // ���� try catch �ȿ� �ִ°��� ���� ���� �ʴٰ� �Ѵ�
								// �ֳ��ϸ� rs �� close �ɶ� ���ܰ� �߻��ϸ� �ٷ� catch�� ���⶧���� ������ ps, c ��
//								   close�� ���� �ʴ´�
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