package com.kitri.haksa.service;

import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.kitri.haksa.data.HaksaDto;
import com.kitri.haksa.db.*;

public class HaksaServiceImpl implements HaksaService {

	ArrayList<HaksaDto> list = new ArrayList<HaksaDto>();
	//Connection haksa = new HaksaConnection().getConnection();
	HaksaDao haksaDao;

	BufferedReader in; // ���ٷ� �ٲ� �� ����.
	private String job[] = { "�й�", "����", "�μ�" };

	public String getJob(int i) {
		return job[i];
	}

	public void setJob(String[] job) {
		this.job = job;
	}

	public HaksaServiceImpl() {
		super();
		in = new BufferedReader(new InputStreamReader(System.in));
		haksaDao = new HaksaDao();

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

		for (;;) {
			int num = getNumber();
			if (num == 1) {
				menu();
			} else if (num == 0) {
				System.exit(0);
			} else {
				System.out.println("���ڴ� 1 �Ǵ� 0�� �����մϴ�.");
			}
		}
	}

	@Override
	public void menu() {
		System.out.println("========== �޴� ���� ==========");
		System.out.println("1. ���\n" + "2. ã��\n" + "3. ����\n" + "4. ��ü ���\n" + "--------------------\n" + "0. ����\n"
				+ "--------------------\n" + "��ȣ�� ������ �ּ���.. ");

		int num = getNumber();

		if (num >= 0 && num <= 4) {
			if (num == 0) {

				System.exit(0);

			} else if (num == 1) {

				registerMenu();

			} else if (num == 2) {

				findNameMenu();
				CEcheck();

			} else if (num == 3) {
				
				deleteMenu();
				CEcheck();

			} else if (num == 4) {

				selectAll();
				CEcheck();
			}

		} else {
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

				System.out.print(job[num - 1] + " : ");
				
				String value = getName();
				int key = num;

				haksaDto = new HaksaDto(age, name, key, value);

				register(haksaDto);

			} else if (num == 2) {

				System.out.print("�� �� : ");
				int age = getNumber();

				System.out.print("�� �� : ");
				String name = getName();

				System.out.print(job[num - 1] + " : ");
				
				String value = getName();
				int key = num;

				haksaDto = new HaksaDto(age, name, key, value);

				register(haksaDto);

			} else if (num == 3) {

				System.out.print("�� �� : ");
				int age = getNumber();

				System.out.print("�� �� : ");
				String name = getName();

				System.out.print(job[num - 1] + " : ");

				String value = getName();
				int key = num;

				haksaDto = new HaksaDto(age, name, key, value);
				register(haksaDto);

			} else if (num == 4) {
				menu();
			}

		} else {
			System.out.println("1~4 ���̷� �Է��� �ּ���.");
		}

		menu();

	}

	@Override
	public void register(HaksaDto haksa) {
		haksaDao.register(haksa);
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
		haksaDao.findName(name);
	}

	@Override
	public void deleteMenu() {
		
		//HaksaDto haksaDto = new HaksaDto(0, null, 0, null);
		
		System.out.println("========== �޴� ���� ==========");
		System.out.println("������ ����� �̸��� �Է��� �ּ���.\n�̸� : ");

		String name = getName();
		delete(name);
		

	}

	@Override
	public void delete(String name) {
		haksaDao.delete(name);
	}

	@Override
	public void selectAll() {
		List<HaksaDto> list = haksaDao.selectAll();
		int len = list.size();
		for (int i = 0; i < len; i++) {
			System.out.println(list.get(i));
		}
	}

	@Override
	public void processExit() {

	}

}
