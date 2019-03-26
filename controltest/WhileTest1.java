public class WhileTest1{
	public static void main(String[] args)	{
/*
		System.out.println(" 1-10 까지 출력. ");

		int i = 0;

		while(i < 10){
			System.out.println(++i);
		} // 많이 사용하는 용도는 무한루프를 돌릴때 사용함.

		System.out.println(" 1-10 까지의 수중 난수 발생. ");
		
		
		boolean flag = true;
		while( flag ){
			int number = (int)(Math.random() * 11); // 0 - 11
			if(number != 0){
				System.out.println("number == " + number);
			}else{// 1 == 1 무한루프 true랑 똑같음.
				System.out.println("0이 발생되어 프로그램 종료!!!!");
				flag = false;
			}		
		*/
		/*
		
		boolean flag = true;
		int cnt = 0;
		while( flag ){ // 1 == 1 무한루프 true랑 똑같음.
			cnt++;
			int number = (int)(Math.random() * 11); // 0 - 11 0.9999 니깐 10을 곱하면 9까지.
			if(number != 0){
				System.out.println("number == " + number);
			}else{
				System.out.println("0이 발생( "+ cnt +"번째)되어 프로그램 종료!!!!");
				flag = false;
			}
		}
		
		*/
		
		
		System.out.println(" 1-10 까지의 수중 0인 난수 발생. ");
		
		
		boolean flag = true;

		while (true)
		{
			int num = (int)(Math.random()*11);
			if (num != 0){
				System.out.println( num );
			}else{
				System.out.println(" 도중에 " + num + " 이 발생 하였습니다.");
				break;
			}
			
		 }
			
		






	}
}
