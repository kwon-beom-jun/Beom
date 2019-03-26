import java.util.*;

public class AbstractTest1{
	public static void main(String[] args)	{

		//1. 하위 클래스 참조
		GregorianCalendar cal = new GregorianCalendar();

		
		System.out.println(cal.get(Calendar.AM_PM));


		/*2. 자신의 객체를 return하는 static method.
		Calendar cal = Calendar.getInstance();
		
		int y = cal.get(Calendar.YEAR); // 클래스의 이름으로 접근함.
		int m = cal.get(Calendar.MONTH) + 1; // 월은 영어로 표기하므로 우리나라처럼 숫자로 표기할려면 0부터 시작이니 +1 해줘야뎀.
		int d = cal.get(Calendar.DATE);
		int h = cal.get(Calendar.HOUR);
		int mi = cal.get(Calendar.MINUTE);
		int s= cal.get(Calendar.SECOND);
		
		System.out.println(y+ "년 " +m +"월 "+d+"일 "+h+"시 "+mi+"분 "+s+"초 ");
		*/
		
	}
}
