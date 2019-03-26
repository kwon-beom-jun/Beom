
/*
�⺻���(basicPrice)  
	�Ϲ�:3800, �ɾ�:5800
�����(totalPrice)
���(price)
	�Ϲ� : 100/km
	�ɾ� : 150/km

2. ��� ���(calcPrice())
3. �ɾ����� : 0��~6��

������ �̿��ؼ� �ó�����.
*/

import java.util.*;

public class Taxi extends Car{

	int basicPrice; 
	int totalPrice; 
	int price;
	int incPerKm;
	//������, ��Ż, �����̽�, Ű�ι��ʹ� �����Ǵ� ���

	

	
	public Taxi(){
		//super() : ���� Ŭ���� ������ �߿��� default�� ȣ����.(�������� ù��° ��) �׷��� �ݵ�� public car() -> �� �־����.
		//this() : �ڱ� �ڽ��� �����ڸ� ȣ��.  


	}// �������� ���� ������ �޸𸮿� ������.
	
	public Taxi(String carName, String carColor, String carMaker){ 
		super(carName, carColor, carMaker);
		/*
		this.carName = carName;
		this.carColor = carColor;
		this.carMaker = carMaker;
		*/
	}

	

	// ���ͱ⸦ ����.
	// ���۰� ���ÿ� �ð��� üũ��.
	// mt�� 1�϶� ����. 0�϶� ����
	/*	�����(totalPrice)
	���(price)
		�Ϲ� : 100/km
		�ɾ� : 150/km

	2. ��� ���(calcPrice())
	3. �ɾ����� : 0��~6��

	������ �̿��ؼ� �ó�����.
	*/

	public void initPrice(){ // ó�� �մ� ������
		
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


	public void sumPrice(int km){ // ������
		totalPrice += calcPrice(km);
		price = 0;
	}

	
	public int calcPrice(int km){
		price = basicPrice + km * incPerKm;
		return price;
	}

	@Override  // @�� ������̼� ������ ���ϸ� �ּ�
	int speedUp(int speed){ // ���������ڸ� ���� ������ �ٲ� �� ����.
	//	this.speed += speed;
	//	speedup(speed); // ���ѷ�����
		speed = super.speedUp(speed); // ����Ŭ������ �ִ� ���� �����Ͷ�. ���Կ����ڴ� ������ �����.
		if ( this.speed > 0 ){
			this.speed = 150; // this�� �پ�ߵ�. �̾ȿ��� speed�� 150�̵�																??
		}
		return this.speed;
	}
	
	// t2.toString() + "�ý�"																											??

	@Override
	public String toString(){		//info() public ���� ����																			??
		return super.toString() + "�ý�" ;  // ����Ŭ������ �ִ°��� �������̵� �ؼ� �ýø� ����. ������ ������ �ý��� ������ ����.
		// �����ִ� ������ �ҷ��Ͷ�. �������� public car() ���� ������ �־�����.
	}
}
