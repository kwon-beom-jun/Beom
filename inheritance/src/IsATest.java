 import java.awt.*;


public class IsATest extends Frame{
	
	

	Button b = new Button("눌러바앙~");

	public IsATest(){
		super("Is A Test!!");
		//setTitle("Is A Test~");
		setLayout(new FlowLayout());
		//setLabel("눌러봥~");
		add(b);
		setSize(400, 300);
		setVisible(true);
		setLocation(300,400);							
	}
	
	public static void main(String[] args)	{

		IsATest hat = new IsATest();
	}
}
