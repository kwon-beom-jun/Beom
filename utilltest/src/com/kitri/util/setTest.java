
package com.kitri.util;

import java.util.*;

public class setTest {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("Ȳ����");
		set.add("�ڹ̷�");
		set.add("�ڹ̷�");
		set.add("������");
		set.add("������");
		
		System.out.println("set�� ũ�� : " + set.size());
		
		Object ob[] = set.toArray();
//		Object[]	toArray()
	
//		int len = ob.length;
//		for (int i = 0; i < len; i++) {
//			System.out.println((String)ob[i]); // Ÿ���� ���� �𸦶�
//		}

		String str[] = set.toArray(new String[0]);
//		<T> T[]	toArray(T[] a)
//	     String[] y = x.toArray(new String[0]);
		int len = str.length;
		for (int i = 0; i < len; i++) {
			System.out.println(str[i]);
		}
		
		System.out.println("==========================================");
		Iterator<String> iterate = set.iterator();
		while(iterate.hasNext()) { // ���� ��ū �ֳ�
//			System.out.println(iterator.hasNext()); //���� ��ū ���Ͷ�
			System.out.println(iterate.next());
		}
	
	}
}









