package com.kitri.lang;

public class StringTest5 {
	public static void main(String[] args) {
		
		String str = "hello java !!!";
		int x = str.indexOf('a');
		System.out.println(str + "에서 a는 " + (x + 1) + "번째 있다.");
//		indexOf(int ch) = 문자열에 몇번째 있는지 나타내줌.

		x = str.indexOf('a' , 8);
		System.out.println(str + "에서 8번째 부터 a는 " + (x + 1) + "번째 있다.");
//		indexOf(int ch, int fromIndex)
		
		x = str.indexOf("java");
		System.out.println(str + "에서 java는 " + (x + 1) + "번째 있다.");
//		indexOf(String str) 시작점을 말함.
		
		x = str.lastIndexOf("a");
		System.out.println(str + "에서 끝에서 부터 a는 " + (x + 1) + "번째 있다.");
//		lastIndexOf(int ch)
		
		String str2 = "";
		System.out.println(str2 + "의 길이 : " + str2.length());
		if (str2.isEmpty()) {
			System.out.println("빈문자열");
		}else {
			System.out.println("str2 == " + str2);
		}
//		isEmpty()
		
		String str3 = "  hello     ";
		System.out.println(str3 + "의 길이 : " + str3.length());
		System.out.println(str3.trim() + "의 공백 제거 후의 길이 : " + str3.trim().length());
//		trim() = 공백 제거 길이. 문자열과 문자열의 사이 공백 제거 못함.
		
		String str4 = "jaba";
		System.out.println(str4 + " :::: " + str4.replace('b', 'v'));
		System.out.println(str4 + " :::: " + str4.replace("jaba", "java"));
		System.out.println(str4 + " :::: " + str4.replaceAll("jaba", "java"));
//		replace(char oldChar, char newChar) / jdk : Since: 1.5 api에 있는데 안돼면 jdk 확인해보기.
//		replaceAll(String regex, String replacement)
//		String	replaceAll(String regex, String replacement) 1.4이상만 가능함. 1.4이하는 문자열 못바꿈.
		
		String str5 = "hello java !!!";
		String s[] = str5.split(" ");
		int len = s.length;
		for (int i = 0; i < len; i++) {
			System.out.println("s[" + i + "] == " + s[i]);
		}
//		split(String regex) regex = 기존문자열. / 뭘로 나눌것이냐 라는 뜻.
		
		System.out.println(str5.substring(6));
		System.out.println(str5.substring(6 , 9));
//		substring(int beginIndex) / 6부터 끝까지. 0부터시작.
//		substring(int beginIndex) / 6부터 끝까지. 9전까지. / 오라클은 다름.
		
		// 숫자 >> 문자열
		int num = 100;
		String sn1 = num + "";
		System.out.println(sn1 + 100);
		String sn2 = String.valueOf(num);
		System.out.println(sn2 + 100);
		String sn3 = Integer.toString(num);
		System.out.println(sn3 + 100);
//		valueOf(char c) char c를 문자열로 바꿔라
		// 문자열 >> 숫자
		String ns = "100";
		num = Integer.parseInt(ns);
		System.out.println(num + 100);
//		Integer.parseInt(String s) 문자열을 숫자로 바꾸는것은 이것밖에 없음.
		
		
	}
}


















