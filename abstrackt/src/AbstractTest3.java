import java.awt.*;
import java.awt.event.*;

public class AbstractTest3 extends Frame{
	
	

	Button b = new Button("�����پ�~");

	public AbstractTest3(){
		super("Is A Test!!");
		//setTitle("Is A Test~");
		setLayout(new FlowLayout());
		//setLabel("�����g~");
		add(b);
		setSize(400, 300);
		setVisible(true);
		setLocation(300,400);	
		
		WindowListener wl = new WindowAdapter(){ // �����Ŷ� �����ص��� WindowAdapter wl = new WindowAdapter(){} �̷��� �ص���.
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}

			public void windowIconified(WindowEvent e){
				System.out.println("������ȭ!!!");
			}
		};
		addWindowListener(wl);
	}
	
	public static void main(String[] args)	{

		AbstractTest3 hat = new AbstractTest3();
	}
}
