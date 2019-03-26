
public class Pointcard{
	
	int cnt;
	String name;

	public Pointcard(String name){
		this.name = name;
	}

	public int visit(){
		cnt++;
		return cnt;
	}
}
