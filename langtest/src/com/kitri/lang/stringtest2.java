package com.kitri.lang;

import java.io.UnsupportedEncodingException;

public class stringtest2 {
	public static void main(String[] args) throws UnsupportedEncodingException {
//		String str1 = null; // null 힙에 안올라감. empty는 힙에 올라가긴하지만 빈공간임. 
		String str1 = new String(); // ""랑 같음.
		System.out.println("문자열 길이 : " + str1.length());
		
//		byte b[] = {97, 98, 99, 100};
		byte b[] = {-66,-56,-77,-25,-57,-49,-68,-68,-65,-28,46,};
		String str2 = new String(b);
//		String str2 = new String(b, "euc-kr"); // 아무것도 안쓰면 euc-kr임. 2바이트로 처리
		System.out.println(str2);
		
		byte b2[] = {-20,-107,-120,-21,-123,-107,-19,-107,-104,-20,-124,-72,-20,-102,-108,46};
		String str3 = new String(b2, "utf-8"); // 에러나면 이클립스에서 에러 고치면 throws 생김.
//		String(byte[] bytes, Charset charset)
		System.out.println("str3 = " + str3); // 한글이 깨지면 사용하는 방법. utf-8은 글자를 그린다. 3바이트
		
		byte b3[] = {97, 98, 99, 100, 101 ,102 ,103 ,104};
		String str4 = new String(b, 2, 4);
		System.out.println("str4 == " + str4); 
//		String(byte[] bytes, int offset(시작점), int length) == 어디서부터 어디까지 뽑아서 만들겠다.
//		String(byte[] bytes, int offset, int length, String charsetName)				??
		
//		char c[] = {'a', 'b', 'c', 'd', 'e', 'f'};
		char c[] = {'안', '녕', '하', '세', '요', '.'};
		String str5 = new String(c);
		System.out.println("str5 == " + str5);
//		String(char[] value)
		
		String str6 = new String(c,2,4);
		System.out.println("str6 == " + str6);
//		String(char[] value, int offset, int count) 문자는 count를 사용함.
		
		String str7 = new String("안녕하세요");
		System.out.println(str7);
//		String(String original)
		
		
		
		
		
		
	} 

}
