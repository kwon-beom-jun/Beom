package com.kitri.text;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToggleButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import java.awt.Color;
import javax.swing.JScrollPane;

public class BaseBall extends JFrame {

	private JPanel contentPane;
	private JTextField tf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BaseBall frame = new BaseBall();
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
	public BaseBall() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 573, 533);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\uC785\uB825");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(12, 446, 44, 42);
		contentPane.add(label);
		
		tf = new JTextField();
		tf.setBounds(68, 446, 375, 43);
		contentPane.add(tf);
		tf.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(454, 10, 90, 479);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(5, 1, 0, 10));
		
		JButton newG = new JButton("\uC0C8\uAC8C\uC784");
		newG.setBackground(Color.YELLOW);
		panel.add(newG);
		
		JButton clear = new JButton("\uC9C0\uC6B0\uAE30");
		panel.add(clear);
		
		JButton dap = new JButton("\uC815\uB2F5");
		panel.add(dap);
		
		JButton btnNewButton_3 = new JButton("\uAE00\uC790\uC0C9");
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("\uC885\uB8CC");
		panel.add(btnNewButton_4);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 10, 426, 406);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
	}
}
