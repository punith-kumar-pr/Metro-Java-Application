
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Covid extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Covid frame = new Covid();
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
	public Covid() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1800, 820);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.text);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel1 = new JLabel("");
		lblNewLabel1.setBackground(SystemColor.inactiveCaption);
		Image img = new ImageIcon(this.getClass().getResource("logo2bg.png")).getImage();
		lblNewLabel1.setIcon(new ImageIcon(img));
		lblNewLabel1.setBounds(10, -26, 200, 200);
		contentPane.add(lblNewLabel1);
		
		JLabel lblNewLabel = new JLabel("Covid -19 Precautions ");
		lblNewLabel.setBackground(new Color(0, 255, 127));
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Stencil", Font.PLAIN, 40));
		lblNewLabel.setBounds(568, 37, 489, 61);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		
		lblNewLabel_1.setBackground(SystemColor.inactiveCaption);
		Image img1 = new ImageIcon(this.getClass().getResource("covid.gif")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img1));
		lblNewLabel_1.setBounds(983, 130, 475, 439);
		contentPane.add(lblNewLabel_1);
		
		JTextPane txtpnZbjnbj = new JTextPane();
		txtpnZbjnbj.setBackground(new Color(153, 204, 255));
		txtpnZbjnbj.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtpnZbjnbj.setText("\tDo\u2019s:\r\n\r\n\t1.Please wear a mask inside Metro premises and Trains.\r\n\t2.Carry smart phone with \u201CAAROGYA SETU\u201D app installed.\r\n\t3.Maintain Hygiene & respect restrictions in metro premises.\r\n\t4.Sanitize hands at the entrance of the stations.\r\n\r\n\tDon\u2019ts:\r\n\r\n\t1.Don\u2019t shake hands with others.\r\n\t2.Don\u2019t travel with any of the COVID-19 symptoms like \r\n\ttemperature greater than 370C, cough, sneezing etc.\r\n\t3.Don\u2019t spit in the metro premises.\r\n");
		txtpnZbjnbj.setBounds(57, 158, 911, 491);
		contentPane.add(txtpnZbjnbj);
		
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
		
		
		JLabel lblNewLabel_3 = new JLabel("");
		Image img13 = new ImageIcon(this.getClass().getResource("fo.jpg")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(img13));
		lblNewLabel_3.setBounds(1092, 575, 325, 170);
		contentPane.add(lblNewLabel_3);
	}
}
