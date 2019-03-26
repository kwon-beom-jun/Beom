public class Car{
		
	// 속도증가, 속도감소, 정지, 차이름 , 색상 , 속도 
		
	String carName;
	String carColor;
	String carMaker;
	int speed;
		
	public Car(){
		/*
		carName = "쏘나타";
		carColor = "검정색";
		carMaker = "현대";
		*/
		this("쏘나타" , "검정색" , "현대"); // 생성자 호출이므로 new를 붙이면 안됌. 위에있는 초기값을 가져옴. 그러므로 밑에있는 public Car(String carName, String carColor, String carMaker) 값을 가져오라함.
	}		// 차를 아예 생성해서 보내주고 싶음.


	public Car(String carColor){		// 색을 바꾸고 싶어서 스트링 사용.
		/*
		carName = "쏘나타";
		this.carColor = carColor;
		carMaker = "현대";
		*/
		this("쏘나타" , carColor , "현대"); //				this() 는 생성자 첫번째 줄에서만 가능함??
	}
	
	/*
	public Car(String carColor){	// 안돼는 이유 = 에러 안나는 이유는 영역이 다름. 전역변수에다가 지역변수를 집어넣어라 하지만 이름이 같으면 가까운것을 사용함. 그래서 지역변수에 흰색을 집어넣어야된다는 말이됨.
		carName = "쏘나타";
		// Car car = new Car();  오류 : 새로운 자동차를 만들어서 넣으니 다른 영역에 저장되므로 바뀌지 않음. 
		This.carColor = carColor; // This는 자기 자신을 참조해라는 뜻이됨.
		carMaker = "현대"; // 알아서 This.을 버철머신이 붙여줌 하지만 이름이 같으면 지역변수가 우선권이 되므로 This.을 따로 붙여줘야뎀.
	}
	*/

	public Car(String carName, String carColor){
		/*
		this.carName = carName;
		this.carColor = carColor;
		this.carMaker = "현대";
		*/
		this( carName , carColor , "현대");
	}

	public Car(String carName, String carColor, String carMaker){ // String cn을 쓸 수 있는 이유는 메소드 안에서만 작동하게 되있으므로 사용 가능하다.
		this.carName = carName;
		this.carColor = carColor; // 대입연산자 기준으로 왼쪽은 변수 오른쪽은 값임.
		this.carMaker = carMaker;
	}


	void speedUp(){			// 사용가능
		speed += 10;	
	}
	
	int speedUp(int speed){
		this.speed += speed; // this를 안붙이면 자기것에 붙여버리는것임.
		return this.speed; // this를 안붙이면 가져온것을 그냥 되돌려주는 것.
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
		return "차이름 : " + carName + " 색상 " + carColor +" 제조사 : " + carMaker;
	}








	
	// Car car10 = new Car(); // !!메소드 안에서 메모리 생성 가능??
	
}
