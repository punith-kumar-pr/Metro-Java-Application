import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registration extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_1;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setVisible(true);
					frame.setResizable(false);
					frame.setSize(1800,820);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Registration() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
		setSize(1800,820);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_10 = new JButton("Home");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home h = new Home();
				h.show();
				dispose();
			}
		});
		btnNewButton_10.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_10.setBounds(1401, 723, 107, 37);
		contentPane.add(btnNewButton_10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(SystemColor.inactiveCaption);
		Image img = new ImageIcon(this.getClass().getResource("logo2bg.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(10, 0, 200, 200);
		contentPane.add(lblNewLabel);
		
		txtName = new JTextField();
		txtName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtName.setBounds(639, 217, 221, 31);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Registration");
		lblNewLabel_1.setBackground(Color.BLACK);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel_1.setBounds(661, 54, 251, 85);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBackground(new Color(0, 0, 255));
		textField.setBounds(220, 45, 1250, 116);
		contentPane.add(textField);
		textField.setColumns(10);//////////////
		
		JTextPane txtpnName = new JTextPane();
		txtpnName.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtpnName.setText("Name :");
		txtpnName.setBounds(323, 217, 200, 31);
		contentPane.add(txtpnName);
		
		JTextPane txtpnMobileNumber = new JTextPane();
		txtpnMobileNumber.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtpnMobileNumber.setText("Mobile Number :");
		txtpnMobileNumber.setBounds(323, 300, 200, 31);
		contentPane.add(txtpnMobileNumber);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_2.setBounds(639, 300, 221, 31);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JTextPane txtpnCardNumber = new JTextPane();
		txtpnCardNumber.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtpnCardNumber.setText("Card Number :");
		txtpnCardNumber.setBounds(323, 392, 200, 31);
		contentPane.add(txtpnCardNumber);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_1.setBounds(637, 392, 223, 31);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.BOLD, 20));
		passwordField.setBounds(639, 474, 221, 31);
		contentPane.add(passwordField);
		
		JTextPane txtpnEnterPassword = new JTextPane();
		txtpnEnterPassword.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtpnEnterPassword.setText("Enter Password :");
		txtpnEnterPassword.setBounds(323, 474, 200, 31);
		contentPane.add(txtpnEnterPassword);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Registration Successful");
			}
		});
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(574, 570, 146, 42);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel3 = new JLabel("");
		lblNewLabel3.setBackground(SystemColor.inactiveCaption);
		Image img3 = new ImageIcon(this.getClass().getResource("home.jpg")).getImage();
		lblNewLabel3.setIcon(new ImageIcon(img3));
		lblNewLabel3.setBounds(0, 0, 1800, 820);
		getContentPane().add(lblNewLabel3);
		
	}
}
