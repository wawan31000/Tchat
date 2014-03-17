package vuesClient;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ChatDocument extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextArea texte;
	private JScrollPane texteConteneur;

	public ChatDocument() {
		texte = new JTextArea();
		texte.setMinimumSize(new Dimension(600,400));
		texte.setMaximumSize(new Dimension(1200, 800));
		texte.setPreferredSize(new Dimension(600, 400));
		texte.setSize(new Dimension(600, 400));
		texte.add(new JScrollBar());
		texteConteneur = new JScrollPane(texte,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		this.setLayout(new GridLayout(1,1));
		this.add(texteConteneur);
	}
}
