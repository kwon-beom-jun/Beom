/*
------- 버스 기능 -------
버스 색, 종류, 이름
버스 기능
	손님이 들어올때 가격 제한.
	누적금액.
	손님 인원수 시작 0명.
    인원수 카운트 30명.
		 
버스(Bus)			  
승객수(count)         
타다()                 
loadUp(int weight)
내리다()              
getOut(int count)    

나이 제한 1 ~ 19세 800원
		  20 ~ 60세 1000원
		  60 ~  100세 500원

*/

public class BusFunction extends Bus {

	int count; // 승객수
	int age; // 나이
	int pay; // 금액
	int totalpay; // 총 금액

	public BusFunction(){
		count = 0;
		totalpay = 0;
		age = 0;
		pay = 0;
	}
	
	public BusFunction(String busName, String busMark, String busColor){
		super(busName, busMark, busColor);
	}



/*		  
	승객수(count)         
	타다()                 
	loadUp(int weight)
	내리다()              
	getOut(int count) 
	손님이 들어올때 가격 제한.
	총 누적금액.
	손님 인원수 시작 0명.
    인원수 카운트 30명.	
	인원수 30명 되면 못들어오게 하기.
*/
	
	
	// 나이 제한
	// 총 금액 누적
	// 인원수 30명 되면 못들어오게 하기.
	public void loadUP(){
		
		if (this.count >= 0 && this.count < 30){
			this.count += count;		
		}else{
			this.count = count;
			System.out.println("더 이상 승객을 태울 수 없습니다.");
		}
	}

	
	public void getOut(){

	}
	
	//총 금액
	//어린이 요금
	//성인 요금
	//버스 총 금액 = 어린이 요금 * 어린이 인원수 + 성인요금 * 성인 인원수
	/*
	public void total(int cpay , int apay , int count, int acount){
		totalpay = cpay * count + apay * count;
	}
	*/

	
	











}
