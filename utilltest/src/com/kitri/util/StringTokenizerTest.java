package com.kitri.util;

import java.util.StringTokenizer;
import java.util.UUID;

public class StringTokenizerTest {
	
	public static void main(String[] args) {
		
		String str = "hello java !!!";
//		StringTokenizer st = new StringTokenizer(str, "j");
		StringTokenizer st = new StringTokenizer(str);
		int cnt = st.countTokens();
		// j�� �������� ��ū�� ����.
		// �ƹ��͵� ������ ���ϸ� ������ ������ ��ū���� ����. hello/java/!!!
		System.out.println(cnt);
		
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		str = "To|�ǹ���|�ȳ��ϼ��� �ݰ�����~";
		StringTokenizer st2 = new StringTokenizer(str , "|");
		String protocol = st2.nextToken();
		String to = st2.nextToken();
		String msg = st2.nextToken();
		
		System.out.println("��� : " + protocol);
		System.out.println("�������� : " + to);
		System.out.println("������ �޼���: " + msg);
		
		System.out.println(UUID.randomUUID()); // ? �̰� new���ϰ� �ٷ� ����� �� �ִ� ����?
		
		
	}
	
}









