package com.kitri.array;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class ArrayTest2 {
	
	public static void main(String[] args) {
		Car car[] = new Car[6];
		
		car[0] = new Car("쏘나타","검정색","현대");
		car[1] = new Car("k5","흰색","기아");
		car[2] = new Car("SM5","은색","삼성");
		car[3] = new Car("아반떼","흰색","현대");
		car[4] = new Car("니어로","비둘기색","기아");
		car[5] = new Car("싼타페","검정색","현대");
		
		System.out.println(car[0].getCarName());
		
		int len = car.length;
		for (int i = 0; i < len; i++) {
			System.out.println(i + 1 + "번째구역 : " + car[i]);
		}
		
		String name = "니어로";
//		비둘기색 니어로(기아)은 5번째에 있습니다.	
		for (int i = 0; i < len; i++) {
			if (car[i].getCarName().equals(name)) { // name.equals(car[i].getCarName())도 됨.
				System.out.println(car[i]);	
				System.out.println(car[i].getColor() + 
						" " + car[i].getCarName() + "(" + car[i].getMaker() + ")은 " 
						+ (i+1) + "번 째에 있습니다.");
				break; // 찾으면 정지시켜야됨. 아니면 계속 돌아감.
			}
		}
		
		System.out.println("---------------------------------------");
		
		String name1 = "QM5";
		
		/*
		for (int i = 0; i < len; i++) {
			if (car[i].getCarName().equals(name1)) { 
				System.out.println(car[i]);	
				System.out.println(car[i].getColor() + 
						" " + car[i].getCarName() + "(" + car[i].getMaker() + ")은 " 
						+ (i+1) + "번 째에 있습니다.");
				break; // 찾으면 정지시켜야됨. 아니면 계속 돌아감.
			}else if (car[i].getCarName().equals() != car[i].getCarName().equals(name1)) {
				System.out.println(car[i].getCarName() +"은 없습니다.");
			}
			
		}
		*/
		
		
		
	}
	

}
