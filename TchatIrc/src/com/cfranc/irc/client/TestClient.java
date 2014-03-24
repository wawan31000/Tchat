package com.cfranc.irc.client;

import java.awt.Dimension;

import javax.swing.JFrame;

import vuesClient.ConnFen;
import vuesClient.Testvue;
import vuesClient.VuePrincipale;

public class TestClient extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TestClient() {
//		this.setTitle("TChat");
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		this.setContentPane(new Testvue());
		this.setPreferredSize(new Dimension(400, 110));
		this.setMaximumSize(new Dimension(400, 110));
		this.setMinimumSize(new Dimension(400, 110));
//		this.setSize(new Dimension(800, 400));
		ConnFen fen = new ConnFen();
		this.add(fen);
		this.setTitle("Tchat Ingesup");
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestClient();
		// SimpleChatClient chat= new SimpleChatClient("192.168.88.1", 46755);
	}

}
