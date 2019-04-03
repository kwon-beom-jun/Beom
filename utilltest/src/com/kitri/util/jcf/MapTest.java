package com.kitri.util.jcf;

import java.util.*;

public class MapTest {
	
	
	public static void main(String[] args) {
		
		
//		Map<String, PlayerDto> map = new HashMap<String, PlayerDto>(); // 똑같음 동기화가 안돼있음.
		Map<String, PlayerDto> map = new Hashtable<String, PlayerDto>(); // 결과가 같음. 기능이 많음. 동기화가 되있음.
		// 오브젝트, 오브젝트로 해야됨
		new PlayerDto(24, "오재원", 4, 0.321);
		map.put("DS24", new PlayerDto(24, "오재원", 4, 0.321));	// playerDto 쓸수 있는 이유
		map.put("DS9", new PlayerDto(9, "페르난데스", 3, 0.421));
		map.put("KW24", new PlayerDto(24, "박병호", 3, 0.421));
		map.put("HH19", new PlayerDto(19, "정근우", 3, 0.321));
//		put(K key, V value) // key가 중요함. key가 같으면 덮어써버림.
//		<String, PlayerDto>
		
		int size = map.size();
		System.out.println("등록 인원 : " + size);
		
		int number = 24;
		System.out.println("두산의 " + number + "번의 정보");
		PlayerDto playerDto = map.get("DS" + number);
		System.out.println(playerDto);
		
//		put 집어넣을때
//		Collection<V>	values()
//		순서가 없으니 Collection<v>가 쓰임
		
		
	}

}
