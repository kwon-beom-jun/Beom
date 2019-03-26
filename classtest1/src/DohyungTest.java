public class DohyungTest{
	public static void main(String[] args)	{
		
		Rect r1 = new Rect();
		System.out.println("가로가 " +r1.width+"이고 세로가 "+r1.heigh+"인 사각형의 넓이는 " + r1.calcArea() + " 둘레는 "+ r1.clacRound());
		// 가로가 4이고 세로가 3인 사각형의 넓이는 12이고 둘레는 14 입니다. 로 결과 뽑기.
		
		Rect r2 = new Rect(5,7);
		System.out.println("가로가 " + r2.width + "이고 세로가 " + r2.heigh + "인 사각형의 넓이는 " + r2.calcArea() + " 둘레는 "+ r2.clacRound());
		// 가로가 5이고 세로가 7인 사각형의 넓이는 35이고 둘레는 24 입니다. 로 결과 뽑기. 내 마음대로 뽑을 수 있게 만들기
		
		Circle c1 = new Circle();
		System.out.println("반지름" +  "넓이"  + "둘레"  );
		//반지름이 4인 원의 넓이는 48.xxx이고 둘레는 24.xxx 입니다.

		Circle c2 = new Circle();
		//반지름이 5인 원의 넓이는 75.xxx이고 둘레는 30.xxx 입니다. 내 마음대로 뽑을 수 있게 만들기.

		
	}
}
