import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.TrayIcon.MessageType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class LogIn extends JFrame{
	private String login, password;
	private JPanel panel;
	private JButton okButton;
	private JTextField loginField;
	private JPasswordField passwordField;
	
	public LogIn(String l, String p)
	{
		super();
		login = l; password = p;
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Log in");
		this.setSize(400, 300);
		loginField = new JTextField();
		passwordField = new JPasswordField();
		okButton = new JButton("OK");
		panel = new JPanel(new GridLayout(0, 1));
		panel.add(new JLabel("Login"));
		panel.add(loginField);
		panel.add(new JLabel("Password"));
		panel.add(passwordField);
		panel.add(okButton);
		okButton.addActionListener(new ActionListener() {
			
			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent e) {
				message();
			}
		});
		this.add(panel);
	}
	
	private void message()
	{
		if(loginField.getText().equalsIgnoreCase(login) && passwordField.getText().equalsIgnoreCase(password))
			JOptionPane.showMessageDialog(this, "Secret Information");
		else
			JOptionPane.showMessageDialog(this, "Error");
	}
	
	public static void main(String[] args) {
		LogIn logIn = new LogIn("Dima", "12345678");
		logIn.setVisible(true);

	}

}
