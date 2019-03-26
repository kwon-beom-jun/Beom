
public class TaxiGuest{
	public static void main(String[] args)	{

		Taxi t1 = new Taxi();
		System.out.println("t1 >> " + t1.toString() + "기본요금 : " + t1.basicPrice); // 메소드는 상속 됨.
		
		Taxi t2 = new Taxi("k5,", "감홍색", "기아");
		System.out.println("t1 >> " + t2.toString() + "기본요금 : " + t2.basicPrice);

		int km = 20;
		System.out.println( t2 + "를 타고 구디에서 강남까지" + km + "km이동!!!");
		
		

		km = 2;
		t2.initPrice();
		System.out.println("요금 : " + t2.price + "원");
		t2.sumPrice(km);
		System.out.println("누적 수익" + t2.totalPrice + "원");

		km = 1;
		t2.initPrice();
		System.out.println("요금 : " + t2.price + "원" );
		t2.sumPrice(km);
		System.out.println("누적 수익" + t2.totalPrice + "원 \n\n");
		System.out.println( t2 + "를 타고 강남에서 구디까지" + km + "km이동!!!");


		int upDown = 50;
		System.out.println("t2의 속도를" + upDown + "만큼 가속!!!");
		int speed = t2.speedUp(upDown);
		System.out.println("t2의 속도 : " + speed + "  " + t2.speed); 

		upDown = 250;
		System.out.println("t2의 속도를" + upDown + "만큼 가속!!!");
		speed = t2.speedUp(upDown);
		System.out.println("t2의 속도 : " + speed + "  " + t2.speed); 
		
		/*
		System.out.println( t1 + "        " + t2 ); // t1은 클래스임 // 오브젝트 상속받으면 오브젝트라고 할 수 있음. 
		System.out.println( t1.toString() + "        " + t2 ); 
		// 문자열 + 숫자는 문자열인데 클래스는 오브젝트를 가져와서 toString이 생김 , toString은 주소값.							 ??
		*/


		Taxi t3 = new Taxi("k5,", "감홍색", "기아");
		System.out.println( t2 + "        " + t3 ); // tostring 을 써서 주소값을 쓸 수 없음.									다시공부.
		System.out.println( t2.hashCode() + "        " + t3.hashCode() ); // t3.hashCode()는 주소값
		
		if(t2 == t3)// 내용이 같은것이지 값이 다른것. ==(비교연산자)는 기본DT일 경우에 값을 비교만 참조형DT일 경우는 주소값을비교.
			System.out.println("t2와 t3는 주소값이 같은차이다.");
		else
			System.out.println("t2와 t3는 주소값이 다른차이다.");

		if(t2.equals(t3)) // 오브젝트의 주소값을 비교. boolean.
			System.out.println("t2와 t3는 차이름이 같은차이다.");
		else
			System.out.println("t2와 t3는 차이름이 다른차이다.");
		

	}
}
