/*
	
	가위바위보 게임

1. 0 ( 가위 ) , 1 ( 바위 ) , 2 ( 보 )
2. 컴 : 난수 (0,1,2)
3. 결과 Logic(이기거나 지거나 비기거나)
4. 결과 출력
	나 : 보, 컴 : 바위 결과 : 이겼다.
	나 : 보, 컴 : 보 결과 : 졌다.
	나 : 보, 컴 : 가위 결과 : 비겼다.
*/

public class GBB{
	public static void main(String[] args)	{
		
		/*
		
		
		int my = 2;
		int d = (int)(Math.random() * 3);

		if (my == 2 && d == 1 ){
			System.out.println(" 나 : " + my + ", 컴 : " + d + " 결과 : 이겼다." );
		}else if(my == 2 && d == 2 ){
			System.out.println(" 나 : " + my + ", 컴 : " + d + " 결과 : 비겼다." );
		}else if(my == 2 && d == 0 ){
			System.out.println(" 나 : " + my + ", 컴 : " + d + " 결과 : 졌다." );
		}else if(my == 1 && d == 1 ){
			System.out.println(" 나 : " + my + ", 컴 : " + d + " 결과 : 비겼다." );
		}else if(my == 1 && d == 2 ){
			System.out.println(" 나 : " + my + ", 컴 : " + d + " 결과 : 졌다." );
		}else if(my == 1 && d == 0 ){
			System.out.println(" 나 : " + my + ", 컴 : " + d + " 결과 : 이겼다." );
		}else if(my == 0 && d == 1 ){
			System.out.println(" 나 : " + my + ", 컴 : " + d + " 결과 : 졋다." );
		}else if(my == 0 && d == 2 ){
			System.out.println(" 나 : " + my + ", 컴 : " + d + " 결과 : 이겼다." );
		}else if(my == 0 && d == 0 ){
			System.out.println(" 나 : " + my + ", 컴 : " + d + " 결과 : 비겼다." );
		}
		
		
		
		
        int my = 2;
        int com = (int) (Math.random() * 3);
			
			
        if(((my+1) % 3) == com) {
            System.out.println(" 나 : " + my + ", 컴 : " + com + " 결과 : 졌다." );
        } else if(((my+2) % 3) == com) {
            System.out.println(" 나 : " + my + ", 컴 : " + com + " 결과 : 이겼다." );
        } else {
            System.out.println(" 나 : " + my + ", 컴 : " + com + " 결과 : 비겼다." );;
        }
		*/

		int my = 2;
        int com = (int)(Math.random() * 3);
		String resultstr;
		String mystr;
		String comstr;

		int result = (( my - com ) + 2) % 3;

		if(result == 0){
			resultstr = "이겼다";
		}else if(result == 1){
		resultstr = "졌다.";
		}
		else{
		resultstr = "비겼다.";
		}

		switch(my){
			case 0 : mystr = "가위"; break;
			case 1 : mystr = "바위"; break;
			default : mystr = "보"; break;// default 대신 case를 쓰면 변수를 초기화 안해서 에러남.
		}
		switch(com){
			case 0 : comstr = "가위"; break;
			case 1 : comstr = "바위"; break;
			default : comstr = "보"; break;
		}

	}
}
