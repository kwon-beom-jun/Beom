/*
1. 가로 width, 세로 heigh
2. 넓이 : calcArea()
   둘레 : calcRound()
*/


public class Rect{
	
	int width;
	int heigh;

	public Rect(){
		this( 3 , 4 );
	}

	public Rect(int x, int y){
		this.width = x;
		this.heigh = y;
	}

	public int calcArea(){
		return width * heigh;
	}

	public int clacRound(){
		return 2*(width + heigh);
	}

}
