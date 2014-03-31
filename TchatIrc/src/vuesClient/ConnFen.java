package vuesClient;

import javax.swing.JFrame;

public class ConnFen extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ConnFen(){
		
		// this.setTitle("TChat");

		// this.setContentPane(new Testvue());
		// this.setPreferredSize(new Dimension(400, 110));
		// this.setMaximumSize(new Dimension(400, 110));
		// this.setMinimumSize(new Dimension(400, 110));
		// this.setSize(new Dimension(800, 400));
		ConnPan fen = new ConnPan();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(fen);
		this.setTitle("Tchat Ingesup");
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
	}
}
