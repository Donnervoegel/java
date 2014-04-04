package database;

import java.sql.*;
import java.util.ArrayList;

import types.*;

/**
 * Class to access accounts in project SQL database.
 * 
 * NOTE: This class will NOT work outside of the SFU network. It also requires
 * the JDBC Driver for SQL server to be in the classpath of the JVM for it to
 * function.
 * 
 * @author Markus Balaski
 * @version 0.1 - 22/03/2014
 */
public class AccountAccess {
	// ATTRIBUTES - CLASS VARIABLES

	private static Connection dbConnection; // The connection to the database

	// STATIC METHODS

	/*
	 * Method to establish a connection to the Cypress SQL server. Uses
	 * hard-coded login information of our group's SQL connection.
	 */
	private static void establishConnection() {
		try { // Access the JDBC driver
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("No JDBC driver found, exiting.");
		}

		try { // Connect to Cypress
			dbConnection = DriverManager
					.getConnection("jdbc:sqlserver://cypress.csil.sfu.ca;"
							+ " user = c275g01; password = TAA2Md7nGrPj2LjN");
		} catch (SQLException e) {
			System.out.println("Connection failed, exiting.");
		}
	}

	// NON-STATIC METHODS

	/*
	 * Method to access an account in the database. The method builds a
	 * ResultSet containing all the fields of account type, selected based on
	 * the username entered as a parameter.
	 */
	public static ResultSet accessAccount(String username) {
		// Create the selection query string
		String query = "SELECT * FROM c275g01A.dbo.Account WHERE Username = '"
				+ username + "'";
		return execQuery(query);
	}

	public static Object[] accessAccountList() {
		ArrayList<String> accounts = new ArrayList<String>();
		String query = "SELECT Username FROM c275g01A.dbo.Account";
		ResultSet res = execQuery(query);
		try {
			while (res.next()) {
				accounts.add(res.getNString(1));
			}
		} catch (SQLException e) {
			System.out.println("SQL Exception occured, the state : "
					+ e.getSQLState() + "\nMessage: " + e.getMessage());
		}

		return accounts.toArray();
	}

	public static Object[] accessAllTAs() {
		ArrayList<String> accounts = new ArrayList<String>();
		String query = "SELECT EmployeeName, EmployeeID FROM "
				+ "c275g01A.dbo.Account WHERE AccountType = 5";
		ResultSet res = execQuery(query);
		try {
			while (res.next()) {
				accounts.add(res.getNString(1) + " - " + res.getInt(2));
			}
		} catch (SQLException e) {
			System.out.println("SQL Exception occured, the state : "
					+ e.getSQLState() + "\nMessage: " + e.getMessage());
		}

		return accounts.toArray();
	}

	public static Object[] accessAllInstructors() {
		ArrayList<String> accounts = new ArrayList<String>();
		String query = "SELECT EmployeeName,EmployeeID FROM "
				+ "c275g01A.dbo.Account WHERE AccountType = 4";
		ResultSet res = execQuery(query);
		try {
			while (res.next()) {
				accounts.add(res.getNString(1) + " - " + res.getInt(2));
			}
		} catch (SQLException e) {
			System.out.println("SQL Exception occured, the state : "
					+ e.getSQLState() + "\nMessage: " + e.getMessage());
		}

		return accounts.toArray();
	}

	public static String accessUsername(int empID) {
		String query = "SELECT Username from c275g01A.dbo.Account WHERE EmployeeID = '" + empID + "'";
		String username = null;
		ResultSet res = execQuery(query);
		try {
			res.next();
			username = res.getNString(1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return username;
	}

	/*
	 * Method that useses accessAccount() to access an account, then return an
	 * Account object constructed from the ResultSet. Untested, must verify it
	 * works. Account type is set to TA/TM if an improper type is retrieved.
	 * 
	 * @author Graeme Smith (just this method)
	 */
	public static Account constructAccountObject(String username) {
		ResultSet result = accessAccount(username);
		Account account = null;
		try {
			result.next();
			String uname = result.getNString(1);
			String pass = result.getNString(2);
			int employee_id = result.getInt(3);
			String employee_name = result.getNString(4);
			int type = result.getInt(5);
			String[] names = employee_name.split("\\s+");
			String fname = names[0];
			String lname = names[1];
			Boolean blocked = result.getBoolean(6);
			if (type == 1) {
				account = new SystemAdmin(fname, lname, employee_id, uname,
						pass);
			} else if (type == 2) {
				account = new AcademicAdmin(fname, lname, employee_id, uname,
						pass);
			} else if (type == 3) {
				account = new AssistantAdmin(fname, lname, employee_id, uname,
						pass);
			} else if (type == 4) {
				account = new Instructor(fname, lname, employee_id, uname, pass);
			} else if (type == 5) {
				account = new TATM(fname, lname, employee_id, uname, pass);
			} else {
				account = new TATM(fname, lname, employee_id, uname, pass);
				System.out.println("There was an error with account type; "
						+ "account type set to TA/TM");
			}
			account.setBlocked(blocked);
			return account;
		} catch (SQLException ex) {
			System.out.println("SQL Exception occured, the state : "
					+ ex.getSQLState() + "\nMessage: " + ex.getMessage());
		}
		System.out.println("Returning a null account because something "
				+ "failed while retrieving the account");
		return account;
	}

	/*
	 * Method to return a ResultSet containing the usernames of all the accounts
	 * in the database.
	 */
	public static ResultSet accessAllAccounts() {
		String query = "SELECT Username FROM c275g01A.dbo.account";
		return execQuery(query);
	}

	/*
	 * Method to add an account to the database. Takes an Account object and
	 * creates an entry in the database matching the variables of the Account
	 * passed as a parameter.
	 */
	public static void createAccount(Account acct) {
		// Initialise fields of the account object to create
		String username = acct.getUsername();
		String password = acct.getPassword();
		int empID = acct.getEmpID();
		String empName = acct.getFirstName() + " " + acct.getLastName();
		int acctType = acct.getAccountTypeAsInt();
		boolean blockFlag = acct.isBlocked();

		// Create the insertion query string
		String query = "INSERT INTO c275g01A.dbo.Account VALUES ('" + username
				+ "','" + password + "'," + empID + ",'" + empName + "',"
				+ acctType + "," + boolToBit(blockFlag) + ", 0)";
		execUpdate(query); // Execute the insertion update
	}

	/*
	 * Method to update an account in the database. Takes a username to access,
	 * and updates the account with all the fields of the account object passed.
	 */
	public static void modifyAccount(String accessUsername, Account acct) {
		// Initialise fields of account object to edit in database
		String username = acct.getUsername();
		String password = acct.getPassword();
		int empID = acct.getEmpID();
		String empName = acct.getFirstName() + " " + acct.getLastName();
		int acctType = acct.getAccountTypeAsInt();
		boolean blockFlag = acct.isBlocked();

		// Create the update query string
		String query = "UPDATE c275g01A.dbo.Account SET Username = '"
				+ username + "', Pass = '" + password + "', EmployeeID = "
				+ empID + ", EmployeeName = '" + empName + "', AccountType = "
				+ acctType + ", BlockAccountFlag = " + boolToBit(blockFlag)
				+ "WHERE Username = '" + accessUsername + "'";
		execUpdate(query);
		//establishConnection();
		//PreparedStatement prepSt = dbConnection.prepareStatement(query); // Execute the update query
		//prepSt.executeUpdate();
	}

	/*
	 * Method to delete an account from the database. Takes a username as an
	 * argument and removes the account with that username from the database.
	 */
	public static void deleteAccount(String username) {
		// Create the deletion query string
		String query = "DELETE FROM c275g01A.dbo.Account WHERE Username = '"
				+ username + "'";
		execUpdate(query);
		//establishConnection();
		//PreparedStatement prepSt = dbConnection.prepareStatement(query); // Execute the update query
		//prepSt.executeUpdate();
	}

	public static int failedLogin(String username) {
		String query = "SELECT PWAttempts FROM c275g01A.dbo.Account WHERE Username = '"
				+ username + "'";
		ResultSet res = execQuery(query);
		int attempts = 0;
		try {
			res.next();
			attempts = res.getInt(1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		attempts++;
		if (attempts < 5) {
			query = "UPDATE c275g01A.dbo.Account SET PWAttempts = " + attempts
					+ " WHERE Username = '" + username + "'";
		} else {
			query = "UPDATE c275g01A.dbo.Account SET PWAttempts = " + attempts
					+ ", BlockAccountFlag = 1 WHERE Username = '" + username
					+ "'";
		}
		execQuery(query);
		return attempts;
	}

	public static void successfulLogin(String username) {
		String query = "UPDATE c275g01A.dbo.Account SET PWAttempts = 0 WHERE Username = '"
				+ username + "'";
		execUpdate(query);
	}

	/*
	 * Method to execute an update (INSERT, DELETE, UPDATE) query on the
	 * database connection.
	 */
	private static void execUpdate(String query) {
		PreparedStatement prepStatement = null;

		establishConnection(); // Establish connection to Cypress

		try { // Prepare and execute the query
			prepStatement = dbConnection.prepareStatement(query);
			prepStatement.executeUpdate();
		} catch (SQLException e) {
			System.out.println("SQL Exception occured, the state : "
					+ e.getSQLState() + "\nMessage: " + e.getMessage());
		}
	}

	/*
	 * Method to execute a query on the database connection and return a result
	 * set for the query entered as a string argument.
	 */
	private static ResultSet execQuery(String query) {
		PreparedStatement prepStatement = null;
		ResultSet resSet = null;

		establishConnection();
		try { // Prepare and execute query
			prepStatement = dbConnection.prepareStatement(query);
			resSet = prepStatement.executeQuery();
		} catch (SQLException e) {
			System.out.println("SQL Exception occured, the state : "
					+ e.getSQLState() + "\nMessage: " + e.getMessage());
		}
		return resSet;
	}

	/*
	 * Method to convert a boolean value to either 0 or 1 to be used as a bit in
	 * SQL queries.
	 */
	private static int boolToBit(boolean b) {
		return b ? 1 : 0;
	}
}
