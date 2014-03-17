package vuesClient;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class VuePrincipale extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private UserListePanel liste;
	private PanneauDroit droite;
	public VuePrincipale() {
		
		liste=new UserListePanel();
		droite= new PanneauDroit();
		GridBagLayout layout = new GridBagLayout();
		this.setLayout(layout);
		this.add(liste);
		this.add(droite);
		GridBagConstraints listeGridBagConstraints = new GridBagConstraints();
		GridBagConstraints droiteGridBagConstraints = new GridBagConstraints();
		
		listeGridBagConstraints.weightx=0.3;
		listeGridBagConstraints.weighty=10;
		listeGridBagConstraints.gridx=0;
		listeGridBagConstraints.gridy=0;
		
		droiteGridBagConstraints.weightx=0.7;
		droiteGridBagConstraints.weighty=10;
		droiteGridBagConstraints.gridx=1;
		droiteGridBagConstraints.gridy=0;
		
		layout.setConstraints(liste, listeGridBagConstraints);
		layout.setConstraints(droite, droiteGridBagConstraints);
		
		//this.setSize(1000, 800);
		
	}
}
