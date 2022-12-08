
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class AboutUs extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AboutUs frame = new AboutUs();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void close()
	{
		WindowEvent closeWindow= new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
	}

	/**
	 * Create the frame.
	 */
	public AboutUs() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1800, 820);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.text);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBackground(SystemColor.inactiveCaption);
		Image img = new ImageIcon(this.getClass().getResource("callbg.png")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img));
		lblNewLabel_1.setBounds(993, 89, 372, 267);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Mobile no. +919475368495");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel_2.setBounds(1039, 365, 297, 51);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Email : nammametro@gmail.com");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNewLabel_3.setBounds(1026, 437, 372, 44);
		contentPane.add(lblNewLabel_3);
		
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
		
		JLabel lblNewLabel_5 = new JLabel("About us");
		lblNewLabel_5.setForeground(new Color(139, 0, 139));
		lblNewLabel_5.setFont(new Font("Stencil", Font.PLAIN, 60));
		lblNewLabel_5.setBounds(618, 44, 332, 68);
		contentPane.add(lblNewLabel_5);
		
		JTextPane txtpnBangaloreMetroRail = new JTextPane();
		txtpnBangaloreMetroRail.setBackground(new Color(153, 204, 255));
		txtpnBangaloreMetroRail.setFont(new Font("Tahoma", Font.PLAIN, 22));
		txtpnBangaloreMetroRail.setText("Bangalore Metro Rail Corporation Limited (BMRCL) , a joint venture of Government of India ang Government of Karnataka is a Special Purpose Vehicle entrusted with the responsibility of implementation \r\nOf Bangalore Metro Rail Project.\r\n\r\nBangalore Metro, christened as \u201CNAMMA METRO\u201D, not only adds to the beauty of Bangalore skyline, but immensely adds to the comfort level of travel. Besides this, Namma Metro is a major environment friendly addition to the Bangalore City as it significantly contributes to the reduction of carbon emissions.\r\n\r\nThe project has an East-West corridor - 25.6 km long, starting from Baiyappanahalli in the East and terminating at Kengeri in the West and a 30.4 km North-South corridor commencing at Nagasandra in the North and terminating at Silk Institute in the South.\r\n\r\nThis is the First Metro rail project in India commissioned with 750V DC Third Rail on Standard Guage.");
		txtpnBangaloreMetroRail.setBounds(20, 150, 805, 504);
		contentPane.add(txtpnBangaloreMetroRail);
		
		JLabel lblNewLabel2 = new JLabel("");
		lblNewLabel2.setBackground(SystemColor.inactiveCaption);
		Image img1 = new ImageIcon(this.getClass().getResource("logo2bg.png")).getImage();
		lblNewLabel2.setIcon(new ImageIcon(img1));
		lblNewLabel2.setBounds(10, -20, 200, 188);
		contentPane.add(lblNewLabel2);
		
		JLabel lblNewLabel22 = new JLabel("");
		lblNewLabel22.setBackground(SystemColor.inactiveCaption);
		Image img12 = new ImageIcon(this.getClass().getResource("gmailbg.png")).getImage();
		lblNewLabel22.setIcon(new ImageIcon(img12));
		lblNewLabel22.setBounds(814, 491, 563, 282);
		contentPane.add(lblNewLabel22);
		
		JTextPane txtpnPunithPunikumargmailcom = new JTextPane();
		txtpnPunithPunikumargmailcom.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtpnPunithPunikumargmailcom.setText("Punith Kumar P R           : punikumar20022gmail.com\r\nPrasanna V Deshpande    : 20becs130prasannadeshpande@gmail.com\r\nSuhas Reddy                 : suhasreddy@gmail.com");
		txtpnPunithPunikumargmailcom.setBounds(124, 675, 595, 76);
		contentPane.add(txtpnPunithPunikumargmailcom);
		
	}
}
