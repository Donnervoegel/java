**To be Completed for iteration review 1**

- 1.2.1. A system administrator can add new user accounts to the system 
- 1.2.5. ~~When an account is created the system administrator supplies~~
- 1.2.5.1.	~~a temporary password~~
- 1.2.5.2.	~~a username~~
- 1.2.5.3.	~~users name~~
- 1.2.5.4.	~~users employee id~~
- 1.2.5.5.	~~the type (role) of the account~~ 
- 1.2.8. ~~A user with multiple roles requires one account for each role~~
- 1.2.9. ~~A system administrator may not access any activities or grades~~ 
- 1.2.12. ~~TAs/TMs are have identical privileges within the streamlined grading system~~
- 1.2.13.  A system administrator may view any or all accounts at any time
- 1.3.1. ~~A course includes~~
- 1.3.1.1.	~~Course name~~
- 1.3.1.2.	~~Course number~~`
- 1.3.1.3.	~~Start date and end date~~
- 1.3.1.4.	~~Instructor name and employee number~~
- 1.3.1.5.	~~List of TA/TM names and employee numbers~~
- 1.3.1.6.	~~List of students names and student numbers~~ 
- 1.3.2. A course may also include
- 1.3.2.1.	List of activities added by the instructor after the course is created
- 1.3.2.2.	Student grades for each activity added after the activity is created
- 1.3.3. An administrative assistant can create a course 
- 1.3.3.1.	Instructors, TAs, TMs, and students may be added to the course when the course is created  OR after the course is created
- 1.3.3.2.	An administrative assistant may add ONLY the parts of the course listed in - - - 1.3.1 when he or she creates a course
- 1.3.7. Lists of students may be added to a by loading a comma separated file into the streamlined grading system. The csv file will contain a list of students, one line per student. Each line includes student name, comma, student ID
- 1.4.1. At the time of creation an activity must include
- 1.4.1.1. ~~Activity name~~
- 1.4.1.2.	 Activity solution or solutions
- 1.4.1.3.	 ~~Activity type
- 1.4.1.4.	 ~~Activity language (English, French, German, Chinese, C++, Java, Python)~~
- 1.4.1.5.	 ~~A flag indicating if the activity is an individual activity or a group activity~~
- 1.4.2.   The following must be part of an activity but may be added after the creation of the activity
- 1.4.2.1.	A rubric 
- 1.4.2.2.	The number of programming tests to be run using each student’s code.  If the activity is not a programming activity there will be 0 tests.
- 1.4.2.3.	A Path to a directory containing student submissions for the activity 
- 1.4.2.4.	A description of the student submission
- 1.4.2.5.	All student grades for all items in the specified rubric
- 1.4.3.   The following items may be part of an activity and may be added after the activity is created
- 1.4.3.1.	Paths to files containing the solution for the essay or problem set (if the activity is an essay or problem set activity)
- 1.4.3.2.	Due Date (optional)
- 1.4.4.  A rubric includes
- 1.4.4.1.      A list of items to be given points, 
- 1.4.4.2.     The maximum number of points to give for each of the items 
- 1.4.4.2.1.	The streamlined grading system should not prevent the marker from   entering a number of points larger than the maximum number of points specified in the rubric. 
- 1.4.6.   Student or submissions will be supplied to the streamlined grading system in a directory on a network accessible disk. The streamlined grading system does not handle accepting submissions from students.
- 1.4.6.1.	The instructor will specify the path to the submission directory as part of creating or modifying the activity
- 1.4.6.2.	The submission directory will contain one sub-directory for each student who completed the activity
- 1.4.6.3.	A student’s sub directory will contain the work that student submitted
- 1.4.7.   For a particular activity each student’s sub directory in the submission directory is expected to hold a specified group of submitted files
- 1.4.7.1.	The number of files, N, is specified by the instructor when creating or modifying the activity.  
- 1.4.7.1.1.	For the prototype, for essays and problem sets N=1, one PDF file containing the essay or solution
- 1.4.7.2.	A complete submission will contain the instructor specified number of files.  An incomplete submission may contain fewer files
- 1.4.7.3.	When creating or modifying the activity the instructor will give a unique name for each of the N files.  In each student directory containing a complete submission there will be one file with each of these N names.
- 1.4.7.4.	When creating or modifying the activity the instructor will give a type/format for each of these N files (PDF, text …)
- 1.4.7.4.1.	The default format for essays and problem sets will be PDF
- 1.5.1.    An instructor can access only the courses he is teaching or has taught. The only exception to this rule is give in 1.5.5.1
- 1.5.2.    An instructor can add a new activity to a course they are teaching at any time after he or she is assigned to teach the course (create an activity)
- 1.5.7.   The instructor may view any activity for any course he / she is assigned to 


**To be completed for iteration review 2  (requirements in addition to those for iteration review 1)**


- 1.2.2. A system administrator can modify user accounts 
- 1.2.4. A system administrator can block or unblock an account 
- 1.2.6. A user is blocked after 5 incorrect attempts to log in
- 1.2.6.1.	A user that has been blocked must obtain a new temporary password from the system administrator 
- 1.2.7. Any user can change their own password 
- 1.3.4. An administrative assistant can modify a course, ONLY the parts of the course listed in 1.3.1 may be modified by the administrative assistant
- 1.3.8. An administrative assistant may modified the list of students in a course after the initial list of students is added to the course by loading an updated comma separated file. The updated csv file will contain an updated list of students in the course including all students presently in the course.  
- 1.4.3.   The following items may be part of an activity and may be added after the activity is created
- 1.4.3.5.	A list of tests containing a description of each test (Only if the activity is a programming activity, otherwise there are 0 tests and no list)
- 1.4.3.6.	An environment in which programming assignments are to be tested (Only if the activity is a programming activity, otherwise blank or none)
- 1.4.3.7.	Solutions and input and output files for tests are not required to remain at the locations specified with by the instructor after the instructor considers that grading of the activity is finished.
- 1.4.5. The description of a programming test includes
- 1.4.5.5.	Names (paths) of the files containing the instructors solution code 
- 1.4.5.6.	Number of required input files (not including console input) (May set maximum number of input files to 1 for the prototype)
- 1.4.5.7.	Names (paths) to all required input files, including one input file containing console input 
- 1.4.5.8.	Number of required output files (not including console or error output)  (May set maximum number of output files to 1 for the prototype)
- 1.4.5.9.	 Names (paths) of samples of all expected output files, including one file that contains the console output and one file containing the console error output (for languages with console error output)
- 1.4.6.    Student or group submissions will be supplied to the streamlined grading system in a directory on a network accessible disk. The streamlined grading system does not handle accepting submissions from students or groups
- 1.4.6.4.	 Graded work must be placed back in the student’s (or group’s) directory. The file containing the graded work must have the same name and type as the original file that contained the ungraded work
- 1.4.6.5.	Graded work is returned to the student or group by an application outside of the streamlined grading system
- 1.5.3. The instructor may update (modify) an activity at any time after it is created
- 1.5.4. Instructors are automatically assigned to all submissions,  for all activities,  for all courses they are assigned to
- 1.5.5. TAs/TMs and instructors are all markers 
- 1.5.6. An instructor MAY assign a subset of submissions for a particular activity to a particular TA/TM or to a group of TAs/TMs. 
- 1.5.6.4.	 If the instructor makes such assignments, only the assigned TA’s/TM’s may view, grade, re-grade, or modify grades for their assigned submissions
- 1.5.6.5.	If the instructor does not make specific assignments, the default is for all TAs / TMs assigned to the course to be assigned to grade all submissions
- 1.5.7. Markers may grade their assigned submissions for an activity
- 1.6.1. Instructors are automatically assigned to all submissions,  for all activities,  for all courses they are assigned to
- 1.6.2. TAs/TMs and instructors are all markers 
- 1.6.4. Markers may grade their assigned submissions for an activity (essay or problem set only)
- 1.6.5. Markers may re-grade their assigned submission for an activity (essay or problem set only, any user assigned to a submission may regrade that submission
- 1.6.6. If a rubric is modified after grading has begun all students must be graded (or regarded) using the new rubric
- 1.6.7. To begin grading a marker will first choose
- 1.6.7.4.	A course from a list of courses they are responsible for marking
- 1.6.7.5.	An activity from the course chosen in 1.6.4.1
- 1.6.7.6.	A student (or group) from the list of students or groups whose activity they are responsible for marking.
- 1.6.8. If the activity being graded is an essay or a problem set the streamlined grading system will 
- 1.6.8.4.	Open and display the selected student’s or group’s work 
- 1.6.8.5.	Open and display the instructor’s solution.
- 1.6.8.6.	Open and display the rubric for the activity
- 1.6.8.7.	Enable the marker to switch between each of the previous three items with no more than 1 click
- 1.6.8.8.	For each item in the rubric the marker can read the item in the rubric, then 
- 1.6.8.8.3.	 Examine the students work and solution related to the rubric item.
- 1.6.8.8.4.	 Add comments/feedback about the rubric item directly to the student work 
- 1.6.8.8.5. Enter the resulting grade for that rubric item into the displayed rubric
- 1.6.8.9.	When all comments and grades for that student or group have been added to the submission the streamlined grading system will save the commented version of the students submission (with the filename of the original student or group work) to the students directory 
- 1.6.11. At any time after the activity is created the instructor can create a csv file containing the information available about the grades of students that have been graded. The csv file contains one row for each student or group and one column for each item in the rubric.


**Completed for UAT (requirements in addition to those for iteration review 1 and 2)**

- 1.2.10. A system administrator can archive the system, 
- 1.2.10.1.	All data, all course information and all user information is archived
- 1.2.11. A system administrator can restore backed up data
- 1.2.11.1.	The archive of the system from any date can be restored 
- 1.2.12. 
- 1.6.6. Markers may grade their assigned submissions for an activity (programming activity)
- 1.6.9. If the activity being graded is a programming problem the streamlined grading system will 
- 1.6.9.1.	Compile the student’s solution (code) for the programming problem using the specified language in the specified environment
- 1.6.9.2.	Run the compiled student code for each test specified by the instructor
- 1.6.9.3.	Save the results (output files) from each test
- 1.6.9.4.	Open and display the rubric for the activity
- 1.6.9.5.	For each test the streamlined grading system will
- 1.6.9.5.1.	Either
- 1.6.9.5.1.1.	Open and display the selected student’s program output 
- 1.6.9.5.1.2.	Open and display the instructor’s program output
- 1.6.9.5.2.	OR  
- 1.6.9.5.2.1.	Open and display a difference summary between 1.6.8.5.1 and 1.6.8.5.2
- 1.6.9.5.3.	Enable the marker to switch between each of 1.6.9.4,  1.6.9.5.1.1, 1.6.9.5.1.2  or between each of 1.6.9.4 and 1.6.9.5.2  with no more than 1 click
- 1.6.9.6.	For each item in the rubric the marker can read the item in the rubric, then 
- 1.6.9.6.1. 	Examine the students work and solution related to the rubric item.
- 1.6.9.6.2.	 Add comments/feedback directly to the student work to the rubric item
- 1.6.9.6.3.	 Enter the resulting grade for that rubric item into the displayed rubric
- 1.6.9.7.	If necessary when grading a programming assignment the marker will be given the opportunity to add comments about the student’s code. These comments will be kept in a separate file, each comment must refer to a line or line (using line numbers) of the code. 
- 1.6.10. When all comments and grades for that student or group have been added to the submission the streamlined grading system will save the commented version of the students submission (with the filename of the original student or group work) to the students directory 




**Optional items, up to 3 items may be completed for bonus points (2% of project grade for each item)**

- 1.2. Deletion of accounts, courses, activities, rubricks,
- 1.2.3.0.	A system administrator may delete a user account
- 1.3.5.0.	An administrative assistant may delete a course that has no activities associated with it
- 1.5.3.0.	An instructor may delete an activity


- 1.5.4. An administrative assistant may copy a course
- 1.3.6.1.	When a course is copied items listed in 1.3.2 are NEVER copied


- 1.4.3. The following items may be part of an activity and may be added after the activity is created
- 1.4.3.3.	Late penalties: Up to 3 late submission dates. Each late submission date will be specified by a number of days (can include fractions) after the due date and % penalty for submission of the work up to that number of days after due date (optional)
- 1.4.3.4.	Early bonuses: Up to three early submission dates  Each early submission date will be specified by a number of days (can include fractions) before the due date and % bonus for submission of the work up to that number of days before the due date (optional)


- 1.5.5.     An instructor may copy one activity 
- 1.5.5.1.	The activity may be copied from any previous offering of the same course within the last 5 years, regardless of who was the instructor 
- 1.5.5.2.	The activity may be copied from any other course taught by the same instructor during the last 5 years
- 1.5.5.3.	When an activity is copied items 1.4.1 to 1.4.2 (except for 1.4.2.3 and 1.4.2.5), and 1.4.3 (except 1.4.3.1 and 1.4.3.2)


- 1.5.6.     The instructor may copy all activities for a course without having to copy them one by one


- 1.5.8.     The instructor may specify that a particular activity is a group activity
- 1.5.8.1.	For a group activity the instructor will assign each student in the class to exactly one group.  A group may contain one or more students
- 1.5.8.2.	Each group will have a name.  The name of the group will used to refer to the group’s submission.
- 1.5.8.3.	For a particular activity group names will be unique
- 1.5.8.4.	The students that belong to each group may be loaded from a provided csv file containing student names and ids for each group.
- 1.5.8.5.	The instructor is responsible for providing the group names and group memberships when the group activity Is created or updated.






- 1.6.3. An instructor MAY assign a subset of submissions for a particular activity to a particular TA/TM or to a group of TAs/TMs. 
- 1.6.3.1.	 If the instructor makes such assignments, only the assigned TA’s/TM’s may view, grade, re-grade, or modify grades for their assigned submissions
- 1.6.3.2.	If the instructor does not make specific assignments, the default is for all TAs / TMs assigned to the course to be assigned to grade all submissions


- 1.6.5. Markers may also re-grade or modify grades for their assigned submissions, subject to the following limitations
- 1.6.5.1.	Academic administrators may change grades entered by any marker
- 1.6.5.2.	After an academic administrator has changed a grade for a submission, no marker may re-grade or change grades for that submission
- 1.6.5.3.	An Instructor may re-grade or change grades for all submissions to their own courses, except those that have been modified by an academic administrator
- 1.6.5.4.	TAs and TMs can re-grade or change grades for submissions assigned to them  unless those submissions have 
- 1.6.5.4.1.	Been graded, re-graded by an instructor  
- 1.6.5.4.2.	Had had their grades changed by an instructor or academic administrator
