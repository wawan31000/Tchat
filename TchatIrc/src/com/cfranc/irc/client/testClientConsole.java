package com.cfranc.irc.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.StyledDocument;

import vuesClient.ConnFen;
import vuesClient.VuePrincipale;
import vuesClient.VuePrincipaleFen;

public class testClientConsole {

	private static final long serialVersionUID = 1L;
	public static StyledDocument chat;
	public static ConnFen window;
	public static VuePrincipaleFen vue;
	public static Socket socket;
	public static  final String PSW="hello";
	public static final String ID="erwan";
	public static  final String host="localhost";
	public static  final int port=46755;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testClientConsole.chat = new DefaultStyledDocument();
		testClientConsole.vue = new VuePrincipaleFen(testClientConsole.chat);
		try {
			testClientConsole.socket = new Socket(host, port);
			ClientToServerThread client = new ClientToServerThread(
					testClientConsole.chat, VuePrincipale.modelListUsers,
					testClientConsole.socket, testClientConsole.ID, testClientConsole.PSW);
			client.start();
			client.setMsgToSend((new BufferedReader(new InputStreamReader(System.in))).readLine());
		}
		catch (UnknownHostException e)
		{
			System.out.println("hote inconnu");
			e.printStackTrace();
		}
		catch (java.net.ConnectException e)
		{
			System.out.println("Connection refusée ou hote hors ligne");
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
	
	}

}
