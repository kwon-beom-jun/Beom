/*
	Food �� ��ӹ޴´�
	abstract class Drink
	enum IceType 
    HOT, ICE
	��� ������ protected
	���� : int price : ����
          String name : �̸�
          IceType iceType : ��������
          int totalPrice : �Ѱ���


	������
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
			System.out.println("���� �ְ� �����");
		}else {
			System.out.println("���� ���� �����");
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
