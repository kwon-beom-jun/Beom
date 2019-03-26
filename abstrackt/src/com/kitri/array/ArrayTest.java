package com.kitri.array;
// F:\Javadata\workspace\javase\abstrackt\src\com\kitri\array À§Ä¡

public class ArrayTest {
	public static void main(String[] args) {
		int x1 = 10;
		int x2 = 20;
		int x3 = 30;
		System.out.println("x1 = " + x1 + "\tx2 = " + x2 + "\tx3 = " + x3);
	
		int x[];
		x = new int[3];
		x[0] = 10;
		x[1] = 20;
		x[2] = 30;
		System.out.println("x[0] = " + x[0] + "\tx[1] = " + x[1] + "\tx[2] = " + x[2] );
		
		int len = x.length;
		System.out.println(len);
	}
	

}
