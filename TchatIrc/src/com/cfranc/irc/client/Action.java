package com.cfranc.irc.client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.DefaultListModel;
import javax.swing.JComponent;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.text.DefaultStyledDocument;

import vuesClient.ConnPan;
import vuesClient.VuePrincipale;
import vuesClient.VuePrincipaleFen;

public class Action implements ActionListener {

	private DefaultListModel<String> modellist;
	private String login;
	private String pswd;
	private int PORT;
	private TestClient client;
	@Override
	public void actionPerformed(ActionEvent e) {
		JComponent composant = (JComponent) e.getSource();

		if (composant == ConnPan.conn) {

			login = client.window.getconnfen()
					.getID();
			pswd = client.window.getconnfen()
					.getPSWD();
			Thread launch= new Thread(new Runnable() {

				public void run() {
					try {

						SwingUtilities.invokeLater(new Runnable() {

							public void run() {
								
								client.chat = new DefaultStyledDocument();
								client.vue = new VuePrincipaleFen(
										client.chat, client.action,
										modellist);
								// TestClient.vue.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
								client.vue
										.addWindowListener(new WindowAdapter() {
											@Override
											public void windowClosing(
													WindowEvent e) {
												try {
													client.thread
															.quitServer();
												} catch (IOException e1) {
													System.out
															.println("erreur au moment de quitter le serveur");
													e1.printStackTrace();
												}
											}
										});
								try {
									if (ConnPan.getSalon().equals("salon 1"))
									{
										PORT= 46755;
									}else if (ConnPan.getSalon().equals("salon 2"))
									{
										PORT= 46756;
									}
									client.socket = new Socket("localhost",
											PORT);
								} catch (UnknownHostException e) {
									System.out.println("hote inconnu");
									e.printStackTrace();
								} catch (java.net.ConnectException e) {
									System.out
											.println("Connection refusée ou hote hors ligne");
								} catch (IOException e) {
									System.out.println("pb IO");
									e.printStackTrace();
								} catch (Exception e) {
									System.out.println("erreur inconnue");
									e.printStackTrace();
								}

								

								
									client.thread = new ClientToServerThread(
											client.chat,
											client.modelListUsers,
											client.socket, login, pswd);
									client.thread.start();
									client.vue.setVisible(true);
									client.window.setVisible(false);
								
							}
						});

					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
			System.out.println("login: "+login);
			System.out.println("mdp: "+pswd);
			while (!((login.equals(null) || login.equals(""))
					|| ( /*pswd.equals(null)
					||*/ pswd.equals("")))){
				
				launch.start();
			}
			
			
		}
		if (composant == (VuePrincipale.getBtnEnvoi())) {
			JTextArea airedefrappe = VuePrincipale.getAireDeFrappe();
			String txtToSend = airedefrappe.getText();
			if (!txtToSend.equals("") && !txtToSend.equals(null)) {
				client.thread.setMsgToSend(txtToSend);
				airedefrappe.setText("");
			}

		}
		if (composant == VuePrincipale.getBtnCancel()) {
			JTextArea airedefrappe = VuePrincipale.getAireDeFrappe();
			airedefrappe.setText("");
		}
		// todo
	}
	public Action(TestClient client) {
		this.client=client;
		modellist = client.modelListUsers;
	}

}
