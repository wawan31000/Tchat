
package com.cfranc.irc.client;

import java.net.Socket;

import javax.swing.SwingUtilities;
import javax.swing.text.StyledDocument;

import vuesClient.ConnFen;
import vuesClient.VuePrincipaleFen;

public class TestClient
{

	/**
	 * 
	 */
	public static StyledDocument	chat;
	public static ConnFen			window;
	public static VuePrincipaleFen	vue;
	public static Socket			socket;
	public static Action			action;
	public static ClientToServerThread thread;

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
								action=new Action();
								window = new ConnFen(action);
								window.setVisible(true);
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
