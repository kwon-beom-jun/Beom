package com.kitri.util.jcf;

import java.util.*;

public class MapTest {
	
	
	public static void main(String[] args) {
		
		
//		Map<String, PlayerDto> map = new HashMap<String, PlayerDto>(); // �Ȱ��� ����ȭ�� �ȵ�����.
		Map<String, PlayerDto> map = new Hashtable<String, PlayerDto>(); // ����� ����. ����� ����. ����ȭ�� ������.
		// ������Ʈ, ������Ʈ�� �ؾߵ�
		new PlayerDto(24, "�����", 4, 0.321);
		map.put("DS24", new PlayerDto(24, "�����", 4, 0.321));	// playerDto ���� �ִ� ����
		map.put("DS9", new PlayerDto(9, "�丣������", 3, 0.421));
		map.put("KW24", new PlayerDto(24, "�ں�ȣ", 3, 0.421));
		map.put("HH19", new PlayerDto(19, "���ٿ�", 3, 0.321));
//		put(K key, V value) // key�� �߿���. key�� ������ ��������.
//		<String, PlayerDto>
		
		int size = map.size();
		System.out.println("��� �ο� : " + size);
		
		int number = 24;
		System.out.println("�λ��� " + number + "���� ����");
		PlayerDto playerDto = map.get("DS" + number);
		System.out.println(playerDto);
		
//		put ���������
//		Collection<V>	values()
//		������ ������ Collection<v>�� ����
		
		
	}

}
