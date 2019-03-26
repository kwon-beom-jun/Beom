/*
Drink 를 상속받는다
class Coffee


변수
int SYRUP_PRICE
int SHOT_PRICE
int shotAmount         기본은 0, shot 추가 개수
int syrupAmount        기본은 0, 시럽 추가 개수


생성자
* name, price 만 받고 shotAmount, syrupAmount 는 0으로 초기화
* name, price,shotAmount, syrupAmount 을 받아서 세팅
    * 추가로 SYRUP_PRICE, SHOT_PRICE 는 둘다 500원으로 초기화


method
 일반적인 get, set
syrup 으로 인해 추가되는 돈을 return 하는 method
shot 으로 인해 추가되는 돈을 return 하는 method
*/

package food;

public class Coffee extends Drink {
	
	int syrup_Price = 500;
	int shot_Price = 500;
	int shotAmount = 0;        //기본은 0, shot 추가 개수
	int syrupAmount = 0;       //기본은 0, 시럽 추가 개수
	
	
	public Coffee(int price, String name) {
		super(price, name);
	}
		

}
