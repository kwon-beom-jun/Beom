public class StarCraft{
	public static void main(String[] args)	{
		Marine my = new Marine();
		Marine com = new Marine();
		// 내체력 : 100 적체력 : 100

		int count = 2;
		System.out.println("내가 적을 " + count + "회 공격!!!");
		// 내체력 : 100 적체력 : 80

		my.attack(com, count);

		count = 4;
		System.out.println("적이 나를 " + count + "회 공격!!!");
		// 내체력 : 60 적체력 : 80

		System.out.println("모드 변경!!!");
		// 내체력 : 35 적체력 : 80

		count = 3;
		System.out.println("내가 적을 " + count + "회 공격!!!");
		// 내체력 : 35 적체력 : 35

		System.out.println("모드 변경!!!");
		// 모드 변경 불가~!!! 경고나옴.
		// 내체력 : 35 적체력 : 80

		count = 3;
		System.out.println("적이 나를 " + count + "회 공격!!!");
		// 내체력 : 35 적체력 : die
	
	
	}
}
