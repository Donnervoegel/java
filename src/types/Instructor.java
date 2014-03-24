package types;

import java.util.*;
/**
 * @desc:   The AcademicAdmin class is used to model the Academic Administrator account.
 * 
 * @author 
 */
public class Instructor extends Marker
{
    private ArrayList<Course> courses;
    
    
    public Instructor(String fn, String ln, int empID, String un, String pass)
    
    {
        super(fn, ln, empID, un, pass, 4);
        courses = new ArrayList<Course>();
    }
    
    public void addCourse(Course c)
    {
        courses.add(c);
    }

    public void addRubricToActivty(Activity a, String path)
    {
        
    }
}
