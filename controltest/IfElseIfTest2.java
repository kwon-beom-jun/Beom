/*
	score(����)��
	90 �̻��̸� A����
	80 �̻��̸� B����
	70 �̻��̸� C����
	60 �̻��̸� D����
	60 �̸��̸� F����.
	���� ��� : ������ xx���̹Ƿ� x�����Դϴ�.

x5�� �̻��̸� x+����.

*/

public class IfElseIfTest2{
	public static void main(String[] args)	{
	/*
		int score = 78;
		String a;
		
		if( score >= 95 ){
			a = "+A";
		}else if( score >= 90){
			a = "A";
		}
		else if( score >= 85){
			a = "+B";
		}
		else if( score >= 80){
			a = "B";
		}
		else if( score >= 75){
			a = "+C";
		}
		else if( score >= 70){
			a = "C";
		}
		else if( score >= 65){
			a = "+D";
		}
		else if( score >= 60){
			a = "D";
		}else{
			a = "F";
		}
		System.out.println("������ "+score+"���̹Ƿ� " +a+"�����Դϴ�."); // �߿�!! �������� ������ ������� ���� ���� ������ ����Ǹ� ���������� ����.
	}
	*/

	int score = 66;
	String a;
	if( score >= 90 ){
			a = "A";
		}
		else if( score >= 80){
			a = "B";
		}
		else if( score >= 70){
			a = "C";
		}
		else if( score >= 60){
			a = "D";
		}else{
			a = "F";
		}
	
	// (score % 10) > 5 ? "+" : (( score/100 ) = 0 ? "+" : "");
	/*
	if(score == 100){
		d = "+";
	}else if(score < 60){
		d = "";
	}else if(score % 10 >= 5){
		d = "+";
	}else{
		d = "";
	}
	*/
	if(score > 60 && (score == 100 || score% 10 >= 5)){ // �ص������� ������. score > 60 && score == 100
		a += "+";
	}
	
	System.out.println("������ "+score+"���̹Ƿ� " +a+"�����Դϴ�.");
	}

}