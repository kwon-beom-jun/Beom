package com.kitri.awt.design;

import java.awt.*;
import java.awt.event.ActionListener;

import javafx.scene.layout.Border;


public class Calculator extends Frame{
	
	Panel pN = new Panel();
	Panel pC = new Panel();
	Panel pS = new Panel();
	
	
	Label numL = new Label();
	Label opeol = new Label();
	Button bt[] = new Button[16];

	String a[] = {"7","8","9","+","4","5","6","-","1","2"
			,"3","*","0","C","=","/"};
	
	Button exit = new Button("Á¾·á");

	
	public Calculator(){
		
		pN.setLayout(new BorderLayout());
		pN.add(numL,"Center");
		pN.add(opeol,"East");
		
		pC.setLayout(new GridLayout(4,4));
		
		int len = a.length;
		for (int i = 0; i < len; i++) {
			bt[i] = new Button(a[i]);
			pC.add(bt[i]);
		}
		
		
		
		pS.setLayout(new BorderLayout());
		pS.add(exit,"Center");
		
		
		setLayout(new BorderLayout());
		add(pN,"North");
		add(pC,"Center");
		add(pS,"South");
		setBounds(300, 200, 500, 400);
		setVisible(true);
		
			
	}
	
	
	public static void main(String[] args) {
		
		new Calculator();
		
	}
	
}
