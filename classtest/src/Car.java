public class Car{


    String carName;
    String color;
    String maker;
    int speed; // 전역변수
	//public Car(){}


	public Car(){}
	
	String ad;
	public Car(String a){
		ad = a;
	}

	int x = 1;
	public Car(int a){
		x = 3;
	}

    // 엑셀 밟을떄마다 +10 -10


    void speedup(){ // 접근제어자 ReturnType methodName( [args] ) 메소드 형식.  
        speed += 10;//지역변수, 전역변수가 있으므로 인자값이 필요없음. 그러므로 void형식.
    }
    
    public void speedDown(){
        speed -= 10;
		if (speed < 0) // if문 1줄만 있을 경우에는 중가로 제거 가능!!
		 // speed = 0; 이것도 됨 비효율임.
			stop(); // 외부가 아니라서 앞에 클래스 명 안붙여도됨. 같은 클라스안에서 메소드 사용 가능.
	}

	String aa;
    public void stop(){
        aa =  "안녕하세요";
    }
}

