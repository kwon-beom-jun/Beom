package com.kitri.test;

import com.kitri.car.Car;

public class CarUser {
	public static void main(String[] args) {
		Car car = new Car("쏘나타" , "검은색", "현대");
		System.out.println("이름 : " + car.getName()); 
		System.out.println("색상 : " + car.getColor()); 
		System.out.println("제조사 : " + car.getMaker()); 
	// package가 달라져서 Car의 name에 public을 붙여야뎀. 안붙이면 default가 자동으로 생성 default는 같은 패키지만 사용가능.
		car.setColor("빨강");
		System.out.println("변경 후 생삭 : " + car.getColor());
		System.out.println(car);
		
	}
}
