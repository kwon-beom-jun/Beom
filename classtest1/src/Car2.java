public class Car2{
	public static void main(String[] args)	{
		

		Car car1 = new Car();
		System.out.println(car1.info());

		Car car2 = new Car("���"); // ���ڰ��� String�� ���� ȣ����.
		System.out.println(car2.info());

		Car car3 = new Car("�׷���","���"); // ȣ�� �� �� ������ �¾ƾߵ�. �ȱ׷��� �ٲ�� ����. ��ǻ�ʹ� ������� �ν�.
		System.out.println(car3.info());
		// ���� �� �� ���� ����??

		Car car4 = new Car("K5","����","���");
		System.out.println(car4.info());

		System.out.println("car4�� �ӵ��� 3ȸ ����!!!");
		
		for (int i = 0; i < 3 ; i++ )
		{
			car4.speedUp();
		}

		System.out.println("car4�� �ӵ� : " + car4.speed);


		System.out.println("car4�� �ӵ��� 85 ����!!!");
		int speed = car4.speedUp(85); // ������ ������.
		System.out.println("car4�� �ӵ� : " + speed); // speedUp() �޼ҵ忡 this�� �Ⱥ��̸� �ڱⰪ�� 85�� ���ؼ� 170�� ����. �ڵ��� ����� �ӵ�.
		System.out.println("car4�� �ӵ� : " + car4.speed); // ���� �ڵ��� ���� �ӵ�.


		

	
		
		
		
		
		
		
		
		
		
		
		
		
		// car10.speedUp();



	}
}
