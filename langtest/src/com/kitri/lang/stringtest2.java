package com.kitri.lang;

import java.io.UnsupportedEncodingException;

public class stringtest2 {
	public static void main(String[] args) throws UnsupportedEncodingException {
//		String str1 = null; // null ���� �ȿö�. empty�� ���� �ö󰡱������� �������. 
		String str1 = new String(); // ""�� ����.
		System.out.println("���ڿ� ���� : " + str1.length());
		
//		byte b[] = {97, 98, 99, 100};
		byte b[] = {-66,-56,-77,-25,-57,-49,-68,-68,-65,-28,46,};
		String str2 = new String(b);
//		String str2 = new String(b, "euc-kr"); // �ƹ��͵� �Ⱦ��� euc-kr��. 2����Ʈ�� ó��
		System.out.println(str2);
		
		byte b2[] = {-20,-107,-120,-21,-123,-107,-19,-107,-104,-20,-124,-72,-20,-102,-108,46};
		String str3 = new String(b2, "utf-8"); // �������� ��Ŭ�������� ���� ��ġ�� throws ����.
//		String(byte[] bytes, Charset charset)
		System.out.println("str3 = " + str3); // �ѱ��� ������ ����ϴ� ���. utf-8�� ���ڸ� �׸���. 3����Ʈ
		
		byte b3[] = {97, 98, 99, 100, 101 ,102 ,103 ,104};
		String str4 = new String(b, 2, 4);
		System.out.println("str4 == " + str4); 
//		String(byte[] bytes, int offset(������), int length) == ��𼭺��� ������ �̾Ƽ� ����ڴ�.
//		String(byte[] bytes, int offset, int length, String charsetName)				??
		
//		char c[] = {'a', 'b', 'c', 'd', 'e', 'f'};
		char c[] = {'��', '��', '��', '��', '��', '.'};
		String str5 = new String(c);
		System.out.println("str5 == " + str5);
//		String(char[] value)
		
		String str6 = new String(c,2,4);
		System.out.println("str6 == " + str6);
//		String(char[] value, int offset, int count) ���ڴ� count�� �����.
		
		String str7 = new String("�ȳ��ϼ���");
		System.out.println(str7);
//		String(String original)
		
		
		
		
		
		
	} 

}
