/*
1. ü�� hp 100, ��� ( 0 : �Ϲݸ��, 1 : ��� )
2. ���� attack()
		1ȸ ���ݴ� �� ü�� ( 0 : -10, 1 : -15)
   ��庯�� changeMode()
   		�� ü�� - 25;
		�� ü�� 40 ������ ���� ���� �Ұ�.
		
*/
public class Marine{

	int hp; // �Ϲ������� ��ü �ʱ�ȭ �۾��� �����ڿ��� �Ѵ�.
	int mod;
	int attack;
	
	
	public Marine(){}


	public Marine(int x, int y, int z){
		this.hp = 100;
		this.mod = 0;
		this.attack = 0;
	}

	// attack�ϸ� �� ����, �ǰ� 0�� �Ǹ� ��ž�� ��� ���
	// ���� 0�϶� ���ݷ� 10 ������ ����� 1�϶� ���ݷ� 25
	// �Ѵ� ���������� �ǰ�����.
	public void attack(Marine enemy , int x){ // Marine enemy ���� Marine�� �������̸�? // ������� com�̶�� ������ ��������.
		attack = 0;
		if ( mod == 0){
			hp -= (10 * attack);
		}else{
			hp -= (25 * attack);
		}
		 
	}
	
	// 0: ���� 1: ���
	// 0 -> 1 ü�� -25, ü�� 40 ���ϸ� ��� �߻��ϰ� 0->0
	// 1 -> 0 
	public void changeMode(){
		if ( mod == 0 && hp > 40 ){
			mod = 1;
			hp -= 25;
		}else if ( mod == 0 && hp <= 40 ){
			System.out.println("���");
		}else{
			mod = 0;
		}
	}



}
