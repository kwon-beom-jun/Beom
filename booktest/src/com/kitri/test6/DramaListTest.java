package com.kitri.test6;

import java.util.ArrayList;
import java.util.List;

public class DramaListTest{
	public static void main(String[] args) {
		

		
		ArrayList<Drama> dramaL = new ArrayList<Drama>();
		
		dramaL.add(new Drama("�� �ܿ�, �ٶ��� �д�.", "SBS", "�����", "���μ�", "������"));
		dramaL.add(new Drama("����� ����", "MBC", "�ּ���", "", ""));
		dramaL.add(new Drama("���̸���2", "KBS", "ǥ�μ�", "����", "�̴���"));
		dramaL.add(new Drama("�ְ�� �̼���", "KBS", "������", "", "������"));
		// index�� �˾Ƽ� ������� ������.
		
		int len = dramaL.size();
		for (int i = 0; i < len; i++) {
			System.out.println(dramaL.get(i));
		}
		
//		System.out.println(dramaL.toString()); // arraylist ����Ŭ������ tostring�� ���� ����.
		
	}
	
	
	
}
