package com.kitri.util;

import java.util.Random;

public class RandomTest {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		boolean b = random.nextBoolean();
		System.out.println(b);
//		nextBoolean() �����ϰ� boolean�� ȣ��
		
		double d = random.nextDouble();
		System.out.println(d);
		int i = random.nextInt();
		System.out.println(i);
		
		int r = random.nextInt(256);
		System.out.println(r); // 256������ ȣ�� �̹Ƿ� 255���� ����.
		
		
		
	}
	
}
