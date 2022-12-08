import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import java.awt.Button;
import java.awt.Canvas;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class Login extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TimeTable frame = new TimeTable();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1800, 820);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.text);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Green Line");
		lblNewLabel.setForeground(new Color(0, 204, 102));
		lblNewLabel.setFont(new Font("Stencil", Font.PLAIN, 40));
		lblNewLabel.setBounds(694, 28, 354, 64);
		contentPane.add(lblNewLabel);
		
		
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
		
		JLabel lblNewLabel1 = new JLabel("");
		lblNewLabel1.setBackground(SystemColor.inactiveCaption);
		Image img = new ImageIcon(this.getClass().getResource("logo2bg.png")).getImage();
		lblNewLabel1.setIcon(new ImageIcon(img));
		lblNewLabel1.setBounds(10, -26, 200, 200);
		contentPane.add(lblNewLabel1);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBounds(825, 455, 141, 37);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Signup");
		btnNewButton_2.setBounds(1055, 455, 141, 37);
		contentPane.add(btnNewButton_2);
	}
}
