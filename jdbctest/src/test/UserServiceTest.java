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
//			System.out.println("���� ���̵� : " + user.getId() + "\t\t���� ��й�ȣ : " + user.getPassword()
//								+ "\t\t���� �̸� : " + user.getName());
//		}
//		System.out.println("--------------------------���Ʒ��� ���� �ڵ��Դϴ�--------------------------");
		int len = list.size();
		for (int i = 0; i < len; i++) {
			System.out.println("���� ���̵� : " + list.get(i).getId() + "\t\t���� ��й�ȣ : " + list.get(i).getPassword()
			+ "\t\t���� �̸� : " + list.get(i).getName());
		}
		
		// dao�� �޼ҵ带 Ȱ���Ͽ� ����Ͻ� ������ ����
//		user.setId("new1234");
//		user.setName("testname");
//		user.setPassword("testpass");
//
//		userService.addUser(user);
//		System.out.println("��ħ");
//		User resultUser;
//		resultUser = userService.getUser("new123");
//		System.out.println(resultUser);
	}
}