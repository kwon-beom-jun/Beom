package com.kitri.lang;

public class ReverseTest {
	public static void main(String[] args) {
		String str = "!!! avaJ olleH";
		String s = "";
		
//		Hello Java !!! 바꾸기. 최소 3개이상 바꾸기.
		System.out.println(str + " >>> " + str.replace("!!! avaJ olleH", "Hello Java !!!"));
		
		System.out.println("--------------------------------------");
		
		char c[] = str.toCharArray();
		int len = c.length; // length() = 문자열.
		
//		System.out.println(len);
//		System.out.println(c[13]);
//		for ( len - 1; len >= 0; len--) {
//			System.out.println(c[len]);
//		}
		
		for (int i = len - 1; i >= 0; i--) { // 0부터 시작이므로 -1을 해줘야뎀.
			s += c[i];
		}
		System.out.println(s);
		int x = s.indexOf('e');
		System.out.println(x + 1);
		
		System.out.println();
		System.out.println("--------------------------------------");
		
		
//		한글일때 사용 불가.
		byte b[] = str.getBytes();
		String s2 = "";
		
		for (int i = len -1 ; i >= 0; i--) {
			byte b2[] = {b[i]};
			String str2 = new String(b2);
			System.out.print(str2); // 한글자씩 뽑아낸거임.
			s2 += str2; // 한글자씩 추가함.
		}
		System.out.println();
		System.out.println(s2);
		
		
		
		
		
		System.out.println();
		System.out.println("--------------------------------------");

		
		
//		String str = "hello java !!!";
//		int x = str.indexOf('a');
//		System.out.println(str + "에서 a는 " + (x + 1) + "번째 있다.");
//		indexOf(int ch) = 문자열에 몇번째 있는지 나타내줌.
		
//		e는 2번째있습니다. 뒤집은 다음.
		
		
	}
}
