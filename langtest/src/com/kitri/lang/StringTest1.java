package com.kitri.lang;

public class StringTest1 {
	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "java";
		String s3 = new String ("java");
		String s4 = new String ("java");
		
		if (s1 == s2) {
			System.out.println("s1 s2�� �ּҰ��� ����."); 
			// o -- ���ڿ� ����ҿ� s1�� ���� ���� �� s2������ �� ���ڿ� ����ҿ� ������ �־� s1�� �ִ� �ּҰ��� ������.
		}
		if (s1 == s3) {
			System.out.println("s1 s3�� ����."); // x new�ؼ� �ּҰ��� �ٸ�.
		}
		if (s2 == s4) {
			System.out.println("s1 s4�� ����."); // x
		}
		if (s2 == s3) {
			System.out.println("s2 s3�� ����."); // x
		}
		if (s2 == s4) {
			System.out.println("s2 s4�� ����."); // x
		}
		if (s3 == s4) {
			System.out.println("s3 s4�� ����."); // x
		}
		
		System.out.println("--------------------------------------------");
		
		if (s1.equals(s2)) {
			System.out.println("s1 s2�� ���ڿ��� ����."); // o
			// equals�� object�� ������ ���� �ּҰ��� ���� ������ string class�� ������ �ִ� equals�� ���ڿ��� ����.
			// Override�� �Ȱ���.
		}
		if (s1.equals(s3)) {
			System.out.println("s1 s3�� ���ڿ��� ����."); // o
		}
		if (s2.equals(s4)) {
			System.out.println("s1 s4�� ���ڿ��� ����."); // o
		}
		if (s2.equals(s3)) {
			System.out.println("s2 s3�� ���ڿ���  ����."); // o
		}
		if (s2.equals(s4)) {
			System.out.println("s2 s4�� ���ڿ��� ����."); // o
		}
		if (s3.equals(s4)) {
			System.out.println("s3 s4�� ���ڿ��� ����."); // o
		}
		
	}

}
