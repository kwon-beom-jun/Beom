package com.kitri.test6;

import java.util.ArrayList;
import java.util.List;

public class DramaListTest{
	public static void main(String[] args) {
		

		
		ArrayList<Drama> dramaL = new ArrayList<Drama>();
		
		dramaL.add(new Drama("그 겨울, 바람이 분다.", "SBS", "김규태", "조인성", "송혜교"));
		dramaL.add(new Drama("백년의 유산", "MBC", "주성우", "", ""));
		dramaL.add(new Drama("아이리스2", "KBS", "표민수", "작혁", "이다해"));
		dramaL.add(new Drama("최고다 이순신", "KBS", "윤성식", "", "아이유"));
		// index를 알아서 순서대로 지정함.
		
		int len = dramaL.size();
		for (int i = 0; i < len; i++) {
			System.out.println(dramaL.get(i));
		}
		
//		System.out.println(dramaL.toString()); // arraylist 상위클래스에 tostring이 따로 있음.
		
	}
	
	
	
}
