import java.io.*;

public class CGBB{
			
	private int com;
	

	public CGBB(){
		in = new BufferedReader(new InputStreamReader(System.in));
	}

	public void game() throws Exception{
	
		System.out.println("==== 컴퓨터와 가위바위보 한판!!! ====");

		while(true){
			
			com = (int)(Math.random()*3);
			
			String a;
			String b;

			switch (com){
			case 0 : a = "가위"; break;
			case 1 : a = "바위"; break;
			default : a = "보"; break;
			}

					
			System.out.print("가위(0), 바위(1), 보(2) 선택하세요. : ");
			int my = Integer.parseInt(in.readLine());

			switch (my){
			case 0 : b = "가위"; break;
			case 1 : b = "바위"; break;
			default : b = "보"; break;
			}
			
			if ( my > 2 || my < 0 ){
				
				if (my == 4){
					System.out.println("프로그램 종료합니다.!!!");
					exit();
				}else{
					System.out.println("다른 숫자를 낼 수 없습니다.");
				}
			}
			
			if ( my <= 2 && my >= 0 ){
					
				int resault = (( my - com ) + 2) % 3;
								
				System.out.print("나 : " + b + "   " + "컴퓨터 : " + a + "   " + "결과는 : " );

				if(resault == 0){
						System.out.println("비겼다.");
					}else if (resault == 1){
						System.out.println("이겼다.");
					}else if (resault == 2){
						System.out.println("졌다.");
					}
			}
		}
	}

	

	public void exit(){
		System.exit(0);
	}

	BufferedReader in; //입력받기.

	public static void main(String[] args) throws Exception	{
		CGBB t = new CGBB();
		
		t.game();

		
		

		

	}
}
