public class WhileGugudan{
	public static void main(String[] args)	{
		
		System.out.println(" ������ ");
		int i = 2;
		// int a = 0; 

		while (i < 10)
		{
			int a = 1; // �ؿ� �ڵ��� ���� �ö���� 10�̴� �ٽ� ���� ��������ߵ�.
			while ( a < 10 )
			{
				// a++;
				System.out.print( i + "*" + a + "=" + (i * a) + " " );
				a++; // �ؿ� ����ߵ�. ���� ���ָ� 10���� ��.
			}
			i++;
			System.out.print("\n");
		}		
	}
}
