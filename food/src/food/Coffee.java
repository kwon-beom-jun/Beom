/*
Drink �� ��ӹ޴´�
class Coffee


����
int SYRUP_PRICE
int SHOT_PRICE
int shotAmount         �⺻�� 0, shot �߰� ����
int syrupAmount        �⺻�� 0, �÷� �߰� ����


������
* name, price �� �ް� shotAmount, syrupAmount �� 0���� �ʱ�ȭ
* name, price,shotAmount, syrupAmount �� �޾Ƽ� ����
    * �߰��� SYRUP_PRICE, SHOT_PRICE �� �Ѵ� 500������ �ʱ�ȭ


method
 �Ϲ����� get, set
syrup ���� ���� �߰��Ǵ� ���� return �ϴ� method
shot ���� ���� �߰��Ǵ� ���� return �ϴ� method
*/

package food;

public class Coffee extends Drink {
	
	int syrup_Price = 500;
	int shot_Price = 500;
	int shotAmount = 0;        //�⺻�� 0, shot �߰� ����
	int syrupAmount = 0;       //�⺻�� 0, �÷� �߰� ����
	
	
	public Coffee(int price, String name) {
		super(price, name);
	}
		

}
