/*
	score(점수)가
	90 이상이면 A학점
	80 이상이면 B학점
	70 이상이면 C학점
	60 이상이면 D학점
	60 미만이면 F학점.
	실행 결과 : 점수가 xx점이므로 x학점입니다.

x5점 이상이면 x+학점.

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
		System.out.println("점수가 "+score+"점이므로 " +a+"학점입니다."); // 중요!! 컴파일은 위에서 순서대로 나옴 위에 조건이 성사되면 빠져나오기 때문.
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
	if(score > 60 && (score == 100 || score% 10 >= 5)){ // 앤드조건이 먼저임. score > 60 && score == 100
		a += "+";
	}
	
	System.out.println("점수가 "+score+"점이므로 " +a+"학점입니다.");
	}

}