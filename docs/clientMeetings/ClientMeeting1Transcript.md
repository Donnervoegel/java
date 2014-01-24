**Regan:** So welcome, I’m glad you could all come. I understand you’re the group that has won our contract for our new grading system. I look forward to working with you on this over the next 18 months. I believe that was the length of our contract. I think for today what we were doing is to answer some of your questions regarding the requirements that we sent you and also regarding what parts of those requirements will be implemented in our prototype for the first three months. So I’ll let you begin.

**Colin:** Thank you very much for having us. If it’s possible we’d like to record the meeting.

**Regan:** no problem.

**Colin:** just so we can refer back to it later. Thank you for the specifications. We got that the other day and we’ve had a number of meetings regarding it. If possible, we’d like to just jump right in.

**Regan:** Wonderful

**Colin:** Ok, Stephen, can you…

**Stephen:** All right. So first off, how big is your userbase going to be like? How many users at a time do you expect to use it?

**Regan:** At a time or the total userbase?

**Stephen:** Both, actually.

**Regan:** The total userbase should be on the order of about 200. At busy times there maybe be 20. 

**Stephen:** And then, going on with the login system. What would happen when passwords are lost, for the users.

**Regan:** If passwords are lost. I would assume that the administrator of the system would have to assign a temporary password that would allow the person to reset their password. Either that or the administrator would have to reset the password to something requested by the user.

**Colin:** By Administrator do you mean the System Administrator?

**Regan:** Yes.

**Colin:** In the document that we received from you there was a System Administrator as well as the Administrator.

**Regan:** Yes. I think we had a System Administrator and an Administrative Assistant who was actually entering things like the course information in preparation for Instructors before they were actually using the system.

**Colin:** So then there were 3 users then that had that Administrator title.

**Chazz:** 3 types of user.

**Regan:** More than 3 types of users. There’s the System Administator, there’s the Administrative Assistant. Did we have an Administrator as well…
General babbling.

**Ian:** There were 3 types of Administrators noted down in the…

**Regan:** Ok. What did our Administrator do? Do you have a copy…

**Graeme:** As far as I can remember, the top Administrator was supposed to be able to view and update the material done by any other user…

**Regan:** Ah yes, we do have 3, so yes, that would be an Administrator in terms of administration of the university and an Administrator in terms of administration of the system.

**Markus:** So when the users would go to reset their passwords we assume that the System Administrator would be responsible for that?

**Regan:** Yes, the System Administrator.

**Markus:** Sorry one more thing: the students themselves would not be able to reset their passwords, they would always require the help of the System Administrator or is that…?

**Regan:** Students have no access to this system.

**Stephen:** And then going on with that. Since the System Administrator would be required for lost passwords, how about when users enter incorrect passwords too many times? Would they be locked out?

**Regan:** Lockout? Yes, that would actually be a very useful feature. We do want the system to be secure.

**Stephen:** So after a couple of tries?

**Regan:** Maybe 5.

**Stephen:** And then after that they’d have to go back to the System Administrator to get it all sorted out?

**Markus:** So an extension of my old question earlier that individual users have no way of resetting their own password? Without going through the System Admin.

**Regan:** They should be able to reset their own password. I understood this question as they had forgotten their password or misentered it.

**Stephen:** And also with the UI. Since there are Administrators and then more normal users, would the UI look different for them or would it be more of a unified thing?

**Regan:** I suspect it would be fairly unified but the things that a user couldn’t do just wouldn’t show up. It would just be a simpler page with less options.

**Colin:** For example, an Academic Administrator, do you think that’s an appropriate term?

**Regan:** That’s an appropriate term.

**Colin:** Or the Assistant can create courses, say that page, that creation page just wouldn’t be visible for a TM, or say a TA.

**Regan:** That’s right. If you’re not allowed to do that function you wouldn’t be able to see that option.

**Colin:** Is it safe to say that this is a desktop application and not a browser-based application?

**Regan:** We would be happy either way. In fact browser-based might even be easier but it’s not necessary. A desktop application would also be very acceptable.

**Stephen:** Keeping with the multiple types of Administrators, if a user has multiple roles, such as a Teacher and a TM or a TA in a different course, or even might be an Administrator and also teaching, their interface would just…?

**Regan:** In the case where one person has multiple roles we would expect that person to have one account for each role.

**Colin:** With say a completely different username than say for…

**Regan:** At least different for password, possibly a different username.

**Ian:** Could be a different number, possibly.

**Chazz:** I would like to talk about the System Administrator. I understand from you project specifications that he is allowed to manage accounts as in, as you mentioned before, create passwords, create user accounts, manage them. Is there anything else the System Administrator can do?

**Regan:** The System Administrator would also be responsible for backups of the system so we would want him to be able to back up the entire database and restore the database in the case we want to restore to a previous state.

**Chazz:** So the System Administrator has no access to the other functions that, say, an Administrator could do.

**Regan:** No. He’s only responsible for actually managing the system and access to the system. Not anything going on inside the system.

**Chazz:** How much power does the System Administrator have? Can the Administrator change passwords without student request?

**Regan:** Could you rephrase that? Because you said Administrator but not which kind, and also student password when students have no access.

**Chazz:** I’m sorry. My apologies. So the System Admin, how much power does the System Administrator have? Can he arbitrarily change passwords of a user of the system?

**Regan:** He should be able to either change or block an account if there’s problems with security.
**Colin:** Is there a limit to the number of System Administrators that can be on the system.

**Regan:** I suspect we would have a small number, probably one for each shift?

**Chazz:** For example 3 or 4 System Administrators.

**Regan:** Yes, 3 or 4.

**Colin:** Certainly not 1.

**Regan:** Certainly not 1, because 1 will not be here 24 hours a day.

**Markus:** So I was thinking of moving down the hierarchy and ask about the other administrative roles. So, kind of wondering specifically about the top Administrator, without the assistant title. So, in terms of access, the specifications kind of say they have access to everything. So, the scope of everything a teacher can do, an instructor, say a teaching assistant…

**Regan:** Anything that anyone else in the system can do or enter they can look at or change.

**Chazz:** Sorry, is that including the System Administrator’s privileges?

**Regan:** I would see the System Administrator as completely separate. The Academic Administrator would not be allowed to manage passwords.

**Markus:** Basically there’d be a complete divide between the System Admin and the other roles.

**Regan:** Yes.

(knocking on door around this time, for TA’s entrance presumably)

**Markus:** So the System Admin would deal with passwords and accounts whereas all the other roles are dealing with the marking side of things.

**Regan:** Yes, that’s right.

**Markus:** So in that case, for example, would an administrator be able to go into a course and, for some reason if they needed to, modify the grade of an individual student?

**Regan:** Yes, they would, because they are responsible for things like students requesting changes to grades because they are not happy with how the instructor has dealt with them and so forth.

**Markus:** So if it went through a review council or something.

**Regan:** Or if suddenly the instructor has a harder time and needs someone to go in and take over.

**Markus:** Another thing was with the Assistant Admins kind of seem like the people who will be creating courses and modifiying them and such. There’s no mention of students who will participate in classes, so, will the system kind of like, for example, might the registration system create a file with a list of students and then..

**Regan:** All right. So you’re asking how we get the classes into your system?

**Markus:** Yes. And students specifically.

**Regan:** Students specifically. All right. So, we have a course management system and the course management system keeps track of who is registered in what course. We will download a comma separated file from that tool and it will have the student names, student ID for all the students registered in the course. And when the Assistant Administrator creates the course, she’ll add the list of students and periodically she will update this from the course management system. Download a new list and update the system.

**Chazz:** Sorry, do we have the syntax for that now? Like the student name…

**Regan:** The comma separated files would come out of a spreadsheet so it’s just student name, comma, student ID. One row for each student.

**Colin:** It’ll be clear when we see it.

**Markus:** So in that case, for something like in the case where a student shouldn’t be registered in the course, we’re presuming that…

**Regan:** That’s taken care of before we get to your system. You have to have the ability to let the Assistant Administrator add a whole new list of names or add list of names to update the present list. So, she’d put in the new list and your system would have to check it against the present list; delete or add to make it correspond to the new list.

**Markus:** And just, maybe, it would also be desirable to add an individual student, or just based off of the csv would be fine.

**Regan:** Just based off of the csv would be fine because we want to make it as fast and simple as possible for the administrator. It’s a one button job to get the list. To get just the students that need to be added is much harder.

**Markus:** I think that’s everything for me…

**Ian:** So I’m just going to continue on with the courses. So what does it mean to exactly create a course from the administration? Are there anything to do with prerequisites or any other kind of attributes to go with the course?

**Regan:** Well for your system we are creating a course to grade. So you already had a question about the student list. The course then will need a list of the activities in the course, a list of the Teaching Assistants and Tutor Markers, the name of the Instructor, start and end date of the course.

**Jordan:**  So because this is a grading system we wouldn’t be expected to include things like the syllabus or other, more descriptive…

**Regan:** That’s correct.

**Ian:** Would that be included as the activities in the course, kind of like the assignments that are going to be given or such things?

**Regan:** Yes. Maybe we should finish talking about the course and then talk about the activities. Now I’ve forgotten which ones I’ve given you. The course has a name, the course has a number, we’ve got the dates, the list of activities, the list of students, the Instructor, the list of Teaching Assistants and Tutor Markers. For the course we had a list of activities so each activity has parts, and a list that we’ve come up with, of course the activity has a name, there’s a solution or a model solution for the activity which may be one or more items, we have the rubric, we have a type of activity, we have the language of the activity, whether it’s a group or an individual activity, a directory of student submissions, a due date, and a list of student grades for each item in the rubric for each student.

**Colin:** Can I clarify something? You mentioned the language of the activity. Did that mean human spoken language or computer language when it would be about computing science?

**Regan:** Yes and yes. We have teachers of foreign languages where the assignment would be in a foreign language. We have teachers of computing science where it will be the computing language.

**Colin:** So both.

**Regan:** Both.

**Ian:** So moving on here. There was a list that an admin could also copy a course and we were wondering what part of that is copied. The students or the rubric or…?

**Regan:** That’s a very good question. Basically, we would need all the things that the instructor puts in about the course. So you need the rubric, you need , let’s go through the list, the language, whether it’s group oriented or individual, what the due date was, the name, the solution. Basically everything that’s part of the actual description of the activity but not the student grades, not the student names because we’re copying it so that it’s ready for another term.

**Jordan:**  Would the Tutors or the TAs not also be included?

**Regan:** The tutors wouldn’t be included, the TAs wouldn’t be included…

**Jordan:**  The instructor also

**Regan:** The instructor, because those can change.

**Chazz:** And the course ID as well? Would we need to generate a new course ID?

**Regan:** No, the course ID would be the same. The way that we discriminate between offerings of the course is to take the ID plus the date.

**Chazz:** Ok, there’s also the option for the Admin to modify a course and, now, I’m assuming that at some point in time, modification of a course is probably not the best, so say within halfway through a term or later in a term. I was wondering if there was such thing as a time limit when you can modify a course.

**Regan:** On the surface it seems that you shouldn’t be changing during the term but we’ve found that there are situations where it becomes necessary. When the instructor becomes ill two thirds of the way through the course we have to change the instructor. When a TA does not satisfy the instructor, is not able to perform the duties we have to change the TA partway through the course. So yes, in an ideal world we wouldn’t want to change them but in some situations we have to. Flexibility needs to be there and also can be used if we need to have it.

**Ian:** With the Instructors and TAs changing it wouldn’t be too big of a problem for us, but I was wondering more about rubrics. Since there’s going to be probably a lot of assignments handed in already that have been graded through the rubric, if we do happen to change the rubric all of a sudden, I think it might maybe end up messing up the course grading.

**Regan:** If a rubric is changed then the course has to be regarded.

**Chazz:** Or that activity.

**Regan:** Or that activity for the rubric.

**Jordan:**  So, sorry, just one thing on the rubric while we’re there. So would we have a rubric for each assignment then?

**Regan:** Yes.

**Jordan:**  And then would the course itself have a rubric also?

**Regan:** Each activity has a rubric.

**Ian:** Yeah, that’s it for courses for me.

**Colin:** Is there a way then to calculate the final grade for a course if there’s no rubric for the course? Say if this assignment has this much weight, say a midterm has 20 percent and the final has 50.

**Regan:** The purpose of this system is to actually do the grading. The calculation of the final grade can be held in our course management system. Now did we want to go back to talk about, let’s see we talked about what was in the course, you’d asked about…Oh, we did do the activity.


**Colin:** They were mentioned in passing, we had instructors as a possible user, as well as TAs. We couldn't find anything that differentiated TAs and TMs

**Regan:** The difference between those two is duties outside the grading system. A tutor marks only, a teaching assistant has direct contact with the students. As far as your system is concerned, there shouldn't be a difference between TAs and TMs.

**Colin:** So it would be fair to treat them as essentially the same entity for login and marking purposes?

**Regan:** Yes.

**Colin:** These (instructors/TAs/TMs) were called markers, and as well as the administrator could alter grades, or anything in the system?

**Regan:** Yes. They could alter, but they aren't doing any grading. It would be on a student by student basis if there was any extraordinary reason to change grades.

**Colin:** So the graders all have access to the individual assignments assigned to them. So they can see the rubrics? (*Yes*) If there is no rubric - all grading must be done with the rubric already submitted?

**Regan:** Yes. The rubric must be submitted before grading occurs.

**Colin:** Is there any sort of pass/fail system where a rubric might not be appropriate?

**Regan:** If there was a pass/fail, then the rubric would say "this is pass/fail, did this student pass or fail?"

**Colin:** If the instructor hasn't submitted a rubric, is marking blocked?

**Regan:** Yes, if there's no rubric grading is blocked.

**Jordan:** About the coding assignments. In our experience, the testing suite you want to implement would require a lot of work - time and money. We would need to provide multiple expensive modules, and we would prefer to spend more time on the grading aspect than this code testing suite.

**Regan:** Unfortunately, some of the drivers for this project are the instructors in CS, and they are very enthusiastic about this aspect. They're also aware of the complexity of a full system. We don't want a full system that does everything automatically. This is to accelerate our grading. So we want it to run the code, and then show us the results compared with a proper solution. Was that your understanding of what we were asking for?

**Jordan:** Yes. So would you like the code to be compiled on the marking system server? (*Yes*) So when you went to grade that code via the rubric, would you be looking at a side by side comparison?

**Regan:** Yes. A side-by-side, so that we could see the solution, and the student's solution. I was told that there are tools that could be implemented that would show the differences, and that's all we're after. They're not looking for exact checking. They know that that would be enormous, and quite beyond the budget of our project.

**Colin:** There are potential dangers with security issues with simply running students' code or compiling what they have.

**Regan:** Yes, this was also another issue, and we think basically you would need to run in an isolated environment
and we would provide the system with an insulated server.

**Colin:** In the off chance something malicious did occur? (*Yes*)

**Jordan:** Going back to the marking, for both code and other work like essays or non-CS work, how would you like the commenting implemented? We have two possibilities: we could put the comments directly on the work, directly in the code or as comments in PDF files, or, the one we recommend, is to have the comments stored in the server with the assignments, and the system would display the comments and allow the markers to modify the assignments on the system. For code this would be on a per-line basis, and for PDF files, we would put the comments in a general section.

**Regan:** We had lots of arguments about this. Basically, the people who want to add comments to things like essays and problem sets insist that the comments are of no use if they aren't in the document. It just requires to much description to say where they are in the document. This is why PDF was our first choice for these kind of documents. We would assume your system would open the document, and allow the marker to add comments using the PDF tool.

**Jordan:** So then, assuming the assignment is not a code assignment, is the only file we will receive be a PDF?

**Regan:** There was some discussion of allowing Word or OpenOffice files, but certainly in the prototype PDF will be what we're after. Perhaps in the full project, we'll consider the other file types.

**Jordan:** Since the comments will be in the file, is it reasonable to assume we won't have a duplicate of the original file in the system? Would we append the comments directly to the work?

**Regan:** When the marker was finished, you'd essentially save a graded copy.

**Jordan:** A separate copy from the original?

**Regan:** I'm not sure whether you would need a separate copy. That would be for you to decide which would be safer and better.

**Chazz:** What about the case where a student wants to dispute a mark? Shouldn't we have the original copy to compare with the graded one?

**Regan:** Definitely, but we do have that, because the way you are going to get submissions is from the course management system. So the originals will be stored in our course management system, and you'll be downloading copies for use in the grading system.

**Graeme:** So students have no access to this grading system? (*Yes*) But at some point we are returning assignments to the students? So will we be taking what we have and pushing it back to the course management system? How are we returning the assignments?

**Regan:** The course management system can upload a .csv file with the grades. So the .csv containing all the students grades for all the different parts of the rubric can be fed directly into the course management system. As for returning particular files, the course management system can also do that. If we have the files in the same directory format as they were supplied from the course management system, we can run this app and it will return work to the students.

**Colin:** So we're basically concerned with putting things back as we got them? (*Yes*)

**Chazz:** (short discussion about logs where Regan thought he said lock) There was no mention of logs in the specification, but we feel this would be a valuable aspect.

**Regan:** I suspect this would be a very useful thing to have. How expensive would this be to implement?

**Chazz:** It shouldn't be expensive at all. Logs are very simple and won't take up much space.

**Regan:** Alright, then that sounds like a very useful thing.

**Chazz:** So who would we give log privileges to? Who would be responsible for it?

**Regan:** I would think this would be something the system administrator would do. If there was a problem with the log like a security problem, or someone having difficulty using the tool, they (SysAdmin) could do something about it.

**Colin:** As well as logs dealing with changes to the system, we were thinking of having academic logs for changes with students, like if a grade were changed it would be in a file just for them. That way, if there were ever grading disputes you would see why something was changed.

**Regan:** Sound wonderful, but we already have that in  our course management system. So once we have the activity graded and it is put into our course management system, it will be logged.

**Jordan:** So you're interested in the system log, but not in the academic log?

**Regan:** When you said academic log, I was thinking it might be useful to have a log of who has been marked and what they've been given by whom. If the instructor can easily access that, they can tell how grading is going.

**Chazz:** So instructors would have access to academic logs?

**Regan:** Yes, everyone down to the instructor.

**Chazz:** So TAs and TMs would not have access? (*Yes*)

**Graeme:** So if someone holds multiple roles, they would have different accounts. Could you change the role of an account?

**Regan:** I would say the SysAdmin could change the permissions of different accounts

**Graeme:** Could he change the permissions of other SysAdmins? For example if there was an issue with one SysAdmin, could another lock or modify the account?

**Regan:** Yes, I would assume that that would be necessary.

**Jordan:** We talked about time limits with courses, but would it be the same for modifying rubrics? (clarifying) There's no time limit on modifying a course, as you stated earlier. Would it be the same, with no time limit for modifying a rubric for an assignment?

**Regan:** Yes, but with the caveat that if a rubric is changed after the assignment has been graded, it would have to be regraded.

**Colin:** Jordan asked about the 'side-by-side' view, so the expected form of the program, as well as what they had?

**Regan:** No, the expected output of the program, as well as a good output.

**Colin:** So there's no checking of the validity of the code, nor will the program?

**Regan:** Yes. There is one thing we might add later - a tool to check style - but that was put on a list of lower priorities.

**Colin:** That would obviously require multiple tools for the four different languages.

**Regan:** Yes. What we haven't discussed is which of these things will go in the prototype. We have four different languages and different requirements. I can't imagine all of those in the prototype, as there will probably be only time for one of them.

**Jordan:** Which one would you be most happy with having in the prototype?

**Regan:** We have proponents of almost all of them. Our strongest supporter likes C++ and Visual Studio, second strongest likes Java and Eclipse. Either of those would be very good. We have supporters for every language, so whatever would be easiest for you to do would be acceptable for the prototype.

**Colin:** Python would be the easiest, right off the bat.

**Regan:** Okay, we have one strong supporter of Python, so that would be quite acceptable as well. Any other questions, either about the requirements, or about what should be included in your prototype?

**Colin:** I don't think so. This is what we came up with in our meetings.

**Regan:** Alright. What we've talked about is, as I'm aware, a lot of work that probably won't fit in a prototype. So next meeting we will probably have to revisit what will fit in the prototype.

**Chazz:** Do you have any questions for us?

**Regan:** Are you comfortable with what's included in a rubric?

**Colin:** Our interpretation is that it would be a description of that particular part of the activity e.g.: produces correct output, and there would be a maximum mark, and in the system the mark they received.

**Regan:** And when the person is grading they have to be able to enter that. That is a correct interpretation. Just to clarify, the items in the rubric might include anything; the result of running a code test, the result of reading a paragraph, the result of grading a problem, and it might be several lines long. (*The description?*) Yes, the description. And also, particularly for things like problems, there may be three or four things that you want to grade together. So if we have the rubric showing at the same time as what you're grading and the solution, and we can scroll up and down in each.

**Jordan:** So you're comfortable with a side-by-side view for that?

**Regan:** Either side-by-side, or if real estate is tight, tabbed. But I think users need to be able to see the rubric, and to see  the solution, and to see the answer very easily as they're grading.

**Colin:** For something like an essay, would you want a view of what they have written?

**Regan:** You would want to have your PDF document so that they could add comments, and a view of the rubric so that you could add the points as you're grading.

**Colin:** Within the application? So there wouldn't be any, say, external opening of Adobe Reader.

**Regan:** Your program might open Adobe Reader, but the user shouldn't have to do it.

**Chazz:** Will the system be responsible for automatically checking for a rubric and marking it automatically?

**Regan:** No. All the grades entered into the rubric will be entered by the grader. The system is rolling things together so we can do it quickly. There was one other thing I think got left out. That was, for code and essays, if possible we would like your system to tie into the tools for detecting academic dishonesty. We'd like to know how expensive adding that would be.

**Chazz:** How would that be implemented? Would there be examples of previous submissions?

**Jordan:** Does the school already have a system in place that the markers use manually? (*Yes*) Would you give us access to that system?

**Regan:** We can lead you to the tools they are presently using, and we would like your system to tie in directly with those tools, so that they can easily use that system.

**Colin:** That should be possible as well as in our time frame. So long as we had the appropriate information about the systems.

**Regan:** I will try to get that information for you, but I'll have to go back to my technical specialist to get it for you. (*Closing remarks.*)
