/*
package com.kitri.awt.design;

import java.awt.*;


//1. Fame ���
//2. ����� �ʿ��� ��ü ����.
//3. ��ġ�ο��� design(component��ġ)
// �۾��� �׻� �����ź��� ū�ż����� �ϴ°� ����.


public class ItemTest extends Frame{
	
	Panel pN = new Panel();
	Panel pS = new Panel();
	
	//pN
	CheckboxGroup cbg = new CheckboxGroup();
	Checkbox mor = new Checkbox("��ħ");
	Checkbox aft = new Checkbox("����");
	Checkbox eve = new Checkbox("����");
	
	//center
	TextArea ta = new TextArea();
	
	//pS
	Choice ch = new Choice();
	Button exit = new Button("����");
		
	
	public ItemTest() {
		super("ItemTest !!!");
		
		add(pN, "North");
		add(ta, "Center");
		add(pS, "South");
		
		pN.setLayout(new GridLayout(2, 3));
		pN.add(mor, true);
		pN.add(aft, false);
		pN.add(eve, false);
		pN.add(new Checkbox("���", cbg, true));
		pN.add(new Checkbox("�ٳ���", cbg, false));
		pN.add(new Checkbox("����", cbg, false));
		
		
		pS.setLayout(new BorderLayout(10,0));
		pS.add(ch,"Center");
		pS.add(exit,"East");
		ch.add("��ħ");
		ch.add("����");
		ch.add("����");
		
		
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
	Checkbox mor = new Checkbox("��ħ", cg, true);
	Checkbox aft = new Checkbox("����", cg, false);
	Checkbox eve = new Checkbox("����", cg, false);
	Checkbox app = new Checkbox("���", true);
	Checkbox banana = new Checkbox("�ٳ���");
	Checkbox straw = new Checkbox("����");
	
	TextArea ta = new TextArea();
	
	Choice ch = new Choice();
	Button exit = new Button("����");
	
	ItemLogic itemLogic;
	
	public ItemTest() {
		super("������ �׽�Ʈ!!!");
		
		pN.setLayout(new GridLayout(2, 3, 10, 10));
		pN.add(mor);
		pN.add(aft);
		pN.add(eve);
		pN.add(app);
		pN.add(banana);
		pN.add(straw);
		
		pS.setLayout(new BorderLayout(10, 0));
		ch.add("��ħ");
		ch.add("����");
		ch.add("����");
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












