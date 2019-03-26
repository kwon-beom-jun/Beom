// 534자루의 연필을 30명의 학생들에게 똑같은 개수로 나누어 줄 때
// 각각 몇개를 가질 수 있고 남는게 몇개인지.

package booktest;

public class test {

	public static void main(String[] args) {
		
		int a = 534 % 30;
		int b = 534 / 30;
		
		System.out.println( a + "는 남은 갯수" + b + "는 각자의 몫");
		
	}

}
