public class BookOrderTest{
	public static void main(String[] args)	{
		
		int JAVA = 24000;
		int JQuery = 21000;
		int ����Ŭ = 19000;
		int ������ = 35000;

		int money = (JAVA + JQuery + ����Ŭ + ������);
		
		double card = money - (money*0.15);

		System.out.println("===== ���� ���� ��� =====" +
			"\n"+"JAVA : " + JAVA +
			"\n"+"JQuery : " + JQuery +
			"\n"+"����Ŭ : " + ����Ŭ +
			"\n"+"������ : " + ������ +
			"\n"+"--------------------------" +
			"\n"+"�߹� �ѱݾ� : " + money +
			"\n"+"������ ���� �ݾ� : " + (int)card);

	}
}
