public class Car{


	String carName;
	String color;
	String maker;
	int speed; // 전역변수

	// 엑셀 밟을떄마다 +10 -10

	public void speedup(){ // 접근제어자 ReturnType methodName( [args] ) 메소드 형식.  
		speed += 10;//지역변수, 전역변수가 있으므로 인자값이 필요없음. 그러므로 void형식.
	}
	
	public void speedDown(){
		speed -= 10;
	}

	public void stop(){
		speed = 0;
	}

	

}
