/*
	Food 를 상속받는다
	abstract class Drink
	enum IceType 
    HOT, ICE
	모든 변수는 protected
	변수 : int price : 가격
          String name : 이름
          IceType iceType : 얼음여부
          int totalPrice : 총가격


	생성자
	public Drink(String name, int price)
 */

package food;

enum IceType{
	HOT, ICE
}

public abstract class Drink implements Food{
	
	int price;
	String name;
	int totalPrice;
	
	public Drink(int price, String name) {
		this.price = price;
		this.name = name;
	}
	
	public void IceType(IceType iceType) {
		if (iceType == IceType.ICE) {
			System.out.println("얼음 있게 만들기");
		}else {
			System.out.println("얼음 없이 만들기");
		}
	}
	
	@Override
	public int getPrice() {
		return 0;
	}

	@Override
	public void setPrice(int price) {
		
	}

	@Override
	public String getName() {
		return null;
	}

	@Override
	public void setName(String name) {
	}

	@Override
	public int getTotalPrice() {
		return 0;
	}
	
	
	
}
