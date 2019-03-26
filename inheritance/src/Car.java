
public class Car{
		
	// �ӵ�����, �ӵ�����, ����, ���̸� , ���� , �ӵ� 
		
	String carName;
	String carColor;
	String carMaker;
	int speed;
	
	
	public Car(){
		this("�Ÿ" , "������" , "����"); 
	}

	public Car(String carColor){		
		this("�Ÿ" , carColor , "����");
	}
	
	

	public Car(String carName, String carColor){
		this( carName , carColor , "����");
	}

	public Car(String carName, String carColor, String carMaker){ 
		super(); //super();�� ������. -- object�� ������� ��.(�޸�) this�� �־ ����� ��.
		this.carName = carName;
		this.carColor = carColor;
		this.carMaker = carMaker;
	}

	
	int speedUp(int speed){
		this.speed += speed; 
		return this.speed;
	}

		
	int speedDown(int speed){
		this.speed -= speed;
		if (this.speed < 0)
			stop();
		return this.speed;
	}

	public void stop(){
		speed = 0;
	}
	
	
	@Override
	public String toString(){		//info() , public ���� ����																			??
		return carMaker + "���� ���� " + carColor + " " + carName ; 
		// �����ִ� ������ �ҷ��Ͷ�. �������� public car() ���� ������ �־�����.
	}
	
	@Override
	public boolean equals(Object obj){ // ������ Object�� �޾Ƽ� Object�� �����.
		Car car = (Car) obj; // ������Ʈ�� Car�� ����ȯ �ؾߵ�. ��� Ŭ������ ������Ʈ��.
		//if(carName == car.carName){ // ������Ʈ�� �񱳰� �ȉ�(���ڿ�). ������ ������ ��. ���ڿ�										??
		// ""�� ���� true, new String("")�� ���� false
		if(carName.equals(car.carName)){
			return true;
		}
		return false;
	}	






	
	// Car car10 = new Car(); // !!�޼ҵ� �ȿ��� �޸� ���� ����??
	
}
