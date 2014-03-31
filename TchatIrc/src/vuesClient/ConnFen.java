package vuesClient;

import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class ConnFen extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ConnPan fen;
	public ConnFen(ActionListener client){
		
		// this.setTitle("TChat");

		// this.setContentPane(new Testvue());
		// this.setPreferredSize(new Dimension(400, 110));
		// this.setMaximumSize(new Dimension(400, 110));
		// this.setMinimumSize(new Dimension(400, 110));
		// this.setSize(new Dimension(800, 400));
		fen = new ConnPan();
		fen.getCo().addActionListener(client);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(fen);
		this.setTitle("Tchat Ingesup");
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
	}
	
	public ConnPan getconnfen(){
		return fen;
	}
}
