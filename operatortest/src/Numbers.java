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

		int y = c; // 4����Ʈ�� 2����Ʈ�� �ٲ�.
		System.out.println("y==" +y);

		c = (char)y; // ��������ȯ char�� �Ⱥ����� ������ �ٲ�� �ȵ�. char�� �ƽ�Ű�ڵ�� ���ڷ� �ٲ� �� �־ ��ȯ��.
		System.out.println("c==" + c);

		//boolean b = true; // error Ÿ�Ժ�ȯ�� �Ұ����� true�� ���ڷ� �ȹٲ�.
		//int z = b;

		int z = 30;
		double d = z;
		z = (int)d; // z�� 4����Ʈ d�� 8����Ʈ�̹Ƿ� Ÿ�Ժ�ȯ�� ����ߵ�.

	}
}
