/*
------- ���� ��� -------
���� ��, ����, �̸�
���� ���
	�մ��� ���ö� ���� ����.
	�����ݾ�.
	�մ� �ο��� ���� 0��.
    �ο��� ī��Ʈ 30��.
		 
����(Bus)			  
�°���(count)         
Ÿ��()                 
loadUp(int weight)
������()              
getOut(int count)    

���� ���� 1 ~ 19�� 800��
		  20 ~ 60�� 1000��
		  60 ~  100�� 500��

*/

public class BusFunction extends Bus {

	int count; // �°���
	int age; // ����
	int pay; // �ݾ�
	int totalpay; // �� �ݾ�

	public BusFunction(){
		count = 0;
		totalpay = 0;
		age = 0;
		pay = 0;
	}
	
	public BusFunction(String busName, String busMark, String busColor){
		super(busName, busMark, busColor);
	}



/*		  
	�°���(count)         
	Ÿ��()                 
	loadUp(int weight)
	������()              
	getOut(int count) 
	�մ��� ���ö� ���� ����.
	�� �����ݾ�.
	�մ� �ο��� ���� 0��.
    �ο��� ī��Ʈ 30��.	
	�ο��� 30�� �Ǹ� �������� �ϱ�.
*/
	
	
	// ���� ����
	// �� �ݾ� ����
	// �ο��� 30�� �Ǹ� �������� �ϱ�.
	public void loadUP(){
		
		if (this.count >= 0 && this.count < 30){
			this.count += count;		
		}else{
			this.count = count;
			System.out.println("�� �̻� �°��� �¿� �� �����ϴ�.");
		}
	}

	
	public void getOut(){

	}
	
	//�� �ݾ�
	//��� ���
	//���� ���
	//���� �� �ݾ� = ��� ��� * ��� �ο��� + ���ο�� * ���� �ο���
	/*
	public void total(int cpay , int apay , int count, int acount){
		totalpay = cpay * count + apay * count;
	}
	*/

	
	











}
