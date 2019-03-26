package com.kitri.util;

import java.util.Random;

public class RandomTest {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		boolean b = random.nextBoolean();
		System.out.println(b);
//		nextBoolean() 랜덤하게 boolean값 호출
		
		double d = random.nextDouble();
		System.out.println(d);
		int i = random.nextInt();
		System.out.println(i);
		
		int r = random.nextInt(256);
		System.out.println(r); // 256전까지 호출 이므로 255까지 얻어옴.
		
		
		
	}
	
}
