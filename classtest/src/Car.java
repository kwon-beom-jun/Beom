public class Car{


    String carName;
    String color;
    String maker;
    int speed; // ��������
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

    // ���� ���������� +10 -10


    void speedup(){ // ���������� ReturnType methodName( [args] ) �޼ҵ� ����.  
        speed += 10;//��������, ���������� �����Ƿ� ���ڰ��� �ʿ����. �׷��Ƿ� void����.
    }
    
    public void speedDown(){
        speed -= 10;
		if (speed < 0) // if�� 1�ٸ� ���� ��쿡�� �߰��� ���� ����!!
		 // speed = 0; �̰͵� �� ��ȿ����.
			stop(); // �ܺΰ� �ƴ϶� �տ� Ŭ���� �� �Ⱥٿ�����. ���� Ŭ�󽺾ȿ��� �޼ҵ� ��� ����.
	}

	String aa;
    public void stop(){
        aa =  "�ȳ��ϼ���";
    }
}

