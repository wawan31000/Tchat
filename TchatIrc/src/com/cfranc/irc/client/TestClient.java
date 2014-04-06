
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
	public static StyledDocument	chat;
	public static ConnFen			window;
	public static VuePrincipaleFen	vue;
	public static Socket			socket;
	public static Action			action;
	public static ClientToServerThread thread;
	public static  DefaultListModel<String>	modelListUsers;

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
								TestClient.modelListUsers= new DefaultListModel<String>();
								action=new Action();
								window = new ConnFen(action);
								window.setVisible(true);
								window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
								          
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
