package shell;

import java.util.*;
import java.io.*;

/**
 * @author: Colin
 */
public abstract class Shell {
    public static String exec(ArrayList<String> cmd) {
	ShellExec e = new ShellExec(cmd);
	String result = "";

	try {
	    e.executeCommand();
	    StringBuilder output = e.getStandardOutputFromCommand();
	    result = new String(output);
	    System.out.println("Shell call went ok!");
	} catch (IOException err) {
	    System.out.println("MarkShark: There was some IO when executing a shell call.");
	} catch (InterruptedException err) {
	    System.out.println("MarkShark: A shell call was interrupted.");
	}
	
	return result;
    }

    public static boolean isWindows() {
	String os = System.getProperty("os.name");

	if (os.contains("Windows")) {
	    System.out.println("I AM WINDOWS!!!!");
	    return true;
	}
	return false;
    }

    public static String pythonCall(String cmd) {
	ArrayList<String> l = new ArrayList<String>();
	String command;

	if (isWindows()) {
	    command = "C:\\Python27\\python";
	} else {
	    command = "python";
	}

	l.add(command);
	l.add(cmd);

	return Shell.exec(l);
    }

	public static String pythonCall(String cmd, String testIn) {
		ArrayList<String> l = new ArrayList<String>();
		String command;

		if (isWindows()) {
		    command = "C:\\Python27\\python";
		} else {
		    command = "python";
		}

		l.add(command);
		l.add(cmd);
		l.add(testIn);

		return Shell.exec(l);
	}
}
