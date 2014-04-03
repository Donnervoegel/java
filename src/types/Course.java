package types;

import java.util.*;

/**
 * @desc:   The Course class is used to model the course object. A course can
 *          only be created by an AssitantAdmin.
 * 
 * @author Chazz Young
 */
public class Course
{
    private String courseName, startDate, endDate, courseID;
    private Instructor instructor;
    private ArrayList<TATM> markers;
    private ArrayList<Student> students;
    private ArrayList<Activity> activities;
    
    public String getCourseName() {
	return courseName;
    }

    public String getStartDate() {
	return startDate;
    }

    public String getEndDate() {
	return endDate;
    }

    public String getCourseID() {
	return courseID;
    }

    public Instructor getInstructor() {
	return instructor;
    }
    
    public Account[] getTA() {
    	Account[] tas = new Account[markers.size()];
    	for (Account a : markers) {
    		tas[markers.indexOf(a)] = a;
    	}
    	return tas;
	}
    
    public Course(String n, String id, Instructor ins, String start, String end)
    {
        courseName = n;
        courseID = id;
        instructor = ins;
        startDate = start;
        endDate = end;
        markers = new ArrayList<TATM>();
        students = new ArrayList<Student>();
        activities = new ArrayList<Activity>();
    }
    
    /**
     * @desc:   Single add marker
     * @author: Chazz Young
     */
    public void addMarker(TATM m)
    {
        ArrayList<TATM> a = new ArrayList<TATM>(1);
        a.add(m);
        updateMarkers(a);
    }
    
    /**
     * @desc:   Single add student
     * @author: Chazz Young
     */
    public void addStudent(Student s)
    {
        ArrayList<Student> a = new ArrayList<Student>(1);
        a.add(s);
        updateStudents(a);
    }
    
    /**
     * @desc:   Single addActivity
     * @author: Chazz Young
     */
    public void addActivity(Activity s)
    {
        ArrayList<Activity> a = new ArrayList<Activity>(1);
        a.add(s);
	//        updateActivities(a);
    }
    
    /**
     * @desc:   Batch add Markers
     *          Takes an ArrayList of TATMs and searches the 
     *          sorted ArrayList for the given object iteratively
     * @author: Chazz Young
     */
    public void updateMarkers(ArrayList<TATM> t)
    {
        for(TATM i : t){
            //Checks to see if it is in markers
            boolean c = markers.contains(i);
            if(c == true){
                //do nothing
            }else{
                markers.add(i);
            }
        }
        
        //This code is based off of 
        //http://programmingbulls.com/java-sorting-integer-arraylist-using-collectionsso
        //Sorting
        Collections.sort(markers, new Comparator<TATM>() {
            @Override
            public int compare(TATM m1, TATM m2)
            {
                int o1 = m1.getEmpID(); 
                int o2 = m2.getEmpID();
                return (o1>o2 ? -1 : (o1==o2 ? 0 : 1));
            }
        });
    }
    
    /**
     * @desc:   Batch add Students
     *          Takes an ArrayList of Students and searches the 
     *          sorted ArrayList for the given object iteratively
     * @author: Chazz Young
     */
    public void updateStudents(ArrayList<Student> t)
    {
        for(Student i : t){
            //Checks to see if it is in markers
            boolean c = students.contains(i);
            if(c == true){
                //do nothing
            }else{
                students.add(i);
            }
        }
        
        //This code is based off of 
        //http://stackoverflow.com/questions/18441846/how-sort-a-arraylist-in-java
        //Sorting
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2)
            {
//                 int o1 = s1.getID(); 
//                 int o2 = s2.getID();
//                 return (o1>o2 ? -1 : (o1==o2 ? 0 : 1));
                return 5;
            }
        });
    }
    
    /**
     * @desc:   Batch add Activities
     *          Takes an ArrayList of Actviities and searches the 
     *          sorted ArrayList for the given object iteratively
     * @author: Chazz Young
     */
    /*
    public void updateActivities(ArrayList<Activity> t)
    {
        for(Activity i : t){
            //Checks to see if it is in markers
            boolean c = activities.contains(i);
            if(c == true){
                //do nothing
            }else{
                activities.add(i);
            }
        }
        
        //This code is based off of 
        //http://programmingbulls.com/java-sorting-integer-arraylist-using-collectionsso
        //Sorting
        Collections.sort(activities, new Comparator<Activity>() {
            @Override
            public int compare(Activity a1, Activity a2)
            {
                int o1 = a1.getID(); 
                int o2 = a2.getID();
                return (o1>o2 ? -1 : (o1==o2 ? 0 : 1));
            }
        });
	}*/  // Commenting out for now to fix broken compiling
    
}
