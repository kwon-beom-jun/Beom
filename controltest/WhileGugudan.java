public class WhileGugudan{
	public static void main(String[] args)	{
		
		System.out.println(" 구구단 ");
		int i = 2;
		// int a = 0; 

		while (i < 10)
		{
			int a = 1; // 밑에 코딩이 돌고 올라오면 10이니 다시 변수 지정해줘야뎀.
			while ( a < 10 )
			{
				// a++;
				System.out.print( i + "*" + a + "=" + (i * a) + " " );
				a++; // 밑에 써줘야뎀. 위에 써주면 10까지 감.
			}
			i++;
			System.out.print("\n");
		}		
	}
}
