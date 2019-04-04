package com.kitri.text;

import javax.swing.JPanel;
import java.awt.Rectangle;
import javax.swing.JScrollBar;
import javax.swing.JTextField;

public class View2 extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public View2() {
		setBounds(new Rectangle(10, 50, 630, 420));
		setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(12, 10, 577, 373);
		add(textField);
		textField.setColumns(10);

	}

}
