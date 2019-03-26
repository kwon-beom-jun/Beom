public class IfElseIfTest1{
	public static void main(String[] args)	{
		int x = 10;
		int y = 10;

		String ds;
		if(x == y){
			ds = "같다";
		}else if(x > y){
			ds = "크다";
		}else{
			ds = "작다";
		}
		System.out.println(x+"는 "+y+"보다 "+ds);
	}
}
