public class CarUser{
	public static void main(String[] args)	{
		
		
		Car car1 = new Car(); // 생성자가 안만들어 졌는데 써지는 이유는 Car클레스에 default( public Car();)로 숨어져 있음
		
		System.out.println(car1); // 좌표값.
		System.out.println(car1.carName); // 지정 안해서 null값.
		
		System.out.println("1. 차이름 : " + car1.carName + " 색상 " + car1.color +" 제조사 : " + car1.maker );
		car1.carName = "쏘나타";
		car1.color = "검정색";
		car1.maker = "현대";
		System.out.println("2. 차이름 : " + car1.carName + " 색상 " + car1.color +" 제조사 : " + car1.maker );
		
		System.out.println("최초" + car1.carName + "의 속도 : " + car1.speed);
		System.out.println("car1의 속도를 2회 증가!!!");
		car1.speedup();
		car1.speedup();
		System.out.println("2회 증가후" + car1.carName + "의 속도 : " + car1.speed);
		
		
		for (int i = 0; i < 28 ; i++ )
		{
			car1.speedup();
		}
		System.out.println("30회 증가후" + car1.carName + "의 속도 : " + car1.speed);

		for (int i = 0; i < 50 ; i++ )
		{
			car1.speedDown();
		}
		System.out.println("30회 증가후" + car1.carName + "의 속도 : " + car1.speed); // 음수는 불가능하니 조건걸어주기.






		Car car2 = new Car();
		
		car2.carName = "람보르기니";
		car2.color = "파랑색";
		car2.maker = "람보르";
		System.out.println("2. 차이름 : " + car2.carName + " 색상 : " + car2.color +" 제조사 : " + car2.maker );
		
		
		
	}
}
