public class StarCraft{
	public static void main(String[] args)	{
		Marine my = new Marine();
		Marine com = new Marine();
		// ��ü�� : 100 ��ü�� : 100

		int count = 2;
		System.out.println("���� ���� " + count + "ȸ ����!!!");
		// ��ü�� : 100 ��ü�� : 80

		my.attack(com, count);

		count = 4;
		System.out.println("���� ���� " + count + "ȸ ����!!!");
		// ��ü�� : 60 ��ü�� : 80

		System.out.println("��� ����!!!");
		// ��ü�� : 35 ��ü�� : 80

		count = 3;
		System.out.println("���� ���� " + count + "ȸ ����!!!");
		// ��ü�� : 35 ��ü�� : 35

		System.out.println("��� ����!!!");
		// ��� ���� �Ұ�~!!! �����.
		// ��ü�� : 35 ��ü�� : 80

		count = 3;
		System.out.println("���� ���� " + count + "ȸ ����!!!");
		// ��ü�� : 35 ��ü�� : die
	
	
	}
}
