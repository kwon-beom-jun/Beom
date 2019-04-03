package com.kitri.awt.calculator;

import java.awt.Button;


public class CalculatorService {
	
	CalculatorController calculatorController;
	Calculator calculator;
	
	int result;		

	public CalculatorService(CalculatorController calculatorController) {
		this.calculatorController = calculatorController;
		result = 0;
		
	}
	
	
	public void number(int i) {
	

		// button(라벨) 이므로 라벨값을 넣어주면됌.


		
		System.out.println(calculatorController.calculator.a[i]);
		
		calculatorController.calculator.numL.setText(calculatorController.calculator.a[i]);
		
		if(i == 3) {
		
			if ( i >= 0 && i <= 2 ) {
				result += Integer.parseInt(calculatorController.calculator.a[i]);
			}else if (i >= 4 && i <= 6) {
				result += Integer.parseInt(calculatorController.calculator.a[i]);
			}else if (i >= 8 && i <= 10) {
				Integer.parseInt(calculatorController.calculator.a[i]);
				result += Integer.parseInt(calculatorController.calculator.a[i]);
			}else if ( i == 12 ) {
				Integer.parseInt(calculatorController.calculator.a[i]);	
				result += Integer.parseInt(calculatorController.calculator.a[i]);
			}
		}
		
		// 덧셈연산자.
		
		
		
//		if (calculatorController.calculator.a[i] >= 0 && calculatorController.calculator.a[i] <= 9) {
//			
//			
//		}else {
//			
//		}
		
//		calculatorController.calculator.numL.setText(calculatorController.calculator.a[i]);
		
		
	}

	public void exit() {
		System.exit(0);
		System.out.println("종료");
	}
	
}
