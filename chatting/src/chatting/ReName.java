package chatting;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;

public class ReName extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReName frame = new ReName();
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
	public ReName() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 200);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblOldName = new JLabel("Old Name :");
		lblOldName.setBounds(31, 44, 76, 15);
		contentPane.add(lblOldName);
		
		JLabel lblName = new JLabel("New Name :");
		lblName.setBounds(31, 80, 76, 15);
		contentPane.add(lblName);
		
		JButton btnNewButton = new JButton("\uBCC0\uACBD");
		btnNewButton.setBounds(75, 116, 66, 23);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("\uCDE8\uC18C");
		button.setBounds(153, 116, 66, 23);
		contentPane.add(button);
		
		textField = new JTextField();
		textField.setBounds(119, 77, 116, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Oldname");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(119, 40, 116, 23);
		contentPane.add(lblNewLabel);
	}

}
