package com.kitri.io;

import java.io.IOException;

public class StdInOutTest {
	
	public static void main(String[] args) {
		
		try {
//			System.out.print("입력1 : ");
//			int x = System.in.read(); // 입력할때 제일 맨 앞 아스키코드로 됌.
//			System.out.println("1. x == " + x);
//			System.out.println("1. x == " + (char)x);
			
			System.out.print("입력2 : ");
			byte b[] = new byte[100];
			
			int x = System.in.read(b);
			System.out.println("2. x == " + x); // enter를 누르게 되는순간 2byte가 추가됌.
			
			int len = b.length;
			for (int i = 0; i < len; i++) {
				System.out.println(b[i]);
			}
			
			String s = new String(b, 0, x - 2);
			System.out.println("s == " + s);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
