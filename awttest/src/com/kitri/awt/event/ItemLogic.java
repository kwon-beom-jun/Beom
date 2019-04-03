package com.kitri.awt.event;

import java.awt.Checkbox;
import java.awt.event.*;

public class ItemLogic implements ItemListener, ActionListener{

	ItemTest itemTest;													//??
	
	public ItemLogic(ItemTest itemTest) {
		this.itemTest = itemTest;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		
		Object ob = e.getSource();
//		protected Object	source
		
		if (ob == itemTest.ch) { // 주소값 비교
			String str = itemTest.ch.getSelectedItem();
			if (str.contentEquals("아침")) {
				itemTest.mor.setState(true);
			}else if(str.contentEquals("점심")) {
				itemTest.aft.setState(true);
			}else {
				itemTest.eve.setState(true);
			}
		}
		Checkbox sel = itemTest.cg.getSelectedCheckbox();
		String selStr = sel.getLabel();
//		System.out.println(selStr);
		itemTest.ta.setText("---" + selStr + "---\n");
		itemTest.ta.append("1. 사과 : " + eat(itemTest.app.getState()) + "\n");
		itemTest.ta.append("2. 바나나 : " + eat(itemTest.banana.getState()) + "\n");
		itemTest.ta.append("3. 딸기 : " + eat(itemTest.straw.getState()) + "\n");
		itemTest.ch.select(selStr);
		
	}
	
	private String eat(boolean flag) {
		return flag ? "먹었다." : "안먹었다.";
	}
	
}











