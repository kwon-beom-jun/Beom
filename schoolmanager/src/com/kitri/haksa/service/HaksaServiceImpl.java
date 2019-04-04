package com.kitri.haksa.service;

import java.io.*;
import java.util.ArrayList;

import com.kitri.haksa.data.HaksaDto;

public class HaksaServiceImpl implements HaksaService {
	
	
	ArrayList<HaksaDto> list = new ArrayList<HaksaDto>();
	
	
	
	BufferedReader in;  // 한줄로 바꿀 수 있음.
	private String job[] = {"학번" , "과목" , "부서"};
	
	
	public String getJob(int i) {
		return job[i];
	}


	public void setJob(String[] job) {
		this.job = job;
	}


	public HaksaServiceImpl() {
		super();
		in = new BufferedReader(new InputStreamReader(System.in));
	
	}
//	System.out.println("1. 등록\n" + "2. 찾기\n" 
//	+ "3. 삭제\n" + "4. 전체 출력\n" + "--------------------\n" + "0. 종료" + 
//				"--------------------\n" + "번호를 선택해 주세요.. " );


	private int getNumber() {
		int num = 0;
		try {
			num = Integer.parseInt(in.readLine());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return num;
	}
	
	private String getName() {
		String name = null;
		try {
			name = in.readLine();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return name;
	}
	
	public void CEcheck() {
		System.out.println("계속 하시려면 1, 종료하시려면 0을 입력해주세요. ");
		
		for(;;){
			int num = getNumber();
			if (num == 1) {
				menu();
			}else if(num == 0) {
				System.exit(0);
			}else {
				System.out.println("숫자는 1 또는 0만 가능합니다.");
			}	
		}
	}
	
	@Override
	public void menu() {
		System.out.println("========== 메뉴 선택 ==========");
		System.out.println("1. 등록\n" + "2. 찾기\n" 
		+ "3. 삭제\n" + "4. 전체 출력\n" + "--------------------\n" + "0. 종료\n" + 
		"--------------------\n" + "번호를 선택해 주세요.. " );
		
		int num = getNumber();
		
		if (num >= 0 && num <= 4) {
			if (num == 0) {
				
				System.exit(0);
				
			}else if (num == 1) {
				
				registerMenu();
				
			}else if (num == 2) {
								
				findNameMenu();
				CEcheck();
				
			}else if (num == 3) {
				deleteMenu();
				CEcheck();
				
			}else if (num == 4) {
				
				selectAll();
				CEcheck();
			}
			
		}else {
			System.out.println("0 ~ 4 사이로 입력해 주세요.");
		}
		
	}


	@Override
	public void registerMenu() {
		
		System.out.println("========== 메뉴 선택 ==========");
		System.out.println("1. 학생\n2. 교수\n3. 관리자\n4. 이전메뉴\n번호를 선택해 주세요.. ");
		
		HaksaDto haksaDto = new HaksaDto(0, null, 0, null);
		
		int num = getNumber();
		
		if (num >= 1 && num <= 4) {
			
			if (num == 1) {
				
				System.out.print("나 이 : ");
				int age = getNumber();
				
				System.out.print("이 름 : ");
				String name = getName();
				
				System.out.print(job[num-1] + " : ");
				
				int key = num - 1;
				String value = getName();
				
				haksaDto = new HaksaDto(age, name, key, value);
				
				register(haksaDto);
				
			}else if (num == 2) {
				
				System.out.print("나 이 : ");
				int age = getNumber();
				
				System.out.print("이 름 : ");
				String name = getName();
				
				System.out.print(job[num-1] + " : ");

				int key = num - 1;
				String value = getName();

				haksaDto = new HaksaDto(age, name, key, value);
				
				register(haksaDto);
				
			}else if (num == 3) {
				
				System.out.print("나 이 : ");
				int age = getNumber();
				
				System.out.print("이 름 : ");
				String name = getName();
				
				System.out.print(job[num-1] + " : ");

				int key = num - 1;
				String value = getName();				

				haksaDto = new HaksaDto(age, name, key, value);
				register(haksaDto);
				
			}else if (num == 4) {
				menu();
			}
			
		}else {
			System.out.println("1~4 사이로 입력해 주세요.");
		}
		
		menu();
		
	}


	@Override
	public void register(HaksaDto haksa) {
		list.add(haksa);
	}


	@Override
	public void findNameMenu() {
		System.out.println("========== 메뉴 선택 ==========");
		System.out.print("찾을 이름을 입력해 주세요.\n이름 : ");
		
		String name = getName();
		findName(name);
		
	}


	@Override
	public void findName(String name) {
		
		HaksaDto dto = null;
		
		
		int a = 0;		
		
		int len = list.size();
		for (int i = 0; i < len; i++) {
			
			if ( name.equals(list.get(i).getName()) ) {
				System.out.println(list.get(i).toString());
			}
			
			if ( name.equals(list.get(i).getName()) ) {
				 a += 1; 
			}
		}
		
		if ( a == 0) {
			System.out.println("일치 하는 사람이 없습니다.");
		}
	
	}


	@Override
	public void deleteMenu() {
		
		System.out.println("========== 메뉴 선택 ==========");
		System.out.println("삭제할 사람의 이름을 입력해 주세요.\n이름 : ");
		
		String name = getName();	
		delete(name);
		
	}


	@Override
	public void delete(String name) {
		
		HaksaDto dto = null;
		
		
		int a = 0;		
		
		int len = list.size();
		for (int i = 0; i < len; i++) {
			
			if ( name.equals(list.get(i).getName()) ) {
				list.remove(i);
				a++;
				break;
			}
			
		}
		
		if ( a == 0) {
			System.out.println("일치 하는 사람이 없습니다.");
		}
		
	}


	@Override
	public void selectAll() {
		
		
		int len = list.size();
		for (int i = 0; i < len; i++) {
			System.out.println(list.get(i).toString());
			
			
		}
		
	}


	@Override
	public void processExit() {
		
	}
	
	
	
	
	
}










