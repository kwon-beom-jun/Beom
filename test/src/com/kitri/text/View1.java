package com.kitri.text;

import javax.swing.JPanel;
import java.awt.Rectangle;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class View1 extends JPanel {

	/**
	 * Create the panel.
	 */
	public View1() {
		setBounds(new Rectangle(10, 50, 630, 420));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uD1B5\uACC4");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("±¼¸²", Font.PLAIN, 17));
		lblNewLabel.setBounds(138, 30, 357, 39);
		add(lblNewLabel);
		
		JButton btnNewButton = new JButton("\uB9C9\uB300");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(108, 106, 68, 45);
		add(btnNewButton);
		
		JButton button = new JButton("\uC6D0");
		button.setBounds(174, 106, 68, 45);
		add(button);

	}

}
