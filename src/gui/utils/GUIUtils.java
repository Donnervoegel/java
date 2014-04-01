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
import types.Writer;
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

    /**
    * @desc:   This method is used by the Instructor to generate a csv file containing the 
    *          grades for a given activity. It takes data from the database and converts it
    *          into a .txt file which is saved to the specified path with the given name.
    * @author: Chazz Young
    */
    public static void generateGradeCSV(String courseID, String actName, String path, String name)
    {
        //Get grades from database
        ResultSet grade_rs = database.GradeAccess.accessGrades(courseID, actName);
        boolean row_valid = false;
        
        //Check to see if the database connection was successful
        try {
            row_valid = grade_rs.next();
        } catch (SQLException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        
        //Initialize grades to return
        ArrayList<String> grades = new ArrayList<String>();
        
        if (row_valid){
            //Initialize temp values to store line info for the csv file
            int student = 0;
            float grade = 0.0f;
            float total = 0.0f;
            String toAdd;
            
            //Set first line to begin
            try{
                student = grade_rs.getInt("StudentID");
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            toAdd = Integer.toString(student);
            
            //Populate the ArrayList<String> of lines to add
            while(row_valid){
                try {
                    //For each student, add grade (rounded to 2 decimal places) to line
                    //e.g. 12345, 6.25, 12.00, 88.50, 2.00, 106.25
                    if(student == grade_rs.getInt("StudentID")){//add another grade to line
                        grade = grade_rs.getFloat("Grade");
                        total += grade;
                        grade = Math.round(student*100)/100;
                        toAdd = toAdd + ", " + Float.toString(grade);
                        row_valid = grade_rs.next();
                    }else{//Add total to end of line, reset line, and initialize next line
                        toAdd = (toAdd + ", " + total);
                        grades.add(toAdd);
                        toAdd = "";
                        student = grade_rs.getInt("StudentID");
                        grade = grade_rs.getFloat("Grade");
                        grade = Math.round(student*100)/100;
                        toAdd = (Integer.toString(student) + ", " + grade);
                        row_valid = grade_rs.next();
                    }
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            
            //Write the ArrayList<String> to a file
            (new Writer()).write(grades, path, name);
        }else{
            System.out.println("Error. Either there was an error connecting to the database");
            System.out.println("or one of teh specified fields is invalid.");
        }
            
    }
            

}
