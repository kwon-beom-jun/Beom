package test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.UserDto;
import service.UserService;



public class UserServiceTest {
	public static void main(String[] args) {

		UserService userService = new UserService();
		List<UserDto> list = new ArrayList<UserDto>();
		list = userService.getAllUser();
		
		
//		for(UserDto user : list) {
//			System.out.println("유저 아이디 : " + user.getId() + "\t\t유저 비밀번호 : " + user.getPassword()
//								+ "\t\t유저 이름 : " + user.getName());
//		}
//		System.out.println("--------------------------위아래는 같은 코드입니다--------------------------");
		int len = list.size();
		for (int i = 0; i < len; i++) {
			System.out.println("유저 아이디 : " + list.get(i).getId() + "\t\t유저 비밀번호 : " + list.get(i).getPassword()
			+ "\t\t유저 이름 : " + list.get(i).getName());
		}
		
		// dao의 메소드를 활용하여 비즈니스 로직을 구현
//		user.setId("new1234");
//		user.setName("testname");
//		user.setPassword("testpass");
//
//		userService.addUser(user);
//		System.out.println("마침");
//		User resultUser;
//		resultUser = userService.getUser("new123");
//		System.out.println(resultUser);
	}
}