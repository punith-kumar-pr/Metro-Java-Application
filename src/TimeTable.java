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

public class TimeTable extends JFrame {

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
	public TimeTable() {
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
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setForeground(SystemColor.text);
		lblNewLabel_1.setBackground(SystemColor.inactiveCaption);
		Image img23 = new ImageIcon(this.getClass().getResource("timetablegreen.jpeg")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img23));
		lblNewLabel_1.setBounds(194, 113, 1336, 598);
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
		
		JButton btnNewButton_1 = new JButton("Purple line");
		btnNewButton_1.setBackground(new Color(153, 50, 204));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TimePurple t=new TimePurple();
				t.show();
				dispose();
			}
		});
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setBounds(1072, 35, 173, 48);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel1 = new JLabel("");
		lblNewLabel1.setBackground(SystemColor.inactiveCaption);
		Image img = new ImageIcon(this.getClass().getResource("logo2bg.png")).getImage();
		lblNewLabel1.setIcon(new ImageIcon(img));
		lblNewLabel1.setBounds(10, -26, 200, 200);
		contentPane.add(lblNewLabel1);
	}
}
