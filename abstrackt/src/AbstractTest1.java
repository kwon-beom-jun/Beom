import java.util.*;

public class AbstractTest1{
	public static void main(String[] args)	{

		//1. ���� Ŭ���� ����
		GregorianCalendar cal = new GregorianCalendar();

		
		System.out.println(cal.get(Calendar.AM_PM));


		/*2. �ڽ��� ��ü�� return�ϴ� static method.
		Calendar cal = Calendar.getInstance();
		
		int y = cal.get(Calendar.YEAR); // Ŭ������ �̸����� ������.
		int m = cal.get(Calendar.MONTH) + 1; // ���� ����� ǥ���ϹǷ� �츮����ó�� ���ڷ� ǥ���ҷ��� 0���� �����̴� +1 ����ߵ�.
		int d = cal.get(Calendar.DATE);
		int h = cal.get(Calendar.HOUR);
		int mi = cal.get(Calendar.MINUTE);
		int s= cal.get(Calendar.SECOND);
		
		System.out.println(y+ "�� " +m +"�� "+d+"�� "+h+"�� "+mi+"�� "+s+"�� ");
		*/
		
	}
}
