/*
package com.kitri.awt.design;

import java.awt.*;


//1. Fame 상속
//2. 선언부 필요한 객체 생성.
//3. 배치부에서 design(component배치)
// 작업은 항상 작은거부터 큰거순으로 하는게 좋음.


public class ItemTest extends Frame{
	
	Panel pN = new Panel();
	Panel pS = new Panel();
	
	//pN
	CheckboxGroup cbg = new CheckboxGroup();
	Checkbox mor = new Checkbox("아침");
	Checkbox aft = new Checkbox("점심");
	Checkbox eve = new Checkbox("저녁");
	
	//center
	TextArea ta = new TextArea();
	
	//pS
	Choice ch = new Choice();
	Button exit = new Button("종료");
		
	
	public ItemTest() {
		super("ItemTest !!!");
		
		add(pN, "North");
		add(ta, "Center");
		add(pS, "South");
		
		pN.setLayout(new GridLayout(2, 3));
		pN.add(mor, true);
		pN.add(aft, false);
		pN.add(eve, false);
		pN.add(new Checkbox("사과", cbg, true));
		pN.add(new Checkbox("바나나", cbg, false));
		pN.add(new Checkbox("딸기", cbg, false));
		
		
		pS.setLayout(new BorderLayout(10,0));
		pS.add(ch,"Center");
		pS.add(exit,"East");
		ch.add("아침");
		ch.add("점심");
		ch.add("저녁");
		
		
		setBounds(300,300,400,500);
		setVisible(true);
		
	}
	
	
	
	public static void main(String[] args) {
		
		new ItemTest();
		
	}

}
*/


package com.kitri.awt.event;

import java.awt.*;
import java.awt.event.*;

public class ItemTest extends Frame {

	Panel pN = new Panel();
	Panel pS = new Panel();
	
	CheckboxGroup cg = new CheckboxGroup();
	Checkbox mor = new Checkbox("아침", cg, true);
	Checkbox aft = new Checkbox("점심", cg, false);
	Checkbox eve = new Checkbox("저녁", cg, false);
	Checkbox app = new Checkbox("사과", true);
	Checkbox banana = new Checkbox("바나나");
	Checkbox straw = new Checkbox("딸기");
	
	TextArea ta = new TextArea();
	
	Choice ch = new Choice();
	Button exit = new Button("종료");
	
	ItemLogic itemLogic;
	
	public ItemTest() {
		super("아이템 테스트!!!");
		
		pN.setLayout(new GridLayout(2, 3, 10, 10));
		pN.add(mor);
		pN.add(aft);
		pN.add(eve);
		pN.add(app);
		pN.add(banana);
		pN.add(straw);
		
		pS.setLayout(new BorderLayout(10, 0));
		ch.add("아침");
		ch.add("점심");
		ch.add("저녁");
		pS.add(ch, "Center");
		pS.add(exit, "East");
		
		setLayout(new BorderLayout(0, 10));
		add(ta, "Center");
		add(pN, "North");
		add(pS, "South");
		
		setBounds(300, 200, 300, 500);
		setVisible(true);
		itemLogic = new ItemLogic(this);
		
		exit.addActionListener(itemLogic);
		
		mor.addItemListener(itemLogic);
		aft.addItemListener(itemLogic);
		eve.addItemListener(itemLogic);
		app.addItemListener(itemLogic);
		banana.addItemListener(itemLogic);
		straw.addItemListener(itemLogic);
		ch.addItemListener(itemLogic);
		
		
	}
	
	public static void main(String[] args) {
		new ItemTest();
	}

	
	
	
	
}












