
public class TaxiGuest{
	public static void main(String[] args)	{

		Taxi t1 = new Taxi();
		System.out.println("t1 >> " + t1.toString() + "�⺻��� : " + t1.basicPrice); // �޼ҵ�� ��� ��.
		
		Taxi t2 = new Taxi("k5,", "��ȫ��", "���");
		System.out.println("t1 >> " + t2.toString() + "�⺻��� : " + t2.basicPrice);

		int km = 20;
		System.out.println( t2 + "�� Ÿ�� ���𿡼� ��������" + km + "km�̵�!!!");
		
		

		km = 2;
		t2.initPrice();
		System.out.println("��� : " + t2.price + "��");
		t2.sumPrice(km);
		System.out.println("���� ����" + t2.totalPrice + "��");

		km = 1;
		t2.initPrice();
		System.out.println("��� : " + t2.price + "��" );
		t2.sumPrice(km);
		System.out.println("���� ����" + t2.totalPrice + "�� \n\n");
		System.out.println( t2 + "�� Ÿ�� �������� �������" + km + "km�̵�!!!");


		int upDown = 50;
		System.out.println("t2�� �ӵ���" + upDown + "��ŭ ����!!!");
		int speed = t2.speedUp(upDown);
		System.out.println("t2�� �ӵ� : " + speed + "  " + t2.speed); 

		upDown = 250;
		System.out.println("t2�� �ӵ���" + upDown + "��ŭ ����!!!");
		speed = t2.speedUp(upDown);
		System.out.println("t2�� �ӵ� : " + speed + "  " + t2.speed); 
		
		/*
		System.out.println( t1 + "        " + t2 ); // t1�� Ŭ������ // ������Ʈ ��ӹ����� ������Ʈ��� �� �� ����. 
		System.out.println( t1.toString() + "        " + t2 ); 
		// ���ڿ� + ���ڴ� ���ڿ��ε� Ŭ������ ������Ʈ�� �����ͼ� toString�� ���� , toString�� �ּҰ�.							 ??
		*/


		Taxi t3 = new Taxi("k5,", "��ȫ��", "���");
		System.out.println( t2 + "        " + t3 ); // tostring �� �Ἥ �ּҰ��� �� �� ����.									�ٽð���.
		System.out.println( t2.hashCode() + "        " + t3.hashCode() ); // t3.hashCode()�� �ּҰ�
		
		if(t2 == t3)// ������ ���������� ���� �ٸ���. ==(�񱳿�����)�� �⺻DT�� ��쿡 ���� �񱳸� ������DT�� ���� �ּҰ�����.
			System.out.println("t2�� t3�� �ּҰ��� �������̴�.");
		else
			System.out.println("t2�� t3�� �ּҰ��� �ٸ����̴�.");

		if(t2.equals(t3)) // ������Ʈ�� �ּҰ��� ��. boolean.
			System.out.println("t2�� t3�� ���̸��� �������̴�.");
		else
			System.out.println("t2�� t3�� ���̸��� �ٸ����̴�.");
		

	}
}
