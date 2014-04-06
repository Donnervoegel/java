/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package database;

import java.sql.*;


/**
 *
 * @author Pun
 */
public class Dbaccess {
    
    
	// ATTRIBUTES - CLASS VARIABLES

	private static Connection dbConnection; // The connection to the database

	// STATIC METHODS

	/*
	 * Method to return the list of courses by course ID to be used in a course
	 * selection dropdown box.
	 */
	public static void backupdatabase(String filepath) {
	// set up the query string here:	
            String query = "BACKUP DATABASE c275g01A TO DISK = '"+ filepath+"wiresharkbackup.BAK'";
            execUpdate(query);  //execute backup
	}    
        
        public static void restoredatabase(String filepath) {
	// set up the query string here:	
            String query = "RESTORE DATABASE c275g01A FROM DISK = '"+ filepath+"'";
            execUpdate(query);  //execute backup
	}    
        

	// HELPER METHODS

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

	/*
	 * Method to convert a boolean value to either 0 or 1 to be used as a bit in
	 * SQL queries.
	 */
	private static int boolToBit(boolean b) {
		return b ? 1 : 0;
	}
}        
    

