//기본가격은 아무런 옵션이 추가되지 않은 형태의 가격, 총가격은 기본가격+옵션별 추가금액이 적용된 금액
//음식에 옵션은 있을수도 있고 없을 수도 있다.
//get 은 데이터를 return  set 은 데이터를 변수에 저장하는 구조
//모든 변수는 private
//기본가격을 가져옴
//public int getPrice();
//기본가격을 받아서 설정함
//public void setPrice(int price);
//음식의 이름을 가져옴
//public String getName();
//음식의 이름을 세팅함
//public void setName(String name);
//toString Override 해서 해당 음식에 대한 출력을 한다
//public String toString();
//총가격을 가져온다
//public int getTotalPrice();
// 총가격은 설정 불가능

package food;

public interface Food {
	
	public int getPrice();
	public void setPrice(int price);
	public String getName();
	public void setName(String name);
	public String toString();
	public int getTotalPrice();


}
