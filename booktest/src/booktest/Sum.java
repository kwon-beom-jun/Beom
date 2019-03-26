// 1~100 까지 3의 배수의 총합을 구하는 코드 작성.

package booktest;

public class Sum {

	public static void main(String[] args) {
		
		int num = 0;
		
		for (int i = 1; i <= 100; i++) {
			if (i%3 == 0) {
				num += i;
			}
		}
		
		System.out.println(num);
		
	}

}
