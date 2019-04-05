package service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.DaoFactory;
import dao.UserDao;
import dto.UserDto;



public class UserService { // 이제 비즈니스 로직인 service 단계에서 어떤 커넥션을 쓸지 결정하지 않는다. 
							//단순히 daofactory의 메소드를 호출하기만 하면 되기 때문이다
	private UserDto user = new UserDto();
	private UserDao dao = new DaoFactory().userDao();

	public void addUser(UserDto user) {
		if(dao.addUser(user)>0)
		System.out.println(user.getId() + "아이디 등록 성공");
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