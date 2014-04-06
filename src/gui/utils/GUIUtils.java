package gui.utils;

import gui.MasterFrame;

import java.awt.*;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import javax.swing.*;

import database.GradeAccess;

import java.io.*;

/**
 * @author: Colin
 */
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

    public static LinkedList<String> lines(String filename) {
	LinkedList<String> lines = new LinkedList<String>();
	String line = "";
	try {
	    BufferedReader in = new BufferedReader(new FileReader(filename));
	    while ((line = in.readLine()) != null) {
		lines.add(line);
	    }
	} catch (IOException e) {
	    e.printStackTrace();
	}
	return lines;
    }
    
    /**
     * Takes a resultset and an index as arguments.  Outputs
     * an ArrayList<String>.  If you want to use this ArrayList to populate a 
     * drop down do ArrayList.toArray() as an argument to the constructor for
     * my_dropdown.setModel(new javax.swing.DefaultComboBoxModel(ArrayList.toArray()));
     */
    public static ArrayList<String> generateArrayFromResultSet(ResultSet rs, int index) {
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
    
    /**
    * @desc:   This method is used by the Instructor to generate a csv file containing the 
    *          grades for a given activity. It takes data from the database and converts it
    *          into a .txt file which is saved to the specified path with the given name.
    * @author: Chazz Young
    */
    public static void generateGradeCSV(String courseID, String actName, String path, String name)
    {
    	ResultSet res = GradeAccess.accessGrades(courseID, actName);
    	String s = "";
    	int x = 0;
    	try {
    		while(res.next()) {
    			if(x == res.getInt(1)) {
    				s += "," + res.getFloat(2);
    			} else {
    				if(x == 0)
    					s += res.getInt(1) + "," + res.getFloat(2);
    				else
    					s += "\n" + res.getInt(1) + "," + res.getFloat(2);
    			}
    			x = res.getInt(1);
    		}
    	} catch (SQLException e) {
    		e.printStackTrace();
    	}
    	
    	try {
			PrintWriter out = new PrintWriter(path + "/" + name);
			out.write(s);
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
    }
    //Given a name, an id, get the next position of the array
    public static String getNextStudent(String name, int student_id, Object[] array)
    {
        ArrayList<String> string_arraylist = new ArrayList();
        int index;
        
        for (Object n : array)
            string_arraylist.add((String) n);
        
        String line = name + " - " + Integer.toString(student_id);
        index = string_arraylist.indexOf(line);
        
        if (index == -1)
            return null;
        
        else
            return string_arraylist.get(index+1);
    }
            

}
