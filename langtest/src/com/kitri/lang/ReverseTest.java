package com.kitri.lang;

public class ReverseTest {
	public static void main(String[] args) {
		String str = "!!! avaJ olleH";
		String s = "";
		
//		Hello Java !!! �ٲٱ�. �ּ� 3���̻� �ٲٱ�.
		System.out.println(str + " >>> " + str.replace("!!! avaJ olleH", "Hello Java !!!"));
		
		System.out.println("--------------------------------------");
		
		char c[] = str.toCharArray();
		int len = c.length; // length() = ���ڿ�.
		
//		System.out.println(len);
//		System.out.println(c[13]);
//		for ( len - 1; len >= 0; len--) {
//			System.out.println(c[len]);
//		}
		
		for (int i = len - 1; i >= 0; i--) { // 0���� �����̹Ƿ� -1�� ����ߵ�.
			s += c[i];
		}
		System.out.println(s);
		int x = s.indexOf('e');
		System.out.println(x + 1);
		
		System.out.println();
		System.out.println("--------------------------------------");
		
		
//		�ѱ��϶� ��� �Ұ�.
		byte b[] = str.getBytes();
		String s2 = "";
		
		for (int i = len -1 ; i >= 0; i--) {
			byte b2[] = {b[i]};
			String str2 = new String(b2);
			System.out.print(str2); // �ѱ��ھ� �̾Ƴ�����.
			s2 += str2; // �ѱ��ھ� �߰���.
		}
		System.out.println();
		System.out.println(s2);
		
		
		
		
		
		System.out.println();
		System.out.println("--------------------------------------");

		
		
//		String str = "hello java !!!";
//		int x = str.indexOf('a');
//		System.out.println(str + "���� a�� " + (x + 1) + "��° �ִ�.");
//		indexOf(int ch) = ���ڿ��� ���° �ִ��� ��Ÿ����.
		
//		e�� 2��°�ֽ��ϴ�. ������ ����.
		
		
	}
}
