package com.kitri.lang;

public class StringTest1 {
	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "java";
		String s3 = new String ("java");
		String s4 = new String ("java");
		
		if (s1 == s2) {
			System.out.println("s1 s2는 주소값이 같다."); 
			// o -- 문자열 저장소에 s1이 먼저 생성 후 s2생성할 때 문자열 저장소에 같은게 있어 s1에 있는 주소값을 가져옴.
		}
		if (s1 == s3) {
			System.out.println("s1 s3는 같다."); // x new해서 주소값이 다름.
		}
		if (s2 == s4) {
			System.out.println("s1 s4는 같다."); // x
		}
		if (s2 == s3) {
			System.out.println("s2 s3는 같다."); // x
		}
		if (s2 == s4) {
			System.out.println("s2 s4는 같다."); // x
		}
		if (s3 == s4) {
			System.out.println("s3 s4는 같다."); // x
		}
		
		System.out.println("--------------------------------------------");
		
		if (s1.equals(s2)) {
			System.out.println("s1 s2는 문자열이 같다."); // o
			// equals는 object가 가지고 있음 주소값을 비교함 하지만 string class가 가지고 있는 equals는 문자열을 비교함.
			// Override가 된거임.
		}
		if (s1.equals(s3)) {
			System.out.println("s1 s3는 문자열이 같다."); // o
		}
		if (s2.equals(s4)) {
			System.out.println("s1 s4는 문자열이 같다."); // o
		}
		if (s2.equals(s3)) {
			System.out.println("s2 s3는 문자열이  같다."); // o
		}
		if (s2.equals(s4)) {
			System.out.println("s2 s4는 문자열이 같다."); // o
		}
		if (s3.equals(s4)) {
			System.out.println("s3 s4는 문자열이 같다."); // o
		}
		
	}

}
