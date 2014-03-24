package types;

import java.util.*;
import java.io.*;
/**
 * @desc:   The class TextAnalyzer is used to read and return information from a text file. 
 * @author: Chazz Young
 */
public class TextAnalyzer
{
    /**
     * Constructor for objects of class TextAnalyzer
     */
    public TextAnalyzer()
    {
        
    }

    /**
     * This method reads the inputs of each line and returns an ArrayList of type String.
     */
    public static ArrayList<String> getInput(String filename)
    {
        ArrayList<String> entry = new ArrayList<String>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line = reader.readLine();
            while(line != null) {
                entry.add(line);
                line = reader.readLine();
            }
            reader. close();
        }
        catch(FileNotFoundException e) {
            System.out.println("This is not a valid directory for the file path specified.");
        }
        catch(IOException e) {
            
        }
        return entry;
    }
}