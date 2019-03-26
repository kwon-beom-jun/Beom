public class IfElseTest1{
	public static void main(String[] args)	{
		int x = 10;
		int y = 10;
		/*
		if( x > y ){
		 System.out.println( x + "는 " + y + "보다 크다.");
		}
		else{
		System.out.println( x + "는 " + y + "보다 작다.");
		}
		
		String ds; // 변수는 값이 들어가기 전에만 값이 100퍼센트 나오면 됨.
		if ( x > y){
			ds = "크다";
		}else {
			ds = "작다";
		}
		System.out.println( x + "는 " + y + "보다 작다.");
		System.out.println("프로그램 종료!!!");
		
		
		String ds;
		if( x > y ){
			ds = "크다";
		}else {
			ds = "작다";
			if ( x == y)
			{
				ds = "같다";
			}
		}
		System.out.println( x + "는 " + y + ds);
		System.out.println("프로그램 종료!!!");
		*/

		String ds;
		if( x == y ){ // 가능하면.
			ds = "같다";
		}else {
			if(x > y){
				ds = "크다";
			} else{
				ds = "작다";
			}
		}
	System.out.println( x + "는 " + y + ds);
	System.out.println("프로그램 종료!!!");			
	}	


}

// 남자 여자로 바꿔보기.

