package com.kitri.array;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class ArrayTest2 {
	
	public static void main(String[] args) {
		Car car[] = new Car[6];
		
		car[0] = new Car("�Ÿ","������","����");
		car[1] = new Car("k5","���","���");
		car[2] = new Car("SM5","����","�Ｚ");
		car[3] = new Car("�ƹݶ�","���","����");
		car[4] = new Car("�Ͼ��","��ѱ��","���");
		car[5] = new Car("��Ÿ��","������","����");
		
		System.out.println(car[0].getCarName());
		
		int len = car.length;
		for (int i = 0; i < len; i++) {
			System.out.println(i + 1 + "��°���� : " + car[i]);
		}
		
		String name = "�Ͼ��";
//		��ѱ�� �Ͼ��(���)�� 5��°�� �ֽ��ϴ�.	
		for (int i = 0; i < len; i++) {
			if (car[i].getCarName().equals(name)) { // name.equals(car[i].getCarName())�� ��.
				System.out.println(car[i]);	
				System.out.println(car[i].getColor() + 
						" " + car[i].getCarName() + "(" + car[i].getMaker() + ")�� " 
						+ (i+1) + "�� °�� �ֽ��ϴ�.");
				break; // ã���� �������Ѿߵ�. �ƴϸ� ��� ���ư�.
			}
		}
		
		System.out.println("---------------------------------------");
		
		String name1 = "QM5";
		
		/*
		for (int i = 0; i < len; i++) {
			if (car[i].getCarName().equals(name1)) { 
				System.out.println(car[i]);	
				System.out.println(car[i].getColor() + 
						" " + car[i].getCarName() + "(" + car[i].getMaker() + ")�� " 
						+ (i+1) + "�� °�� �ֽ��ϴ�.");
				break; // ã���� �������Ѿߵ�. �ƴϸ� ��� ���ư�.
			}else if (car[i].getCarName().equals() != car[i].getCarName().equals(name1)) {
				System.out.println(car[i].getCarName() +"�� �����ϴ�.");
			}
			
		}
		*/
		
		
		
	}
	

}
