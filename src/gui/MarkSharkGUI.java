// Main driver class for the GUI

package gui;

import javax.swing.*;
import java.util.logging.*;

/**
 * @author: Colin
 */
public class MarkSharkGUI {
    private LoginScreen login;

    public MarkSharkGUI() {
	login = new LoginScreen();
    }

    public void startGUI() {
         try {
             UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(LoginScreen.class.getName())
		 .log(Level.SEVERE, null, ex);
         } catch (InstantiationException ex) {
             Logger.getLogger(LoginScreen.class.getName())
		 .log(Level.SEVERE, null, ex);
         } catch (IllegalAccessException ex) {
             Logger.getLogger(LoginScreen.class.getName())
		 .log(Level.SEVERE, null, ex);
         } catch (UnsupportedLookAndFeelException ex) {
             Logger.getLogger(LoginScreen.class.getName())
		 .log(Level.SEVERE, null, ex);
         }

	 // Display the Login Page
	 login.setVisible(true);
    }
}
