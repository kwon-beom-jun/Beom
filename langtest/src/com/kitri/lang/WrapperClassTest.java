package com.kitri.lang;

//Wrapper Class : 기본 DT을 클래스화

//기본 DT			WrapperClass
//boolean			Boolean
//char			Character
//byte			Byte
//short			Short
//int				Integer
//long			Long
//float			Float
//double			Double

public class WrapperClassTest {
	public static void main(String[] args) {	
		Boolean b1 = new Boolean("true");
		boolean b2 = b1.booleanValue();
		
		boolean b3 = Boolean.parseBoolean("true");
		
		if (b2) {
			System.out.println("b2는 true이다.");
		}
		if (b3) {
			System.out.println("b3는 true이다.");
		}
		
		String s = "123";
		System.out.println(s+4); // 1234
//		int x = (int) s; // 기본 타입에  래퍼런스가 들어 갈 수 업음.
//		Integer i = new Integer(s);
//		int x = i.intValue();
		int x = Integer.parseInt(s); // 1237 문자열은 안뎀 숫자로 변환 안뎀!!! , 숫자로 변경시켜줌
		System.out.println(x+4);
		
		s = "123.45";
		double d = Double.parseDouble(s);
		System.out.println(d + 4); // 127.45
		
		// autoboxing 단 조건은 래퍼클래스에서 같은 타입으로만 가능.
		Integer i2 = new Integer(3);
		int y = i2; // Integer만 가능함. unboxing. -- i2가 int로 바뀜
		Integer i3 = y;	//	boxing
	}
}








//equals(Object obj)
//toString()
