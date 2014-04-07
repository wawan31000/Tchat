
package com.cfranc.irc.client;

import java.net.Socket;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.text.StyledDocument;

import vuesClient.ConnFen;
import vuesClient.VuePrincipaleFen;

public class TestClient
{

	/**
	 * 
	 */
	public StyledDocument			chat;
	public ConnFen					window;
	public VuePrincipaleFen			vue;
	public Socket					socket;
	public Action					action;
	public ClientToServerThread		thread;
	public DefaultListModel<String>	modelListUsers;

	public TestClient()
	{
	}

	public static void main(String[] args)
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
							try
							{
								TestClient client= new TestClient();
								client.modelListUsers = new DefaultListModel<String>();
								client.action = new Action(client);
								client.window = new ConnFen(client.action);
								client.window.setVisible(true);
								client.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

							}
							catch (Exception e)
							{
								System.out.println("erreur inconnue");
								e.printStackTrace();
							}

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

}
