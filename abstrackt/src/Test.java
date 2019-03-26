/*
가위 바위 보 게임.
*/
import java.io.*;

public class Test{
	
	

	public Test(){
		in = new BufferedReader(new InputStreamReader(System.in));
	}

	public void game() throws Exception{
		while(true){
			System.out.print("0 1 2 입력 : ");
			int my = Integer.parseInt(in.readLine());
			System.out.println("my === " + my);
			if (my == 4){
				exit();
			}
		}
	}

	public void exit(){
		System.out.println("프로그램 종료합니다.!!!");
		System.exit(0);
	}

	BufferedReader in; //입력받기.






	public static void main(String[] args) throws Exception	{
		Test t = new Test();
		t.game();
		

		

	}
}
