package vuesClient;

import javax.swing.JFrame;

import com.cfranc.irc.client.Action;

public class ConnFen extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ConnPan fen;
	public ConnFen(Action action){
		
		// this.setTitle("TChat");

		// this.setContentPane(new Testvue());
		// this.setPreferredSize(new Dimension(400, 110));
		// this.setMaximumSize(new Dimension(400, 110));
		// this.setMinimumSize(new Dimension(400, 110));
		// this.setSize(new Dimension(800, 400));
		fen = new ConnPan(action);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(fen);
		this.setTitle("Tchat42");
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
	}
	
	public ConnPan getconnfen(){
		return fen;
	}
}
