**Starting approx. 24:00 of Jordan's recording**

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