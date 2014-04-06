/*
 * This should be the only .java file on this level.
 */

import gui.MarkSharkGUI;

/**
 * @author: Colin
 */
public class MarkShark {
    public static void main(String doesnt_matter[]) {
	MarkSharkGUI gui = new MarkSharkGUI();

	System.out.println("Starting GUI...");
	gui.startGUI();
	System.out.println("Operation Complete.");
    }
}
