public class Numbers
{
	public static void main(String[] args) 
	{

		int a = 1;
		System.out.println(a);
		System.out.println(a++);
		System.out.println(a);

		char c = 'a';
		System.out.println("c==" +c);
		System.out.println(" (int)c == " + (int)c);

		int y = c; // 4바이트가 2바이트로 바뀜.
		System.out.println("y==" +y);

		c = (char)y; // 강제형변환 char가 안붙으면 공간이 바뀌여서 안들어감. char는 아스키코드로 숫자로 바꿀 수 있어서 변환됨.
		System.out.println("c==" + c);

		//boolean b = true; // error 타입변환이 불가능함 true는 숫자로 안바뀜.
		//int z = b;

		int z = 30;
		double d = z;
		z = (int)d; // z는 4바이트 d는 8바이트이므로 타입변환을 해줘야뎀.

	}
}
