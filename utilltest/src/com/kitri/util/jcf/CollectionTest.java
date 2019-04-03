package com.kitri.util.jcf;

import java.util.*;

public class CollectionTest {

	public static void main(String[] args) {
		Collection coll = new ArrayList(); // 중복 데이터 저장 O
//		Collection coll = new HashSet(); // 중복 데이터 저장 X                                                                
		System.out.println("초기 크기 : " + coll.size());
		coll.add("홍길동");
		coll.add("이순신");
		coll.add("강감찬");
		coll.add("윤봉길");
		coll.add("윤봉길");
//		coll.add(new Integer(10));
		System.out.println("마지막 크기 : " + coll.size());
		
		Object ob[] = coll.toArray();
		
		int len = ob.length;
		for (int i = 0; i < len; i++) {
			System.out.println((String)ob[i]);
		}
		
	}
	
}
