package vuesClient;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class UserListePanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JScrollPane panneau;
	private JList<String> liste;
	private DefaultListModel<String> model;
	public UserListePanel() {
		
		model= new DefaultListModel<String>();
		model.addElement("wawan");
		model.addElement("fred");
		model.addElement("richard");
		liste= new JList<String>();
		liste.setModel(model);
		this.setLayout(new FlowLayout());
		panneau= new JScrollPane(liste);
		this.add(panneau);
		panneau.setMinimumSize(new Dimension(100, 400));
		this.setMinimumSize(new Dimension(100, 400));
		this.setMaximumSize(new Dimension(200, 800));
		this.setPreferredSize(new Dimension(100, 400));
		this.setSize(new Dimension(100, 400));
		
		
	}
}
