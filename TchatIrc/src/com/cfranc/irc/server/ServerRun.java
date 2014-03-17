package com.cfranc.irc.server;

import javax.swing.DefaultListModel;
import javax.swing.text.StyledDocument;

public class ServerRun {

	public static void main(String[] args) {
		StyledDocument model = null;
		DefaultListModel<String> clientListModel = null;
		// TODO Auto-generated method stub
		ClientConnectThread go=new ClientConnectThread(46755, model, clientListModel);
		go.run();
	}

}
