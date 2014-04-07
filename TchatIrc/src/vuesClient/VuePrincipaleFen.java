package vuesClient;

import java.awt.Dimension;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.text.StyledDocument;

import com.cfranc.irc.client.Action;

public class VuePrincipaleFen extends JFrame {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static VuePrincipale vue;

	public VuePrincipaleFen(StyledDocument doc,Action action,DefaultListModel<String> model){
	 this.setTitle("TChat42");
	 vue = new VuePrincipale(doc, action,model);

	 this.setContentPane(vue);
	 this.setPreferredSize(new Dimension(400, 110));
	 this.setMaximumSize(new Dimension(400, 110));
	 this.setMinimumSize(new Dimension(400, 110));
	 this.setSize(new Dimension(800, 400));
	 //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
	}
}
