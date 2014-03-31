package com.cfranc.irc.client;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.Socket;

import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.StyledDocument;

import vuesClient.ConnFen;
import vuesClient.VuePrincipale;
import vuesClient.VuePrincipaleFen;

public class TestClient {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static StyledDocument chat;
	public static ConnFen window;
	public static VuePrincipaleFen vue;
	public static Socket socket;

	public TestClient() {

	}

	static ConnectionListener connectionListener = new ConnectionListener();

	public static void main(String[] args) {

		 EventQueue.invokeLater(new Runnable() {
		 public void run() {
		 try {
		
		 window = new ConnFen(connectionListener);
		 window.setVisible(true);
		 } catch (Exception e) {
		 e.printStackTrace();
		 }
		 }
		 });
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					String [] selectionValues={"connexion","annuler"};
//					window=new ConnPan();
//					JDialog conn=(JDialog) JOptionPane.showInputDialog(null, window, "Connexion", JOptionPane.QUESTION_MESSAGE, null, null, null);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});

	}

}

class ConnectionListener implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					System.out.println("hello");
					TestClient.chat = new DefaultStyledDocument();
					TestClient.vue = new VuePrincipaleFen(TestClient.chat);
					TestClient.socket=new Socket("localhost", 46755);
					ClientToServerThread client = new ClientToServerThread(
							TestClient.chat, VuePrincipale.model,
							TestClient.socket, TestClient.window.getconnfen().getID(),
							TestClient.window.getconnfen().getPSWD());
					TestClient.vue.setVisible(true);
					

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
