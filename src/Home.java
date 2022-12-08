import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.net.URI;
import java.net.URL;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;

public class Home extends JFrame {

	private JPanel contentPane;

	
	 //Launch the application.
	
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

	//Create the frame.
	
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
		setSize(1800,820);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Click to watch Video ");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.RED);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=Cqe5hwspduI"));;
				}catch(Exception err) {}
			}
		});
		btnNewButton.setBounds(655, 544, 255, 81);
		contentPane.add(btnNewButton);
		
		JButton registration = new JButton("Register");
		registration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Registration r = new Registration();
				r.show();
				dispose();
			}
		});
		registration.setFont(new Font("Tahoma", Font.PLAIN, 20));
		registration.setBounds(621, 240, 331, 58);
		contentPane.add(registration);
		
		
		JButton btnNewButton2 = new JButton("TIMETABLE");
		btnNewButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TimeTable au = new TimeTable();
				au.show();
				dispose();
			}
		});
		btnNewButton2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton2.setBounds(1082, 240, 331, 58);
		contentPane.add(btnNewButton2);
		
		JButton btnNewButton3 = new JButton("MAP");
		btnNewButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Map au = new Map();
				au.show();
				dispose();
			}
		});
		btnNewButton3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton3.setBounds(111, 386, 331, 58);
		contentPane.add(btnNewButton3);
		
		JButton btnNewButton4 = new JButton("FARE INFO");
		btnNewButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Fare au = new Fare();
				au.show();
				dispose();
			}
		});
		btnNewButton4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton4.setBounds(1082, 386, 331, 58);
		contentPane.add(btnNewButton4);
		
		JButton btnNewButton5 = new JButton("DO s DON'T s");
		btnNewButton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dosdonts au = new dosdonts();
				au.show();
				dispose();
			}
		});
		btnNewButton5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton5.setBounds(111, 520, 331, 58);
		contentPane.add(btnNewButton5);
		
		JButton btnNewButton6 = new JButton("COVID PRECAUTIONS");
		btnNewButton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Covid c=new Covid();
				c.show();
				dispose();
			}
		});
		btnNewButton6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton6.setBounds(1082, 520, 331, 58);
		contentPane.add(btnNewButton6);
		
		JButton btnNewButton7 = new JButton("FEEDBACK & COMPLAINTS ");
		btnNewButton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Desktop.getDesktop().browse(new URI("https://forms.gle/5ND2tCNM6mPsaPx8A"));;
				}catch(Exception err) {}
			}
		});
		btnNewButton7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton7.setBounds(1082, 656, 331, 58);
		contentPane.add(btnNewButton7);
		
		JButton btnNewButton_1 = new JButton("TOP UP");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TopUp t= new TopUp();
				t.show();
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.setBounds(111, 240, 331, 58);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton8 = new JButton("ABOUT US");
		btnNewButton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AboutUs c = new AboutUs();
				c.show();
				dispose();
			}
		});
		btnNewButton8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton8.setBounds(111, 656, 331, 58);
		contentPane.add(btnNewButton8);
		
		JLabel lblNewLabel99= new JLabel("HOME");
		lblNewLabel99.setFont(new Font("Stencil", Font.PLAIN, 80));
		lblNewLabel99.setForeground(new Color(128, 0, 128));
		lblNewLabel99.setBounds(675, 144, 237, 70);
		contentPane.add(lblNewLabel99);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(SystemColor.inactiveCaption);
		Image img = new ImageIcon(this.getClass().getResource("logo2bg.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(10, 0, 200, 200);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel33 = new JLabel("");
		lblNewLabel33.setBackground(SystemColor.inactiveCaption);
		Image img33 = new ImageIcon(this.getClass().getResource("youtube.png")).getImage();
		lblNewLabel33.setIcon(new ImageIcon(img33));
		lblNewLabel33.setBounds(607, 334, 348, 200);
		contentPane.add(lblNewLabel33);
		
		JLabel lblNewLabel2 = new JLabel("");
		lblNewLabel2.setBackground(SystemColor.inactiveCaption);
		Image img1 = new ImageIcon(this.getClass().getResource("logohomebg.png")).getImage();
		lblNewLabel2.setIcon(new ImageIcon(img1));
		lblNewLabel2.setBounds(511, 10, 664, 161);
		contentPane.add(lblNewLabel2);
		
		JLabel lblNewLabel3 = new JLabel("");
		lblNewLabel3.setBackground(SystemColor.inactiveCaption);
		Image img3 = new ImageIcon(this.getClass().getResource("home.jpg")).getImage();
		lblNewLabel3.setIcon(new ImageIcon(img3));
		lblNewLabel3.setBounds(0, 0, 1800, 820);
		getContentPane().add(lblNewLabel3);
			
	}
}
