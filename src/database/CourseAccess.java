package database;

import java.util.ArrayList;

import types.*;

import java.sql.*;

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
	 * Method to return the list of courses by course ID to be used in a course
	 * selection dropdown box.
	 */
	public static Object[] accessCourseList() {
		ArrayList<String> courseIDs = new ArrayList<String>();
		String query = "SELECT CourseID FROM c275g01A.dbo.Course";
		ResultSet res = execQuery(query);
		try {
			while (res.next()) {
				courseIDs.add(res.getNString(1));
			}
		} catch (SQLException e) {
			System.out.println("SQL Exception occured, the state : "
					+ e.getSQLState() + "\nMessage: " + e.getMessage());
		}

		return courseIDs.toArray();
	}

	/*
	 * Method to return the list of courses by course ID to be used in a course
	 * selection dropdown box for a specific instructor.
	 */
	public static Object[] accessCourseList(int instID) {
		ArrayList<String> courseIDs = new ArrayList<String>();
		String query = "SELECT CourseID FROM c275g01A.dbo.Course WHERE InstructorID = '"
				+ instID + "'";
		ResultSet res = execQuery(query);
		try {
			while (res.next()) {
				courseIDs.add(res.getNString(1));
			}
		} catch (SQLException e) {
			System.out.println("SQL Exception occured, the state : "
					+ e.getSQLState() + "\nMessage: " + e.getMessage());
		}

		return courseIDs.toArray();
	}

	public static Object[] accessCourseListTA(int emplID) {
		ArrayList<String> courseIDs = new ArrayList<String>();
		String query = "SELECT CourseID FROM c275g01A.dbo.TeachingAssistant WHERE EmployeeID = '"
				+ emplID + "'";
		ResultSet res = execQuery(query);
		try {
			while (res.next()) {
				courseIDs.add(res.getNString(1));
			}
		} catch (SQLException e) {
			System.out.println("SQL Exception occured, the state : "
					+ e.getSQLState() + "\nMessage: " + e.getMessage());
		}

		return courseIDs.toArray();
	}

	/*
	 * Method to access a course in the database based off of course ID. This
	 * method returns a ResultSet object that can be used to access the data in
	 * a course.
	 */
	public static ResultSet accessCourse(String courseID) {
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
		String instructorName = course.getInstructor().getFirstName() + " "
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
	public static void modifyCourse(String accessID, Course course) {
		// Build database entries from course object
		String courseID = course.getCourseID();
		String courseName = course.getCourseName();
		String instructorName = course.getInstructor().getFirstName() + " "
				+ course.getInstructor().getLastName();
		int instructorID = course.getInstructor().getEmpID();
		String startDate = course.getStartDate();
		String endDate = course.getEndDate();

		// Create the update query string
		String query = "UPDATE c275g01A.dbo.Course SET CourseID='" + courseID
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
	public static boolean deleteCourse(String courseID) {
		String query = "SELECT * FROM c275g01A.dbo.Activity WHERE CourseID = '"
				+ courseID + "'";
		ResultSet res = execQuery(query);
		try {
			boolean test = res.next();
			if (!test) {
				// Create the deletion query string
				query = "DELETE FROM c275g01A.dbo.Course WHERE CourseID = '"
						+ courseID + "'";
				execUpdate(query); // Execute the deletion query
				return true;
			} else {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	/*
	 * Method to create a Course object populated from the database given a
	 * courseID. Uses cID as the courseID, since it is the key value.
	 */
	@SuppressWarnings("unused")
	public static Course constructCourseObject(String cID) {
		// Method variables
		Course course = null;
		ResultSet rs = null;
		// Course variables
		String courseName = null, courseID = null, instructorName = null;
		int instructorID;
		Date startDate = null, endDate = null;
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
		String aLang;
		boolean groupAct, aType;
		// Course table
		rs = accessCourse(cID);
		try {
			rs.next();
			// Listed loosely in Course constructor's order
			courseName = rs.getNString("CourseName");
			courseID = cID; // rs.getNString("CourseID");
			instructorName = rs.getNString("InstructorName");
			instructorID = rs.getInt("InstructorID");
			startDate = rs.getDate("StartDate");
			endDate = rs.getDate("EndDate");
			String[] names = instructorName.split("\\s+");
			String fname = names[0];
			String lname = "";
			if (names.length > 1)
				lname = names[1];
			ins = new Instructor(fname, lname, instructorID, null, null);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Now to put it all together
		course = new Course(courseName, cID, ins, startDate.toString(),
				endDate.toString());
		// TeachingAssistant table
		rs = accessTAs(cID);
		if (rs != null) {
			try {
				while (rs.next()) {
					taEID = rs.getInt("EmployeeID");
					taEName = rs.getNString("EmployeeName");
					System.out.println(taEName);
					String[] names = taEName.split("\\s+");
					String fname = names[0];
					String lname = names[1];
					TATM temp = new TATM(fname, lname, taEID, null, null);
					course.addMarker(temp);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		// Students table
		// rs = accessStudentList(cID);
		// if (rs != null) {
		// try {
		// while (rs.next()) {
		// sID = rs.getInt("StudentID");
		// sName = rs.getNString("StudentName");
		// String[] names = sName.split("\\s+");
		// String fname = names[0];
		// String lname = names[1];
		// Student temp = new Student();
		// course.addStudent(temp);
		// }
		// } catch (SQLException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// }
		// Activities table
		rs = accessCourseActivities(cID);
		if (rs != null) {
			try {
				while (rs.next()) {
					aName = rs.getNString("ActivityName");
					aDesc = rs.getNString("ActivityDesc");
					sSolnPath = rs.getNString("StudentSolnPath");
					solnPath = rs.getNString("SolnPath");
					aLang = rs.getNString("ActivityLang");
					aType = rs.getBoolean("ActivityType");
					groupAct = rs.getBoolean("GroupAct");
					int numTests = rs.getInt("NumTests");
					Date dueDate = rs.getDate("DueDate");
					Activity temp = new Activity(aName, aDesc, sSolnPath,
							solnPath, aLang, dueDate.toString(), aType,
							groupAct, numTests);
					course.addActivity(temp);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// c is a complete
		return course;
	}

	/*
	 * Method to access the student list for a specified course. Will return the
	 * student IDs and names of the student list for the course.
	 */
	public static Object[] accessStudentList(String courseID) {
		ArrayList<String> students = new ArrayList<String>();
		String query = "SELECT StudentName,StudentID FROM c275g01A.dbo.Student "
				+ "WHERE CourseID = '" + courseID + "'";
		ResultSet res = execQuery(query);

		try {
			while (res.next()) {
				String name = res.getNString(1);
				int id = res.getInt(2);
				students.add(name + " - " + id);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return students.toArray();
	}

	/*
	 * Method to clear the student list when updating it with a new .csv file.
	 */
	public static void clearStudentList(String courseID) {
		String query = "DELETE FROM c275g01A.dbo.Student WHERE CourseID = '"
				+ courseID + "'";
		execUpdate(query);
	}

	/*
	 * Method to add a student to the student list for a particular course.
	 */
	public static void addStudent(String studentName, int studentID,
			String courseID) {
		String query = "INSERT INTO c275g01A.dbo.Student VALUES ('"
				+ studentName + "'," + studentID + ",'" + courseID + "')";
		execUpdate(query);
	}

	/*
	 * Method to access the list of activities for a particular course.
	 */
	public static ResultSet accessCourseActivities(String courseID) {
		String query = "SELECT * FROM c275g01A.dbo.Activity WHERE CourseID = '"
				+ courseID + "'";
		return execQuery(query);
	}

	public static Object[] accessActivityList(String courseID) {
		ArrayList<String> activities = new ArrayList<String>();
		String query = "SELECT * FROM c275g01A.dbo.Activity WHERE CourseID = '"
				+ courseID + "'";
		ResultSet res = execQuery(query);

		try {
			while (res.next()) {
				activities.add(res.getNString("ActivityName"));
			}
		} catch (SQLException e) {
			System.out.println("SQL Exception occured, the state : "
					+ e.getSQLState() + "\nMessage: " + e.getMessage());
		}

		return activities.toArray();
	}

	/*
	 * Method to access a particular activity by combination of course ID and
	 * name.
	 */
	public static ResultSet accessActivity(String courseID, String activityName) {
		String query = "SELECT * FROM c275g01A.dbo.Activity WHERE CourseID = '"
				+ courseID + "' AND ActivityName = '" + activityName + "'";
		return execQuery(query);
	}

	public static Activity constructActivityObject(String courseID,
			String activityName) {
		ResultSet res = accessActivity(courseID, activityName);
		Activity act = null;
		try {
			res.next();
			String aName = res.getNString("ActivityName");
			String aDesc = res.getNString("ActivityDesc");
			String sSolnPath = res.getNString("StudentSolnPath");
			String solnPath = res.getNString("SolnPath");
			String aLang = res.getNString("ActivityLang");
			String dueDate = res.getDate("DueDate").toString();
			boolean aType = res.getBoolean("ActivityType");
			boolean groupAct = res.getBoolean("GroupAct");
			int numTests = res.getInt("NumTests");
			act = new Activity(aName, aDesc, sSolnPath, solnPath, aLang,
					dueDate, aType, groupAct, numTests);
		} catch (SQLException e) {
			System.out.println("SQL Exception occured, the state : "
					+ e.getSQLState() + "\nMessage: " + e.getMessage());
		}
		return act;
	}

	public static String[] accessSubmissionPath(String courseID, String actName) {
		String[] paths = new String[2];
		String query = "SELECT StudentSolnPath,SolnPath FROM c275g01A.dbo.Activity WHERE CourseID = '"
				+ courseID + "' AND ActivityName = '" + actName + "'";
		ResultSet res = execQuery(query);

		try {
			res.next();
			paths[0] = res.getNString(1);
			paths[1] = res.getNString(2);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return paths;
	}

	/*
	 * Method to add an activity, including all necessary details,
	 */
	public static void addActivity(String courseID, Activity act) {
		// Build database entries from activity object
		String activityName = act.getName();
		String activityDesc = act.getActivityDesc();
		String studentSolnPath = act.getStudentSubPath();
		String solnPath = act.getSolnPath();
		String activityLang = act.getLanguage();
		boolean activityType = act.isProgramming();
		boolean group = act.isGroup();
		int numTests = act.getNumOfTests();
		String dueDate = act.getDueDate();

		// Generate the insertion query
		String query = "INSERT INTO c275g01A.dbo.Activity VALUES ('" + courseID
				+ "','" + activityName + "','" + activityDesc + "','"
				+ activityLang + "'," + boolToBit(activityType) + ","
				+ boolToBit(group) + ",'" + studentSolnPath + "','" + solnPath
				+ "'," + numTests + ",'" + dueDate + "')";
		execUpdate(query);
	}

	/*
	 * Method to update an activity (specified by name) in a particular course
	 * specified by the course ID passed as a parameter.
	 */
	public static void modifyActivity(String courseID, String accessName,
			Activity act) {
		// Build database entries from activity object
		String activityName = act.getName();
		String activityDesc = act.getActivityDesc();
		String studentSolnPath = act.getStudentSubPath();
		String solnPath = act.getSolnPath();
		String activityLang = act.getLanguage();
		boolean activityType = act.isProgramming();
		boolean group = act.isGroup();
		int numTests = act.getNumOfTests();
		String dueDate = act.getDueDate();

		// Generate the update query
		String query = "UPDATE c275g01A.dbo.Activity SET ActivityName='"
				+ activityName + "',ActivityDesc='" + activityDesc
				+ "',ActivityLang='" + activityLang + "',activityType="
				+ boolToBit(activityType) + ",GroupAct=" + boolToBit(group)
				+ ",StudentSolnPath='" + studentSolnPath + "',SolnPath='"
				+ solnPath + "',NumTests=" + numTests + ",DueDate = '"
				+ dueDate + "' WHERE CourseID = '" + courseID
				+ "' AND ActivityName = '" + accessName + "'";
		execUpdate(query);
	}

	/*
	 * Method to remove a specified activity from a course (also specified) by
	 * name and course ID.
	 */
	public static void deleteActivity(String courseID, String activityName) {
		String query = "DELETE FROM c275g01A.dbo.Activity WHERE CourseID = '"
				+ courseID + "' AND ActivityName = '" + activityName + "'";
		execUpdate(query);
	}

	/*
	 * Method to list the teaching assistant(s) or tutor marker(s) for the
	 * specified course.
	 */
	public static ResultSet accessTAs(String courseID) {
		String query = "SELECT EmployeeID, EmployeeName FROM c275g01A.dbo.TeachingAssistant WHERE CourseID = '"
				+ courseID + "'";
		return execQuery(query);
	}

	/*
	 * Method to add a teaching assistant (or tutor marker) to a specified
	 * course including their employee ID and name.
	 */
	public static void addTA(String courseID, int empID, String empName) {
		String query = "INSERT INTO c275g01A.dbo.TeachingAssistant VALUES ('"
				+ courseID + "'," + empID + ",'" + empName + "')";
		execUpdate(query);
	}

	/*
	 * Method to delete a teaching assistant (or tutor marker) from a specified
	 * course, deleted by their employee ID.
	 */
	public static void clearTAs(String courseID) {
		String query = "DELETE FROM c275g01A.dbo.TeachingAssistant WHERE CourseID = '"
				+ courseID + "'";
		execUpdate(query);
	}

	/*
	 * Method to access the rubric for a specific activity in a course.
	 */
	public static ResultSet accessRubric(String courseID, String activityName) {
		String query = "SELECT RubricItem, MaxGrade FROM c275g01A.dbo.Rubric WHERE CourseID = '"
				+ courseID + "' AND ActivityName = '" + activityName + "'";
		return execQuery(query);
	}

	public static Object[][] accessRubricItems(String courseID, String actName) {
		ResultSet res = accessRubric(courseID, actName);
		Object[][] rubric = null;
		int i = 0;
		try {
			while (res.next())
				i++;
			res = accessRubric(courseID, actName);
			rubric = new Object[i][2];
			i = 0;
			while (res.next()) {
				rubric[i][0] = res.getNString(1);
				rubric[i][1] = res.getFloat(2);
				i++;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return rubric;
	}

	/*
	 * Method to add a rubric item to the database for a specific activity in a
	 * specific course.
	 */
	public static void addRubricItem(String courseID, String activityName,
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
	public static void deleteRubric(String courseID, String activityName) {
		String query = "DELETE FROM c275g01A.dbo.Rubric WHERE CourseID = '"
				+ courseID + "' AND ActivityName = '" + activityName + "'";
		execUpdate(query);
	}

	public static String accessTestIn(String courseID, String actName) {
		String query = "SELECT TestInput FROM c275g01A.dbo.ProgTests WHERE CourseID = '"
				+ courseID + "' AND ActivityName = '" + actName + "'";
		ResultSet res = execQuery(query);
		String test = "";

		try {
			if (res.next())
				test = res.getNString("TestInput");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return test;
	}

	public static String accessTestOut(String courseID, String actName) {
		String query = "SELECT TestOutput FROM c275g01A.dbo.ProgTests WHERE CourseID = '"
				+ courseID + "' AND ActivityName = '" + actName + "'";
		ResultSet res = execQuery(query);
		String test = "";

		try {
			if (res.next())
				test = res.getNString("TestOutput");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return test;
	}

	public static void addTest(String courseID, Activity act, String testIn,
			String testOut) {
		String query = "SELECT * FROM c275g01A.dbo.ProgTests WHERE CourseID = '"
				+ courseID + "' AND ActivityName = '" + act.getName() + "'";
		ResultSet res = execQuery(query);
		System.out.println(courseID + "," + act.getName());
		try {
			if (res.next()) {
				System.out.println("update");
				query = "UPDATE c275g01A.dbo.ProgTests SET TestInput = '"
						+ testIn + "',TestOutput = '" + testOut
						+ "' WHERE CourseID = '" + courseID
						+ "' AND ActivityName = '" + act.getName() + "'";
				execUpdate(query);
			} else {
				System.out.println("insert");
				query = "INSERT INTO c275g01A.dbo.ProgTests VALUES ('"
						+ courseID + "','" + act.getName() + "','" + testIn
						+ "','" + testOut + "')";
				execUpdate(query);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void deleteTests(String courseID, Activity act) {
		String query = "DELETE FROM c275g01A.dbo.ProgTests WHERE CourseID = '"
				+ courseID + "' AND ActivityName = '" + act.getName() + "'";
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