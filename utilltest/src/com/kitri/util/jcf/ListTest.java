package com.kitri.util.jcf;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		System.out.println("list size == " + list.size());
		list.add("����");
		list.add("������");
		list.add("�ڰǿ�");
		list.add("����ȯ");
		System.out.println("list size == " + list.size());
		System.out.println("--- �λ��� Ÿ�� ---");
		
//		String[] name = list.toArray(new String[0]);
//		int len = name.length;
//		for (int i = 0; i < len; i++) {
//			System.out.println(i+1+".�� Ÿ�� : " + name[i]);
//		}
		
		
		int size = list.size();
		for (int i = 0; i < size; i++) {
			System.out.println(i+1+".�� Ÿ�� : " + list.get(i));
		}
		
		String name = "������";
		for (int i = 0; i < size; i++) {
			if (list.get(i).equals(name)) {
//				boolean	equals(Object o)
				System.out.println(name + "�� " + (i+1) + "��Ÿ���Դϴ�.");
				break;
			}	
		}	// 													�������̸�??
//		System.out.println(i+1+".�� Ÿ�� : " + list.get(i));			
		
		
		
		String name2 = "�����";
		System.out.println(name + "��" + name2 + "��������� ��ü");
		for (int i = 0; i < size; i++) {
			if (list.get(i).equals(name)) {
//				boolean	equals(Object o)
				list.set(i, name2);
//				E	set(int index, E element)
				break;
			}	
		}
		
		size = list.size();
		for (int i = 0; i < size; i++) {
			System.out.println(i+1+".�� Ÿ�� : " + list.get(i));
		}
		
		
	}

}





