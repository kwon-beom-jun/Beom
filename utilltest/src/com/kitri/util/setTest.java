
package com.kitri.util;

import java.util.*;

public class setTest {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("황선혜");
		set.add("박미래");
		set.add("박미래");
		set.add("이혜린");
		set.add("조윤영");
		
		System.out.println("set의 크기 : " + set.size());
		
		Object ob[] = set.toArray();
//		Object[]	toArray()
	
//		int len = ob.length;
//		for (int i = 0; i < len; i++) {
//			System.out.println((String)ob[i]); // 타입이 뭔지 모를때
//		}

		String str[] = set.toArray(new String[0]);
//		<T> T[]	toArray(T[] a)
//	     String[] y = x.toArray(new String[0]);
		int len = str.length;
		for (int i = 0; i < len; i++) {
			System.out.println(str[i]);
		}
		
		System.out.println("==========================================");
		Iterator<String> iterate = set.iterator();
		while(iterate.hasNext()) { // 다음 토큰 있냐
//			System.out.println(iterator.hasNext()); //다음 토큰 얻어와라
			System.out.println(iterate.next());
		}
	
	}
}









