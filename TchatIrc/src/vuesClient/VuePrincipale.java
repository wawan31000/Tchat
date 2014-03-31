package vuesClient;

import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JScrollPane;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.SwingConstants;
import javax.swing.text.StyledDocument;

public class VuePrincipale extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static DefaultListModel<String> model;
	public VuePrincipale(StyledDocument doc) {
		
		JTextArea chatArea=new JTextArea(doc);
		model= new DefaultListModel<String>();;
		JList<String> list = new JList<String>();
		JScrollPane scrollPane = new JScrollPane(chatArea);
		JTextArea textArea = new JTextArea();
		JPanel panel = new JPanel();
		JPanel chatDocument = new JPanel();
		JPanel panel_3 = new JPanel();
		JButton btnEnvoi = new JButton("Envoyer");
		JButton btnCancel = new JButton("Annuler");
		
		setLayout(new BorderLayout(0, 0));
		
		
		model.addElement("wawan");
		model.addElement("fred");
		model.addElement("richard");
		
		list.setBorder(BorderFactory.createLineBorder(Color.black));
		list.setModel(model);
		
		add(list, BorderLayout.WEST);
		
		add(panel, BorderLayout.CENTER);
		
		panel.setLayout(new BorderLayout(0, 0));
		
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		panel.add(scrollPane, BorderLayout.CENTER);
		
		panel.add(chatDocument, BorderLayout.SOUTH);
		chatDocument.setLayout(new BorderLayout(0, 0));
		
		
		chatDocument.add(textArea, BorderLayout.CENTER);
		
		chatDocument.add(panel_3, BorderLayout.EAST);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		
		btnEnvoi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		panel_3.add(btnEnvoi, BorderLayout.NORTH);
		
		
		panel_3.add(btnCancel, BorderLayout.SOUTH);
		Dimension taille = new Dimension(800, 400);
		this.setMinimumSize(taille);
		this.setPreferredSize(taille);
	}

}
