package com.kitri.exception.runtime;

import java.util.Random;

public class ArithmeticTest {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		int x = 30;
//		int y = random.nextInt(5);
		
//		ArithmeticException은 runtime-e 이므로 로직으로 처리하는게 좋은 방법이다.
//		try {
//			int z = x / y;	
//			System.out.println(x + " / " + y + " = " + z);			
//		} catch (ArithmeticException e) {
//			System.out.println(e.getMessage());
//			System.out.println("0으로 나눌 수 없습니다.");
//		}
		
		
//		1. 위에랑 다른점은 위에는 에러가 나서 catch한거고 밑에는 에러가 나지 않았음.
		int y = random.nextInt(5);
		if (y != 0) {
			int z = x / y;	
			System.out.println(x + " / " + y + " = " + z);			
		} else {
			System.out.println("0으로 나눌 수 없습니다.");						
		}

		
		
//		2. 0을 아예 안나오게 바꿈
//		int y = random.nextInt(4)+1;
//		int z = x / y;	
//		System.out.println(x + " / " + y + " = " + z);			

		
		
	}

}
