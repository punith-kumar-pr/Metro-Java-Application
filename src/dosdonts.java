import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.net.URI;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Desktop;

public class dosdonts extends JFrame {

	private JPanel contentPane;
	private JTextField txtSss;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dosdonts frame = new dosdonts();
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
	public dosdonts() {
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
					Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=3R1rEdi5rOw&t=2s"));;
				}catch(Exception err) {}
			}
		});
		btnNewButton.setBounds(116, 603, 255, 79);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel2 = new JLabel("");
		lblNewLabel2.setBackground(SystemColor.inactiveCaption);
		Image img1 = new ImageIcon(this.getClass().getResource("logo2bg.png")).getImage();
		lblNewLabel2.setIcon(new ImageIcon(img1));
		lblNewLabel2.setBounds(10, 10, 200, 188);
		contentPane.add(lblNewLabel2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(SystemColor.inactiveCaption);
		Image img = new ImageIcon(this.getClass().getResource("dosdontsbg.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(739, -38, 622, 369);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_10 = new JButton("Back");
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
		
		JButton btnNewButton_1 = new JButton("Escalators");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				descalator au = new descalator();
				au.show();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.setBounds(1027, 360, 193, 45);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("AFC Gates");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dafcgates au = new dafcgates();
				au.show();
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_2.setBounds(1027, 453, 193, 45);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Platform");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dplatform au = new dplatform();
				au.show();
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_3.setBounds(1027, 542, 193, 45);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Inside Train");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dinsidetrain au = new dinsidetrain();
				au.show();
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_4.setBounds(1027, 634, 193, 45);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBackground(SystemColor.inactiveCaption);
		Image img2 = new ImageIcon(this.getClass().getResource("dosdontsbg2.png")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img2));
		lblNewLabel_1.setBounds(354, 404, 550, 356);
		contentPane.add(lblNewLabel_1);
		
		JTextPane txtpnThereAreSome = new JTextPane();
		txtpnThereAreSome.setBackground(Color.CYAN);
		txtpnThereAreSome.setFont(new Font("Sylfaen", Font.PLAIN, 24));
		txtpnThereAreSome.setText("*There are some rules which are to be followed in metro stations, inplatforms, inside the train, escalators and AFC Gates for safety.\r\n\r\n*Please read the safety guidelines carefully and follow them");
		txtpnThereAreSome.setBounds(70, 208, 603, 211);
		contentPane.add(txtpnThereAreSome);
		
		JLabel lblNewLabel33 = new JLabel("");
		lblNewLabel33.setBackground(SystemColor.inactiveCaption);
		Image img33 = new ImageIcon(this.getClass().getResource("youtube.png")).getImage();
		lblNewLabel33.setIcon(new ImageIcon(img33));
		lblNewLabel33.setBounds(75, 418, 348, 200);
		contentPane.add(lblNewLabel33);
		
	}
}
