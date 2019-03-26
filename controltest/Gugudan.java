

public class Gugudan{
	public static void main(String[] args)	{
		
		System.out.println(" ** 备备窜 1 **");
		
		
		/*
		for(int i = 2; i <= 9; i++){			
			int d = 1;
			System.out.print( (i * 1) + "*" + d + "=" + (i * d) + " " );
		}
		System.out.println();
		for(int i = 2; i <= 9; i++){			
			int d = 2;
			System.out.print( (i * 1) + "*" + d + "=" + (i * d) + " " );
		}
		System.out.println();
		for(int i = 2; i <= 9; i++){			
			int d = 3;
			System.out.print( (i * 1) + "*" + d + "=" + (i * d) + " " );
		}
		System.out.println();
		for(int i = 2; i <= 9; i++){			
			int d = 4;
			System.out.print( (i * 1) + "*" + d + "=" + (i * d) + " " );
		}
		System.out.println();
		for(int i = 2; i <= 9; i++){			
			int d = 5;
			System.out.print( (i * 1) + "*" + d + "=" + (i * d) + " " );
		}
		System.out.println();
		for(int i = 2; i <= 9; i++){			
			int d = 6;
			System.out.print( (i * 1) + "*" + d + "=" + (i * d) + " " );
		}
		System.out.println();
		for(int i = 2; i <= 9; i++){			
			int d = 7;
			System.out.print( (i * 1) + "*" + d + "=" + (i * d) + " " );
		}
		System.out.println();
		for(int i = 2; i <= 9; i++){			
			int d = 8;
			System.out.print( (i * 1) + "*" + d + "=" + (i * d) + " " );
		}
		System.out.println();
		for(int i = 2; i <= 9; i++){			
			int d = 9;
			System.out.print( (i * 1) + "*" + d + "=" + (i * d) + " " );
		}
		System.out.println();
		*/
		
		for(int i = 2; i <= 9; i++){
			for( int d =1 ; d <= 9 ; d++ )
			{
				System.out.print( (i * 1) + "*" + d + "=" + (i * d) + " " );
			}
			System.out.println();
		}
	
	System.out.println(" ** 备备窜 2 **");
	
	for(int d = 1 ; d <= 9 ; d++ ){
			for(int i = 2 ; i <= 9 ; i++ )
			{	
				System.out.print( i + "*" + d + "=" + (i * d) + " ");
			}
			System.out.println();
		}
	}
}
