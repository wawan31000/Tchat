package vuesClient;

import javax.swing.JFrame;

public class ConnFen extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ConnFen(){
		
		ConnPan fen = new ConnPan();
		this.add(fen);
		this.setTitle("Tchat Ingesup");
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
	}
}
