package com.kitri.text;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Main extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JButton b1;
	private JButton b2;
	
//	-------------------------------------
	JPanel panel = new JPanel();
	
	View1 v1 = new View1();
	View2 v2 = new View2(); // 패널 상속.
	
	CardLayout card = new CardLayout(); // view 붙이기.
//	-------------------------------------

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 673, 519);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

//		------------------------------------
		panel.setLayout(card); // view 패널붙이기
		panel.add("view1" , v1);
		panel.add("view2" , v2);
		card.show(panel, "view2");
//		------------------------------------
		panel.setBounds(10, 50, 630, 420);
		
		contentPane.add(panel);
		
		
		b1 = new JButton("\uD654\uBA741");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		b1.setBounds(12, 10, 121, 29);
		contentPane.add(b1);
		
		b2 = new JButton("\uD654\uBA742");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		b2.setBounds(145, 10, 121, 29);
		contentPane.add(b2);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		if (ob == b1) {
			panel.add("view1" , v1);
		}else if (ob == b2) {
			panel.add("view2" , v2);
		}
		
	}

}
