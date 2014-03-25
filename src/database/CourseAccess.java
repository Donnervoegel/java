package database;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import types.Activity;
import types.Course;
import types.Instructor;
import types.Student;
import types.TATM;

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
	public ResultSet accessCourse(String courseID) {
		// Create the selection query string
		String query = "SELECT * FROM c275g01A.dbo.Course WHERE CourseID = '"
				+ courseID + "'";
		return execQuery(query); // Execute the query and return the result set
	}

	/*
	 * Method to add a course to the database. Takes a course object as an
	 * argument, and adds a course with all the details of the course object to
	 * the database.
	 */
	public static void createCourse(Course course) {
		// Build database entries from course object
		String courseID = course.getCourseID();
		String courseName = course.getCourseName();
		String instructorName = course.getInstructor().getFirstName()
				+ course.getInstructor().getLastName();
		int instructorID = course.getInstructor().getEmpID();
		String startDate = course.getStartDate();
		String endDate = course.getEndDate();

		// Create the insertion query string
		String query = "INSERT INTO c275g01A.dbo.Course VALUES ('" + courseID
				+ "','" + courseName + "','" + instructorName + "',"
				+ instructorID + ",'" + startDate + "','" + endDate + "')";
		execUpdate(query); // Execute the insertion update
	}

	/*
	 * Method to update a course in the database. Takes a course ID to access,
	 * and updates all the fields of that course in the database based on the
	 * course object passed as an argument.
	 */
	public void modifyCourse(String accessID, Course course) {
		// Build database entries from course object
		String courseID = course.getCourseID();
		String courseName = course.getCourseName();
		String instructorName = course.getInstructor().getFirstName()
				+ course.getInstructor().getLastName();
		int instructorID = course.getInstructor().getEmpID();
		String startDate = course.getStartDate();
		String endDate = course.getEndDate();

		// Create the update query string
		String query = "UPDATE c275g01A.dbo.Course CourseID='" + courseID
				+ "',CourseName='" + courseName + "',InstructorName='"
				+ instructorName + "',InstructorID=" + instructorID
				+ ",StartDate='" + startDate + "',EndDate='" + endDate
				+ "' WHERE CourseID='" + accessID + "'";
		execUpdate(query); // Execute the update query
	}

	/*
	 * Method to delete a course from the database. Takes a course ID as the
	 * parameter and removes the specified course from the database.
	 */
	public void deleteCourse(String courseID) {
		// Create the deletion query string
		String query = "DELETE FROM c275g01A.dbo.Course WHERE CourseID = '"
				+ courseID + "'";
		execUpdate(query); // Execute the deletion query
	}

	/*
	 * Method to create a Course object populated
	 * from the database given a courseID.
	 * Uses cID as the courseID, since it is the key value.
	 */
	@SuppressWarnings("unused")
	public Course constructCourseObject(String cID) {
		// Method variables
		Course course = null;
		ResultSet rs = null;
		// Course variables
		String courseName = null, courseID = null, instructorName = null;
		int instructorID;
		Date startDate = null, endDate= null;
		Instructor ins = null;
		// TeachingAssistant variables
		ArrayList<TATM> markers = new ArrayList<TATM>();
		int taEID;
		String taEName = null;
		// Students variables
		ArrayList<Student> students = new ArrayList<Student>();
		int sID;
		String sName = null;
		// Activities variables
        ArrayList<Activity> activities = new ArrayList<Activity>();
        String aName = null, aDesc = null, sSolnPath = null, solnPath = null;
        int aLang, aType;
        boolean groupAct;
		// Course table
		rs = accessCourse(cID);
		try {
			rs.next();
			// Listed loosely in Course constructor's order
			courseName = rs.getNString("CourseName");
			courseID = cID; //rs.getNString("CourseID");
			instructorName = rs.getNString("InstructorName");
			instructorID = rs.getInt("InstructorID");
			startDate = rs.getDate("StartDate"); // What is the format for the date?
			endDate = rs.getDate("EndDate");
            String[]names=instructorName.split("\\s+");
            String fname=names[0];
            String lname=names[1];
            ins = new Instructor(fname, lname, instructorID, null, null);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Now to put it all together
		course = new Course(courseName, cID, ins, startDate.toString(), endDate.toString());
		// TeachingAssistant table
		rs = accessTAs(cID);
		try {
			while(rs.next()){
				taEID = rs.getInt("EmployeeID");
				taEName = rs.getNString("EmployeeName");
                String[]names=taEName.split("\\s+");
                String fname=names[0];
                String lname=names[1];
				TATM temp = new TATM(fname, lname, taEID, null, null); // Why does the system need to load their username and password?
				course.addMarker(temp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Students table
		rs = accessStudentList(cID);
		try {
			while(rs.next()){
				sID = rs.getInt("StudentID");
				sName = rs.getNString("StudentName");
                String[]names=sName.split("\\s+");
                String fname=names[0];
                String lname=names[1];
                Student temp = new Student();
                course.addStudent(temp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Activities table
		rs = accessCourseActivities(cID);
		try {
			while(rs.next()){
				aName = rs.getNString("ActivityName");
				aDesc = rs.getNString("ActivityDesc");
				sSolnPath = rs.getNString("StudentSolnPath");
				solnPath = rs.getNString("SolnPath"); // Activity only accepts 1 path
				aLang = rs.getInt("ActivityLang");
				aType = rs.getInt("ActivityType");
				groupAct = rs.getBoolean("GroupAct");
				boolean isProgramming = (aType == 0); // 0 is programming, 1 is essay, 2 is problem set?
				Activity temp = new Activity(aName, sSolnPath, aLang, isProgramming, groupAct);
				course.addActivity(temp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// c is a complete
		return course;
	}
	
	/*
	 * Method to access the student list for a specified course. Will return the
	 * student IDs and names of the student list for the course.
	 */
	public ResultSet accessStudentList(String courseID) {
		String query = "SELECT StudentID,StudentName FROM c275g01A.dbo.Student "
				+ "WHERE CourseID = '" + courseID + "'";
		return execQuery(query);
	}

	/*
	 * Method to clear the student list when updating it with a new .csv file.
	 */
	public void clearStudentList(String courseID) {
		String query = "DELETE FROM c275g01A.dbo.Student WHERE CourseID = '"
				+ courseID + "'";
		execUpdate(query);
	}

	/*
	 * Method to add a student to the student list for a particular course.
	 */
	public void addStudent(String studentName, int studentID, String courseID) {
		String query = "INSERT INTO c275g01A.dbo.Student VALUES ('"
				+ studentName + "'," + studentID + ",'" + courseID + "')";
		execUpdate(query);
	}

	/*
	 * Method to access the list of activities for a particular course.
	 */
	public ResultSet accessCourseActivities(String courseID) {
		String query = "SELECT * FROM c275g01A.dbo.Activity WHERE CourseID = '"
				+ courseID + "'";
		return execQuery(query);
	}

	/*
	 * Method to access a particular activity by combination of course ID and
	 * name.
	 */
	public ResultSet accessActivity(String courseID, String activityName) {
		String query = "SELECT * FROM c275g01A.dbo.Activity WHERE CourseID = '"
				+ courseID + "' AND ActivityName = '" + activityName + "'";
		return execQuery(query);
	}

	/*
	 * Method to add an activity, including all necessary details,
	 */
	public void addActivity(String courseID, Activity act) {
		// Build database entries from activity object
		String activityName = act.getName();
		String activityDesc = act.getActivityDesc();
		String studentSolnPath = act.getSolnPath();
		int activityLang = act.getLanguage();
		boolean activityType = act.isProgramming();
		boolean group = act.isGroup();
		String solnPath = "";
		int numTests = act.getNumOfTests();

		// Generate the insertion query
		String query = "INSERT INTO c275g01A.dbo.Activity VALUES ('" + courseID
				+ "','" + activityName + "','" + activityDesc + "','"
				+ activityLang + "'," + boolToBit(activityType) + ","
				+ boolToBit(group) + ",'" + studentSolnPath + "','" + solnPath
				+ "'," + numTests + ")";
		execUpdate(query);
	}

	/*
	 * Method to update an activity (specified by name) in a particular course
	 * specified by the course ID passed as a parameter.
	 */
	public void modifyActivity(String courseID, Activity act) {
		// Build database entries from activity object
		String activityName = act.getName();
		String activityDesc = act.getActivityDesc();
		String studentSolnPath = act.getSolnPath();
		int activityLang = act.getLanguage();
		boolean activityType = act.isProgramming();
		boolean group = act.isGroup();
		String solnPath = "";

		// Generate the update query
		String query = "UPDATE c275g01A.dbo.Activity ActivityName='"
				+ activityName + "',ActivityDesc='" + activityDesc
				+ "',ActivityLang=" + activityLang + ",activityType="
				+ activityType + ",GroupAct=" + boolToBit(group)
				+ ",StudentSolnPath='" + studentSolnPath + "',SolnPath='"
				+ solnPath + "' WHERE CourseID = '" + courseID + "'";
		execUpdate(query);
	}

	/*
	 * Method to remove a specified activity from a course (also specified) by
	 * name and course ID.
	 */
	public void deleteActivity(String courseID, String activityName) {
		String query = "DELETE FROM c275g01A.dbo.Activity WHERE CourseID = '"
				+ courseID + "' AND ActivityName = '" + activityName + "'";
		execUpdate(query);
	}

	/*
	 * Method to list the teaching assistant(s) or tutor marker(s) for the
	 * specified course.
	 */
	public ResultSet accessTAs(String courseID) {
		String query = "SELECT EmployeeID, EmployeeName FROM c275g01A.dbo.Activity WHERE CourseID = '"
				+ courseID + "'";
		return execQuery(query);
	}

	/*
	 * Method to add a teaching assistant (or tutor marker) to a specified
	 * course including their employee ID and name.
	 */
	public void addTA(String courseID, int empID, String empName) {
		String query = "INSERT INTO c275g01A.dbo.TeachingAssistant VALUES ('"
				+ courseID + "'," + empID + ",'" + empName + "')";
		execUpdate(query);
	}

	/*
	 * Method to delete a teaching assistant (or tutor marker) from a specified
	 * course, deleted by their employee ID.
	 */
	public void deleteTA(String courseID, int empID) {
		String query = "DELETE FROM c275g01A.dbo.TeachingAssistant WHERE CourseID = '"
				+ courseID + "' AND EmployeeID = " + empID;
		execUpdate(query);
	}

	/*
	 * Method to access the rubric for a specific activity in a course.
	 */
	public ResultSet accessRubric(String courseID, String activityName) {
		String query = "SELECT RubricItem, MaxGrade FROM c275g01A.dbo.Rubric WHERE CourseID = '"
				+ courseID + "' AND ActivityName = '" + activityName + "'";
		return execQuery(query);
	}

	/*
	 * Method to add a rubric item to the database for a specific activity in a
	 * specific course.
	 */
	public void addRubricItem(String courseID, String activityName,
			String rubricItem, float maxGrade) {
		String query = "INSERT INTO c275g01A.dbo.Rubric VALUES ('" + courseID
				+ "','" + activityName + "','" + rubricItem + "'," + maxGrade
				+ ")";
		execUpdate(query);
	}

	/*
	 * Method to delete a rubric item for a specific activity in a specific
	 * course.
	 */
	public void deleteRubricItem(String courseID, String activityName,
			String rubricItem) {
		String query = "DELETE FROM c275g01A.dbo.Rubric WHERE CourseID = '"
				+ courseID + "' AND ActivityName = '" + activityName
				+ "' AND RubricItem = '" + rubricItem + "'";
		execUpdate(query);
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
	private ResultSet execQuery(String query) {
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
	private int boolToBit(boolean b) {
		return b ? 1 : 0;
	}
}