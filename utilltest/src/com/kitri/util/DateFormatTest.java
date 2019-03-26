package com.kitri.util;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatTest {

	public static void main(String[] args) {
		
//		2019.03.26 14:25:30
		Date date = new Date();
		System.out.println(date);
		
		Format f = new SimpleDateFormat("yyyy.mm.dd HH:mm:ss"); // 생성자 보기.
		String today = f.format(date);
		System.out.println(today);
	}
	
}
