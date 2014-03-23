package gui;

import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.*;
import java.util.*;
import types.*;

/**
 * @author Colin
n */
public class MasterFrame extends JFrame {
    private JPanel  top_bar;
    private JPanel  curr_page;
    private JButton logout;
    private JButton back;
    private JLabel  role;
    private JLabel  crumbs;  // This won't be a JLabel later.
    private List<JPanel> pages;

    // This will take an `Account` object and populate itself according to
    // the Account type.
    public MasterFrame(Account a) {
	// Initialize components.
	top_bar = new JPanel();
	logout  = new JButton("Logout");
	back    = new JButton("Back");
	role    = new JLabel("Role: Filler...");  // Changes according to `a`.
	crumbs  = new JLabel("Breadcrumbs here...");

	// Various settings.
	setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	setTitle("MarkShark - Blah");  // Changes according to `a`.
	setResizable(true);

	// Set up action listeners
	back.addActionListener(e -> goBackAction(e));
	logout.addActionListener(e -> logoutAction(e));

	// Set up persistent top bar
	top_bar.setLayout(new GridLayout(2,2,100,5));
	top_bar.add(crumbs);
	top_bar.add(role);
	top_bar.add(back);
	top_bar.add(logout);

	// Set up bottom panel according to `a`.

	// Render the Frame.
	add(top_bar);
	// addComponent(curr_page);
	pack();
    }

    public void run() {
	this.setVisible(true);
    }

    private void goBackAction(ActionEvent e) {
	System.out.println("Going back.");
    }

    private void logoutAction(ActionEvent e) {
	System.out.println("Logging out...");
	// TODO: Write to the system log?
	this.processWindowEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }
}
