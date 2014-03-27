package types;

import java.util.*;
public class AcademicAdmin extends Marker
{
    private ArrayList<Course> courses;
    
    public AcademicAdmin(String fn, String ln, int empID, String un, String pass)
    
    {
        super(fn, ln, empID, un, pass, Type.ACADEMICADMIN);
        courses = new ArrayList<Course>();
    }
    
    public ArrayList<Course> getCourses()
    {
        return courses;
    }
    
    public void addCourse(Course c)
    {
        courses.add(c);
    }
    
    public boolean deleteCourse(Course c)
    {
        boolean inList = courses.contains(c);
        if(inList == true){
            courses.remove(c);
        }else{
            
        }
        return inList;
    }
}