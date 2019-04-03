package com.kitri.util.jcf;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		System.out.println("list size == " + list.size());
		list.add("허경민");
		list.add("정수빈");
		list.add("박건우");
		list.add("김재환");
		System.out.println("list size == " + list.size());
		System.out.println("--- 두산의 타순 ---");
		
//		String[] name = list.toArray(new String[0]);
//		int len = name.length;
//		for (int i = 0; i < len; i++) {
//			System.out.println(i+1+".번 타자 : " + name[i]);
//		}
		
		
		int size = list.size();
		for (int i = 0; i < size; i++) {
			System.out.println(i+1+".번 타자 : " + list.get(i));
		}
		
		String name = "정수빈";
		for (int i = 0; i < size; i++) {
			if (list.get(i).equals(name)) {
//				boolean	equals(Object o)
				System.out.println(name + "은 " + (i+1) + "번타자입니다.");
				break;
			}	
		}	// 													여러명이면??
//		System.out.println(i+1+".번 타자 : " + list.get(i));			
		
		
		
		String name2 = "오재원";
		System.out.println(name + "을" + name2 + "오재원으로 교체");
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
			System.out.println(i+1+".번 타자 : " + list.get(i));
		}
		
		
	}

}





