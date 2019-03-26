package com.kitri.lang;

public class StringTest5 {
	public static void main(String[] args) {
		
		String str = "hello java !!!";
		int x = str.indexOf('a');
		System.out.println(str + "���� a�� " + (x + 1) + "��° �ִ�.");
//		indexOf(int ch) = ���ڿ��� ���° �ִ��� ��Ÿ����.

		x = str.indexOf('a' , 8);
		System.out.println(str + "���� 8��° ���� a�� " + (x + 1) + "��° �ִ�.");
//		indexOf(int ch, int fromIndex)
		
		x = str.indexOf("java");
		System.out.println(str + "���� java�� " + (x + 1) + "��° �ִ�.");
//		indexOf(String str) �������� ����.
		
		x = str.lastIndexOf("a");
		System.out.println(str + "���� ������ ���� a�� " + (x + 1) + "��° �ִ�.");
//		lastIndexOf(int ch)
		
		String str2 = "";
		System.out.println(str2 + "�� ���� : " + str2.length());
		if (str2.isEmpty()) {
			System.out.println("���ڿ�");
		}else {
			System.out.println("str2 == " + str2);
		}
//		isEmpty()
		
		String str3 = "  hello     ";
		System.out.println(str3 + "�� ���� : " + str3.length());
		System.out.println(str3.trim() + "�� ���� ���� ���� ���� : " + str3.trim().length());
//		trim() = ���� ���� ����. ���ڿ��� ���ڿ��� ���� ���� ���� ����.
		
		String str4 = "jaba";
		System.out.println(str4 + " :::: " + str4.replace('b', 'v'));
		System.out.println(str4 + " :::: " + str4.replace("jaba", "java"));
		System.out.println(str4 + " :::: " + str4.replaceAll("jaba", "java"));
//		replace(char oldChar, char newChar) / jdk : Since: 1.5 api�� �ִµ� �ȵŸ� jdk Ȯ���غ���.
//		replaceAll(String regex, String replacement)
//		String	replaceAll(String regex, String replacement) 1.4�̻� ������. 1.4���ϴ� ���ڿ� ���ٲ�.
		
		String str5 = "hello java !!!";
		String s[] = str5.split(" ");
		int len = s.length;
		for (int i = 0; i < len; i++) {
			System.out.println("s[" + i + "] == " + s[i]);
		}
//		split(String regex) regex = �������ڿ�. / ���� �������̳� ��� ��.
		
		System.out.println(str5.substring(6));
		System.out.println(str5.substring(6 , 9));
//		substring(int beginIndex) / 6���� ������. 0���ͽ���.
//		substring(int beginIndex) / 6���� ������. 9������. / ����Ŭ�� �ٸ�.
		
		// ���� >> ���ڿ�
		int num = 100;
		String sn1 = num + "";
		System.out.println(sn1 + 100);
		String sn2 = String.valueOf(num);
		System.out.println(sn2 + 100);
		String sn3 = Integer.toString(num);
		System.out.println(sn3 + 100);
//		valueOf(char c) char c�� ���ڿ��� �ٲ��
		// ���ڿ� >> ����
		String ns = "100";
		num = Integer.parseInt(ns);
		System.out.println(num + 100);
//		Integer.parseInt(String s) ���ڿ��� ���ڷ� �ٲٴ°��� �̰͹ۿ� ����.
		
		
	}
}


















