public class ForTest1{
	public static void main(String[] args)	{
		System.out.println("1~10���� ���.");
		
		for (int i =1 ; i <= 10 ; i++ )
		{
			System.out.print(i+"  ");
		}
		
		System.out.print("\n" );
		System.out.println("1~10���� ���(Ȧ����).");

		for (int i = 1 ; i <= 10 ; i++ )
		{
			System.out.print(i++ + " ");
		}

		System.out.print("\n" );
		System.out.println("1~10���� ���(Ȧ����).");

		for (int i = 1 ; i <= 10 ; i+=2 )
		{
			System.out.print(i + " ");
		}

		System.out.print("\n" );
		System.out.println("1~10���� ���(Ȧ����).");

		for (int i = 1 ; i <= 10 ; i++ )
		{	
			if( i % 2 != 0 ){
				System.out.print(i + " ");
			}
		}

		System.out.print("\n" );			
		System.out.println("1~100���� ���(10�� ���� �ٹٲ�).");

		for ( int i = 1 ; i <= 100  ; i ++ )
		{
			System.out.print( i + " " );
			if(i == 10 || i == 20 || i == 30 || i == 40 || i == 50 || i == 60 || i == 70 || i == 80 || i == 90 ){
				System.out.println("");
			}
		}

		System.out.print("\n" );
		System.out.println("1~100���� ���(10�� ���� �ٹٲ�).");

		for ( int i = 1 ; i <= 100  ; i ++ )
		{
			System.out.print( i + " " );
			if( i % 10 == 0){
				System.out.print("\n" );
			}
		}

		System.out.println("\n���α׷� ����!!!.");

	}
}
