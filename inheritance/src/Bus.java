/*

----- ���� -----
���� �̸� : ���ڷ� ���� ����. 1~3
���� ���� : �ó����� ��������.
���� ���� : �ʷ�, ����, ���
info() �����.
���� Ʋ�� �����.
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
		return "���� �̸� : " + busName + "  ���� ���� : " + busMark + "  ���� ���� : " + busColor;
	}
	
	
}







