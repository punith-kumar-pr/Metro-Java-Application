import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.net.URI;
import java.awt.event.ActionEvent;
import javax.swing.SpinnerListModel;
import javax.swing.JTextPane;

public class TopUp extends JFrame {

	private JPanel contentPane;
	private JTextField txtToBeNoted;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TopUp frame = new TopUp();
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
	public TopUp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
		setSize(1800,820);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"PhonePe", "Paytm", "Google Pay"}));
		comboBox.setBounds(1024, 532, 366, 47);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_2 = new JLabel("Select the Mode of Payment :");
		lblNewLabel_2.setBackground(new Color(255, 228, 181));
		lblNewLabel_2.setForeground(new Color(0, 0, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_2.setBounds(724, 530, 307, 47);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Proceed to Pay");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedItem()=="Paytm")
					JOptionPane.showMessageDialog(null, "*Select bengaluru Metro\n\n*Enter card number correctly\n\n*Top Up amount:\nMin of 50 & should be in multiples of 50 like 50, 100, 150, ...\n\n*Click Ok to Proceed ");
					try {
						Desktop.getDesktop().browse(new URI("https://paytm.com/metro-card-recharge/bengaluru-metro"));;
					}catch(Exception err) {}
				if(comboBox.getSelectedItem()=="PhonePe")
					try {
						Desktop.getDesktop().browse(new URI("https://phonepe.com"));;
					}catch(Exception err) {}
				if(comboBox.getSelectedItem()=="Google Pay")
					try {
						Desktop.getDesktop().browse(new URI("https://pay.google.com/intl/en_in/about/?gclid=Cj0KCQiAjc2QBhDgARIsAMc3SqTANcA4mlIrN1oCLLTTaem7m854Q_k-xVTnRyZqn9ewoTQwRCH2ZdYaAhUZEALw_wcB&gclsrc=aw.ds"));;
					}catch(Exception err) {}
				
			}
		});
		btnNewButton.setBackground(new Color(50, 205, 50));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 23));
		btnNewButton.setBounds(909, 612, 307, 70);
		contentPane.add(btnNewButton);
		
		JTextPane txtpnTarvelOnceIn = new JTextPane();
		txtpnTarvelOnceIn.setBackground(new Color(255, 255, 102));
		txtpnTarvelOnceIn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtpnTarvelOnceIn.setText("*Tarvel once in metro with in 7 days to view the updated balance.\r\n\r\n*Once you topup check after 1 hour to view the updated balance.\r\n\r\n*Travel with in 30 days after recharging card to balance to be updated in the card.\r\n\r\n*If longer, balance not updated, please contact customer care.\r\n\r\n*Topup amount should be min of 50.rs and should be multiples of 50.\r\n\r\n");
		txtpnTarvelOnceIn.setBounds(724, 246, 666, 276);
		contentPane.add(txtpnTarvelOnceIn);
		
		txtToBeNoted = new JTextField();
		txtToBeNoted.setFont(new Font("Tahoma", Font.BOLD, 22));
		txtToBeNoted.setBackground(new Color(255, 0, 0));
		txtToBeNoted.setForeground(new Color(255, 255, 255));
		txtToBeNoted.setText("To be noted:");
		txtToBeNoted.setBounds(724, 189, 154, 47);
		contentPane.add(txtToBeNoted);
		txtToBeNoted.setColumns(10);
		
		JLabel logolabel = new JLabel("");
		logolabel.setBackground(SystemColor.inactiveCaption);
		Image img = new ImageIcon(this.getClass().getResource("topup2.jpg")).getImage();
		logolabel.setIcon(new ImageIcon(img));
		logolabel.setBounds(50, 206, 622, 382);
		contentPane.add(logolabel);
		
		JLabel lblNewLabel2 = new JLabel("");
		lblNewLabel2.setBackground(SystemColor.inactiveCaption);
		Image img1 = new ImageIcon(this.getClass().getResource("logo2bg.png")).getImage();
		lblNewLabel2.setIcon(new ImageIcon(img1));
		lblNewLabel2.setBounds(10, -21, 200, 200);
		contentPane.add(lblNewLabel2);
		
		JLabel lblNewLabel = new JLabel("TOP UP");
		lblNewLabel.setFont(new Font("Stencil", Font.PLAIN, 90));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(608, 50, 362, 91);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home h = new Home();
				h.show();
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1.setBounds(1401, 723, 107, 37);
		contentPane.add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setBackground(new Color(0, 0, 255));
		textField.setBounds(220, 22, 1250, 127);
		contentPane.add(textField);
		textField.setColumns(10);		
	}
}
