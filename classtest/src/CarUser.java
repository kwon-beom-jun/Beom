public class CarUser{
	public static void main(String[] args)	{
		
		
		Car car1 = new Car(); // �����ڰ� �ȸ���� ���µ� ������ ������ CarŬ������ default( public Car();)�� ������ ����
		
		System.out.println(car1); // ��ǥ��.
		System.out.println(car1.carName); // ���� ���ؼ� null��.
		
		System.out.println("1. ���̸� : " + car1.carName + " ���� " + car1.color +" ������ : " + car1.maker );
		car1.carName = "�Ÿ";
		car1.color = "������";
		car1.maker = "����";
		System.out.println("2. ���̸� : " + car1.carName + " ���� " + car1.color +" ������ : " + car1.maker );
		
		System.out.println("����" + car1.carName + "�� �ӵ� : " + car1.speed);
		System.out.println("car1�� �ӵ��� 2ȸ ����!!!");
		car1.speedup();
		car1.speedup();
		System.out.println("2ȸ ������" + car1.carName + "�� �ӵ� : " + car1.speed);
		
		
		for (int i = 0; i < 28 ; i++ )
		{
			car1.speedup();
		}
		System.out.println("30ȸ ������" + car1.carName + "�� �ӵ� : " + car1.speed);

		for (int i = 0; i < 50 ; i++ )
		{
			car1.speedDown();
		}
		System.out.println("30ȸ ������" + car1.carName + "�� �ӵ� : " + car1.speed); // ������ �Ұ����ϴ� ���ǰɾ��ֱ�.






		Car car2 = new Car();
		
		car2.carName = "���������";
		car2.color = "�Ķ���";
		car2.maker = "������";
		System.out.println("2. ���̸� : " + car2.carName + " ���� : " + car2.color +" ������ : " + car2.maker );
		
		
		
	}
}
