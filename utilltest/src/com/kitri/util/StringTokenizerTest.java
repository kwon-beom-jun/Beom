package com.kitri.util;

import java.util.StringTokenizer;
import java.util.UUID;

public class StringTokenizerTest {
	
	public static void main(String[] args) {
		
		String str = "hello java !!!";
//		StringTokenizer st = new StringTokenizer(str, "j");
		StringTokenizer st = new StringTokenizer(str);
		int cnt = st.countTokens();
		// j를 기준으로 토큰을 나눔.
		// 아무것도 지정을 안하면 공백을 가지고 토큰수로 나눔. hello/java/!!!
		System.out.println(cnt);
		
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		str = "To|권범준|안녕하세요 반가워요~";
		StringTokenizer st2 = new StringTokenizer(str , "|");
		String protocol = st2.nextToken();
		String to = st2.nextToken();
		String msg = st2.nextToken();
		
		System.out.println("기능 : " + protocol);
		System.out.println("누구에게 : " + to);
		System.out.println("보내는 메세지: " + msg);
		
		System.out.println(UUID.randomUUID()); // ? 이건 new안하고 바로 사용할 수 있는 이유?
		
		
	}
	
}









