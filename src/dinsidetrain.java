import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.SystemColor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class dinsidetrain extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dinsidetrain frame = new dinsidetrain();
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
	public dinsidetrain() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
		//setSize(800,470);
		setBounds(700, 325, 800, 470);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("<- Previous");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dplatform au = new dplatform();
				au.show();
				dispose();
			}
		});
		btnNewButton.setBounds(508, 381, 103, 21);
		contentPane.add(btnNewButton);
		
		/*JButton btnNewButton_1 = new JButton("Next ->");
		btnNewButton_1.setBounds(639, 381, 103, 21);
		contentPane.add(btnNewButton_1);*/
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(SystemColor.inactiveCaption);
		Image img = new ImageIcon(this.getClass().getResource("dinsidetrain.png")).getImage();
		contentPane.setLayout(null);
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(10, 0, 780, 430);
		contentPane.add(lblNewLabel);
	}

}
