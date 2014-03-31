package vuesClient;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ConnPan extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField login;
	private JLabel loginLabel;
	private JPasswordField pswd;
	private JLabel pswdLabel;
	private JButton conn;
	private JPanel champs;

	public ConnPan() {
		login = new JTextField();
		login.setToolTipText("votre identifiant");
		loginLabel = new JLabel("Identifiant:");
		pswd = new JPasswordField();
		pswdLabel = new JLabel("mot de passe:");
		pswd.setToolTipText("votre mot de passe");
		champs = new JPanel();
		champs.setLayout(new GridLayout(2, 2));
		champs.add(loginLabel);
		champs.add(login);
		champs.add(pswdLabel);
		champs.add(pswd);
		conn = new JButton("connexion");
		this.setLayout(new BorderLayout());
		this.add(champs, BorderLayout.CENTER);
		this.add(conn, BorderLayout.SOUTH);
		this.setPreferredSize(new Dimension(400, 90));
		this.setMaximumSize(new Dimension(400, 90));
		this.setMinimumSize(new Dimension(400, 90));

	}

	public JButton getCo() {

		return conn;
	}

	public String getID() {
		String ID = "";
		ID= login.getText();		
		return ID;
	}
	public String getPSWD() {
		char[] ID = null;
		ID= pswd.getPassword();
		for (int i = 0; i < pswd.getPassword().length; i++) {
			pswd.getPassword()[i]=0;
		}
		ID.toString();
		return ID.toString();
	}

}
