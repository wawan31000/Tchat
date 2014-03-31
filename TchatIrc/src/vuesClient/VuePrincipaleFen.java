package vuesClient;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.text.StyledDocument;

public class VuePrincipaleFen extends JFrame {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public VuePrincipaleFen(StyledDocument doc){
	 this.setTitle("TChat");

	 this.setContentPane(new VuePrincipale(doc));
	 this.setPreferredSize(new Dimension(400, 110));
	 this.setMaximumSize(new Dimension(400, 110));
	 this.setMinimumSize(new Dimension(400, 110));
	 this.setSize(new Dimension(800, 400));
	 
	}
}
