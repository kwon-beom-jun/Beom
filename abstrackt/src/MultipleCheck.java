public class MultipleCheck{
	public static void main(String[] args)	{
				
		int count = 20;
		int Drainage = 2;
		int Drainage2 = 3;
		int Drainage5 = 5;
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;

		for ( int num = 1 ; num <= count ; num++ ){
			
			System.out.print(num + ". ");

			if (num%Drainage == 0 ){
				System.out.print("2�� ��� ");
				count1++;
			}
			if (num%Drainage2 == 0){
				System.out.print("3�� ��� ");
				count2++;
			}
			if (num%Drainage5 == 0){
				System.out.print( "5�� ��� ");
				count3++;
			}
			
			System.out.println();
			
		}
		System.out.println("==== ��� Ƚ�� ====" + "\n2�� ��� : " + count1 + "\n3�� ��� : "+ count2 + "\n5�� ��� : " + count3);
	}
}
