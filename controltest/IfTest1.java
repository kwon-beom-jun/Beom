public class IfTest1{
	public static void main(String[] args)	{
		int x = 10;
		int y = 7;
		if (x>y){
			System.out.println("x ũ��");
		}
		System.out.println("���α׷� ����!!!");

		
		/*int jumin = 2;
		String a = jumin % 2 == 0 ? "����" : "����";

		if( jumin % 2 == 0){
			System.out.println("����");
		}
		if(jumin % 2 == 1){
			System.out.println("����");
		}
		if(jumin % 2 != 1){
			System.out.println("����");
		} 
		������ ���� �����˻縦 ����. */
		
		int jumin = 2;
		String gender = "����";
		if( jumin % 2 == 0){
			gender = "����";
		}
		System.out.println(gender);
		

	}
}
