**Janice:** I understand you ... since our last meeting we’ve also had another meeting and have come up with a couple of changes that I’ll bring up as soon as we come to talking about those areas that have changed. And in the interest of efficiency I’ll just hand over the floor to you and we can get started right away.

**Colin:** Um, since our last meeting we’ve come up with a formal document of the requirements and in that process we’ve come up with some... some more questions from what we asked you last time.  This time we’ve put together some scenarios, so if you will entertain us by listening to the scenarios we’ve come up with, um we’re going to in order of what makes sense in terms of the hierarchy and order of how the user will use the program itself. First Chazz is going to talk about....

**Chazz:** So uh before I begin, is it alright if we record this meeting?

**Janice:** Sure, go ahead.  In fact I was going to record this time but my phone ran out of power.

**Chazz:** Alright, perfect, sorry about that.

**Janice:** No problem.

**Chazz:** Alright. Um. First I would like to discuss the system administrator and the course creation. Um, so to start with, let’s start with creating a course.

**Janice:** That’s not the system admin.

**Chazz:** Right, I’m sorry, creating a user account.

(Laughter)

**Chazz:** Sorry, so um, for let’s say there’s a system administrator named Jenifer who wants to create an account for a tA named bob dole.  Um, so we assume the system administrator has logged into the system, with her valid ID and password, and she clicks on the create account button. Um, she has all of bob dole’s information and she needs to put them into the computer.

**Janice:** Ok.

**Chazz:** Um, what I need to know is what information does the system administrator need to have. Is there a standard ID?

**Janice:** Yes, there is. Uh, right page here... so, there’ll be the user’s name

**Chazz:** First and last

**Janice:** User ID, that is going to be created. The employee ID

**Chazz:** Employee id, is that going to be a number or?

**Janice:** That will be a number.  And the type of user for this account.

**Chazz:** Type of user, excellent.

(Chatter)

**Chazz:** Uh, no I guess that’s all we have for course. Does the ID need to have a specific form, such as firstname-lastname or an ID specification?

**Janice:** No

**Chazz:** Ok, excellent.  SO the uh, so the user gives all this information to the system administrator and he specifies the ID and

**Janice:** Actually the information will come from the academic administrator, he will set list of all accounts that need to be created.  But that will be outside your system.

**Chazz:** Excellent. So after the system administrator has plugged in all this information a confirmation will pop up basically uh giving back all the information just to confirm that all this information is correct. It will have options to go back to the creating the account.

**Janice:** Alright, good.

**Chazz:** Excellent. After that, uh, a new screen will pop up saying that this account has been created.  This will give a username and password which has been randomly generated. How will the new user get this new information?

**Janice:** The new user will actually be sent inter-office courier essentially, to the new user.

**Chazz:** So on paper?

**Janice:** On paper. And when the new user gets it we’d like the new user to be able to change the password to something.

**Chazz:** ‘course.  Excellent. So, actually this next part has to do with password reset. And so uh, Jane smith is an instructor and she accidently pressed caps lock at some point so when she tried to log in to the system she failed to input her password, 5 times, from our last meeting, what we agreed on

**Janice:** Yeah

**Chazz:** We were wondering what the process would be for the system administrator to change the password and.

**Janice:** The user will have to contact the system administrator. He would generate a new password for her, give her in person the new password and then she would be able to login and change her password so she can remember it again.

**Chazz:** Not emailed to her?

**Janice:** No. 

**Chazz:** That’d be outside the system.

**Janice:** That would be outside of the system. (6:38)

**Chazz:** Excellent, that’s it for me. Stephen?

**Stephen:** So, going on with Jane, after she’s received her new randomly generated password from the system administrator, how we see her changing her password to something more memorable is that she would log into program normally, then she’d, on the home page, which would come up as the next screen, she’d press the reset password button, and that’d ask her for her current password, and then to type in her new password wants (twice) and then we’d have another confirmation screen after.

**Janice:** Sounds great.

**Stephen:** And I have one question about if she fails to put in the password correctly that she was given when she’s trying to change it, would there be some sort of security issue or continually allow to...

**Janice:** Again, if she screws it up five times she’ll have to go back to the system administrator.

(That’s still unlikely)

**Janice:** Alright.

**Stephen:** And then, so that...  So for the password, do you have any sorts of specifications that you suggest to conform with the rest of your system?

**Janice:** Um, not directly, we simply specify that they’re characters and numbers.

**Chazz:** characters and numbers.

**Stephen:** And, you require the users to change their passwords on regular basis?

(No)

**Stephen:** And this is all stored in the database, so the system administrator Jennifer, when she went to go back up the database, we envision this to be outside the system, so that she would shut down the system...

**Janice:** We would actually like the system administrator within the system to have a button that says “backup system”

**Stephen:** So just make it…  So then, would you like to… be able to schedule on a regular basis or just always the system

**Janice:** We will take care of with the system admin scheduling backups.  A normal schedule would be at the end of every term.  Of course [the idea omelet comp]

**Stephen:** Alright, um, so internal… So then, the system administrator’s home page would have a backup button, would that be, would this be common feature that the system administrator does seeing as it’s only a semester—a term.

**Janice:** It’s something that would not be done that often.  [?] Archive it.  It would probably actually have ongoing backups.

**Stephen:** Yes.  And you had some other comments about the database?

**Janice:** Actually there was storing.

**Stephen:** Oh yes, storing. So then, you would also want a restore button that would bring up a list of previous backups?

**Janice:** What we would like to see in the long run is that from old backups on request we could load courses that were more than 5 years old.

**Stephen:** More than 5.

**Janice:** Because at 5 years we’ll be taking them out of the active system.

**Stephen:** Ok.  And you specified courses, so backups, how we see it would be the entire system.  So you would like to choose specific courses for the restore?

**Janice:** Ideally in the long run we would probably don’t need to be that fine grained in our program.

**Stephen:** Ok

**Stephen:** So Ian, you had some other questions?

**Ian:** Perfect.  I would like to talk about the administrator assistant role.  So um, let’s say the admin assistant Jane logs in correctly and uh what I have come up with is that we’re given a UI of some sort that has a create button, a modify or update button

**Janice:** Uh huh

**Ian:** And copy course, and my question here is about the delete. And in the scenario that Jane, er, yeah, would like to delete a course

**Janice:** Mmhm

**Ian:** Is a certain time frame that they’re allowed to delete in or…?

**Janice:** There’s not an actual time frame but there is a constraint.

**Ian:** Ok

**Janice:** After activities have been added she may not delete a course.

**Ian:** Thank you.  Ok so, I want to further ask the course database.  Now, when we do create a course um, is it in a local database that we’re holding the courses for then—

**Janice:** Your system would have a local database. Um, local as opposed to what?

**Ian:** Storing the courses as outside the … building.

**Chazz:** Like on an external database.

**Janice:** Uhhhhhh well we would… maybe our technical person needs to do this because as far as I understand it we have one central database for the system and

**Ian:** Ok.

**Janice:** Course system interacts with… is that correct?

**TA:** I think so. I guess the physical location of the database

**Janice:** It will be on one of our servers

**TA:** So it has to be on one of our servers for several reasons.

**Colin:** May I ask something?  That courses can’t be deleted after activities have been added. 

**Janice:** That’s correct

**Colin:** When you… copy a course, are assignments that were say part of the older course that you could then… several semesters ago, wouldn’t there already be assignments in there?

**Janice:** No, no.  Copy a course is only some of the things that are copied

**Colin:** Ok.

**Janice:** The course name, course number, start and end date of the course, the instructor, and name and employee number, the ta name and employee numbers, and that’s it.

**Colin:** Ok. Thank you I was visualizing the assignments getting copied along with it thus rendering the course undeletable by, by that

**Janice:** The uh, administrator assistant has no access to activities. She can’t even see them.

**Colin:** Alright.

**Ian:** I would like to ah ask about on more scenario. In the same scenario if the admin were to actually copy a course and say it is from 3 years back in a certain semester, would we be able to do that since we were noted down just earlier that the backup could be held for within 5 years correct?

**Janice:** mmhm.

**Ian:** so are we allowed to only copy courses within the 5 years?

**Janice:** Yes.

**Ian:** So then that would be from the same backup .

**Janice:** It would be from the active courses in the database which would be the last 5 years.

**Ian:** ok.  And up with creating a page, um, or say sorry creating a course, I would like to know a little bit more about the additional info needed about the instructor or the TA.

**Janice:** Uh, I think I just actually gave you that, because all we need is the name and employee number for each.

**Ian:** Name and employee number.

**Janice:** For each instructor and TA.

**Ian:** Ok.  And when we’re in as an admin assistant we’re also doing the list of activities section, and I just want to clarify for further than from our last meeting what that is meant.  Does the admin assistant

**Janice:** The admin assistant as I just pointed out, to your team member, *sigh* just staring at this.  So the admin assistant has no access At All to activities.

**Ian;** Ok. Thank you.  Ok, and that’s it for me.

**Markus:** k, and so, I was going to go on and talk about the instructor. I was mostly focusing on activities. So a couple scenarios.

**Janice:** could you give us just a second here?

**Markus:** Yeah no problem.

**Janice:** Okay.

**Markus:** Ok, so let’s say we’ll have an instructor, say professor smith, who has logged in correctly, and is on the start page. They might have an option for grading and an option for course management, which would be the instructor’s part of managing courses obviously not creating or anything. SO, they might choose course management and see a list of courses they have, maybe CS125 and CS150? They chose one of those, maybe 125 and they would see a list of their activities for the course, that they might already have this could be empty or maybe they already put some in.  Um, and so kind of branch off into two slightly different options. They’d have an option to create a course

**Janice:** Course or an activity?

**Markus:** Er activity, sorry, thank you. So, they would create an activity, and sort of be prompted with a form to fill out, and I just wanted to clarify to make sure we had the proper details for this.  So I have listed here that it would have the name of the activity, description for the activity, its type, say programming or an essay or something, language, now this could either be a programming language or foreign language, if it was a group or individual activity, a rubric, and possibly a solution if there was

**Janice:** It must have a solution

**Markus:** Ok it has to have a solution. Would you want that even for something like an essay?

**Janice:** There would be a sample solution.

**Markus:** Ok, and would there be anything else?

**Janice:** ok, uh, well, you have to be able to find the assignments to grade, so the instructor would have to specify the path to the directory of the assignments to mark. And depending on your project there’s going to be different types of files and different numbers of files in each student’s directory, in that submission area, so you would have to have the instructor specify the file names and file types that are expected

**Markus:** Ok

**Janice:** Did you have a due date?

**Markus:** Uh… I should have said that, I had it written here, but I didn’t, so.

**Janice:** Well in addition to the due date, uh, there would be a group of late penalties, ok?  So up to 3 dates after the due date, and for each due date a percentage reduction score.

**Colin:** one percent or a certain percent? 

**Janice:** The instructor would actually specify the percent reduction for each of the 3 dates

**Markus:** so for example after 24h maybe the student would lose 25% of their total mark.

**Janice:** And after 48 hours 50%.

**Markus:** Ok.

**Janice:** And after 72 hours, 100%.

**Chazz:** As an example.

**Janice:** As an example. So they would have to specify the time the date and the uh

**Markus:** Time and date of the penalties.

**Janice:** And we also have instructors that prefer to give early bonuses as opposed to uh, penalties, so that would be uh

**Stephen:** I have one comment about the percentage reduction

**Janice:** Mmhm?

**Stephen:** Uh, one other way I have heard of other classes is that the professors would remove a percentage of the grade of the what the student would get if it wasn’t late, like if the student would have handed it in on time, and he only got 50%, and the student--and the late fee was 25% they’d only lose 25% of the 50

**Janice:** Well... that’s exactly what we mean.

**Stephen:** Oh.

**Janice:** Well basically, that’s actually a good thing to clarify because it can be interpreted in different ways.  If the instructor says the reduction is 50% the student gets 50% of the score that they would have got if it was on time.

**Chazz;** so the instructor marks it as they would mark it if it wasn’t late, and the system would handle the reduction.

**Janice:** Correct.

**Markus:** So is that all the details of an activity?

**Janice:** Ah, let me see…  The list of tests if it’s a programming, and of course after it’s been graded the list of all the student grades for every rubric.

**Markus:** And just to clarify the rubric as well, so you’re looking at sort of a table, where it would have columns for uh parts of the assignment

**Janice:** So a description of what points are for, the maximum number of points, and a place to actually enter the actual number of points.  And I think one thing I should point out about that is that the system should not enforce the maximum because instructors occasionally like to give bonuses.

**Markus:** And just to go along with that, that would be for creating an activity and presumably for editing an activity it would be a similar thing instead of clicking create they’d choose from an activity that they already had

**Janice:** Would come up

**Markus:** In the same form, with the only constraint that if they do edit a rubric then everything needs to be regarded.

**Janice:** Janice: If anything has been marked.

**Markus:** And then, I just want to ask about copying as well, so 

**Janice:** Alright just give me a short second…

(Cough)

**Markus:** So following the same basic flow, the professor logs in, they choose course management, they choose the course they’re teaching, uh, and then they see the list of activities again, and there would be a prompt to copy activities kind of probably close to the create button, and uh at this point I’m assuming they would be presented with a list of previous offerings of the course. Would this be any offerings or only theirs or

**Janice:** It would be any offerings.

**Markus:** Ok, and similarly that would follow that 5 year active

**Janice:** Yes and in addition to any offerings previous offerings any other courses that they taught.  

**Markus:** Ok.  So all the courses they’ve taught and previous offerings of the same course.

**Janice:** Yes.

**Markus:** And then they might choose from one of those offerings and then would be shown a list of the activities from that offering, and would be able to select either all or a subset of activities

**Janice:** Yeah

**Markus:** And then they might select the option to copy and this would give them er this would complete the operation and copy those activities into the current course offering

**Janice:** Perfect yes

**Markus:** And I just want to clarify which details would be copied

**Janice:** Alright let me check to make sure I get this correct.  Have you got that list on you?  Ah here.  So you would copy the name the solutions, the rubric, the language, whether it was individual or group, the due date and penalties and bonuses.

**Colin:** the due date?  If it was a previous offering wouldn’t the due date be incorrect?

**Janice:** That’s true.

(Laughter)

**Janice:** Ah yes, so, the specifications of the file name and file types.  I see what happened.

**Colin:** is it safe to say then that due date is not copied?  

**Janice:** Due date is not copied. That was an error on my part

**Chazz:** and so then the late penalties and early bonuses

**Janice:** Yes I did say that I thought the due date yes that’s right. The late penalties and early bonuses could be copied…

**Markus:** if they’re based off the time from the due date rather than a concrete date.

**Janice:** That’s right.

**Markus:** Ok. And I think that covers everything that I have.

**Graeme:** I wanted to talk about the instructor and how groups are managed.

**Janice:** Alright. If you could give me just one second here… (27:13) Ok, 

**Graeme:** So, you have the instructor Smith and he’s going to create a new group, just a single group. So he goes and he [?] in his course management.  So click on that and go to that.  And from there he’ll be presented with the list of activities, so he can choose a group for a certain activity or possibly multiple activities at the same time?

**Janice:** We would want two options: either choose a group for this particular activity, or choose a group for the whole course.

**Graeme:** Ok, so it wouldn’t just be like say a group for 2 activities out of all of—

**Janice:** No.

**Graeme:** Ok.  Ok, in that case he’s just going to make a group for one activity called Activity Hello World, so he chooses “Hello World” from this list of already made activities

**Janice:** Mmhm.

**Graeme:** And he’ll continue next, he’s then presented with his list of students in the course, and he for this activity let’s say there’s a group of two.  So out of his list of students he can choose 2 students… Tasha and John, and then he’ll also enter a name for the group. So the group will have the name um, the can be of his choosing right

**Janice:** Yeah

**Graeme:** So it’s just G1 or anything.   He’ll confirm and there’s this group for that one activity Hello World that’s present.  Also there’s TA and TM management.

**Janice:** Ok.

**Graeme:** Um, well it’ll be the same they’ll be treated essentially the same whether they’re a TA or TM.

**Janice:** Yes.

**Graeme:** So could also have the management option, and he’ll click on that to go to the TA’s and TM’s and similarly he’ll be presented with a list of which

**Janice:** Now who’s doing this?  I missed that.

**Graeme:** The instructor, the instructor’s still…

**Janice:** No, the admin assistant sets up the courses and is responsible for assigning the TA’s.

**Graeme:** To activities? To certain activities.

**Janice:** Oh to certain activities? Oh! Ok so you’re saying for groups of students or 

**Graeme:** Groups of students and activities. Does that...?

**Janice:** Yes, yeah.

**Graeme:** Ok good.

**Janice:** Alright.  I was confused and I missed what you said.

**Graeme:** Oh yes so this management would all be for assigning activities or groups to certain TA’s I’ll just say TA.

**Janice:** Ok

**Graeme:** Um, so, one TA he’ll have, Mark, he’ll choose him, and then he’ll be presented with his list of activities.  So we’re going to assigning activities to our groups to start with, and then from there he’ll be able to see the list of students and groups

**Janice:** Mmhm

**Graeme:** And also then choose which students and groups he wants to assign to that TA for that activity.

**Janice:** Alright.

**Graeme:** Um, also if he’s making edits, so the TA already has some groups of students assigned, he’ll see that information as well.

**Janice:** Alright, sounds very good.

**Graeme:** So, say our TA Mark, he’s already been assigned Tasha, Arnold, and a group.  Can there be individual students and a groups for as single activity?

**Janice:** If it’s a group activity it would be all groups

**Graeme:** All groups.

**Janice:** It’s possible to have a group of one, but you can have all groups.

**Graeme:** Ok, so each would be referenced by a group name and not just…  Ok then.  So then, he already has a few groups, some of these are single groups, so they’ll have names like of the student, “Tasha,” “Arnold,”

**Janice:** Yeah.

**Graeme:** Or one that had a multiple group let’s say of two because they had the option so “Thunderbird.”

**Janice:** Ok. 

**Graeme:** So he’s already been assigned Tasha, Arnold, and Thunderbird. The instructor has changed his mind and decides he wants to add a student, um, say Cindy, and the TA will no longer be responsible for Mark. So from this list, he sees who’s already assigned, he selects one of the students who’s already assigned, and then adds Cindy at the bottom, click confirm, and then [selected, responsible for them].

**Janice:** That sounds good.

**Graeme:** That sound like a complete process for…

**Janice:** It sounds complete yes. I don’t think there’s any problem with that.

**Markus:** Um, would

**Janice:** Oh one possible thing, it would be possible to have more than 1 TA assigned to the same students or groups.

**Graeme:** For grading

**Janice:** For grading. So that you would have a group of TA grading a group of students or groups.

**Markus:** And um, would presumably the option would be desirable to just

**Janice:** So the default would be the group of all TAs grading the group of all students.

**Markus:** Yeah, um, and would you also want to have just the option to instead of for individual activities just the whole course TA’s could 

**Janice:** It would be nice, not critical

**Markus:** Ok.

**Graeme:** Ok, so then, ah no, that’s fine. And this might lead to marking.

(Clears throat, Janice and TA writing notes)

**Graeme:** Are you prepared to... just waiting on you

**Colin:** I was just waiting for you seemed to be kinda

**Janice:** Yep.

**Colin:** we talked last meeting about what types of users can do marking and we visualized a sort of hierarchy that I drew out.  Again, as we talked last time TAs and TMs will be considered as the same thing, so I’m just going to write TA if that’s… less words.  Um, in terms of who can do grading, um, pardon me. 

**Janice:** And this is where I have to jump in for one of the results of our meeting last week.

**Colin:** Ok.

**Janice:** Uh, we have reassessed the role of the academic administrator.

**Colin:** Ok.

**Janice:** And the new — the change is that the academic administrator can view everything in the system but he can only change grades.

**Colin:** As opposed to

**Janice:** Being able to change everything.  View or change everything

**Jordan:** The, so then the academic administrator would then not be able to create courses.

**Graeme:** Wouldn’t have created course

**Janice:** All he can do is look at everything and change grades. 

**Graeme:** Ok.

**Colin:** Interesting, and perhaps it would be something like, not like this but more like (changes diagram on whiteboard) I’m going to abbreviate that

**Janice:** Mmhm

**Colin:** And that would be the admin… perhaps it would be something like... this?
No that would… going like, just um… Because there are things the instructor can do that the admin can’t and there’s things that the admin can, that the instructor can’t, and vice versa.

**Janice:** But we, really all the academic administrator has to do is occasionally update grades in the case of appeals. 

**Colin:** Right.

**Janice:** And uh, so he doesn’t really need to be able to change anything else in the system.

**Colin:** Ok.  Um, the general term given to these types of users that I’ve put all for grades is markers.  The Specification we’re thinking of just adding that the same marker specification to all three of these

**Janice:** Mmhm

**Colin:** And then in practice the academic admin would just never do grading, he would only alter

**Janice:** Ok.

**Colin:** But in theory he could.

**Janice:** That’s like, that’s acceptable.

**Colin:** Ok.  Ok, then actually getting to it, the marker it could be an admin or it could be an instructor or it could be a TA, um, wants to do some marking.  Um, Markus talked about how from the main screen the instructor would have multiple sort of tabs or buttons or options for what they could go to. The would select marking as a general thing, they would see all of the courses that they are in a new page, they would see all the courses that they are affiliated with. If it were a TA, they would only see the courses that the instructor has assigned to them.  Yeah, it has an ability to… they would click on a course.

**Janice:** Um, the instructor is not the one that assigns TA’s, the academic assistant does.

**Colin:** Yes, pardon me.  So the marker sees a list of courses they’re affiliated with, clicks on one, then you get to a sort of um, an activity/student/group view of the… at the top there could be say, a button that has some sort of choice to have student view vs group view, because as you said last time sometimes things can be the whole the group would get the same grade.

**Janice:** Yes.

**Colin:** Whereas in some cases you might only want to alter um

**Janice:** one student

**Colin:** One student out of a group. So then you’d have like a group, ability to choose a group or the group view or the student view depending on which one you chose you would get um 

**Janice:** Either A list of groups or a list of students

**Colin:** Yeah, a list of names could be this way by the groups of students whichever one was chosen. And then um, activity names could be activity 1, 2, 3, 4, what have you. And then a layout like this that would allow you to specifically select one, it would be buttons or support for grading so say this would be student Arron, um, activity one, by clicking that portion then move into the actual grading of that assignment.

**Janice:** Alright.

**Colin:** Are we ok is this ok?

**Janice:** Ok.

**Colin:** Um, yes.  So, up till now is getting to the assignment.

**Janice:** Alright

**Colin:** Once we’re actually in there, you’re initial specification talked about how you wanted as side-by-side view for the rubric and the assignments.

**Janice:** One statement here before we go.

**Colin:** Sure.

**Janice:** We’d also just like an option, we’ve just graded a student, just say “next.”

**Chazz:** We could just create like a student.

**Janice:** Next student or next group.  So basically you’ve got a list, and you just go the next one on the list.

**Colin:** Yeah ok, how about from once you’ve moved into it, in the next screen, where you’re actually doing the grading, there could be a next button.

**Janice:** That’s what we, that would be perfect

**Colin:** Ok.

**Janice:** As an option.

**Colin:** Sure, no that would be that’s very possible. Something that you just reminded me of was that on the screen an instructor by default is associated with all groups and all activities, the TA’s are only associated with some assignments and some groups right?

**Janice:** Mmhm

**Colin:** Um, if say they were associated with Arron, for assignment 1 but not assignment2, this area here would just be grayed out how clear is that?

**Janice:** That’s fine.

**Colin:** So then we’ve moved into, we’ve clicked the button, we’ve moved into the screen, we have obviously some sort of activity name.  Rubric parts…  Um, back to grade, for each point.

**Janice:** So the rubric points would be descriptions of the number of marks. 

**Colin:** Yes the descriptions, the descriptions, so the student has successfully demonstrated blah.

**Janice:** Mmhm

**Colin:** And then um, their grade.  And then fields for entry.

**Janice:** Ok.

**Colin:** This would be hopefully [?] on the screen.  

**Janice:** Ok.

**Colin:** Um, next to that was where, this is basically the side=by-side view, and those are

**Janice:** Ok, yeah.

**Colin:** Description… here.  We visualize two types of views for this, if it is a PDF which it probably would be for something like essays

**Janice:** And if it was problems. 

**Colin:** Um, like yeah math problems.  We would have some sort of option here to... open a PDF, and then we’re thinking that our application will open a external, something, like adobe reader.  It would open that with the screen so that…

**Janice:** so you’d actually have to press the button or would it would just open

**Colin:** just open automatically.  It wouldn’t be able to with this functionality it wouldn’t be able to see the pdf directly in the application but it can be, it would open in Adobe, and then it would be able to see and comment on it.

**Janice:** Alright, so then, it would be able to, it would come up in that part of the window, if you press this button?

**Colin:** Um, would you prefer that or would you prefer it opened completely as a separate window? Like this would be more…

**Janice:** Uh, well our real constraint is that we’d want to be able to see the rubric and the points on the left side of the window. We’d want to be able to see the work and we’d want to be able to see the solution, which would be another pdf. And we’d want to be able to go between all three by a single click if there’s not room for our screen to show them all side-by-side.

**Colin:** I see, so then even next to this ‘cause yes you did mention a moment ago that even for essays or something there’d be a sample solution?

**Janice:** Definitely for problems

**Colin:** Yes.  Ok so we’ll have to we’ll have to think about that. But in theory there’d be something here which will...

**Janice:** Or tabbed or something so that we can go back and record because most screens won’t have room for the rubric and the solution and the work.  So we’ll probably want to have two of them up at a time.

**Colin:** We had um envisioned such a view for coding assignments, because there would be like sample output as well as what was their output was, but be hadn’t anticipated that there would be a sample solution for say an essay so…

**Janice:** Well for an essay you may or may not want to actually look at the sample solution but certainly for a set of problems you would.

**Colin:** You would yes ok.  If the view were not a pdf but instead code, what we were visualizing was that this would be a field showing their file, and this would be directly editable like it would have their code doing whatever and you could click in there with your cursor and then just start typing. And that would be the comments that the instructor wants to leave.

**Janice:** We don’t want to corrupt the students’ submitted code so we would prefer in this case to have the code displayed with line numbers and create a separate file with line number x which is commented.

**Colin:** ok.  What we could do is have their file shown here but it would only be a copy it wouldn’t be the file itself, and then down here say where your data file would say um, save. And that would save a commented version of it where their original would be preserved.

**Janice:** That would work. That would work.

**Colin:** Um

**Janice:** Although we’ve said more-or-less about the essays we’ve only talked about that one aspect of coding.

**Colin:** Um, Jordan will be talking about the test suite next.

**Janice:** Alright, so that’s fine. Just want to make sure we’re… alright.  So, just for the essay now, what would be the steps that someone grading would go through?

**Colin:** for let’s say. Ok, so assuming that 

**Janice:** Or say a problem set.

**Colin:** Problem set? Ok. Assuming we have a view of what the student has and what the solution is, they would um naturally if this was long enough it would be scrollable as would the as would the solution.

**Janice:** Probably the rubric 

**Colin:** I imagine if it was long I guess the whole page could just be scrollable or just this whole path. It’d make no sense for this to scroll and not these. Um, you would have say Point 1 they would read the point, so “student has demonstrated an understanding X,” “hmm have they? Sure.”  What’s the max grade? Ok 10.  They demonstrated … 9 of that. Pu tin 9. You would do that for all points, then at the bottom there would be some sort of um, submit.

**Janice:** Ok

**Colin:** And then as your question just a moment ago, a I guess a next, would go

**Janice:** Which would submit the whole thing

**Colin:** Yes

**Janice:** Perfect

**Colin:** If I could quickly do some meta and ask Janice something and not the client?

**Janice:** Ok.

**Colin:** Since we’re a little bit late starting how much time do we have?

**Janice:** Uhhhh, let’s see… you started at 10 to, so you’ve got 10 max 15.

**Colin:** Alright, Jordan? (46:17)

**Jordan:** Ok, so um, I’m handling the test suite section, so uh well the extension of the code grading and also the test suite that comes along with the code [shading]. So my scenario is the marker would like to add a comment to a piece of student work.

**Janice:** Mmhm

**Jordan:** Um, so the assumptions I’m going to take here are that the user has the permission to mark the student work, and also that the user logs in correctly.  

**Janice:** Ok.

**Jordan:** Um, the user would then navigate to the assignment page, that Colin has just written on the board and half erased. Just a moment ago written on the board in that matrix organization style.  So the marker would then click on the code assignment they’d like to comment on, click on the code assignment they’d like to grade, I suppose.  I would like to show you just sort of quick a quick diagram, now. Ok so just when you would think about this really quickly just as you would click on the, click on an essay or something.  This would be the assignment page, so this assignment page would contain the rubric, and then it would contain the [?predecess] for the code. It would contain the solution code from the instructor or from the whoever.

**Janice:** Solution... code?

**Jordan:** Yes, because, the, just like there would be a sample solution essay or sample solution calculations, 

**Janice:** Ok.

**Jordan:** This would just be a piece of code that produces the proper output, so, um, that would be there. And then you would also have the student code, which is the code that they the TA would be marking.

**Janice:** Mmhm

**Jordan:** Now this is three things, that is this is just in the assignment page, so we’re not in the test suite section yet, this is just the page that you get to when you click on the individual assignment.

**Janice:** Ok

**Jordan:** And we see [clearing the spoon] each have their own window, like inside the grading program.  And they would be, they could be tabbed like this, like just small sections at the top

**Janice:** Mmhm

**Jordan:** With each of them, or if the user had a big enough monitor, say they could be displayed side-by-side or it would be like, all 3 of them at a time, or it would even be possible to just do 2 at a time.

**Janice:** Ok.

**Jordan:** If that’s what the client would want.

**Janice:** Yep. Being able to see any two of them at once would be ideal. 

**Jordan:** Yeah, um, so you have that. And then so that shows you the rubric, that’s mostly just between the rubric and the user code, so you could query the code based on the style of it or whatnot.

**Janice:** Ok.

**Jordan:** Um, so moving on from that, there would probably be a small button at the bottom of this screen, the screen containing these three, that would say test suite

**Janice:** Ok.

**Jordan:** And it would just be a button here that the marker would click on.

**Janice:** Ok.

**Jordan:** So they would click on that, and then that would take them to a separate um like a separate I guess work station, which is the test suite here. And in the test suite you would have say format is that three windows. Solution input output, which is what the um, what the solution code would output to the console.

**Janice:** Ok.

**Jordan:** You would have the user output.

**Janice:** Mmhm

**Jordan:** And then the third one that we would like to propose would be a window showing the differences between the solution code and the user code

**Janice:** Output… output

**Jordan:** or sorry, between the solution output and the user output.

**Janice:** Yep.

**Jordan:** And that would just be a kind of colour coded um, easy to see way where exactly the differences are between the code.  Just in its own little window there.  And like I said before, that would work exactly the same as this would.

**Janice:** We’d also need the rubric. 

**Jordan:** This is the, that’s the next part that I was just about to get to.

**Janice:** Ok.

**Jordan:** Um, but that would work exactly the same format as this with the tabs and they could view all 3 of them at the same time if they needed to.  Or if they have a large enough monitor, or whatever. So, once you’ve done that, we have another button, actually let me just… so this that third one I guess we’d just call Intelligent Difference.

**Janice:** Ok.

**Jordan:** Because that’s, that’s what it is, the intelligent difference between the code.  Um, next we would have a button just like the other buttons, the same position as that, which would be back to assignment page, which then takes us—switches us back to uh the page with the rubric, solution code and student tabs.

**Janice:** We’d need more direct access to the rubric.

**Jordan:** More direct

**Janice:** Yes because we may have 6 tests and we can’t remember which goes on in all 6 tests for 4 different items.   And have to go back to the rubric once.

**Colin:** I guess we had assumed that there would be one test.

**Janice:** No, there will be multiple tests.

**Jordan:** Ok, I can actually handle that. Uh, the way we were thinking of implanting that would be this would just be 2 sections that you would click on the button and then the switch over would be instant, so, would you then once you’ve pressed test suite and all the codes are compiled and run and you have the output shown, you would be able to switch back quickly with just the 1 button between the

**Janice:** Yeah but then you would have outputs for each task.

**Jordan:** Yeah. The outputs would

**Janice:** And you might have multiple outputs for each test

**Jordan:** The outputs would all save. The outputs…

**Janice:** Mmhm, ok.

**Jordan:** When you switch between these 2 views, this would be test suite view and this would be assignment view

**Janice:** Ok.

**Jordan:** When you switch between these views, the outputs would be saved.

**Janice:** So you could look at the outputs, go back to the rubric, put something in, 

**Jordan:** Yeah and it happens like clearly instantaneously

**Janice:** Alright.  Sounds good.

**Jordan:** So that be just the format of our test suite, and how the test suite would fit into the general assignment view. Um, we might have 1 more, that I’m looking for clarification on.  So is there anything that you haven’t expressed that you have a problem with.

**Janice:** Uh, did we talk about actually providing the information to setup the tests?

**Jordan:** Um, just this scenario, just like the format of this, is there anything that needs….

**Janice:** This particular idea this looks great.  I was just asking, I couldn’t remember if we talked about actually getting the information in to tell you where all the information for the test was, other than saying a list of tests at one point.

**Colin:** Files? They were to be inputted by the instructor as files, like a just a sample, um, sample of the

**Janice:** Ok.

**Colin:** But I guess the key point is that there’s multiple 

**Janice:** There’s multiple tests. And each test might have multiple inputs and multiple outputs.

**Colin:** Right I see.

**Jordan:** so would those be then put into the assignment via the when the assignment is created or

[Niet]

**Janice:** when the activity is created the list of tests will be specified and um, the instructor would have to tell you where all those things are, so you could assemble them inside your system.

**Colin:** are the sample inputs all in one file?

**Janice:** There may be one or more. You might have multiple input fields with different data.  You might have also an input file for console input.

**Colin:** Ok.

**Chazz:** Sorry I have a quick question.  Um, would the uh files have to be specified er the filenames have to be specified and standardized?

**Janice:** all of them will be standardized because they come from our course management system and the instructor specifies which each file should be called. 

**Chazz:** Excellent.

**Janice:** So they’ll be the same for each student

(Ok)

**Jordan:** So the way that this works and runs, once you specify what the solution file would be, or what the solution piece of code and would be, then it would just, it would appear in every student’s 

**Janice:** Once you’ve specified the name when you create the tests, that name would be the same name for any of the students’ directories.

**Chazz:** Yes.

**Jordan:** Ok.

**Janice:** And the same file type

**Jordan:** Yeah.

**Chazz:** Yes, of course.

**Janice:** The same is true for problem sets and essays.

**Ian:** Uh hi, do you mind if I jump in for this last minute here.  I… my nervousness got the best of me and may have forgotten a big portion, or not a big portion but uh just a conformation with you.

**Janice:** Ok.

**Ian:** It has to do with the courses and the administration assistant role.  And I just want to confirm with you what exactly is required for creating a course and it’s: the name of the course, the course ID, the assigned instructor’s name, and employee ID, the assigned teacher’s assistants…

**Janice:** Uh juts give me a moment, I have a list, or do you got the list easily available?

**TA:** Uh, courses here…

**Janice:** Ok so we…

**TA:** We would

**Janice:** Go ahead then 

**Ian:** Ok, sure. So it’s the name of the course, the course ID, the assigned instructors name and employee ID as we’ve discussed earlier

**TA:** Yes

**Ian:** Assigned teachers assistant/markers’ names and employee ID, start and end of the course, sorry and end date of the course

**Janice:** Janice: mmhm

**Ian:** And the list of students enrolled.  I was wondering if there was anything else.

**TA:** you would also have some sort of activities of obviously associated with course right.

**Janice:** But the admin assistant doesn’t take care of that.

**Ian:** Yeah so in that I was just wondering more clarity about that. So would they be setting that up in some sort or?

Janice: No, the admin assistant can’t see them or set those up.

Ian: Ok.

**Janice:** They are part of the course, but it’s the instructor’s responsibility to manage all the activities.

**Ian:** Great, and my last question here is um, now we’ve discussed modifying a course, and that there was a small restriction when it comes to modifying the rubric of an activity, as an admin assistant.  I just want to clarify

**Janice:** And admin assistant can’t change an activity and a rubric is part of an activity.

**Ian:** Ok. Great. Alright. And so

**Janice:** That’s the instructor.

**Ian:** Ok so in that case

**Janice:** But there is a constraint that if anything has been graded and the rubric is changed, you have to re-mark. And I think you mentioned that.

**Ian:** Yeah, yeah.

**Chazz:** We have that already. 

**Ian:** so uh the only thing an admin assistant can modify in a course is the ones I listed earlier.

**Janice:** That’s right.

**Ian:** Great, thank you.

(Yeah, that’s all for me.)

**Jordan:** Ok, so just a last thing that I was going to talk to you about when we, just the last thing I thought about with our last five minutes left, um

**Janice:** Well actually you’ve got 2 minutes (57:30)

**Jordan:** 2 minutes. Ok well I can probably do it in 1.  So, when you

(Laughter)

**Jordan:** So when you are in this view right here, and you would enter comments into their code, um, there is a manual save button but would you also like um, say that there’s a would probably be some sort of back button up here just to go back to the main basic stuff, the assignment.  There’s a manual save button, but would you like an automatic save on exit? So when you move from either of these back to the main assignment matrix, would it auto…

**Janice:** Maybe a warning

**Jordan:** A warning?

**Janice:** Because sometimes you might just want to exit because you’ve just screwed something up.

**Jordan:** Ok, ok. So should we then say, if there’s a change in, say the marker wants to put a comment into the user’s code, um, in the assignment view, and they exit without hitting save they should receive a warning that says

**Janice:** “Do you really want to exit without saving?”

**Colin:** we could just gray out the back button.

**Jordan:** You could we could also just gray the back button unless they save or

**Colin:** But then they might have had [a normal x grade].

**Jordan:** Yeah or they might wanna leave without

**Janice:** They might want to leave without saving their changes because they’ve made a serious problem, serious error, and it’s just faster to to re-grade the whole thing.

**Colin:** True, ok. (59:10)

**Jordan:** and then the last kind of thing, just a quick 10 seconds, does the rubric, the rubric would probably automatically save, right? So when you put a number in the rubric the rubric would not depend on the save button.

**Janice:** I wouldn’t think so. No. I think it would be automatically saved.

**Jordan:** I think that’s all for the test suite.

**Janice:** Alright, thank you. I think… are you done?

**All:** Yes.

**Janice:** Ok, so very good. I think we are very close to running out of time here. Thank you for coming, I had hoped we would have some time to discuss priorities and what is going to go into the prototype today, but it looks like we’ll have to have a short meeting at a later time.  Thank you

**All:** Thank you. (59:57)


