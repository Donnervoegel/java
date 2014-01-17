Project Description
===================
A Department in a college is looking for a way to economize. The administration
has decided that large savings can be made if TA budgets are reduced by half and
a tool to make grading more efficient is provided to replace lost TA hours. 
Your team is subcontracting for ABC software consultants. ABC software
consultants have just received the contract to develop the software to
support to streamline grading of assignments, essays and software. Your task
during the term is to design the streamlined grading system and build a working
prototype. The prototype will demonstrate the feasibility of each of the main
goals, grading of essays, grading of problem sets, and grading of computer
coding assignments. Your prototype must also properly manage the access for the
different users of the system. (**Does that mean a login/password system?**)
The final software package must:
- The "system administrator" will manage installation and accounts for the system
  **Does that mean a custom admin interface for the sysadmin? Wipe system, add
  accounts, etc.?**<br>
  **Is there only one sysadmin?**
- Allow "admin assistants" to create courses and assign instructors,
  teaching assistants, and tutor markers courses
  **What defines a course? Section numbers, schedule, enrollment size, etc.**
- Allow "admin assistants" to modify courses they have created, or copy courses
  **What does it mean to copy a course?**
- Allow "administrators" to view and update all material added by other users of
  the system.
  **How powerful is the admin?**
- Allow all "instructors" to enter and modify lists of activities to be graded
  during their course
- Allow all "instructors" to copy lists of graded activities from previous
  offerings of the course
- Allow "instructors" to create groups of students, and to assign grading for
  the groups OR for the individual students
- Allow all "instructors" to assign particular subsets of students or groups in
  the course to particular teaching assistants or tutor markers on an activity
  by activity basis. "Instructors" must also be able to modify those assignments
- A rubric is a list of expected outcomes for the activity and the maximum number
  of points assigned to each expectation
- Allow "instructors" to enter or modify rubrics for grading each activity
- Allow "instructors" to copy rubrics for single activities from previous
  offerings of the course
- Instructors, Teaching assistants, and Tutor Markers may all grade activities
- Individuals who grade activities are called markers
- Allow "markers" to view the work of each student or group they are assigned
  to grade, one student or group at a time
- Allow "markers" to and add comments directly to the submitted student work<BR>
  **Define _directly_.**
- Allow "markers" to enter grades for each item in the rubric after viewing the
  student's work related to that portion of the rubric
- "Markers" should be able to grade or regrade any assigned student or group.
- Some courses require grading of essays, markers must be able to add comments
  to the essays and return the commented work to the student or group
  **What does it mean to add a comment to an essay? As in, directly into the
  text of the document?**<br>
  **What does it mean to _return_ a piece of work to students?**
- Some courses require grading of problems requiring calculations or derivations,
  markers must be able to add comments and return the commented work to the
  student or group
- Some courses require programming assignments in C, C++, JAVA, or PYTHON
  **Is this relevant?**
- Programming assignments may use specific environments such as Visual Studio
  or Eclipse
  **How does this matter?**
- For programming assignments "instructors" will provide a series of tests for
  the student submitted software. Each test will include any input files and
  console input necessary to run each test. Each test will also include correct
  output files and console output for the test.
- The application should help the instructor assemble all the necessary input
  and output files for each test
- The application should run each test using the specified input files and
  console input and producing the require output files and console output
  (for each student's or group's submitted code)
  **Does that mean we are compiling their code?**
- The application should provide comparisons between the output of each
  student's or group's code and the "correct" output
- The application should then display related portions of the rubric and ask
  the "marker" to enter the grade for that portion
- The streamlined grading system should produce a csv file suitable to load into
  a spreadsheet. Each row should be one student or group, each column should be
  one item in the rubric
  **Does each assignment create a csv?**
- The streamlined grading system will be provided with a directory, containing
  one subdirectory for each group or student. In each subdirectory the submitted
  PDF or code files for each student or group will be stored

The Streamlined Marking System must run on the Windows platform, The preferred
languages for development of the system are Java and C++. Other languages may be
considered if there is a significant efficiency increase to be made by moving to
another language. Any persistent data should be stored in a MS SQL database
(**Why MS SQL and not MySQL, etc.?**) or a custom designed data solution.


### Testing Suite Questions
- How do we sanitize input? That is, check for malicious code.
- Do we compile student programs?

### General Questions
- Should we use a database? *Yes, we will use SQL.*
- Is there no Student interface? How do assignments get in the system?
- What is the best desktop Windows GUI library for Java? (Swing?)
- What file formats for student work are supported? Things like PDFs can't be
  edited easily.
- Do students interact with the system at all? If so, do they install the
  application on their computers?
- Should we keep a record of grade changes?
