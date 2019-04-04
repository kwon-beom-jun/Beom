package com.kitri.exception.runtime;

public class NumberFormatTest {

	public static void main(String[] args) {
		
		String s = "1 23 ";
//		try {
//			int x = Integer.parseInt(s);
//			System.out.println(x + 100);			
//		} catch (NumberFormatException e) {
//			System.out.println("숫자가 아닙니다.");
//		}
		
		if (isNumber(s)) {							//???
			int x = Integer.parseInt(s);
			System.out.println(x + 100);
		}else {
			System.out.println("숫자가 아닙니다.");
		}
	}
	
	private static boolean isNumber(String str){
		boolean flag = true;
		int len = str.length();
			for (int i = 0; i < len; i++) {
			int num = str.charAt(i) - 48;
		if(num < 0 || num > 9) {
				flag = false;
				break;
			}
		}	
		return flag;
	}

		
}
	

