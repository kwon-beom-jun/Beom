public class Car2{
	public static void main(String[] args)	{
		

		Car car1 = new Car();
		System.out.println(car1.info());

		Car car2 = new Car("흰색"); // 인자값이 String인 값을 호출함.
		System.out.println(car2.info());

		Car car3 = new Car("그랜져","흰색"); // 호출 할 때 순서가 맞아야뎀. 안그러면 바뀌여서 나옴. 컴퓨터는 순서대로 인식.
		System.out.println(car3.info());
		// 지정 해 줄 수는 없나??

		Car car4 = new Car("K5","은색","기아");
		System.out.println(car4.info());

		System.out.println("car4의 속도를 3회 증가!!!");
		
		for (int i = 0; i < 3 ; i++ )
		{
			car4.speedUp();
		}

		System.out.println("car4의 속도 : " + car4.speed);


		System.out.println("car4의 속도를 85 증가!!!");
		int speed = car4.speedUp(85); // 변수를 생성함.
		System.out.println("car4의 속도 : " + speed); // speedUp() 메소드에 this를 안붙이면 자기값에 85를 더해서 170이 나옴. 자동차 계기판 속도.
		System.out.println("car4의 속도 : " + car4.speed); // 현재 자동차 실제 속도.


		

	
		
		
		
		
		
		
		
		
		
		
		
		
		// car10.speedUp();



	}
}
