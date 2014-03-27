package types;

import java.util.*;
/**
 * @desc:   The AssistantAdmin class is used to model the Academic Admin Assistant account.
 * 
 * @author Chazz Young
 */
public class AssistantAdmin extends Account
{
    private ArrayList<Course> list_of_courses;
    public AssistantAdmin(String fn, String ln, int empID, String un, String pass)
    
    {
        super(fn, ln, empID, un, pass, Type.ASSISTANTADMIN);
        list_of_courses = new ArrayList<Course>();
    }

    public void createCourse(String name, String id, Instructor inst, String start, String end, String path)
    {
        Course c = new Course(name, id, inst, start, end, path);
        inst.addCourse(c);
        list_of_courses.add(c);
    }
    
    private ArrayList<Course> getCourses()
    {
        return list_of_courses;
    }
}