/*

Lotto
1~3 ������ ���� ���δٸ� ���� 3�� �߻�.

*/

public class ForLotto{
	public static void main(String[] args)	{
		
	
        
		/*
		switch(num1){
			case 0 : num2 != ; break;
		}
		*/


		/*
		for( ; ; ){
			
			int num1 = (int)(Math.random() * 3);
			int num2 = (int)(Math.random() * 3);
			int num3 = (int)(Math.random() * 3);
				
			if(num1 != num2 && num1 != num3 && num2 != num3){
				break;
			}
			System.out.println("���� ��÷ ��ȣ : " + (num1 + 1) +" " + (num2 + 1) + " " + (num3 + 1));
		}
		*/
		

		
			int num1;
			int num2;
			int num3;
			
			for( ; ; ){
				num1 = (int)(Math.random() * 3)+1;
				num2 = (int)(Math.random() * 3)+1;
				num3 = (int)(Math.random() * 3)+1;
				
				if(num1 == num2 || num1 == num3 || num2 == num3){
					break;
				}
			System.out.println("���� ��÷ ��ȣ : " + num1 +" " + num2 + " " + num3 );
			}

		
		
		/*
		int num1 = (int)(Math.random() * 3)+1;
		int num2 = 0;
		int num3 = 0;
			
		for( ; ; ){
			num2 = (int)(Math.random() * 3)+1;
			if(num1 != num2){
				break;
			}
		}
		
		for( ; ; ){
			num3 = (int)(Math.random() * 3)+1;
			if(num1 != num3 && num2 != num3){
				break;
			}
		}
		

		System.out.println("���� ��÷ ��ȣ : " + num1 +" " + num2 + " " + num3 );
	 */// �߸��Ǹ� �׺κи� ������ ���
	}
}
