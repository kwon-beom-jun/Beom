public class Car{
		
	// �ӵ�����, �ӵ�����, ����, ���̸� , ���� , �ӵ� 
		
	String carName;
	String carColor;
	String carMaker;
	int speed;
		
	public Car(){
		/*
		carName = "�Ÿ";
		carColor = "������";
		carMaker = "����";
		*/
		this("�Ÿ" , "������" , "����"); // ������ ȣ���̹Ƿ� new�� ���̸� �ȉ�. �����ִ� �ʱⰪ�� ������. �׷��Ƿ� �ؿ��ִ� public Car(String carName, String carColor, String carMaker) ���� ����������.
	}		// ���� �ƿ� �����ؼ� �����ְ� ����.


	public Car(String carColor){		// ���� �ٲٰ� �; ��Ʈ�� ���.
		/*
		carName = "�Ÿ";
		this.carColor = carColor;
		carMaker = "����";
		*/
		this("�Ÿ" , carColor , "����"); //				this() �� ������ ù��° �ٿ����� ������??
	}
	
	/*
	public Car(String carColor){	// �ȵŴ� ���� = ���� �ȳ��� ������ ������ �ٸ�. �����������ٰ� ���������� ����־�� ������ �̸��� ������ �������� �����. �׷��� ���������� ����� ����־�ߵȴٴ� ���̵�.
		carName = "�Ÿ";
		// Car car = new Car();  ���� : ���ο� �ڵ����� ���� ������ �ٸ� ������ ����ǹǷ� �ٲ��� ����. 
		This.carColor = carColor; // This�� �ڱ� �ڽ��� �����ض�� ���̵�.
		carMaker = "����"; // �˾Ƽ� This.�� ��ö�ӽ��� �ٿ��� ������ �̸��� ������ ���������� �켱���� �ǹǷ� This.�� ���� �ٿ���ߵ�.
	}
	*/

	public Car(String carName, String carColor){
		/*
		this.carName = carName;
		this.carColor = carColor;
		this.carMaker = "����";
		*/
		this( carName , carColor , "����");
	}

	public Car(String carName, String carColor, String carMaker){ // String cn�� �� �� �ִ� ������ �޼ҵ� �ȿ����� �۵��ϰ� �������Ƿ� ��� �����ϴ�.
		this.carName = carName;
		this.carColor = carColor; // ���Կ����� �������� ������ ���� �������� ����.
		this.carMaker = carMaker;
	}


	void speedUp(){			// ��밡��
		speed += 10;	
	}
	
	int speedUp(int speed){
		this.speed += speed; // this�� �Ⱥ��̸� �ڱ�Ϳ� �ٿ������°���.
		return this.speed; // this�� �Ⱥ��̸� �����°��� �׳� �ǵ����ִ� ��.
	}

	int speedDown(int speed){
		this.speed -= speed; 
		if (this.speed < 0)
			stop();
		return this.speed;
	}

	
	public void speedDown(){
		speed -= 10;
		if (speed < 0)
			stop();
	}

	public void stop(){
		speed = 0;
	}
	
	

	String info(){
		return "���̸� : " + carName + " ���� " + carColor +" ������ : " + carMaker;
	}








	
	// Car car10 = new Car(); // !!�޼ҵ� �ȿ��� �޸� ���� ����??
	
}
