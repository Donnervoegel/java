package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Class to access courses in project SQL database.
 * 
 * NOTE: This class will NOT work outside of the SFU network. It also requires
 * the JDBC Driver for SQL server to be in the classpath of the JVM for it to
 * function.
 * 
 * @author Markus Balaski
 * @version 0.1 - 22/03/2014
 */
public class CourseAccess {
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
			System.exit(0);
		}

		try { // Connect to Cypress
			dbConnection = DriverManager
					.getConnection("jdbc:sqlserver://cypress.csil.sfu.ca;"
							+ " user = c275g01; password = TAA2Md7nGrPj2LjN");
		} catch (SQLException e) {
			System.out.println("Connection failed, exiting.");
			System.exit(0);
		}
	}

	// NON-STATIC METHODS

	/*
	 * Method to access a course in the database based off of course ID. This
	 * method returns a ResultSet object that can be used to access the data in
	 * a course.
	 */
	protected ResultSet accessCourse(String courseID) {
		PreparedStatement prepStatement = null;
		ResultSet resSet = null;
		// Create the selection query string
		String query = "SELECT * FROM c275g01A.dbo.Course WHERE CourseID = '"
				+ courseID + "'";

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
	 * Method to add a course to the database. Takes the necessary data of a
	 * course as arguments and inserts a course into the database based off of
	 * the parameters.
	 */
	protected void createAccount(String courseID, String courseName,
			int markerID, String instructorName, int instructorID,
			String startDate, String endDate) {
		// Create the insertion query string
		String query = "INSERT INTO c275g01A.dbo.Course VALUES ('" + courseID
				+ "','" + courseName + "'," + markerID + ",'" + instructorName
				+ "'," + instructorID + ",'" + startDate + "','" + endDate
				+ "')";
		execUpdate(query); // Execute the insertion update
	}

	/*
	 * Method to update a course in the database. Takes all the fields of a
	 * course, along with a specific course ID to access as parameters. Updates
	 * all the fields of the course with the specified access ID based on the
	 * arguments passed.
	 */
	protected void modifyAccount(String courseID, String courseName,
			int markerID, String instructorName, int instructorID,
			String startDate, String endDate, String accessID) {
		// Create the update query string
		String query = "UPDATE c275g01A.dbo.Course CourseID='" + courseID
				+ "',CourseName='" + courseName + "',MarkerID=" + markerID
				+ ",InstructorName='" + instructorName + "',InstructorID="
				+ instructorID + ",StartDate='" + startDate + "',EndDate='"
				+ endDate + "' WHERE CourseID='" + accessID + "'";
		execUpdate(query); // Execute the update query
	}

	/*
	 * Method to delete a course from the database. Takes a course ID as the
	 * parameter and removes the specified course from the database.
	 */
	protected void deleteCourse(String courseID) {
		// Create the deletion query string
		String query = "DELETE FROM c275g01A.dbo.Course WHERE CourseID = '"
				+ courseID + "'";
		execUpdate(query); // Execute the deletion query
	}

	/*
	 * Method to execute an update (INSERT, DELETE, UPDATE) query on the
	 * database connection.
	 */
	private void execUpdate(String query) {
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
}