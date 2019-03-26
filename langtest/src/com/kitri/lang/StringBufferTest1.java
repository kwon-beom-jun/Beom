package com.kitri.lang;

public class StringBufferTest1 {
	public static void main(String[] args) {
		
		
		StringBuffer sb1 = new StringBuffer("hello "); 
		//16개의 여유공간이 남아있음. 문자조작이 가능 / String은 문자를 생성할 시에 크기가 배정되어 조작이 불가능함.
		System.out.println("1. sb1 == " + sb1);
		
		int cap = sb1.capacity();
		System.out.println("초기 크기 : " + cap + "\n 문자열 수 : " + sb1.length());
		sb1.append("java ");
		//추가하다.
		System.out.println("2. sb1 == " + sb1); // 추가됨.
		System.out.println("초기 크기 : " + cap + "\n 문자열 수 : " + sb1.length());
		
		cap = sb1.capacity();
		sb1.append("!!!!!");
		System.out.println("3. sb1 == " + sb1); // 추가됨.
		System.out.println("초기 크기 : " + cap + "\n 문자열 수 : " + sb1.length());

//		cap = sb1.capacity();						?? 여기다 쓰면 안늘어나는 이유, 그 크기를 넘어갈 수 있는 이유	
		cap = sb1.capacity();
		sb1.append("!!!!!!!!");
		System.out.println("4. sb1 == " + sb1); // 추가됨.
		System.out.println("초기 크기 : " + cap + "\n 문자열 수 : " + sb1.length());
																					
		/*
		String s = "java";
		s.concat(hello);
		System.out.println(s);
		*/
		
//		StringBuffer sb1 = new StringBuffer(50);
//		StringBuffer(int capacity) 크기를 지정. 초기값  + 16개의 크기를 가짐. 초기값 + 16 보다 더 많아지면 또다시 16개의 공간을 줌
		
//		length() 길이를 되돌려줌.		
//		capacity() 크기를 되돌려줌.	
//		StringBuffer() 0개의 캐릭터 16개의 초기크기
		
		
		sb1.insert(10, "@@@");
		System.out.println("5. sb1 == " + sb1);
//		insert(int offset, boolean b) 처음값
		
		sb1.delete(10, 12);
		System.out.println("6. sb1 == " + sb1);
//		delete(int start, int end) 범위삭제
		
		sb1.deleteCharAt(10);
		System.out.println("7. sb1 == " + sb1);
//		deleteCharAt(int index) 문자 하나 삭제
		
		sb1.replace(6, 10, "자바")	;	
		System.out.println("8. sb1 == " + sb1);
//		replace(int start, int end, String str) 범위 지정 후 바꿔라. 10전까지 바꿔라.
		
		sb1.reverse();
		System.out.println("9. sb1 == " + sb1);
//		뒤집어줌.
		
		sb1.setCharAt(9, '@');
		System.out.println("9. sb1 == " + sb1);
//		setCharAt(int index, char ch)
		
		String s1 = new String(sb1);
		String s2 = sb1.toString();
//		StringBuffer 클래스를 String 클래스로 바꿔줌
//		toString()
//		Returns a string representing the data in this sequence.
		
		String str = "hello 자바 !!!";
		String findstr = "자바";
//		String findstr = "오라클";
		String restr = "java";
		
//		hello java !!!
//		오라클은 없습니다.
		
		StringBuffer str1 = new StringBuffer(str);			//	StringBuffer에 str이 들어갈 수 있는 이유
		StringBuffer findstr1 = new StringBuffer(findstr);
		StringBuffer restr1 = new StringBuffer(restr);
		str1.delete(6,8);
		str1.insert(6, restr);
		System.out.println(str1);
		
		StringBuffer str2 = new StringBuffer(str);
		StringBuffer findstr2 = new StringBuffer(findstr);
		StringBuffer restr2 = new StringBuffer(restr);
		str2.delete(0,12);
		str2.insert(0, findstr + "은 없습니다.");
		System.out.println(str2);
		
	
		
	}
}




//cap = sb1.capacity();						?? 여기다 쓰면 안늘어나는 이유, 그 크기를 넘어갈 수 있는 이유
//StringBuffer에 str이 들어갈 수 있는 이유
//강사님것 다시보고 새 클래스 만들기





















