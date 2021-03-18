package login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Emplogin {

	private JFrame frame;
	private JTextField empId;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Emplogin window = new Emplogin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Emplogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(135, 206, 250));
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 11, 554, 395);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(179, 0, 375, 395);
		panel_1.setBackground(new Color(30, 144, 255));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		empId = new JTextField();
		empId.setBounds(133, 123, 196, 26);
		panel_1.add(empId);
		empId.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Employee ID");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 13));
		lblNewLabel.setBounds(39, 126, 84, 20);
		panel_1.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 13));
		lblPassword.setBounds(39, 195, 84, 20);
		panel_1.add(lblPassword);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//this accepts user input from id and password
				//it checks to see if it is valid
				//NB REMEMBER TO CONNECT IT TO THE DATA BASE CURRENTLY USING TEST VALUES
				String id = empId.getText();
				String pass = password.getText();
				
				if(id.equals("admin")&& pass.equals("test"))
				{
					JOptionPane.showMessageDialog(null,"Login Successful");
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Invalid UserName Or Password");
				}
				
			}
		});
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
		btnNewButton.setBounds(194, 275, 89, 23);
		panel_1.add(btnNewButton);
		
		password = new JPasswordField();
		password.setBounds(133, 193, 194, 26);
		panel_1.add(password);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(0, 0, 159, 373);
		panel.add(lblNewLabel_1);
		frame.setBounds(100, 100, 590, 456);
		ImageIcon icon  = new ImageIcon(this.getClass().getResource("/logo.png"));
		lblNewLabel_1.setIcon(icon);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
