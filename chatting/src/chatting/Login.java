package chatting;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField ipTF;
	private JTextField nameTF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 332, 182);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(Color.GRAY));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("I       P  :");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 22, 100, 30);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("\uB300 \uD654 \uBA85 :");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(12, 59, 100, 30);
		contentPane.add(label);
		
		ipTF = new JTextField();
		ipTF.setHorizontalAlignment(SwingConstants.CENTER);
		ipTF.setText("ipTF");
		ipTF.setBounds(108, 25, 170, 25);
		contentPane.add(ipTF);
		ipTF.setColumns(10);
		
		nameTF = new JTextField();
		nameTF.setHorizontalAlignment(SwingConstants.CENTER);
		nameTF.setText("nameTF");
		nameTF.setColumns(10);
		nameTF.setBounds(108, 62, 170, 25);
		contentPane.add(nameTF);
		
		JButton btnNewButton = new JButton("\uD655 \uC778");
		btnNewButton.setBounds(89, 99, 65, 30);
		contentPane.add(btnNewButton);
		
		JButton btnCnlTh = new JButton("\uCDE8 \uC18C");
		btnCnlTh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCnlTh.setBounds(166, 99, 65, 30);
		contentPane.add(btnCnlTh);
	}

}
