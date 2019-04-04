package chatting;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import java.awt.Color;

public class Chat extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Chat frame = new Chat();
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
	public Chat() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 588, 482);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList list = new JList();
		list.setBounds(443, 10, 117, 318);
		contentPane.add(list);
		
		JButton btnNewButton = new JButton("\uB300\uD654\uBA85\uBCC0\uACBD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(443, 338, 117, 31);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("\uCABD\uC9C0\uBCF4\uB0B4\uAE30");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(443, 371, 117, 30);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\uB098 \uAC00 \uAE30");
		button_1.setBounds(443, 403, 117, 31);
		contentPane.add(button_1);
		
		JLabel lblNewLabel = new JLabel("\uADD3\uC18D\uB9D0");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(23, 415, 57, 15);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(12, 356, 419, 31);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 10, 419, 332);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		textField_1 = new JTextField();
		textField_1.setBounds(92, 402, 339, 31);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
	}
}
