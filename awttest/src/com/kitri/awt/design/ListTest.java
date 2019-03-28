/*
package com.kitri.awt.design;

import java.awt.*;

import javafx.scene.layout.Pane;


public class ListTest extends Frame{
	
	Panel pC = new Panel();
	Panel pW = new Panel();
	Panel pE = new Panel();
	
	List listL = new List();
	
	Button btR = new Button();
	Button btRAll = new Button();
	Button btL = new Button();
	Button btLAll = new Button();

	List listR = new List();
	
	
	TextField tfl = new TextField();
	TextField tfR = new TextField();
	
	
	public ListTest() {
		
		listL.setBackground(new Color(255,0,0));
		
		pW.setLayout(new GridLayout(2,1,0,10));
		pW.add(listL);
		pW.add(tfl);
				
		pC.setLayout(new GridLayout(7,1,10,20));
		pC.add(btR);
		pC.add(btRAll);
		pC.add(btL);
		pC.add(btLAll);
		
		pE.setLayout(new GridLayout(2,1,5,10));
		pE.add(listR);
		pE.add(tfR);
		
		setBounds(300, 400, 500, 600);
		setVisible(true);
		setLayout(new GridLayout(0,3,10,10));
		
		add(pW, "West");
		add(pC, "Center");
		add(pE, "East");
		
	}
	
	public static void main(String[] args) {
		
		new ListTest();
		
	}

}
*/

package com.kitri.awt.design;

import java.awt.*;

public class ListTest extends Frame {

	Panel p1 = new Panel();
	Panel p2 = new Panel();
	Panel p3 = new Panel();
	
	List listL = new List();
	List listR = new List();
	TextField tfL = new TextField();
	TextField tfR = new TextField();
	
	Button btR = new Button("▷");
	Button btRAll = new Button("▶");
	Button btL = new Button("◁");
	Button btLAll = new Button("◀");
	
	Font f = new Font("굴림", Font.BOLD, 20);
	
	public ListTest() {
		super("리스트 테스트");
		
		p1.setLayout(new BorderLayout(0, 10));
		p1.add(listL, "Center");
		p1.add(tfL, "South");
		
		p2.setLayout(new GridLayout(6, 1, 0, 20));
		p2.add(new Label(""));
		btR.setFont(f);
		btRAll.setFont(f);
		btL.setFont(f);
		btLAll.setFont(f);
		p2.add(btR);
		p2.add(btRAll);
		p2.add(btL);
		p2.add(btLAll);
		
		p3.setLayout(new BorderLayout(0, 10));
		p3.add(listR, "Center");
		p3.add(tfR, "South");
		
		setLayout(new GridLayout(1, 3, 10, 0));
		add(p1);
		add(p2);
		add(p3);
		
		setBounds(300, 200, 300, 500);
		setVisible(true);		
	}
	
	
	public static void main(String[] args) {
		new ListTest();
	}
}

