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
			System.out.println("���� ��÷ ��ȣ : " + num1 +" " + num2 + " " + num3 );
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
				while(num1 == num2 || num2 == num3 || num1 == num3) // ������ �Ľ����̹Ƿ� �ۿ��� ������ ���� ����ߵ�. ex) ������ ���� ���;ߵ�.
				{	
					num2 = (int)(Math.random() * 3)+1;
					num3 = (int)(Math.random() * 3)+1;
				}
				System.out.println("���� ��÷ ��ȣ : " + num1 +" " + num2 + " " + num3 );
				
			//}

			/*
			
			// �ζ� ���� 3���� �ʿ���.
			// ���� �ʾƾ� ��.

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
