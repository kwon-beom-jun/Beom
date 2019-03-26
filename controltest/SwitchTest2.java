/*
score(점수)rk
90이상이면 A
80이상이면 B
70이상이면 C
60이상이면 D
60미만이면 F
--switch

X5이상이면 X+학점 -- if로
결과 : 점수가 xx점이므로 x학점입니다.

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
		System.out.println("점수가 " + score + "점이므로 " + a + "학점입니다.");
	}
}
