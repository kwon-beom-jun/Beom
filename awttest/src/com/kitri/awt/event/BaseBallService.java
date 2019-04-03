//package com.kitri.awt.event;
//
//import java.awt.Color;
//import java.util.Random;
//
//public class BaseBallService {
//
//	BaseBallController baseBallController;
//	
//	private int my[];
//	private int com[];
//	int gameLength;
//	Random random = new Random();
//	int count;
//	
//	public BaseBallService(BaseBallController baseBallController) {
//		this.baseBallController = baseBallController;
//		gameLength = 3;
//		my = new int[gameLength];
//		com = new int[gameLength];
//		newGame();
//	}
//
//	public void newGame() {
//		com[0] = random.nextInt(9) + 1;
//		do {
//			com[1] = random.nextInt(10);
//		}while (com[0] == com[1]);
//		do {
//			com[2] = random.nextInt(10);
//		}while (com[0] == com[2] || com[1] == com[2]);	
//		System.out.println("컴터 : " + com[0] + com[1] + com[2]);
//	}
//
//	public void clear() {
//		baseBallController.baseBall.ta.setText(" ");
//	}
//
//	public void showDap() {
//		baseBallController.baseBall.ta.append("답이 궁금하십니까?? 바로 정답은..  " + com[0] + com[1] + com[2] + "입니다.");
//	}
//
//	public void fontColorChange() {
//		
//	}
//
//	public void exit() {
//		System.exit(0);
//	}
//
//	public void game() {
//
//		int strike = 0;
//		int ball = 0;
//		String myNumStr = baseBallController.baseBall.tf.getText().trim();
//		//String으로 잡는 이유는 gettextfeild를 쓰려고
//		baseBallController.baseBall.tf.setText("");								//??
//		
//		for (int i = 0; i < gameLength; i++) {
//			my[i] = myNumStr.charAt(i) - 48;;
//		}
//		
//		for (int m = 0; m < gameLength; m++) {
//			for (int c = 0; c < gameLength; c++) {
//				if(my[m] == com[c]) { //같은 숫자라면..
//					if(m == c)//자리수 같다면...
//						strike++;
//					else
//						ball++;
//				}
//			}
//		}
//		count++;
//		
//		if(strike != gameLength) {
//			baseBallController.baseBall.ta.append(count + ". " + myNumStr + "은 " + strike + "스트라이크 " + ball + "볼입니다.\n");
//		}else {
//			baseBallController.baseBall.ta.append(myNumStr + "을 " + count + "번만에 정답입니다.\n");
//			baseBallController.baseBall.ta.append("새 게임 or 종료를 누르세요!\n");
//			baseBallController.baseBall.tf.setEnabled(false); // 사용 못하게   								//setEnabled?
//		}
//		
//		public void changeColor() {
//			int r = baseBallController.baseBall.fontColorChooser.sbR.getValue(); // 궁금하면 찾아보기
//			int g = baseBallController.baseBall.fontColorChooser.sbG.getValue();
//			int b = baseBallController.baseBall.fontColorChooser.sbB.getValue();
//			
//			colorP.setBackground(new Color(r,g,b));
//			colorL.setText("r = " + r + " g = " + g + " b = " + b);
//		}
//		
//	}
//
//}

package com.kitri.awt.event;

import java.awt.Color;
import java.util.Random;

public class BaseBallService {

	BaseBallController baseBallController;
	private BaseBall bb;
	private FontColorChooser fcc;
	
	private int my[];
	private int com[];
	int gameLength;
	Random random = new Random();
	int count;
	int r, g, b;
	
	public BaseBallService(BaseBallController baseBallController) {
		this.baseBallController = baseBallController;
		bb = baseBallController.baseBall;
		fcc = bb.fontColorChooser;
		gameLength = 3;
		my = new int[gameLength];
		com = new int[gameLength];
		newGame();
	}

	public void newGame() {
		com[0] = random.nextInt(9) + 1;
		do {
			com[1] = random.nextInt(10);
		}while (com[0] == com[1]);
		do {
			com[2] = random.nextInt(10);
		}while (com[0] == com[2] || com[1] == com[2]);
		bb.tf.setEnabled(true);
		clear();
		viewResult("새로운 게임을 시작합니다.");
		count = 0;
		System.out.println("컴터 : " + com[0] + com[1] + com[2]);
	}

	public void clear() {
		bb.ta.setText(" ");
	}

	public void showDap() {
		viewResult("정답은 " + com[0] + com[1] + com[2] + "입니다.");
		viewResult("새게임 또는 종료를 누르세요!!");
		bb.tf.setEnabled(false);
	}

	public void fontColorChange() {
		fcc.setVisible(true);
		changeColor();
	}

	public void exit() {
		System.exit(0);
	}

	public void game() {
		int strike = 0;
		int ball = 0;
		String myNumStr = bb.tf.getText().trim();
		bb.tf.setText("");
		
		if(myNumStr.length() != gameLength) {
			viewResult("3자리 숫자를 입력하세요!!!!");
			return;
		}
		
		if(!isNumber(myNumStr)) {
			viewResult("숫자만 입력하세요!!!!");
			return;
		}
		
		for(int i=0;i<gameLength;i++) {
			my[i] = myNumStr.charAt(i) - 48;
		}
		
		for (int m = 0; m < gameLength; m++) {
			for (int c = 0; c < gameLength; c++) {
				if(my[m] == com[c]) { //같은 숫자라면..
					if(m == c)//자리수 같다면...
						strike++;
					else
						ball++;
				}
			}
		}
		count++;
		
		if(strike != gameLength) {
			viewResult(count + ". " + myNumStr + "은 " + strike + "스트라이크 " + ball + "볼입니다.");
		} else {
			viewResult(myNumStr + "을 " + count + "번만에 정답입니다.");
			viewResult("새게임 또는 종료를 누르세요!!");
			bb.tf.setEnabled(false);
		}
	}
	
	private void viewResult(String msg) {
		bb.ta.append(msg + "\n");
	}
	
	private boolean isNumber(String str) {
		boolean flag = true;
		for (int i = 0; i < gameLength; i++) {
			int num = str.charAt(i) - 48;
			if(num < 0 || num > 9) {
				flag = false;
				break;
			}
		}	
		return flag;
	}

	public void changeColor() {
		r = fcc.sbR.getValue();
		g = fcc.sbG.getValue();
		b = fcc.sbB.getValue();
		fcc.colorP.setBackground(new Color(r, g, b));
		fcc.colorL.setText("r = " + r + "  g = " + g + "  b = " + b);
	}

	public void selectColor() {
		bb.ta.setForeground(new Color(r, g, b));
		fcc.setVisible(false);
	}
}


















