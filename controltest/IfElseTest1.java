public class IfElseTest1{
	public static void main(String[] args)	{
		int x = 10;
		int y = 10;
		/*
		if( x > y ){
		 System.out.println( x + "�� " + y + "���� ũ��.");
		}
		else{
		System.out.println( x + "�� " + y + "���� �۴�.");
		}
		
		String ds; // ������ ���� ���� ������ ���� 100�ۼ�Ʈ ������ ��.
		if ( x > y){
			ds = "ũ��";
		}else {
			ds = "�۴�";
		}
		System.out.println( x + "�� " + y + "���� �۴�.");
		System.out.println("���α׷� ����!!!");
		
		
		String ds;
		if( x > y ){
			ds = "ũ��";
		}else {
			ds = "�۴�";
			if ( x == y)
			{
				ds = "����";
			}
		}
		System.out.println( x + "�� " + y + ds);
		System.out.println("���α׷� ����!!!");
		*/

		String ds;
		if( x == y ){ // �����ϸ�.
			ds = "����";
		}else {
			if(x > y){
				ds = "ũ��";
			} else{
				ds = "�۴�";
			}
		}
	System.out.println( x + "�� " + y + ds);
	System.out.println("���α׷� ����!!!");			
	}	


}

// ���� ���ڷ� �ٲ㺸��.
