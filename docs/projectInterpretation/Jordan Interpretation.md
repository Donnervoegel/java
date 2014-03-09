### Account types
-- Each user has an account type.  For accounts in relation to classes: users can be part of more than one type of role in more than one class.  For example: a student who TAs math but is enrolled in history.

-- The system roles (admin, admin assistants) have jurisdiction over how the classes are created but can't change the content inside of courses. 
 
-- The way this works, we will have two different types of accounts. Some accounts are system based while some are class based.  Markers for example will be only present in the scope of the class.  They don't have control over how classes are created.

### Marking and Grades
-- Returning work: the marker updates the students mark on the activity and the student can check the mark he acheived.  Much like canvas.

-- Comments: We should try to convince the client that comments should either be totally system-side or attached to individual work.  This is also dependant on the types of files used.  If the only filetypes we have to deal with are PDF and code files, it coild be optimal to store the comments within the file. However, if the comments are to be stored serverside, it would be helpful to create a system that does general comments(for arts work) or per-line comments(for code/math work).

-- Rubric comparison: When the marker needs to compare to the rubic he could press a button to open a side by side view of the students work and the rubric.  It would be optimal if the marks entered into the rubric are automatically updated into the students marks.  (Perhaps we then need a more custom rubric solution.  This would be a slick feature but the amount of time it takes might not be worth it)

-- Compiling and checking code: Code could be run in the same way that 'codewrite' runs it.  No access to external libraries and the code would run in a quarantine enviroment.  This would reduce the need for santitation while allowing the markers to see if the assignments are fufilling the requirements.

### System implementation
-- The program will run as a desktop application that connects to the server.  Students will login each time to check their work and submit their grades

-- The system will send email notifying of changes to grades(possible extra feature like canvas)
