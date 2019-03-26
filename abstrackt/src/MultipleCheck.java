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
				System.out.print("2의 배수 ");
				count1++;
			}
			if (num%Drainage2 == 0){
				System.out.print("3의 배수 ");
				count2++;
			}
			if (num%Drainage5 == 0){
				System.out.print( "5의 배수 ");
				count3++;
			}
			
			System.out.println();
			
		}
		System.out.println("==== 출력 횟수 ====" + "\n2의 배수 : " + count1 + "\n3의 배수 : "+ count2 + "\n5의 배수 : " + count3);
	}
}
