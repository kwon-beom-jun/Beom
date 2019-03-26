public class WhileLotto{
	public static void main(String[] args)	{

			/*
			int num1 = 0;
			int num2 = 0;
			int num3 = 0;
			
			for( ; ; ){
				num1 = (int)(Math.random() * 3)+1;
				num2 = (int)(Math.random() * 3)+1;
				num3 = (int)(Math.random() * 3)+1;
				
				if(num1 != num2 && num1 != num3 && num2 != num3){
					break;
				}
			System.out.println("금주 당첨 번호 : " + num1 +" " + num2 + " " + num3 );
			}
			*/
			
			
			boolean a = true;
			
			int num1 = (int)(Math.random() * 3)+1;
			int num2 = 0;
			int num3 = 0;
			
			/*while(a){
				
				num1 = (int)(Math.random() * 3)+1;
				num2 = (int)(Math.random() * 3)+1;
				num3 = (int)(Math.random() * 3)+1;
*/
				while(num1 == num2 || num2 == num3 || num1 == num3) // 선조건 후실행이므로 밖에다 조건할 것을 빼줘야뎀. ex) 난수를 먼저 얻어와야뎀.
				{	
					num2 = (int)(Math.random() * 3)+1;
					num3 = (int)(Math.random() * 3)+1;
				}
				System.out.println("금주 당첨 번호 : " + num1 +" " + num2 + " " + num3 );
				
			//}

			/*
			
			// 로또 난수 3개가 필요함.
			// 같지 않아야 함.

			int num1 = (int)(Math.random()*3);
			int num2 = (int)(Math.random()*3);
			int num3 = (int)(Math.random()*3);

			while ()
			{
			}
			
			System.out.println("");

			*/
	
	}
}
