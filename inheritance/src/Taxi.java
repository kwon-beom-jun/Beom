
/*
기본요금(basicPrice)  
	일반:3800, 심야:5800
요금합(totalPrice)
요금(price)
	일반 : 100/km
	심야 : 150/km

2. 요금 계산(calcPrice())
3. 심야할증 : 0시~6시

두줄을 이용해서 시내할증.
*/

import java.util.*;

public class Taxi extends Car{

	int basicPrice; 
	int totalPrice; 
	int price;
	int incPerKm;
	//베이직, 토탈, 프라이스, 키로미터당 증가되는 요금

	

	
	public Taxi(){
		//super() : 상위 클래스 생성자 중에서 default를 호출함.(생성자의 첫번째 줄) 그래서 반드시 public car() -> 는 있어야함.
		//this() : 자기 자신의 생성자를 호출.  


	}// 생성자의 끝을 만나야 메모리에 생성됨.
	
	public Taxi(String carName, String carColor, String carMaker){ 
		super(carName, carColor, carMaker);
		/*
		this.carName = carName;
		this.carColor = carColor;
		this.carMaker = carMaker;
		*/
	}

	

	// 미터기를 누름.
	// 시작과 동시에 시간을 체크함.
	// mt가 1일때 시작. 0일때 종료
	/*	요금합(totalPrice)
	요금(price)
		일반 : 100/km
		심야 : 150/km

	2. 요금 계산(calcPrice())
	3. 심야할증 : 0시~6시

	두줄을 이용해서 시내할증.
	*/

	public void initPrice(){ // 처음 손님 탔을때
		
		Calendar calendar = Calendar.getInstance();
		int hour = calendar.get(Calendar.HOUR_OF_DAY);

		if (hour >= 0 && hour <= 6 ){
			incPerKm = 150;
			basicPrice = 5800;
		}else{
			incPerKm = 100;
			basicPrice = 3800;			
		}
		//price = basicPrice;
	}


	public void sumPrice(int km){ // 내릴때
		totalPrice += calcPrice(km);
		price = 0;
	}

	
	public int calcPrice(int km){
		price = basicPrice + km * incPerKm;
		return price;
	}

	@Override  // @는 어노테이션 간단히 말하면 주석
	int speedUp(int speed){ // 접근제어자를 넓은 것으로 바꿀 수 있음.
	//	this.speed += speed;
	//	speedup(speed); // 무한루프돔
		speed = super.speedUp(speed); // 상위클래스에 있는 것을 가져와라. 대입연산자는 값부터 실행됨.
		if ( this.speed > 0 ){
			this.speed = 150; // this를 붙어야뎀. 이안에서 speed만 150이됨																??
		}
		return this.speed;
	}
	
	// t2.toString() + "택시"																											??

	@Override
	public String toString(){		//info() public 써준 이유																			??
		return super.toString() + "택시" ;  // 상위클래스에 있는것을 오버라이드 해서 택시를 붙임. 버스가 있으면 택스가 나오기 때문.
		// 위에있는 변수를 불러와라. 변수에는 public car() 에서 변수를 넣어줬음.
	}
}
