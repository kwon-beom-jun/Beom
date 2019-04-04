package com.kitri.exception.runtime;

public class IndexBoundsTest {
	
	public static void main(String[] args) {
		
		String s[] = {"1","2","3","4"};
//		for (int i = 0; i <= 4; i++) {
//			System.out.println(s[i]);
//		}
//		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 4
//		at com.kitri.exception.runtime.IndexBoundsTest.main(IndexBoundsTest.java:9) 라고 오류가 남.
		
		int len = s.length;
		for (int i = 0; i < len; i++) {
			System.out.print(s[i]);
		}
		
		System.out.println();
		
		String str = "hell";
//		for (int i = 0; i < 5; i++) {
//			System.out.println(str.charAt(i));
//		}
//		Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 4
//		at java.lang.String.charAt(String.java:658)
//		at com.kitri.exception.runtime.IndexBoundsTest.main(IndexBoundsTest.java:21)
		len = str.length();
		for (int i = 0; i < len; i++) {
			System.out.print(str.charAt(i));
		}
		
		
		
	}
	
}
