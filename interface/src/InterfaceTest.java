import java.awt.*;
import java.awt.event.*;

public class InterfaceTest extends Frame implements WindowListener, ActionListener{
	
	

	Button b1 = new Button("�����پ�~");

	public InterfaceTest(){
		super("Is A Test!!");
		//setTitle("Is A Test~");
		setLayout(new FlowLayout());
		//setLabel("�����g~");
		add(b1);
		setSize(400, 300);
		setVisible(true);
		setLocation(300,400);
		

		// WindowListener wl = new InterfaceTest();
		addWindowListener(this); // �����Ѵٴ°���. this�� ������.
		b1.addActionListener(this); // ã�ƺ���										??
	}
	
	public void windowDeactivated(WindowEvent e){}
	public void windowActivated(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public void windowIconified(WindowEvent e){}
	public void windowClosed(WindowEvent e){}
	public void windowClosing(WindowEvent e){System.exit(0);}
	public void windowOpened(WindowEvent e){}

	public void actionPerformed(ActionEvent e){
		int r = (int)(Math.random() * 256);
		int g = (int)(Math.random() * 256);
		int b = (int)(Math.random() * 256);
		setBackground(new Color(r,g,b));
	}

	public static void main(String[] args)	{

		InterfaceTest hat = new InterfaceTest();
	}
}
