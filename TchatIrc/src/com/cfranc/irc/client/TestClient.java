package com.cfranc.irc.client;

import java.awt.EventQueue;

import vuesClient.ConnFen;


public class TestClient{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static ConnFen window = new ConnFen();
	public TestClient() {

	}

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window = new ConnFen();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
