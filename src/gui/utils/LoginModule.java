package Login;

import java.util.*;
import types.*;
import database.*;

/**
 * @desc: The LoginModule is used to validate that a user exists and passes that
 *        user into the GUI.
 * @author: Chazz Young
 */
public class LoginModule {
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

	public static Account login(String username, String password) {
		Account acct = null;
		String acctPW = "";

		acct = AccountAccess.constructAccountObject(username);
		
		try {
			acctPW = acct.getPassword();
		} catch (Exception e) {
			return null;
		}
		
		if (acctPW == password)
			return acct;
		else
			System.out.println("Failed login");
		return acct;
	}
}
