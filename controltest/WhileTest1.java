public class WhileTest1{
	public static void main(String[] args)	{
/*
		System.out.println(" 1-10 ���� ���. ");

		int i = 0;

		while(i < 10){
			System.out.println(++i);
		} // ���� ����ϴ� �뵵�� ���ѷ����� ������ �����.

		System.out.println(" 1-10 ������ ���� ���� �߻�. ");
		
		
		boolean flag = true;
		while( flag ){
			int number = (int)(Math.random() * 11); // 0 - 11
			if(number != 0){
				System.out.println("number == " + number);
			}else{// 1 == 1 ���ѷ��� true�� �Ȱ���.
				System.out.println("0�� �߻��Ǿ� ���α׷� ����!!!!");
				flag = false;
			}		
		*/
		/*
		
		boolean flag = true;
		int cnt = 0;
		while( flag ){ // 1 == 1 ���ѷ��� true�� �Ȱ���.
			cnt++;
			int number = (int)(Math.random() * 11); // 0 - 11 0.9999 �ϱ� 10�� ���ϸ� 9����.
			if(number != 0){
				System.out.println("number == " + number);
			}else{
				System.out.println("0�� �߻�( "+ cnt +"��°)�Ǿ� ���α׷� ����!!!!");
				flag = false;
			}
		}
		
		*/
		
		
		System.out.println(" 1-10 ������ ���� 0�� ���� �߻�. ");
		
		
		boolean flag = true;

		while (true)
		{
			int num = (int)(Math.random()*11);
			if (num != 0){
				System.out.println( num );
			}else{
				System.out.println(" ���߿� " + num + " �� �߻� �Ͽ����ϴ�.");
				break;
			}
			
		 }
			
		






	}
}
