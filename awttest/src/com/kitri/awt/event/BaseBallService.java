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
//		System.out.println("���� : " + com[0] + com[1] + com[2]);
//	}
//
//	public void clear() {
//		baseBallController.baseBall.ta.setText(" ");
//	}
//
//	public void showDap() {
//		baseBallController.baseBall.ta.append("���� �ñ��Ͻʴϱ�?? �ٷ� ������..  " + com[0] + com[1] + com[2] + "�Դϴ�.");
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
//		//String���� ��� ������ gettextfeild�� ������
//		baseBallController.baseBall.tf.setText("");								//??
//		
//		for (int i = 0; i < gameLength; i++) {
//			my[i] = myNumStr.charAt(i) - 48;;
//		}
//		
//		for (int m = 0; m < gameLength; m++) {
//			for (int c = 0; c < gameLength; c++) {
//				if(my[m] == com[c]) { //���� ���ڶ��..
//					if(m == c)//�ڸ��� ���ٸ�...
//						strike++;
//					else
//						ball++;
//				}
//			}
//		}
//		count++;
//		
//		if(strike != gameLength) {
//			baseBallController.baseBall.ta.append(count + ". " + myNumStr + "�� " + strike + "��Ʈ����ũ " + ball + "���Դϴ�.\n");
//		}else {
//			baseBallController.baseBall.ta.append(myNumStr + "�� " + count + "������ �����Դϴ�.\n");
//			baseBallController.baseBall.ta.append("�� ���� or ���Ḧ ��������!\n");
//			baseBallController.baseBall.tf.setEnabled(false); // ��� ���ϰ�   								//setEnabled?
//		}
//		
//		public void changeColor() {
//			int r = baseBallController.baseBall.fontColorChooser.sbR.getValue(); // �ñ��ϸ� ã�ƺ���
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
		viewResult("���ο� ������ �����մϴ�.");
		count = 0;
		System.out.println("���� : " + com[0] + com[1] + com[2]);
	}

	public void clear() {
		bb.ta.setText(" ");
	}

	public void showDap() {
		viewResult("������ " + com[0] + com[1] + com[2] + "�Դϴ�.");
		viewResult("������ �Ǵ� ���Ḧ ��������!!");
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
			viewResult("3�ڸ� ���ڸ� �Է��ϼ���!!!!");
			return;
		}
		
		if(!isNumber(myNumStr)) {
			viewResult("���ڸ� �Է��ϼ���!!!!");
			return;
		}
		
		for(int i=0;i<gameLength;i++) {
			my[i] = myNumStr.charAt(i) - 48;
		}
		
		for (int m = 0; m < gameLength; m++) {
			for (int c = 0; c < gameLength; c++) {
				if(my[m] == com[c]) { //���� ���ڶ��..
					if(m == c)//�ڸ��� ���ٸ�...
						strike++;
					else
						ball++;
				}
			}
		}
		count++;
		
		if(strike != gameLength) {
			viewResult(count + ". " + myNumStr + "�� " + strike + "��Ʈ����ũ " + ball + "���Դϴ�.");
		} else {
			viewResult(myNumStr + "�� " + count + "������ �����Դϴ�.");
			viewResult("������ �Ǵ� ���Ḧ ��������!!");
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

















