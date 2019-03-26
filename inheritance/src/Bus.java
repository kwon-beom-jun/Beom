/*

----- 버스 -----
버스 이름 : 숫자로 지정 난수. 1~3
버스 종류 : 시내버스 광역버스.
버스 색깔 : 초록, 빨강, 노랑
info() 만들기.
버스 틀만 만들기.
*/
public class Bus{
	
	String busName;
	String busMark;
	String busColor;

	public Bus(){}

	public Bus(String busName, String busMark, String busColor){
		this.busName = busName;
		this.busMark = busMark;
		this.busColor = busColor;
	}
	
	
	public String info(){
		return "버스 이름 : " + busName + "  버스 종류 : " + busMark + "  버스 색깔 : " + busColor;
	}
	
	
}







