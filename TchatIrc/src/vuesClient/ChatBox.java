package vuesClient;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
//import javax.swing.text.DefaultStyledDocument;
//import javax.swing.text.Document;

public class ChatBox extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// private Document doc;
	private JTextArea area;
	private JButton send;
	private JButton deco;

	public ChatBox() {
		// doc= new DefaultStyledDocument();
		
		//instanciation des element du panneau
		area = new JTextArea();
		area.setBorder(BorderFactory.createLineBorder(Color.black));
		area.setLineWrap(true);
		area.setWrapStyleWord(true);
		area.setMinimumSize(new Dimension(600,100));
		area.setMaximumSize(new Dimension(1200, 100));
		area.setPreferredSize(new Dimension(600, 100));
		area.setSize(new Dimension(600, 100));
		send = new JButton("Envoyer");
		deco = new JButton("Deconnecter");
		
		
		//mise en place du layout
		GridBagLayout layout = new GridBagLayout();
		this.setLayout(layout);
		
		//ajout des element au jpanel
		this.add(area);
		this.add(deco);
		this.add(send);

		// création des contraintes du gridbagLayout
		GridBagConstraints areaGridBagConstraints = new GridBagConstraints();
		GridBagConstraints sendGridBagConstraints = new GridBagConstraints();
		GridBagConstraints decoGridBagConstraints = new GridBagConstraints();

		// parametrage des contraintes
		areaGridBagConstraints.weightx = 0.8;
		areaGridBagConstraints.weighty = 1;
		areaGridBagConstraints.gridx = 0;
		areaGridBagConstraints.gridy = 0;
		
		sendGridBagConstraints.weightx = 0.2;
		sendGridBagConstraints.weighty = 0.5;
		sendGridBagConstraints.gridx = 1;
		sendGridBagConstraints.gridy = 0;
		
		decoGridBagConstraints.weightx=0.2;
		decoGridBagConstraints.weighty=0.5;
		decoGridBagConstraints.gridx=1;
		decoGridBagConstraints.gridy=1;
		
		
		//ajout des contraintes au layout
		
		layout.setConstraints(area, areaGridBagConstraints);
		layout.setConstraints(deco, decoGridBagConstraints);
		layout.setConstraints(send, sendGridBagConstraints);
		
		
		//taille des lignes et colomnes
//		int[] a= {30,30,30, 30};
//		layout.rowHeights=a;
//		layout.columnWidths=a;

		this.setBorder(BorderFactory.createLineBorder(Color.black));
	}
}
