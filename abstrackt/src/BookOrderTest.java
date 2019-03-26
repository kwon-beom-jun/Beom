public class BookOrderTest{
	public static void main(String[] args)	{
		
		int JAVA = 24000;
		int JQuery = 21000;
		int 오라클 = 19000;
		int 스프링 = 35000;

		int money = (JAVA + JQuery + 오라클 + 스프링);
		
		double card = money - (money*0.15);

		System.out.println("===== 도서 구입 목록 =====" +
			"\n"+"JAVA : " + JAVA +
			"\n"+"JQuery : " + JQuery +
			"\n"+"오라클 : " + 오라클 +
			"\n"+"스프링 : " + 스프링 +
			"\n"+"--------------------------" +
			"\n"+"추문 총금액 : " + money +
			"\n"+"할인후 결제 금액 : " + (int)card);

	}
}
