/*
 * 4x + 5y = 60�� ��� �ظ� ���ؼ� (x,y)�� ���·� ����� ����. x�� y�� 10 ������ �ڿ����̴�.
 */
package booktest;

public class Fx4 {
	public static void main(String[] args) {
		
		int sum = 60;
			
		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				sum = 4*x + 5*y;
				if (sum == 60) {
					System.out.println(" x��:" + x + " y��:" + y);
				}
			}
		}
	}

}
