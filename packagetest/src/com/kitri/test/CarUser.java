package com.kitri.test;

import com.kitri.car.Car;

public class CarUser {
	public static void main(String[] args) {
		Car car = new Car("�Ÿ" , "������", "����");
		System.out.println("�̸� : " + car.getName()); 
		System.out.println("���� : " + car.getColor()); 
		System.out.println("������ : " + car.getMaker()); 
	// package�� �޶����� Car�� name�� public�� �ٿ��ߵ�. �Ⱥ��̸� default�� �ڵ����� ���� default�� ���� ��Ű���� ��밡��.
		car.setColor("����");
		System.out.println("���� �� ���� : " + car.getColor());
		System.out.println(car);
		
	}
}
