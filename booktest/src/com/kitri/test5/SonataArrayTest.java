package com.kitri.test5;

import java.util.HashSet;
import java.util.Set;

public class SonataArrayTest {
	
	public static void main(String[] args) {
		
		System.out.println("===================== Sonata 생산 시작 =====================");
		
//		Sonata sonata[] = new Sonata[3];
//		
//		int len = sonata.length;
//		for (int i = 0; i < len; i++) {
//			sonata[i] = 
//		}
		
		Sonata sonata = new Sonata("흰색", 5000, "NF", "승용");
		Sonata sonata1 = new Sonata("은색", 7000, "Brilliant", "업무");
		Sonata sonata2 = new Sonata("감홍색", 4000, "EF", "택시");
		Sonata sonata3 = new Sonata("검정색", 6000, "Hybrid", "승용");
		
		System.out.println(sonata+ "\n" +sonata1+ "\n" +sonata2+ "\n" +sonata3);
		 
		
		
	}
	
	
}
