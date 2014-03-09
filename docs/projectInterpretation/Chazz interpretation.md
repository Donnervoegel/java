Grading System

Roles:

System Admin
-	manage installation of program
-	create user accounts

Administrators
-	view and update all materials added by other users (any restrictions?)

Admin assistants
-	create courses (what do you need to do to create a course)
-	modify courses they have created 
-	copy courses (any or that they have created as well?)
-	(delete courses?)
-	Assigns instructors, TAs (Teaching Assistants) and TMs (Tutor Markers) to courses             
(any? i.e. assign a Math teacher to Engliish?)

Instructors
-	create and modify lists of graded activities during their course
-	copy lists of graded activities (with marks deleted I assume?)
-	grade either an individual student or a group of students
-	create groups of students (any restrictions?)
-	assign subsets or groups of students to TAs/TM/s (also able to modify this)
-	create or modify rubrics (cannot modify after grades are submitted?)
-	copy rubrics from activities from a previous offering of the course

“Markers” (Instructors, TAs, TMs)
-	grade or regrade all activities (within their course(s)?)
-	view work of student or group of students one at a time (is this important?)
-	make comments directly on the student/group’s “assignment” (see Assignments)
-	Make the commented work available to students (how?)

Assignments
-	For essays/Math assignments/other general assignments
	-	Requires a rubric provided by the Instructor
	-	Must be submitted to the system by a student (how?)
	-	Markers access these assignments for grading, and will upload a commented 
version that is available to students, along with a grade
-	For programming assignments
	-	Instructor provides tests for the submitted software with correct output files 
and a rubric, connecting parts of the rubric to related parts of the code (how?)
	-	The program must be able to read Java, C, C++ and Python files
	-	The application takes the input files submitted by student, runs them and 
returns output files. They are then compared to the “correct” output files (side 
by side?) for the marker’s observation and grading

Application:
-	must produce a csv spreadsheet-compatible file with rows containing students/groups 
and columns containing marks from rubric (how exactly do they want this formatted?)
-	must make the submitted work, commented work  and grades available to students, 

General questions:

Privileges: 
-	Does each type of user have the permissions specified above or is there a hierarchy?
-	Do instructors only have access to courses they are assigned to?
-	Can administrators assign any teacher/TA/TM to any course?
-	Are administrators allowed to change anything?
-	Will the rubrics be modifiable after grades are submitted?
-	Are markers allowed to only grade assignments in their assigned courses?

Security:
-	Does submitted code need to be scanned for malicious activity? “sanitized”?
-	Are students a type of user of this application?
-	Should a grading history be implemented to record grades/grade changes for each marker? 

Other
-	Programming assignments
	-	How will parts of the rubric be related by the application to submitted code?
	-	Will we need a universal compiler?
-	Will students be able to resubmit assignments
	-	Do assignment deadlines need to be implemented?


	
