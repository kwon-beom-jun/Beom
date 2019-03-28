package com.kitri.awt.design;

import java.awt.*;

public class BaseBall extends Frame {

	Panel pC = new Panel();
	Panel pCS = new Panel();
	Panel pE = new Panel();
	
	TextArea ta = new TextArea();
	Label l = new Label("입력", Label.CENTER);
	TextField tf = new TextField();
	
	Button newG = new Button("새게임");
	Button clear = new Button("지우기");
	Button dap = new Button("정답");
	Button fontC = new Button("폰트색");
	Button exit = new Button("종료");
	
	public BaseBall() {
		super("숫자 야구 게임!!!");
		
		pCS.setLayout(new BorderLayout(10, 0));
		pCS.add(l, "West");
		pCS.add(tf, "Center");
		
		pC.setLayout(new BorderLayout(0, 10));
		pC.add(pCS, "South");
		pC.add(ta, "Center");
		
		pE.setLayout(new GridLayout(5, 1, 0, 10));
		pE.add(newG);
		pE.add(clear);
		pE.add(dap);
		pE.add(fontC);
		pE.add(exit);
		
		setLayout(new BorderLayout(10, 0));
		add(pC, "Center");
		add(pE, "East");
		
		setBounds(300, 200, 500, 400);
		setVisible(true);	
		
	}
	
	public static void main(String[] args) {
		new BaseBall();
	}
}

