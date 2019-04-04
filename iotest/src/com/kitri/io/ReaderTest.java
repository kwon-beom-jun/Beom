package com.kitri.io;

import java.io.*;

public class ReaderTest {
	
	public static void main(String[] args) {
		
		Reader in = null;
		try {
			in = new InputStreamReader(System.in);		// 필터스트림, 캐릭터스트림이라고도 함.
			char c[] = new char[100];					 // 배열줘서 여러개 불러줄려함.
			System.out.println("입력 : ");
			int x = in.read(c);							// 문자수 (\r\n = enter)
			System.out.println("x == " + x);
			
			int len = c.length;
			for (int i = 0; i < len; i++) {
				System.out.println(c[i]);
			}
			//글자가 제대로 됬는지 확인. 쓰고 남은 남어지 바이트도 다 띄워줘서 문제.
			
			String str = new String(c , 0 , x -2);		//	입력글자를 그대로 끌어오기위해서 씀. 뒤에는 커서위치 조정할려함.
			System.out.println(str);					//	입력글자를 그대로 끌어오기위해서 씀.
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
