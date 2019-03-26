public class SwitchTest1{
	public static void main(String[] args){
		int num = 1;
		switch (num){
		case 1 : System.out.println("1입니다.");break;
		case 2 : System.out.println("2입니다.");break;
		case 3 : System.out.println("3입니다.");break;
		default : System.out.println("123아닙니다.");		
		}
		System.out.println("프로그램종료!!!"); // 첫번쨰 실행되면 나머지 다실행됨

		char c = 'a';
		switch (c){
		case 97 : System.out.println("a입니다.");break;
		case 98 : System.out.println("b입니다.");break;
		case 99 : System.out.println("c입니다.");break;
		default : System.out.println("abc아닙니다.");		
		}
		System.out.println("프로그램종료!!!"); // 아스키코드.

		String str = "java";
		switch (str){
		case "oracle" : System.out.println("1입니다.");break;
		case "java" : System.out.println("2입니다.");break;
		case "jsp" : System.out.println("3입니다.");break;
		default : System.out.println("123아닙니다.");		
		}
		System.out.println("프로그램종료!!!"); // 
	}
}
