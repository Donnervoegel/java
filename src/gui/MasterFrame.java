package gui;

import javax.swing.*;
import java.awt.event.*;
import types.*;

/**
 * @author Colin
 */
public class MasterFrame extends JFrame {
    // Fields here.

    // This will take an `Account` object and populate itself according to
    // the Account type.
    public MasterFrame(Account a) {
	setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("MarkShark - Blah");  // This will change according to `a`.
	pack();
    }

    public void run() {
	this.setVisible(true);
    }
}
