package com.javacodegeeks.xmpp;

import org.jivesoftware.smack.AccountManager;
import org.jivesoftware.smack.XMPPException;

public class XmppTest {
	
	public static void main(String[] args) throws Exception {
		
		String username = "trazabilidad";
		String password = "trazabilidad";
		
		XmppManager xmppManager = new XmppManager("openfire", 5222);
		
		xmppManager.init();
//		try {
		xmppManager.performLogin(username, password);
//		} catch (XMPPException e) {
//			AccountManager am = new AccountManager(xmppManager.getXmppConnection());
//			am.createAccount(username, username);
//			xmppManager.performLogin(username, password);
//		}
		xmppManager.setStatus(true, "Hello everyone");
		
		String buddyJID = "tect";
		String buddyName = "tect";
		xmppManager.createEntry(buddyJID, buddyName);
		
		xmppManager.sendMessage("Es una prueba", "tect@openfire");
		
		xmppManager.printRoster();
		
//		AccountManager am = new AccountManager(xmppManager.getXmppConnection());
//		am.createAccount(username, password);
		boolean isRunning = true;
		
		while (isRunning) {
			Thread.sleep(50);
		}
		
		xmppManager.destroy();
		
	}

}
