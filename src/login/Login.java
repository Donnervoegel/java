package login;

import types.*;
import database.*;

/**
 * @desc: The Login is used to validate that a user exists and passes that
 *        user into the GUI.
 * @author: Chazz Young
 */
public class Login {
    /*
     * private ArrayList<Account> accounts;
     * 
     * public LoginModule(ArrayList<Account> list_of_accounts) { accounts = new
     * ArrayList<Account>(); //Populate list of accounts, Account dummy = new
     * SystemAdmin(null, null, 0, null, null);
     * 
     * }
     * 
     * public Account attemptLogin(String username, String password) { Account
     * toReturn = null; for(Account a : accounts){ if(a.getUsername() == null){
     * return null; } if(a.getUsername().equals(username)){ boolean success =
     * a.checkPassword(password); if(success == true){ toReturn = a; break;
     * }else{ break; } } } return toReturn; }
     */
    
    public static boolean login(String username, String password) {
	Account acct = null;
	String acctPW = "";
	
	acct = AccountAccess.constructAccountObject(username);
	
	try {
	    acctPW = acct.getPassword();
	} catch (Exception e) {
	    System.out.println("No account");
	}
	
	if (acctPW.equals(password)) {
	    return true;
	}
	
	System.out.println("Failed login");
	return false;
    }
}
