package gui.utils;

import gui.MasterFrame;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;
import java.security.SecureRandom;
import java.math.BigInteger;

public abstract class GUIUtils {
    // BUG: If the starting Component is of a higher type than
    // JFrame, this will recurse forever or possibly throw and error.
    public static MasterFrame getMasterFrame(Component c) {
	if(c instanceof MasterFrame) {
	    return (MasterFrame)c;
	} else {
	    return getMasterFrame(c.getParent());
	}
    }

    public static void centerFrame(JFrame f) {
	GraphicsEnvironment env = GraphicsEnvironment
	    .getLocalGraphicsEnvironment();
	GraphicsDevice[] allDevices = env.getScreenDevices();
	int topLeftX, topLeftY, screenX, screenY, windowPosX, windowPosY;

	topLeftX = allDevices[0].getDefaultConfiguration().getBounds().x;
	topLeftY = allDevices[0].getDefaultConfiguration().getBounds().y;
	screenX  = allDevices[0].getDefaultConfiguration().getBounds().width;
	screenY  = allDevices[0].getDefaultConfiguration().getBounds().height;

	windowPosX = ((screenX - f.getWidth())  / 2) + topLeftX;
	windowPosY = ((screenY - f.getHeight()) / 2) + topLeftY;

	f.setLocation(windowPosX, windowPosY);
    }

    public static void nothing() {
	System.out.println("Do nothing.");
    }

    // 32 = 2^5, and 30 % 5 == 0
    // And each character is 5 bits.
    public static String generatePassword()
    {
	SecureRandom random = new SecureRandom();
	String pass = new BigInteger(30, random).toString(32);

	//System.out.println("Password generated: " + pass);
	return pass;
    }
}
