package com.cfranc.irc.client;

import javax.swing.JFrame;

import vuesClient.ConnPan;

public class TestClient extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TestClient() {
//		this.setTitle("TChat");
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		this.setContentPane(new Testvue());
//		this.setPreferredSize(new Dimension(400, 110));
//		this.setMaximumSize(new Dimension(400, 110));
//		this.setMinimumSize(new Dimension(400, 110));
//		this.setSize(new Dimension(800, 400));
		ConnPan fen = new ConnPan();
		this.add(fen);
		this.setTitle("Tchat Ingesup");
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
	}

}
