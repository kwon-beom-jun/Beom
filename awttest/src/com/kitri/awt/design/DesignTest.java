
package com.kitri.awt.design;

import java.awt.*;



/*
	1. Fame 상속
	2. 선언부 필요한 객체 생성.
	3. 배치부에서 design(component배치)
	** 작업은 항상 작은거부터 큰거순으로 하는게 좋음.
*/

public class DesignTest extends Frame{
	
//	선언부
	Panel pN = new Panel();
	Panel pS = new Panel();
	
	Label l = new Label("입력",Label.CENTER);
	TextField tf = new TextField();
	Button send = new Button("전송");
	
	TextArea ta = new TextArea();
	
	Choice ch = new Choice();
	Button exit = new Button("종료");
	
	
	
	public DesignTest() {	// 클래스가 프레임
		super("Design Test !!!");
//	배치부
//	1.setText("입력");
		pN.setLayout(new BorderLayout(10 , 0)); // BorderLayout()는 사용만 하므로 setLayout pt = new BorderLayout(); 안함
//		hgap은 component와 component의 거리
		l.setBackground(new Color(210,210,150)); // R,G,B순
//		l.setForeground(new Color(255,0,0));
		l.setForeground(Color.orange); // static은 클래스로 접근 가능함.
		Font f = new Font("굴림", Font.BOLD , 20); // 여러군데 사용함.
		l.setFont(f);
		pN.add(l, "West"); // default여서 안함. 
		pN.add(tf, "Center");
		pN.add(send, "East");
		
		pS.setLayout(new GridLayout(1, 2, 10, 0));
		ch.add("서울");
		ch.add("경기, 인천");
		ch.add("강원");
		ch.add("충청");
		
		setLayout(new BorderLayout(0,10));
		pS.add(ch);
		exit.setFont(f);
		pS.add(exit);
		
		
		add(pN, "North");
		add(ta, "Center");
		add(pS, BorderLayout.SOUTH); // 이렇게 해도 됨.							?? 임포트가 또 들어가는 이유.
//		반드시 대문자로 해야뎀.
//		메모리 상에서 배치작업임.
		
//		setVisible(boolean b) true 보여라 폴스 안보여라.
//		setSize(300, 500); // class window 그냥쓰는 이유 Frame 호출받아서
//		setLocation(300,200);
		setBounds(300, 200, 300, 500); // 위에 합친것.
		setResizable(false); // 크기 변동불가.
		setVisible(true);
//		setVisible은 항상 마지막에 해야됨 
		
	}
	
	public static void main(String[] args) {
		
		new DesignTest(); // 익명으로 객체생성. DesignTest dt = new DesignTest(); dt를 사용할 일이 없어서 안만듬. 
		
	}

}
