package com.kitri.awt.calculator;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController implements ActionListener{
	
	Calculator calculator;
	CalculatorService calculatorService;
//	String a[] = {"7","8","9","+","4","5","6","-","1","2"
//			,"3","*","0","C","=","/"};
//	Button bt[] = new Button[16];
	
	
	public CalculatorController(Calculator calculator) {
		
		this.calculator = calculator;
		calculatorService = new CalculatorService(this);
	}

	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		//button button = (button)e.getsource();
		
		for (int i = 0; i <= 15; i++) {
			if (ob == calculator.bt[i]) {
				calculatorService.number(i);// 연산자인지 숫자인지 종료인지 보내주기.
			}
		}
		
		
		if (ob == calculator.exit) {
			calculatorService.exit();
		}
		
	}
	
	

}
