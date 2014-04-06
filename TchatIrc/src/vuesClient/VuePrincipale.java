
package vuesClient;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.text.StyledDocument;

import com.cfranc.irc.client.Action;

public class VuePrincipale extends JPanel
{
	/**
	 * 
	 */
	private static final long				serialVersionUID	= 1L;
	private static DefaultListModel<String>	modelListUsers;
	private static JTextArea				chatArea;
	private static JList<String>			JlistUsers;
	private static JScrollPane				scrollPaneDiscution;
	private static JTextArea				aireDeFrappe;
	private static JPanel					panneauPrincipal;
	private static JPanel					chatDocument;
	private static JPanel					btnEnvoiCancel;
	private static JButton					btnEnvoi;
	private static JButton					btnCancel;
	private static Action					action;

	public VuePrincipale(StyledDocument doc, Action ecouteur, DefaultListModel<String> model)
	{

		chatArea = new JTextArea(doc);
		chatArea.setEnabled(false);
		chatArea.setDisabledTextColor(Color.BLACK);
		modelListUsers = model;
		JlistUsers = new JList<String>(modelListUsers);
		scrollPaneDiscution = new JScrollPane(chatArea);
		aireDeFrappe = new JTextArea();
		panneauPrincipal = new JPanel();
		chatDocument = new JPanel();
		btnEnvoiCancel = new JPanel();
		btnEnvoi = new JButton("Envoyer");
		btnCancel = new JButton("Annuler");
		action = ecouteur;

		setLayout(new BorderLayout(0, 0));

		JlistUsers.setBorder(BorderFactory.createLineBorder(Color.black));
		//JlistUsers.setModel(modelListUsers);
		JlistUsers.setFixedCellWidth(100);
		add(JlistUsers, BorderLayout.WEST);

		add(panneauPrincipal, BorderLayout.CENTER);

		panneauPrincipal.setLayout(new BorderLayout(0, 0));

		scrollPaneDiscution
				.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		panneauPrincipal.add(scrollPaneDiscution, BorderLayout.CENTER);

		panneauPrincipal.add(chatDocument, BorderLayout.SOUTH);
		chatDocument.setLayout(new BorderLayout(0, 0));

		chatDocument.add(aireDeFrappe, BorderLayout.CENTER);

		chatDocument.add(btnEnvoiCancel, BorderLayout.EAST);
		btnEnvoiCancel.setLayout(new BorderLayout(0, 0));

		btnEnvoi.addActionListener(action);

		btnCancel.addActionListener(action);
		btnEnvoiCancel.add(btnEnvoi, BorderLayout.NORTH);

		btnEnvoiCancel.add(btnCancel, BorderLayout.SOUTH);
		Dimension taille = new Dimension(800, 400);
		this.setMinimumSize(taille);
		this.setPreferredSize(taille);
	}

	public static JButton getBtnEnvoi()
	{
		return btnEnvoi;
	}

	public static JButton getBtnCancel()
	{
		return btnCancel;
	}

	public static JTextArea getAireDeFrappe()
	{
		return aireDeFrappe;
	}
}
