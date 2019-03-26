import java.awt.*;
import java.awt.event.*;

public class AbstractTest3 extends Frame{
	
	

	Button b = new Button("눌러바앙~");

	public AbstractTest3(){
		super("Is A Test!!");
		//setTitle("Is A Test~");
		setLayout(new FlowLayout());
		//setLabel("눌러봥~");
		add(b);
		setSize(400, 300);
		setVisible(true);
		setLocation(300,400);	
		
		WindowListener wl = new WindowAdapter(){ // 같은거라 생각해도됨 WindowAdapter wl = new WindowAdapter(){} 이렇게 해도됌.
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}

			public void windowIconified(WindowEvent e){
				System.out.println("아이콘화!!!");
			}
		};
		addWindowListener(wl);
	}
	
	public static void main(String[] args)	{

		AbstractTest3 hat = new AbstractTest3();
	}
}
