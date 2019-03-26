
public class Store{

	public static void main(String[] args)	{
		
		Pointcard p1 = new Pointcard("박미래");
		Pointcard p2 = new Pointcard("황선혜");

		System.out.println(p1.name + "님 물건 구매");
		
		int point = p1.visit();
		System.out.println(p1.name + "님은 " + point + "번째 방문자입니다.\n");

		System.out.println(p2.name + "님 물건 구매");
		point = p2.visit();
		System.out.println(p2.name + "님은 " + point + "번째 방문자입니다.\n");

		System.out.println(p2.name + "님 물건 구매");
		point = p2.visit();
		System.out.println(p2.name + "님은 " + point + "번째 방문자입니다.");

		System.out.println("---------------------------------------------");
		
		
		
		
		
		
		Guest g1 = new Guest("박미래");
		Guest g2 = new Guest("황선혜");
	
		System.out.println(g1.name + "님 방문");
		int count = g1.visit();
		System.out.println(g1.name + "님은 " + count + "번째 방문자입니다.\n"); // Guest.cnt 클래스로 다가갈 수 있음. static!!

		System.out.println(p2.name + "님 방문");
		count = Guest.visit();
		System.out.println(g2.name + "님은 " + count + "번째 방문자입니다.\n"); // 메소드를 static 으로 바꿈. static 영역에 있으므로 사용 가능.

		System.out.println(p2.name + "님 방문");
		count = g2.visit();
		System.out.println(g2.name + "님은 " + count + "번째 방문자입니다.\n");
		

	}

}	
