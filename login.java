package task7;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField username;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(22, 53, 77, 16);
		contentPane.add(lblUsername);
		
		username = new JTextField();
		username.setBounds(123, 50, 116, 22);
		contentPane.add(username);
		username.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(22, 104, 56, 16);
		contentPane.add(lblPassword);
		
		password = new JPasswordField();
		password.setBounds(123, 101, 116, 22);
		contentPane.add(password);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","tiger");
					String query="insert into DATA values(?,?)";
					PreparedStatement statement = connection.prepareStatement(query);
					statement.setString(1,username.getText());
					statement.setString(2,password.getText());
					
					statement.execute();
					
					JOptionPane.showMessageDialog(null, "YOU SUCCESSFULLY SAVED ONE RECORD!!");
					
				} catch (ClassNotFoundException | SQLException ee) {
					// TODO Auto-generated catch block
					ee.printStackTrace();
				}
			}
		});
		btnSubmit.setBounds(123, 150, 97, 25);
		contentPane.add(btnSubmit);
	}
}
