
public class Store{

	public static void main(String[] args)	{
		
		Pointcard p1 = new Pointcard("�ڹ̷�");
		Pointcard p2 = new Pointcard("Ȳ����");

		System.out.println(p1.name + "�� ���� ����");
		
		int point = p1.visit();
		System.out.println(p1.name + "���� " + point + "��° �湮���Դϴ�.\n");

		System.out.println(p2.name + "�� ���� ����");
		point = p2.visit();
		System.out.println(p2.name + "���� " + point + "��° �湮���Դϴ�.\n");

		System.out.println(p2.name + "�� ���� ����");
		point = p2.visit();
		System.out.println(p2.name + "���� " + point + "��° �湮���Դϴ�.");

		System.out.println("---------------------------------------------");
		
		
		
		
		
		
		Guest g1 = new Guest("�ڹ̷�");
		Guest g2 = new Guest("Ȳ����");
	
		System.out.println(g1.name + "�� �湮");
		int count = g1.visit();
		System.out.println(g1.name + "���� " + count + "��° �湮���Դϴ�.\n"); // Guest.cnt Ŭ������ �ٰ��� �� ����. static!!

		System.out.println(p2.name + "�� �湮");
		count = Guest.visit();
		System.out.println(g2.name + "���� " + count + "��° �湮���Դϴ�.\n"); // �޼ҵ带 static ���� �ٲ�. static ������ �����Ƿ� ��� ����.

		System.out.println(p2.name + "�� �湮");
		count = g2.visit();
		System.out.println(g2.name + "���� " + count + "��° �湮���Դϴ�.\n");
		

	}

}	
