public class IfTest1{
	public static void main(String[] args)	{
		int x = 10;
		int y = 7;
		if (x>y){
			System.out.println("x 크다");
		}
		System.out.println("프로그램 종료!!!");

		
		/*int jumin = 2;
		String a = jumin % 2 == 0 ? "남자" : "여자";

		if( jumin % 2 == 0){
			System.out.println("여자");
		}
		if(jumin % 2 == 1){
			System.out.println("남자");
		}
		if(jumin % 2 != 1){
			System.out.println("남자");
		} 
		안좋은 예시 문법검사를 다함. */
		
		int jumin = 2;
		String gender = "남자";
		if( jumin % 2 == 0){
			gender = "여자";
		}
		System.out.println(gender);
		

	}
}
