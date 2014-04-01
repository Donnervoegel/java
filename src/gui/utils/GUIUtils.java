package gui.utils;

import gui.MasterFrame;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.*;

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
    
    
    /**
     * Takes a resultset and an index as arguments.  Outputs
     * an ArrayList<String>.  If you want to use this ArrayList to populate a 
     * drop down do ArrayList.toArray() as an argument to the constructor for
     * my_dropdown.setModel(new javax.swing.DefaultComboBoxModel(ArrayList.toArray()));
     */
    public static ArrayList<String> generateArrayFromResultSet(ResultSet rs, int index){
        
        ArrayList<String> list = new ArrayList<String>();
        Array a;
        
       
			try {
			while (rs.next()) {
				list.add(rs.getNString(index));
			}
		} catch (SQLException e) {
			System.out.println("SQL Exception occured, the state : "
					+ e.getSQLState() + "\nMessage: " + e.getMessage());
		}
       return list;             
    }
            

}
