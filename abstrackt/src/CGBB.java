import java.io.*;

public class CGBB{
			
	private int com;
	

	public CGBB(){
		in = new BufferedReader(new InputStreamReader(System.in));
	}

	public void game() throws Exception{
	
		System.out.println("==== ��ǻ�Ϳ� ���������� ����!!! ====");

		while(true){
			
			com = (int)(Math.random()*3);
			
			String a;
			String b;

			switch (com){
			case 0 : a = "����"; break;
			case 1 : a = "����"; break;
			default : a = "��"; break;
			}

					
			System.out.print("����(0), ����(1), ��(2) �����ϼ���. : ");
			int my = Integer.parseInt(in.readLine());

			switch (my){
			case 0 : b = "����"; break;
			case 1 : b = "����"; break;
			default : b = "��"; break;
			}
			
			if ( my > 2 || my < 0 ){
				
				if (my == 4){
					System.out.println("���α׷� �����մϴ�.!!!");
					exit();
				}else{
					System.out.println("�ٸ� ���ڸ� �� �� �����ϴ�.");
				}
			}
			
			if ( my <= 2 && my >= 0 ){
					
				int resault = (( my - com ) + 2) % 3;
								
				System.out.print("�� : " + b + "   " + "��ǻ�� : " + a + "   " + "����� : " );

				if(resault == 0){
						System.out.println("����.");
					}else if (resault == 1){
						System.out.println("�̰��.");
					}else if (resault == 2){
						System.out.println("����.");
					}
			}
		}
	}

	

	public void exit(){
		System.exit(0);
	}

	BufferedReader in; //�Է¹ޱ�.

	public static void main(String[] args) throws Exception	{
		CGBB t = new CGBB();
		
		t.game();

		
		

		

	}
}
