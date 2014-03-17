package vuesClient;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JPanel;

public class PanneauDroit extends JPanel {
	private ChatBox chat;
	private ChatDocument chatPage;
	
	
	public PanneauDroit (){
		chat= new ChatBox();
		chatPage= new ChatDocument();
		GridBagLayout layout = new GridBagLayout();
		this.setLayout(layout);
		
		GridBagConstraints chatGridBagConstraints= new GridBagConstraints();
		GridBagConstraints chatPageGridBagConstraints= new GridBagConstraints();
		
		
		
	}

}
