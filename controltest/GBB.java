/*
	
	���������� ����

1. 0 ( ���� ) , 1 ( ���� ) , 2 ( �� )
2. �� : ���� (0,1,2)
3. ��� Logic(�̱�ų� ���ų� ���ų�)
4. ��� ���
	�� : ��, �� : ���� ��� : �̰��.
	�� : ��, �� : �� ��� : ����.
	�� : ��, �� : ���� ��� : ����.
*/

public class GBB{
	public static void main(String[] args)	{
		
		/*
		
		
		int my = 2;
		int d = (int)(Math.random() * 3);

		if (my == 2 && d == 1 ){
			System.out.println(" �� : " + my + ", �� : " + d + " ��� : �̰��." );
		}else if(my == 2 && d == 2 ){
			System.out.println(" �� : " + my + ", �� : " + d + " ��� : ����." );
		}else if(my == 2 && d == 0 ){
			System.out.println(" �� : " + my + ", �� : " + d + " ��� : ����." );
		}else if(my == 1 && d == 1 ){
			System.out.println(" �� : " + my + ", �� : " + d + " ��� : ����." );
		}else if(my == 1 && d == 2 ){
			System.out.println(" �� : " + my + ", �� : " + d + " ��� : ����." );
		}else if(my == 1 && d == 0 ){
			System.out.println(" �� : " + my + ", �� : " + d + " ��� : �̰��." );
		}else if(my == 0 && d == 1 ){
			System.out.println(" �� : " + my + ", �� : " + d + " ��� : ����." );
		}else if(my == 0 && d == 2 ){
			System.out.println(" �� : " + my + ", �� : " + d + " ��� : �̰��." );
		}else if(my == 0 && d == 0 ){
			System.out.println(" �� : " + my + ", �� : " + d + " ��� : ����." );
		}
		
		
		
		
        int my = 2;
        int com = (int) (Math.random() * 3);
			
			
        if(((my+1) % 3) == com) {
            System.out.println(" �� : " + my + ", �� : " + com + " ��� : ����." );
        } else if(((my+2) % 3) == com) {
            System.out.println(" �� : " + my + ", �� : " + com + " ��� : �̰��." );
        } else {
            System.out.println(" �� : " + my + ", �� : " + com + " ��� : ����." );;
        }
		*/

		int my = 2;
        int com = (int)(Math.random() * 3);
		String resultstr;
		String mystr;
		String comstr;

		int result = (( my - com ) + 2) % 3;

		if(result == 0){
			resultstr = "�̰��";
		}else if(result == 1){
		resultstr = "����.";
		}
		else{
		resultstr = "����.";
		}

		switch(my){
			case 0 : mystr = "����"; break;
			case 1 : mystr = "����"; break;
			default : mystr = "��"; break;// default ��� case�� ���� ������ �ʱ�ȭ ���ؼ� ������.
		}
		switch(com){
			case 0 : comstr = "����"; break;
			case 1 : comstr = "����"; break;
			default : comstr = "��"; break;
		}

	}
}
