public class OperTest3{
	public static void main(String[] args){
		int x = 10;
		int y = 15;
		int z = 20;
		System.out.println(x + " > " + y + ":" + (x > y)); // > 연산자는 + 보다 낮으므로 가로를 안치면 x + " > " + y + ":" + x 이렇게 더해버림. 
		System.out.println(x + " == " + y + "/2" + (x == y /2));	


		System.out.println(x < y && y > z); //f 
		System.out.println(x < y || y > z); //t


	}
}
