/*
score(����)rk
90�̻��̸� A
80�̻��̸� B
70�̻��̸� C
60�̻��̸� D
60�̸��̸� F
--switch

X5�̻��̸� X+���� -- if��
��� : ������ xx���̹Ƿ� x�����Դϴ�.

*/

public class SwitchTest2{
	public static void main(String[] args)	{
		
		int score = 55;
		String a;

		switch(score/10){
		case 10 : case 9 : a = "A"; break;
		case 8 : a = "B"; break;
		case 7 : a = "C"; break;
		case 6 : a = "D"; break;
		default : a = "F"; break;
		}

		if (score > 60 && (score == 100 || score%10 >= 5) )
		{
			a += "+";
		}
		System.out.println("������ " + score + "���̹Ƿ� " + a + "�����Դϴ�.");
	}
}
