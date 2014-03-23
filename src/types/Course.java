package types;

import java.util.*;
/**
 * @desc:   The Course class is used to model the course object. A course can
 *          only be created by an AssitantAdmin.
 * 
 * @author Chazz Young(0.0) - 03/21/2014
 * @version 0.0
 */
public class Course
{
    private static String name, start_date, end_date;
    private static int id;
    private Instructor instructor;
    private ArrayList<TATMMarker> markers;
    private ArrayList<Student> students;
    private ArrayList<Activity> activities;
    
    public Course( String n, int i, Instructor ins, String start, String end)
    {
        name = n;
        id = i;
        instructor = ins;
        markers = new ArrayList<TATMMarker>();
        students = new ArrayList<Student>();
        activities = new ArrayList<Activity>();
        start_date = start;
        end_date = end;
    }
    
    public void addMarker(TATMMarker m)
    {
        ArrayList<TATMMarker> a = new ArrayList<TATMMarker>(1);
        a.add(m);
        updateMarkers(a);
    }
    
    public void addStudent(Student s)
    {
        ArrayList<Student> a = new ArrayList<Student>(1);
        a.add(s);
        updateStudents(a);
    }
    
    public void addActivity(Activity s)
    {
        ArrayList<Activity> a = new ArrayList<Activity>(1);
        a.add(s);
        updateActivities(a);
    }
    
    /**
     * Takes an ArrayList of TATMMarkers and searches the 
     * sorted ArrayList for the given object iteratively
     */
    public void updateMarkers(ArrayList<TATMMarker> t)
    {
        for(TATMMarker i : t){
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
        Collections.sort(markers, new Comparator<TATMMarker>() {
            @Override
            public int compare(TATMMarker m1, TATMMarker m2)
            {
                int o1 = m1.getID(); 
                int o2 = m2.getID();
                return (o1>o2 ? -1 : (o1==o2 ? 0 : 1));
            }
        });
    }
    
    /**
     * Takes an ArrayList of Students and searches the 
     * sorted ArrayList for the given object iteratively
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
     * Takes an ArrayList of Actviities and searches the 
     * sorted ArrayList for the given object iteratively
     */
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
    }
    
}
