public class Car{


	String carName;
	String color;
	String maker;
	int speed; // ��������

	// ���� ���������� +10 -10

	public void speedup(){ // ���������� ReturnType methodName( [args] ) �޼ҵ� ����.  
		speed += 10;//��������, ���������� �����Ƿ� ���ڰ��� �ʿ����. �׷��Ƿ� void����.
	}
	
	public void speedDown(){
		speed -= 10;
	}

	public void stop(){
		speed = 0;
	}

	

}
