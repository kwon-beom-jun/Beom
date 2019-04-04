package com.kitri.io;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import com.sun.org.apache.xml.internal.serializer.utils.SystemIDResolver;

import java.awt.event.ActionListener;
import java.io.*;
import java.awt.event.ActionEvent;

public class NotePad extends JFrame implements ActionListener{
	

	private JPanel contentPane;

	JMenuItem exit = new JMenuItem("\uC885\uB8CC");
	JMenuItem save = new JMenuItem("\uC800\uC7A5");
	JMenuItem open = new JMenuItem("\uC5F4\uAE30");
	
	public NotePad() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 794, 564);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("\uD30C\uC77C");
		mnNewMenu.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(mnNewMenu);
		

		mnNewMenu.add(open);
		mnNewMenu.add(save);
		mnNewMenu.add(exit);
		
		JMenu mnNewMenu_1 = new JMenu("\uB3C4\uC6C0\uB9D0");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("New menu item");
		mnNewMenu_1.add(mntmNewMenuItem_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JTextArea textArea = new JTextArea();
		contentPane.add(textArea, BorderLayout.CENTER);
		
		exit.addActionListener(this);
		open.addActionListener(this);
		save.addActionListener(this);
		
	}
	

	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		
		if (ob == exit) {
			System.exit(0);			
		}
		
		if (ob == save) {
			
			
			
		}
		
		if (ob == open) {
			
//			JFileChooser chooser = new JFileChooser();
			
			
		}
	
	}
	
	public static void main(String[] args) {
		
//		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NotePad frame = new NotePad();
					frame.setVisible(true);
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
	}

	
	
}
