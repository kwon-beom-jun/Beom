package com.kitri.lang;

import java.io.UnsupportedEncodingException;

public class StringTest4 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String str = "abcdef";
		byte b[] = str.getBytes();
		int len = b.length;
		for (int i = 0; i < len; i++) {
			System.out.print("b[" + i + "] == " + b[i] + "\t");
		}		
		
		System.out.println();
		
		String str2 = "¾È³çÇÏ¼¼¿ä.";
//		byte b2[] = str2.getBytes();
		byte b2[] = str2.getBytes("utf-8"); //getBytes(Charset charset)
		int len2 = b2.length;
		for (int i = 0; i < len2; i++) {
			System.out.print("b[" + i + "] == " + b2[i] + "\t");
		}		
//		byte[] getBytes() // byte ¹è¿­·Î ÂÉ°³Áü.
//		getBytes(Charset charset)
		
		System.out.println();
		
		char c[] = str2.toCharArray();
		len = c.length;
		for (int i = 0; i < len; i++) {
			System.out.print(c[i] + "\t");
		}
//		toCharArray()
		
//		hashCode() = ÁÖ¼Ò°ª.
		

		
		
		
	}
}
