package chatting;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JToolBar;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class Paper extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Paper frame = new Paper();
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
	public Paper() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.YELLOW);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFrom = new JLabel("From : ");
		lblFrom.setHorizontalAlignment(SwingConstants.CENTER);
		lblFrom.setBounds(12, 21, 51, 15);
		contentPane.add(lblFrom);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(12, 47, 260, 175);
		contentPane.add(textArea);
		
		JLabel lblTo = new JLabel("To :");
		lblTo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTo.setBounds(148, 21, 51, 15);
		contentPane.add(lblTo);
		
		JLabel lblNewLabel = new JLabel("from");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(Color.ORANGE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(63, 10, 73, 32);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("from");
		label.setOpaque(true);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBackground(Color.ORANGE);
		label.setBounds(199, 10, 73, 32);
		contentPane.add(label);
		
		JButton btnNewButton = new JButton("\uBCF4\uB0B4\uAE30");
		btnNewButton.setBounds(63, 232, 73, 23);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("\uCDE8\uC18C");
		button.setBounds(148, 232, 73, 23);
		contentPane.add(button);
	}
}
