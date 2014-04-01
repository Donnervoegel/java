package types;

import java.util.*;
import java.io.*;
/**
 * This class converts a .txt file to an ArrayList<String>
 * This class is based on the program given at the following website:
 * http://stackoverflow.com/questions/2885173/java-how-to-create-and-write-to-a-file\
 * @author: Chazz Young
 */
public class Writer {
    public void write(ArrayList<String> outputs, String path, String name) {
        try {
          File file = new File(path + name + ".txt");
          BufferedWriter output = new BufferedWriter(new FileWriter(file));
          for(String s : outputs){
                output.write(s);
                output.newLine();
          }
          
          output.close();
        } catch ( IOException e ) {
           e.printStackTrace();
        }
    }
}