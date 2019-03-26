public class AbstractTest2{
	public static void main(String[] args)	throws Exception{
		
		// 3. 외부클래스 참조.
		Runtime r = Runtime.getRuntime(); // 천천히 다시 찾아가보기.
		Process p = r.exec("calc");
		System.out.println("");
		
	}
}
