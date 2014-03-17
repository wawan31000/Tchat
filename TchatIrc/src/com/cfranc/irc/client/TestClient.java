package com.cfranc.irc.client;

import java.awt.Dimension;

import javax.swing.JFrame;

import vuesClient.VuePrincipale;

public class TestClient extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TestClient() {
		this.setTitle("TChat");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(new VuePrincipale());
		this.setMinimumSize(new Dimension(800, 400));
		this.setMaximumSize(new Dimension(1200, 800));
		this.setPreferredSize(new Dimension(800, 400));
		this.setSize(new Dimension(800, 400));
		this.pack();
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestClient();
		// SimpleChatClient chat= new SimpleChatClient("192.168.88.1", 46755);
	}

}
