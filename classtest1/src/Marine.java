/*
1. 체력 hp 100, 모드 ( 0 : 일반모드, 1 : 흥분 )
2. 공격 attack()
		1회 공격당 적 체력 ( 0 : -10, 1 : -15)
   모드변경 changeMode()
   		내 체력 - 25;
		내 체력 40 이하일 경우는 변경 불가.
		
*/
public class Marine{

	int hp; // 일반적으로 객체 초기화 작업은 생성자에서 한다.
	int mod;
	int attack;
	
	
	public Marine(){}


	public Marine(int x, int y, int z){
		this.hp = 100;
		this.mod = 0;
		this.attack = 0;
	}

	// attack하면 피 깍기고, 피가 0이 되면 스탑과 경고문 출력
	// 내가 0일때 공격력 10 스팀팩 모드인 1일때 공격력 25
	// 한대 때릴때마다 피가깍임.
	public void attack(Marine enemy , int x){ // Marine enemy 만약 Marine이 여러개이면? // 상관없음 com이라는 변수를 지정해줌.
		attack = 0;
		if ( mod == 0){
			hp -= (10 * attack);
		}else{
			hp -= (25 * attack);
		}
		 
	}
	
	// 0: 보통 1: 흥분
	// 0 -> 1 체력 -25, 체력 40 이하면 경고문 발생하고 0->0
	// 1 -> 0 
	public void changeMode(){
		if ( mod == 0 && hp > 40 ){
			mod = 1;
			hp -= 25;
		}else if ( mod == 0 && hp <= 40 ){
			System.out.println("경고");
		}else{
			mod = 0;
		}
	}



}
