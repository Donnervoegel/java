// Main driver class for the GUI

package gui;

import javax.swing.*;

public class MarkSharkGUI {
    private LoginScreen login;

    public MarkSharkGUI() {
	login = new LoginScreen();
    }

    public void startGUI() {
         try {
             UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
         } catch (ClassNotFoundException ex) {
             java.util.logging.Logger.getLogger(LoginScreen.class.getName())
		 .log(java.util.logging.Level.SEVERE, null, ex);
         } catch (InstantiationException ex) {
             java.util.logging.Logger.getLogger(LoginScreen.class.getName())
		 .log(java.util.logging.Level.SEVERE, null, ex);
         } catch (IllegalAccessException ex) {
             java.util.logging.Logger.getLogger(LoginScreen.class.getName())
		 .log(java.util.logging.Level.SEVERE, null, ex);
         } catch (javax.swing.UnsupportedLookAndFeelException ex) {
             java.util.logging.Logger.getLogger(LoginScreen.class.getName())
		 .log(java.util.logging.Level.SEVERE, null, ex);
         }

	 // Display the Login Page
	 login.setVisible(true);
    }
}
