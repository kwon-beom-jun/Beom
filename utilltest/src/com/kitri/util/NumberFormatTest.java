package com.kitri.util;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class NumberFormatTest {
	
	public static void main(String[] args) {
		
		double number = 34512412123.127123;
//		34,512,412,123.12
		
		NumberFormat nf = new DecimalFormat("##,###,###,###.##");
		String setn = nf.format(number);
		System.out.println(setn);
		
	}
	
}
