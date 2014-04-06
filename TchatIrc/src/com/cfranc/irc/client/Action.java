
package com.cfranc.irc.client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JComponent;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.text.DefaultStyledDocument;

import vuesClient.ConnPan;
import vuesClient.VuePrincipale;
import vuesClient.VuePrincipaleFen;

public class Action implements ActionListener
{

	@Override
	public void actionPerformed(ActionEvent e)
	{
		JComponent composant = (JComponent) e.getSource();

		if (composant == ConnPan.conn)
		{
			new Thread(new Runnable()
			{

				public void run()
				{
					try
					{

						SwingUtilities.invokeLater(new Runnable()
						{

							public void run()
							{
								TestClient.chat = new DefaultStyledDocument();
								TestClient.vue = new VuePrincipaleFen(
										TestClient.chat, TestClient.action);
								try
								{
									TestClient.socket = new Socket("localhost",
											46755);
								}
								catch (UnknownHostException e)
								{
									System.out.println("hote inconnu");
									e.printStackTrace();
								}
								catch (java.net.ConnectException e)
								{
									System.out
											.println("Connection refusée ou hote hors ligne");
								}
								catch (IOException e)
								{
									System.out.println("pb IO");
									e.printStackTrace();
								}
								catch (Exception e)
								{
									System.out.println("erreur inconnue");
									e.printStackTrace();
								}
								TestClient.thread = new ClientToServerThread(
										TestClient.chat,
										VuePrincipale.modelListUsers,
										TestClient.socket, TestClient.window
												.getconnfen().getID(),
										TestClient.window.getconnfen()
												.getPSWD());
								TestClient.thread.start();
								TestClient.vue.setVisible(true);
								TestClient.window.setVisible(false);
							}
						});

					}
					catch (Exception e)
					{
						e.printStackTrace();
					}
				}
			}).start();
		}
		if (composant == (VuePrincipale.getBtnEnvoi()))
		{
			JTextArea airedefrappe = VuePrincipale.getAireDeFrappe();
			String txtToSend = airedefrappe.getText();
			if (!txtToSend.equals("") && !txtToSend.equals(null))
			{
				TestClient.thread.setMsgToSend(txtToSend);
				airedefrappe.setText("");
			}

		}
		if (composant == VuePrincipale.getBtnCancel())
		{
			JTextArea airedefrappe = VuePrincipale.getAireDeFrappe();
			airedefrappe.setText("");
		}
		// todo
	}

}
