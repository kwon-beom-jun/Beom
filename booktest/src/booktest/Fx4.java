/*
 * 4x + 5y = 60의 모든 해를 구해서 (x,y)의 형태로 출력해 보자. x와 y는 10 이하의 자연수이다.
 */
package booktest;

public class Fx4 {
	public static void main(String[] args) {
		
		int sum = 60;
			
		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				sum = 4*x + 5*y;
				if (sum == 60) {
					System.out.println(" x는:" + x + " y는:" + y);
				}
			}
		}
	}

}
