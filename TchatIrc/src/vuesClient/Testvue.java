package vuesClient;

import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
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

public class Testvue extends JPanel{
	public Testvue() {
		
		DefaultListModel<String> model= new DefaultListModel<String>();;
		JList<String> list = new JList<String>();
		JScrollPane scrollPane = new JScrollPane(new JTextArea());
		JTextArea textArea = new JTextArea();
		JPanel panel = new JPanel();
		JPanel panel_2 = new JPanel();
		JPanel panel_3 = new JPanel();
		JButton btnNewButton = new JButton("Envoyer");
		JButton btnNewButton_1 = new JButton("Annuler");
		
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
		
		panel.add(panel_2, BorderLayout.SOUTH);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		
		panel_2.add(textArea, BorderLayout.CENTER);
		
		panel_2.add(panel_3, BorderLayout.EAST);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		panel_3.add(btnNewButton, BorderLayout.NORTH);
		
		
		panel_3.add(btnNewButton_1, BorderLayout.SOUTH);
	}

}
