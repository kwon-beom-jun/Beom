/*
���� ���� �� ����.
*/
import java.io.*;

public class Test{
	
	

	public Test(){
		in = new BufferedReader(new InputStreamReader(System.in));
	}

	public void game() throws Exception{
		while(true){
			System.out.print("0 1 2 �Է� : ");
			int my = Integer.parseInt(in.readLine());
			System.out.println("my === " + my);
			if (my == 4){
				exit();
			}
		}
	}

	public void exit(){
		System.out.println("���α׷� �����մϴ�.!!!");
		System.exit(0);
	}

	BufferedReader in; //�Է¹ޱ�.






	public static void main(String[] args) throws Exception	{
		Test t = new Test();
		t.game();
		

		

	}
}
