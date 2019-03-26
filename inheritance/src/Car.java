
public class Car{
		
	// 속도증가, 속도감소, 정지, 차이름 , 색상 , 속도 
		
	String carName;
	String carColor;
	String carMaker;
	int speed;
	
	
	public Car(){
		this("쏘나타" , "검정색" , "현대"); 
	}

	public Car(String carColor){		
		this("쏘나타" , carColor , "현대");
	}
	
	

	public Car(String carName, String carColor){
		this( carName , carColor , "현대");
	}

	public Car(String carName, String carColor, String carMaker){ 
		super(); //super();가 들어가있음. -- object를 만들려고 씀.(메모리) this가 있어서 여기다 씀.
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
	public String toString(){		//info() , public 써준 이유																			??
		return carMaker + "에서 만든 " + carColor + " " + carName ; 
		// 위에있는 변수를 불러와라. 변수에는 public car() 에서 변수를 넣어줬음.
	}
	
	@Override
	public boolean equals(Object obj){ // 형식을 Object로 받아서 Object를 써야함.
		Car car = (Car) obj; // 오브젝트를 Car로 형변환 해야뎀. 모든 클래스는 오브젝트임.
		//if(carName == car.carName){ // 오브젝트는 비교가 안됌(문자열). 하지만 지금은 됌. 문자열										??
		// ""일 경우는 true, new String("")일 경우는 false
		if(carName.equals(car.carName)){
			return true;
		}
		return false;
	}	






	
	// Car car10 = new Car(); // !!메소드 안에서 메모리 생성 가능??
	
}
