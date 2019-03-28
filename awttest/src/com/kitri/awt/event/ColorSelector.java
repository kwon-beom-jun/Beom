package com.kitri.awt.event;

import java.awt.*;
import java.awt.event.*;

public class ColorSelector extends Frame implements AdjustmentListener{

	Panel p1 = new Panel();
	Panel p11 = new Panel();
	Panel p12 = new Panel();
	Panel p13 = new Panel();
	Panel p2 = new Panel();
	Panel p21 = new Panel();
	
	Label lR = new Label("빨강", Label.CENTER);
	Label lG = new Label("초록", Label.CENTER);
	Label lB = new Label("파랑", Label.CENTER);
	Scrollbar sbR = new Scrollbar(Scrollbar.HORIZONTAL, 127, 10, 0, 265);
	Scrollbar sbG = new Scrollbar(Scrollbar.HORIZONTAL, 127, 10, 0, 265);
	Scrollbar sbB = new Scrollbar(Scrollbar.HORIZONTAL, 127, 10, 0, 265);
	
	Panel colorP = new Panel();
	Label colorL = new Label();
	Button ok = new Button("선택");
	
	public ColorSelector() {
		super("색상표!!!");
		
		p11.setLayout(new BorderLayout(10, 0));
		lR.setBackground(Color.RED);
		p11.add(lR, "West");
		p11.add(sbR, "Center");
		
		p12.setLayout(new BorderLayout(10, 0));
		lG.setBackground(Color.GREEN);
		p12.add(lG, "West");
		p12.add(sbG, "Center");
		
		p13.setLayout(new BorderLayout(10, 0));
		lB.setBackground(Color.BLUE);
		p13.add(lB, "West");
		p13.add(sbB, "Center");
		
		p1.setLayout(new GridLayout(5, 1, 0, 20));
		p1.add(new Label(""));
		p1.add(p11);
		p1.add(p12);
		p1.add(p13);
		
		p21.setLayout(new BorderLayout(10, 0));
		p21.add(ok, "East");
		p21.add(colorL, "Center");
		
		p2.setLayout(new BorderLayout(0, 10));
		p2.add(colorP, "Center");
		p2.add(p21, "South");
		
		setLayout(new GridLayout(1, 2, 10, 0));
		add(p1);
		add(p2);
		
		setBounds(300, 200, 500, 400);
		setVisible(true);	
		
		sbR.addAdjustmentListener(this);
		sbG.addAdjustmentListener(this);
		sbB.addAdjustmentListener(this);
		
		
			value();
		
		}



	private void value() {
		int r = sbR.getValue(); // 궁금하면 찾아보기
		int g = sbG.getValue();
		int b = sbB.getValue();
		
		colorP.setBackground(new Color(r,g,b));
		colorL.setText("r = " + r + " g = " + g + " b = " + b);
	}
	

	public static void main(String[] args) {
		new ColorSelector();
	}

	
	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {

		value();
	}
}











