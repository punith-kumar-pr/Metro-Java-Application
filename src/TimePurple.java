
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class TimePurple extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TimePurple frame = new TimePurple();
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
	public TimePurple() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1800, 820);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.text);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Purple Line");
		lblNewLabel.setFont(new Font("Stencil", Font.PLAIN, 40));
		lblNewLabel.setForeground(new Color(255, 0, 255));
		lblNewLabel.setBounds(786, 30, 300, 56);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBackground(SystemColor.inactiveCaption);
		Image img = new ImageIcon(this.getClass().getResource("purpletime.jpeg")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img));
		lblNewLabel_1.setBounds(183, 118, 1238, 574);
		contentPane.add(lblNewLabel_1);
		
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
		
		JButton btnNewButton_1 = new JButton("Green Line");
		btnNewButton_1.setBackground(new Color(50, 205, 50));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TimeTable t = new TimeTable();
				t.show();
				dispose();
			}
		});
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setBounds(486, 30, 149, 50);
		contentPane.add(btnNewButton_1);
		

		JLabel lblNewLabel2 = new JLabel("");
		lblNewLabel2.setBackground(SystemColor.inactiveCaption);
		Image img1 = new ImageIcon(this.getClass().getResource("logo2bg.png")).getImage();
		lblNewLabel2.setIcon(new ImageIcon(img1));
		lblNewLabel2.setBounds(0, -31, 200, 188);
		contentPane.add(lblNewLabel2);
	}
}
