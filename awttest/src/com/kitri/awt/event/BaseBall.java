package com.kitri.awt.event;

import java.awt.*;

public class BaseBall extends Frame {

	Panel pC = new Panel();
	Panel pCS = new Panel();
	Panel pE = new Panel();
	
	TextArea ta = new TextArea();
	Label l = new Label("�Է�", Label.CENTER);
	TextField tf = new TextField();
	
	Button newG = new Button("������");
	Button clear = new Button("�����");
	Button dap = new Button("����");
	Button fontC = new Button("��Ʈ��");
	Button exit = new Button("����");
	
	public BaseBall() {
		super("���� �߱� ����!!!");
		
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
