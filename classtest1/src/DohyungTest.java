public class DohyungTest{
	public static void main(String[] args)	{
		
		Rect r1 = new Rect();
		System.out.println("���ΰ� " +r1.width+"�̰� ���ΰ� "+r1.heigh+"�� �簢���� ���̴� " + r1.calcArea() + " �ѷ��� "+ r1.clacRound());
		// ���ΰ� 4�̰� ���ΰ� 3�� �簢���� ���̴� 12�̰� �ѷ��� 14 �Դϴ�. �� ��� �̱�.
		
		Rect r2 = new Rect(5,7);
		System.out.println("���ΰ� " + r2.width + "�̰� ���ΰ� " + r2.heigh + "�� �簢���� ���̴� " + r2.calcArea() + " �ѷ��� "+ r2.clacRound());
		// ���ΰ� 5�̰� ���ΰ� 7�� �簢���� ���̴� 35�̰� �ѷ��� 24 �Դϴ�. �� ��� �̱�. �� ������� ���� �� �ְ� �����
		
		Circle c1 = new Circle();
		System.out.println("������" +  "����"  + "�ѷ�"  );
		//�������� 4�� ���� ���̴� 48.xxx�̰� �ѷ��� 24.xxx �Դϴ�.

		Circle c2 = new Circle();
		//�������� 5�� ���� ���̴� 75.xxx�̰� �ѷ��� 30.xxx �Դϴ�. �� ������� ���� �� �ְ� �����.

		
	}
}
