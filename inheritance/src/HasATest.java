import java.awt.*;


public class HasATest{
	
	Frame f = new Frame("Has A Test~");
	Button b = new Button("�����پ�~");

	public HasATest(){
		//f.setTitle("Has A Test~");
		f.setLayout(new FlowLayout());
		//b.setLabel("�����g~");
		f.add(b);
		f.setSize(400, 300);
		f.setVisible(true);
		f.setLocation(300,400);							
	}
	
	public static void main(String[] args)	{

		HasATest hat = new HasATest();
	}
}
