package service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.DaoFactory;
import dao.UserDao;
import dto.UserDto;



public class UserService { // ���� ����Ͻ� ������ service �ܰ迡�� � Ŀ�ؼ��� ���� �������� �ʴ´�. 
							//�ܼ��� daofactory�� �޼ҵ带 ȣ���ϱ⸸ �ϸ� �Ǳ� �����̴�
	private UserDto user = new UserDto();
	private UserDao dao = new DaoFactory().userDao();

	public void addUser(UserDto user) {
		if(dao.addUser(user)>0)
		System.out.println(user.getId() + "���̵� ��� ����");
	}

	public UserDto getUser(String name) {
		UserDto user = dao.getUserByName(name);
		System.out.println(user.getName());
		System.out.println(user.getPassword());
		return user;
	}
	public List<UserDto> getAllUser() {
		List<UserDto> list = new ArrayList<UserDto>();
		list = dao.getAll();
		return list;
	}
}