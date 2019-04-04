package com.kitri.haksa.service;

import java.io.*;
import java.util.ArrayList;

import com.kitri.haksa.data.HaksaDto;

public class HaksaServiceImpl implements HaksaService {
	
	
	ArrayList<HaksaDto> list = new ArrayList<HaksaDto>();
	
	
	
	BufferedReader in;  // ���ٷ� �ٲ� �� ����.
	private String job[] = {"�й�" , "����" , "�μ�"};
	
	
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
//	System.out.println("1. ���\n" + "2. ã��\n" 
//	+ "3. ����\n" + "4. ��ü ���\n" + "--------------------\n" + "0. ����" + 
//				"--------------------\n" + "��ȣ�� ������ �ּ���.. " );


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
		System.out.println("��� �Ͻ÷��� 1, �����Ͻ÷��� 0�� �Է����ּ���. ");
		
		for(;;){
			int num = getNumber();
			if (num == 1) {
				menu();
			}else if(num == 0) {
				System.exit(0);
			}else {
				System.out.println("���ڴ� 1 �Ǵ� 0�� �����մϴ�.");
			}	
		}
	}
	
	@Override
	public void menu() {
		System.out.println("========== �޴� ���� ==========");
		System.out.println("1. ���\n" + "2. ã��\n" 
		+ "3. ����\n" + "4. ��ü ���\n" + "--------------------\n" + "0. ����\n" + 
		"--------------------\n" + "��ȣ�� ������ �ּ���.. " );
		
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
			System.out.println("0 ~ 4 ���̷� �Է��� �ּ���.");
		}
		
	}


	@Override
	public void registerMenu() {
		
		System.out.println("========== �޴� ���� ==========");
		System.out.println("1. �л�\n2. ����\n3. ������\n4. �����޴�\n��ȣ�� ������ �ּ���.. ");
		
		HaksaDto haksaDto = new HaksaDto(0, null, 0, null);
		
		int num = getNumber();
		
		if (num >= 1 && num <= 4) {
			
			if (num == 1) {
				
				System.out.print("�� �� : ");
				int age = getNumber();
				
				System.out.print("�� �� : ");
				String name = getName();
				
				System.out.print(job[num-1] + " : ");
				
				int key = num - 1;
				String value = getName();
				
				haksaDto = new HaksaDto(age, name, key, value);
				
				register(haksaDto);
				
			}else if (num == 2) {
				
				System.out.print("�� �� : ");
				int age = getNumber();
				
				System.out.print("�� �� : ");
				String name = getName();
				
				System.out.print(job[num-1] + " : ");

				int key = num - 1;
				String value = getName();

				haksaDto = new HaksaDto(age, name, key, value);
				
				register(haksaDto);
				
			}else if (num == 3) {
				
				System.out.print("�� �� : ");
				int age = getNumber();
				
				System.out.print("�� �� : ");
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
			System.out.println("1~4 ���̷� �Է��� �ּ���.");
		}
		
		menu();
		
	}


	@Override
	public void register(HaksaDto haksa) {
		list.add(haksa);
	}


	@Override
	public void findNameMenu() {
		System.out.println("========== �޴� ���� ==========");
		System.out.print("ã�� �̸��� �Է��� �ּ���.\n�̸� : ");
		
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
			System.out.println("��ġ �ϴ� ����� �����ϴ�.");
		}
	
	}


	@Override
	public void deleteMenu() {
		
		System.out.println("========== �޴� ���� ==========");
		System.out.println("������ ����� �̸��� �Է��� �ּ���.\n�̸� : ");
		
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
			System.out.println("��ġ �ϴ� ����� �����ϴ�.");
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










