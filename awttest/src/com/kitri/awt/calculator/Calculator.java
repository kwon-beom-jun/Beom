package com.kitri.awt.calculator;

import java.awt.*;
import java.awt.event.ActionListener;

import javafx.scene.layout.Border;


public class Calculator extends Frame{
	
	CalculatorController calculatorController;
	
	
	Panel pN = new Panel();
	Panel pC = new Panel();
	Panel pS = new Panel();
		
	Label numL = new Label();
	Label opeol = new Label();
	Button bt[] = new Button[16];
	
	String a[] = {"7","8","9","+","4","5","6","-","1","2"
			,"3","*","0","C","=","/"};
	//버튼 배열 메소드
	public void number() {
		
		int len = a.length;
		for (int i = 0; i < len; i++) {
			bt[i] = new Button(a[i]);
			pC.add(bt[i]);
		}
		
	}
	
	Button exit = new Button("종료");

	
	public Calculator(){
		
		pN.setLayout(new BorderLayout());
		pN.add(numL,"Center");
		pN.add(opeol,"East");
		
		pC.setLayout(new GridLayout(4,4));
		
		
		number();
		
		
		pS.setLayout(new BorderLayout());
		pS.add(exit,"Center");
		
		
		setLayout(new BorderLayout());
		add(pN,"North");
		add(pC,"Center");
		add(pS,"South");
		setBounds(300, 200, 500, 400);
		setVisible(true);
		
		calculatorController = new CalculatorController(this);
		exit.addActionListener(calculatorController);
		
//		for (int i = 0; i < 16; i++) {
//			bt[i].addActionListener(calculatorController);
//		}
		int len = bt.length;
		for (int i = 0; i < len; i++) {
			bt[i].addActionListener(calculatorController);
		}
/*		
		bt[0].addActionListener(calculatorController);
		bt[1].addActionListener(calculatorController);
		bt[2].addActionListener(calculatorController);
		bt[3].addActionListener(calculatorController);
		bt[4].addActionListener(calculatorController);
		bt[5].addActionListener(calculatorController);
		bt[6].addActionListener(calculatorController);
		bt[7].addActionListener(calculatorController);
		bt[8].addActionListener(calculatorController);
		bt[9].addActionListener(calculatorController);
		bt[10].addActionListener(calculatorController);
		bt[11].addActionListener(calculatorController);
		bt[12].addActionListener(calculatorController);
		bt[13].addActionListener(calculatorController);
		bt[14].addActionListener(calculatorController);
		bt[15].addActionListener(calculatorController);
*/		
			
	}
	
	
	public static void main(String[] args) {
		
		new Calculator();
		
	}
	
}
