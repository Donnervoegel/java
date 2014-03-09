Project Interpretation
======================

### Meta
- They want a prototype to show that such a system is possible, not the finished
  system itself. 
- This lets us use a local database (or not even, if just for demonstration
  purposes) instead of worrying about servers.
- They want Windows, but if we use Swing it should be multiplatform.

### Application
- Desktop Windows `.exe`.

### Login System
- Users can log in from any computer with a certain ID and password.
- **Do they want integration with the rest of their system, a la Canvas,
  SFU Connect, go.sfu.ca, etc.?**
- Bad passwords or usernames will reject the user.

### Actors/Users
- Users can fill multiple roles.
- SysAdmin: Can add, delete, and change account info. Can alter database
  location.
- TA/TM: Same thing? Can grade.
- Instructor: Can do everything a TA/TM can do. Can manipulate rubrics. 
  Can assign TA/TMs to students. Can alter course activities.
- AsAcAd: Can create/alter courses and assign users below him to courses.
- AcAd: Can do everything the users below him can.
- Non-user actors: students and student groups.

### Testing Suite
- _This whole feature can be argued against_.
  It could be suggested to the client that they contract this out
  as a seperate job completely.
- Instructors only.
- Interface for providing test files.
- The suite compiles C* and Java, and interprets Python.<BR>
  **What Python version? And what implementation of Python?**
- _All_ code regardless of language must be checked for malicious
  behaviour before compiling/running. This requires writing a parser for
  for each language, which will take _a lot_ of research, time, and money.
  