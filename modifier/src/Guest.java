
public class Guest{
	
	static int cnt; // Class 변수
	String name; // instance 변수

	public Guest(String name){
		this.name = name;
	}

	public static int visit(){ 
		cnt++;
		return cnt;
	}
}
