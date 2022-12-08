import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JTextPane;
import javax.swing.JSlider;

public class Fare extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fare frame = new Fare();
					frame.setResizable(false);
					frame.setSize(1800,820);
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
	public Fare() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setSize(1800,820);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(UIManager.getColor("Button.disabledShadow"));
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 22));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"From Station", "Yelachenahalli", "J P Nagara", "Banashankari", "Rashtreeya Vidhyalaya Road", "Jayanagara", "South End circle", "Lalbagh", "National College", "K R Market", "Chickpete", "Majestic", "Mantri Square", "Sriramapura", "Mahakavi Kuvempu Road", "Rajajinagara", "Baiyappanahalli", "Swami Vivekananda Road", "Indiranagara", "Halasuru", "Trinity", "M G road", "Cubbon Park", "Vidhana Soudha", "Central College"}));
		comboBox.setBounds(370, 285, 361, 47);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBackground(UIManager.getColor("Button.disabledShadow"));
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"To Station", "Yelachenahalli", "J P Nagara", "Banashankari", "Rashtreeya Vidhyalaya Road", "Jayanagara", "South End circle", "Lalbagh", "National College", "K R Market", "Chickpete", "Majestic", "Mantri Square", "Sriramapura", "Mahakavi Kuvempu Road", "Rajajinagara", "Baiyappanahalli", "Swami Vivekananda Road", "Indiranagara", "Halasuru", "Trinity", "M G road", "Cubbon Park", "Vidhana Soudha", "Central College"}));
		comboBox_1.setBounds(766, 285, 361, 47);
		contentPane.add(comboBox_1);
		
		JButton btnNewButton = new JButton("Check Fare");
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.setBackground(new Color(144, 238, 144));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedItem()=="Banashankari" && comboBox_1.getSelectedItem()=="Majestic")
					JOptionPane.showMessageDialog(null, "Fare=Rs.26\nPlatform=1 ");
				if(comboBox.getSelectedItem()=="Majestic" && comboBox_1.getSelectedItem()=="Banashankari")
					JOptionPane.showMessageDialog(null, "Fare=Rs.26\nPlatform=2");
				if(comboBox.getSelectedItem()=="Banashankari" && comboBox_1.getSelectedItem()=="Baiyappanahalli")
					JOptionPane.showMessageDialog(null, "Fare=Rs.42.75\nPlatform=1 at Banashankri \nChange to purple line at Majestic \nPlatform=2  ");
				if(comboBox.getSelectedItem()=="Baiyappanahalli" && comboBox_1.getSelectedItem()=="Banashankari")
					JOptionPane.showMessageDialog(null, "Fare=Rs.42.75\nPlatform=1 at Baiyappanahalli \nChange to green line at Majestic \nPlatform=2  ");
				if(comboBox.getSelectedItem()=="From Station" && comboBox_1.getSelectedItem()=="To Station")
					JOptionPane.showMessageDialog(null, "Enter valid Station");	
				if(comboBox.getSelectedItem()=="Banashankari" && comboBox_1.getSelectedItem()=="Yelachenahalli")
					JOptionPane.showMessageDialog(null, "Fare=Rs.14.25\nPlatform=1 ");
				if(comboBox.getSelectedItem()=="Yelachenahalli" && comboBox_1.getSelectedItem()=="Banashankari")
					JOptionPane.showMessageDialog(null, "Fare=Rs.14.25\nPlatform=1 ");
				if(comboBox.getSelectedItem()=="Yelachenahalli" && comboBox_1.getSelectedItem()=="Yelachenahalli")
					JOptionPane.showMessageDialog(null, "Cannot Enter same station\nEnter a valid From & To station ");
				if(comboBox.getSelectedItem()=="Banashankari" && comboBox_1.getSelectedItem()=="Banashankari")
					JOptionPane.showMessageDialog(null, "Cannot Enter same station\nEnter a valid From & To station ");
				if(comboBox.getSelectedItem()=="J P Nagara" && comboBox_1.getSelectedItem()=="J P Nagara")
					JOptionPane.showMessageDialog(null, "Cannot Enter same station\nEnter a valid From & To station ");
				if(comboBox.getSelectedItem()=="Majestic" && comboBox_1.getSelectedItem()=="Majestic")
					JOptionPane.showMessageDialog(null, "Cannot Enter same station\nEnter a valid From & To station ");
				if(comboBox.getSelectedItem()=="Baiyappanahalli" && comboBox_1.getSelectedItem()=="Baiyappanahalli")
					JOptionPane.showMessageDialog(null, "Cannot Enter same station\nEnter a valid From & To station ");
				if(comboBox.getSelectedItem()=="Rashtreeya Vidhyalaya Road" && comboBox_1.getSelectedItem()=="Rashtreeya Vidhyalaya Road")
					JOptionPane.showMessageDialog(null, "Cannot Enter same station\nEnter a valid From & To station ");
				if(comboBox.getSelectedItem()=="Jayanagara" && comboBox_1.getSelectedItem()=="Jayanagara")
					JOptionPane.showMessageDialog(null, "Cannot Enter same station\nEnter a valid From & To station ");
				if(comboBox.getSelectedItem()=="Sounth End circle" && comboBox_1.getSelectedItem()=="Sounth End circle")
					JOptionPane.showMessageDialog(null, "Cannot Enter same station\nEnter a valid From & To station ");
				if(comboBox.getSelectedItem()=="Lalbagh" && comboBox_1.getSelectedItem()=="Lalbagh")
					JOptionPane.showMessageDialog(null, "Cannot Enter same station\nEnter a valid From & To station ");
				if(comboBox.getSelectedItem()=="National College" && comboBox_1.getSelectedItem()=="National College")
					JOptionPane.showMessageDialog(null, "Cannot Enter same station\nEnter a valid From & To station ");
				if(comboBox.getSelectedItem()=="K R Market" && comboBox_1.getSelectedItem()=="K R Market")
					JOptionPane.showMessageDialog(null, "Cannot Enter same station\nEnter a valid From & To station ");
				if(comboBox.getSelectedItem()=="Chickpete" && comboBox_1.getSelectedItem()=="Chickpete")
					JOptionPane.showMessageDialog(null, "Cannot Enter same station\nEnter a valid From & To station ");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnNewButton.setBounds(607, 399, 243, 57);
		contentPane.add(btnNewButton);
		
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
		
		JTextPane txtpnFareInfo = new JTextPane();
		txtpnFareInfo.setFont(new Font("SansSerif", Font.BOLD, 32));
		txtpnFareInfo.setBackground(new Color(255, 0, 0));
		txtpnFareInfo.setForeground(new Color(255, 255, 255));
		txtpnFareInfo.setText("                                FARE INFO");
		txtpnFareInfo.setBounds(370, 201, 757, 57);
		contentPane.add(txtpnFareInfo);
		
		JLabel lblNewLabel2 = new JLabel("");
		lblNewLabel2.setBackground(SystemColor.inactiveCaption);
		Image img1 = new ImageIcon(this.getClass().getResource("logo2bg.png")).getImage();
		lblNewLabel2.setIcon(new ImageIcon(img1));
		lblNewLabel2.setBounds(10, 10, 200, 188);
		contentPane.add(lblNewLabel2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(SystemColor.inactiveCaption);
		Image img = new ImageIcon(this.getClass().getResource("fare.jpg")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(0, 0, 1800, 820);
		contentPane.add(lblNewLabel);		
		
	}
}
