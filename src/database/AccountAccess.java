import java.sql.*;

/**
 * Class to access accounts in project SQL database.
 * 
 * NOTE: This class will NOT work outside of the SFU network. It also requires the JDBC Driver for SQL server to
 * be in the classpath of the JVM for it to function.
 * 
 * @author Markus Balaski
 * @version 0.1 - 22/03/2014
 */
public class AccountAccess {	
	// ATTRIBUTES - CLASS VARIABLES
	
	private static Connection dbConnection;									   // The connection to the database
	
	// STATIC METHODS 
	
	/* Method to establish a connection to the Cypress SQL server. Uses hard-coded login information of s_mbalaski
	 * account to access the database.
	 */
	private static void establishConnection() {
		try {																   // Access the JDBC driver
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("No JDBC driver found, exiting.");
			System.exit(0);
		}

		try {																   // Connect to Cypress
			dbConnection = DriverManager
					.getConnection("jdbc:sqlserver://cypress.csil.sfu.ca;"
							+ " user = s_mbalaski; password = Med72H76hm2RNnJJ");
		} catch (SQLException e) {
			System.out.println("Connection failed, exiting.");
			System.exit(0);
		}
	}
	
	// NON-STATIC METHODS
	
	/* Method to access an account in the database. Takes a username as a parameter, and returns a ResultSet object
	 * based off of the query. This ResultSet can then be used to access information about the specified account.
	 */
	protected ResultSet accessAccount(String username) {
		PreparedStatement prepStatement = null;
		ResultSet resSet = null;
		String query = "SELECT * FROM c275g01A.dbo.Account WHERE Username = '" // Create the selection query string
				+ username + "'";
		
		establishConnection();
		try { 																   // Prepare and execute query
			prepStatement = dbConnection.prepareStatement(query);
			resSet = prepStatement.executeQuery();
		} catch (SQLException e) {
			System.out.println("SQL Exception occured, the state : "
					+ e.getSQLState() + "\nMessage: " + e.getMessage());
		}
		return resSet;
	}

	/* Method to add an account to the database. Takes the necessary data of an account as arguments and inserts an
	 * account into the database based off of the parameters.
	 */
	protected void createAccount(String username, int empID, String password,
			int acctType, boolean blockFlag) {
		String query = "INSERT INTO c275g01A.dbo.Account VALUES ('" + username // Create the insertion query string
				+ "'," + empID + ",'" + password + "'," + acctType + ","
				+ boolToBit(blockFlag) + ")";
		execUpdate(query);												       // Execute the insertion update
	}

	/* Method to update an account in the database. Takes all fields of an account, along with a username to query
	 * as arguments. All fields will be updated to the entered parameters.
	 */
	protected void modifyAccount(String username, int empID, String password,
			int acctType, boolean blockFlag, String accessUsername) {
		String query = "UPDATE c275g01A SET Username='" + username			   // Create the update query string
				+ "', EmployeeID=" + empID + ", Pass = '" + password
				+ "', AccountType = " + acctType + ", BlockAccountaFlag = "
				+ boolToBit(blockFlag) + "WHERE Username = '" + accessUsername
				+ "'";
		execUpdate(query);												       // Execute the update query
	}

	/* Method to delete an account from the database. Takes a username as an argument and removes the account with 
	 * that username from the database.
	 */
	protected void deleteAccount(String username) {
		String query = "DELETE FROM c275g01A.dbo.Account WHERE Username = '"   // Create the deletion query string
				+ username + "'";
		execUpdate(query);													   // Execute the deletion query
	}

	/* Method to execute an update (INSERT, DELETE, UPDATE) query on the database connection.
	 */
	private void execUpdate(String query) {
		PreparedStatement prepStatement = null;

		establishConnection();												   // Establish connection to Cypress

		try {																   // Prepare and execute the query
			prepStatement = dbConnection.prepareStatement(query);
			prepStatement.executeUpdate();
		} catch (SQLException e) {
			System.out.println("SQL Exception occured, the state : "
					+ e.getSQLState() + "\nMessage: " + e.getMessage());
		}
	}

	/* Method to convert a boolean value to either 0 or 1 to be used as a bit in SQL queries.
	 */
	private int boolToBit(boolean b) {
		return b ? 1 : 0;
	}
}