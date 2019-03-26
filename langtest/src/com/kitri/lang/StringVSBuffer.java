package com.kitri.lang;

public class StringVSBuffer {
	public static void main(String[] args) {
		
		long st = System.nanoTime();
		
		String str = "hello";
		for (int i = 0; i < 5000; i++) {
			str += i;
		}
		System.out.println(System.nanoTime() - st);
		
//		StringBuffer sb = new StringBuffer("hello");
//		for (int i = 0; i < 5000; i++) {
//			sb.append(i);
//		}
//		System.out.println(System.nanoTime() - st);
		
	}
}
// 500
// 1018015 1118406 838724
// 238948 230288 520234

//5000
// 41855045 41891930 41802124
// 1073181 1081200 1117443
